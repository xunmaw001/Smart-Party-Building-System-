package com.entity.view;

import com.entity.ShenqingzhuanruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请转入
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 21:44:41
 */
@TableName("shenqingzhuanru")
public class ShenqingzhuanruView  extends ShenqingzhuanruEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingzhuanruView(){
	}
 
 	public ShenqingzhuanruView(ShenqingzhuanruEntity shenqingzhuanruEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingzhuanruEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
