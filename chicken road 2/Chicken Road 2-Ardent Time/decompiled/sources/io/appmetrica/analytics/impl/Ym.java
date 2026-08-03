package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ym extends io.appmetrica.analytics.impl.AbstractC0709t4 {

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ln f5366g;

    public Ym(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.impl.Ln ln, io.appmetrica.analytics.impl.InterfaceC0703so interfaceC0703so, io.appmetrica.analytics.impl.J2 j2) {
        super(0, str, str2, interfaceC0703so, j2);
        this.f5366g = ln;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0709t4
    public final void a(io.appmetrica.analytics.impl.C0367fo c0367fo) {
        java.lang.String str = (java.lang.String) this.f5366g.a((java.lang.String) this.f6841f);
        c0367fo.f5947d.f6063a = str == null ? new byte[0] : str.getBytes();
    }

    public final io.appmetrica.analytics.impl.Ln h() {
        return this.f5366g;
    }
}
