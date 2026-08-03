package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0215a1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.DeferredDeeplinkListener f5445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5446b;

    public RunnableC0215a1(io.appmetrica.analytics.impl.C0706t1 c0706t1, io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f5446b = c0706t1;
        this.f5445a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5446b.f6831a.getClass();
        io.appmetrica.analytics.impl.C0835y0 c0835y0 = io.appmetrica.analytics.impl.C0835y0.f7125e;
        c0835y0.f().a(this.f5445a);
    }
}
