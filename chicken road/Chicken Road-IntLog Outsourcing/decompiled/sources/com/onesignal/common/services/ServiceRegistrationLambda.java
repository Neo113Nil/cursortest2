package com.onesignal.common.services;

import kotlin.jvm.internal.i;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ServiceRegistrationLambda<T> extends ServiceRegistration<T> {
    private final InterfaceC1441l create;
    private T obj;

    public ServiceRegistrationLambda(InterfaceC1441l create) {
        i.e(create, "create");
        this.create = create;
    }

    @Override // com.onesignal.common.services.ServiceRegistration
    public Object resolve(IServiceProvider provider) {
        i.e(provider, "provider");
        T t5 = this.obj;
        if (t5 != null) {
            return t5;
        }
        T t6 = (T) this.create.invoke(provider);
        this.obj = t6;
        return t6;
    }
}
