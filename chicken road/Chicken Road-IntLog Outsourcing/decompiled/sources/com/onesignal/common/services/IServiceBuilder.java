package com.onesignal.common.services;

import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public interface IServiceBuilder {
    ServiceProvider build();

    <T> ServiceRegistration<T> register(Class<T> cls);

    <T> ServiceRegistration<T> register(T t5);

    <T> ServiceRegistration<T> register(InterfaceC1441l interfaceC1441l);
}
