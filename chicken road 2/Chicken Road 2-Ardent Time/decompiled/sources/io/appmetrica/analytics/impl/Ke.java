package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ke implements io.appmetrica.analytics.impl.InterfaceC0743uc, io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0662r9 f4543a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0717tc f4544b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0717tc f4545c;

    public Ke(io.appmetrica.analytics.impl.InterfaceC0662r9 interfaceC0662r9, io.appmetrica.analytics.impl.Qg qg, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.We we) {
        this.f4543a = interfaceC0662r9;
        io.appmetrica.analytics.impl.C0717tc c0717tc = new io.appmetrica.analytics.impl.C0717tc(qg, c0580o4, we);
        this.f4544b = c0717tc;
        this.f4545c = c0717tc;
        if (c0717tc.b()) {
            return;
        }
        io.appmetrica.analytics.impl.C0560na.k().a().subscribe(java.util.concurrent.TimeUnit.SECONDS.toMillis(io.appmetrica.analytics.impl.I7.f4442a.longValue()), io.appmetrica.analytics.impl.C0560na.k().w().d(), this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0743uc
    public final io.appmetrica.analytics.impl.F8 a() {
        return this.f4545c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f4544b.a();
        ((io.appmetrica.analytics.impl.C0477k5) this.f4543a.a()).e();
    }
}
