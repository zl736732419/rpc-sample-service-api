package com.zheng.rpc.sample.service;

/**
 * 客户端服务实现接口
 * 由服务提供端和调用端公用
 * Created by zhenglian on 2017/10/15.
 */
public interface HelloService {
    String hello(String msg);
}
