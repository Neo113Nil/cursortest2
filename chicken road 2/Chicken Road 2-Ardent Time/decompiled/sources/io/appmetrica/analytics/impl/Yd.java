package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yd implements io.appmetrica.analytics.impl.InterfaceC0703so {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5341a;

    public Yd(java.lang.String str) {
        this.f5341a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.util.Collection<java.lang.Object> collection) {
        return io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) collection) ? new io.appmetrica.analytics.impl.C0652qo(this, false, B1.a.j(new java.lang.StringBuilder(), this.f5341a, " is null or empty.")) : new io.appmetrica.analytics.impl.C0652qo(this, true, "");
    }
}
