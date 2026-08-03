package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416hl implements io.appmetrica.analytics.impl.InterfaceC0703so {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0861z0 f6059a;

    public C0416hl(io.appmetrica.analytics.impl.C0861z0 c0861z0) {
        this.f6059a = c0861z0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.lang.Void r3) {
        this.f6059a.getClass();
        return io.appmetrica.analytics.impl.C0861z0.a() ? new io.appmetrica.analytics.impl.C0652qo(this, true, "") : new io.appmetrica.analytics.impl.C0652qo(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final io.appmetrica.analytics.impl.C0652qo a() {
        return a((java.lang.Void) null);
    }
}
