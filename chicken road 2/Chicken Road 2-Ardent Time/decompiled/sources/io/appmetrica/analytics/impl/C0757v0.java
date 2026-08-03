package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757v0 implements io.appmetrica.analytics.impl.Ba {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f6941a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f6942b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0321e4 f6943c;

    public C0757v0() {
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor a2 = io.appmetrica.analytics.impl.C0244b4.l().g().a();
        this.f6942b = a2;
        this.f6941a = a2.getHandler();
        this.f6943c = new io.appmetrica.analytics.impl.C0321e4();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final void a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.impl.Ta ta) {
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final android.os.Handler b() {
        return this.f6941a;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final io.appmetrica.analytics.impl.S1 c() {
        return new io.appmetrica.analytics.impl.S1();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final io.appmetrica.analytics.impl.C0483kb d() {
        return new io.appmetrica.analytics.impl.C0483kb();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor getDefaultExecutor() {
        return this.f6942b;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final io.appmetrica.analytics.impl.C0321e4 a() {
        return this.f6943c;
    }
}
