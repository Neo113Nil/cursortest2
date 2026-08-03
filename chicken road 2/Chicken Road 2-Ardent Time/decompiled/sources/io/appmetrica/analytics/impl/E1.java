package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E1 implements io.appmetrica.analytics.impl.InterfaceC0312dk {

    /* renamed from: b, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.D1 f4245b = new io.appmetrica.analytics.impl.D1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f4246c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0679s0 f4247a;

    public E1(io.appmetrica.analytics.impl.InterfaceC0679s0 interfaceC0679s0) {
        this.f4247a = interfaceC0679s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0312dk
    public final void reportData(int i2, android.os.Bundle bundle) {
        ((io.appmetrica.analytics.impl.B1) this.f4247a).a(bundle);
    }
}
