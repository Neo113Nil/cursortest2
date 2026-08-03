package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class En implements io.appmetrica.analytics.impl.InterfaceC0703so {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0703so f4275a;

    public En(io.appmetrica.analytics.impl.InterfaceC0703so interfaceC0703so) {
        this.f4275a = interfaceC0703so;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.lang.Object obj) {
        io.appmetrica.analytics.impl.C0652qo a2 = this.f4275a.a(obj);
        if (a2.f6701a) {
            return a2;
        }
        throw new io.appmetrica.analytics.ValidationException(a2.f6702b);
    }

    public final io.appmetrica.analytics.impl.InterfaceC0703so a() {
        return this.f4275a;
    }
}
