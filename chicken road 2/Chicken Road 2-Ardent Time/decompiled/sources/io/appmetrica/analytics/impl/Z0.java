package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.DeferredDeeplinkParametersListener f5369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5370b;

    public Z0(io.appmetrica.analytics.impl.C0706t1 c0706t1, io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f5370b = c0706t1;
        this.f5369a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5370b.f6831a.getClass();
        io.appmetrica.analytics.impl.C0835y0 c0835y0 = io.appmetrica.analytics.impl.C0835y0.f7125e;
        c0835y0.f().a(this.f5369a);
    }
}
