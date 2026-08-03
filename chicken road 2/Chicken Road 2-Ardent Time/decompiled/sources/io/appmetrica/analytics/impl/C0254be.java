package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254be implements io.appmetrica.analytics.impl.InterfaceC0703so {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5578a;

    public C0254be(java.lang.String str) {
        this.f5578a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.lang.Object obj) {
        return obj == null ? new io.appmetrica.analytics.impl.C0652qo(this, false, B1.a.j(new java.lang.StringBuilder(), this.f5578a, " is null.")) : new io.appmetrica.analytics.impl.C0652qo(this, true, "");
    }

    public final java.lang.String a() {
        return this.f5578a;
    }
}
