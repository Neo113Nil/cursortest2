package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0809x0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0835y0 f7072a;

    public RunnableC0809x0(io.appmetrica.analytics.impl.C0835y0 c0835y0) {
        this.f7072a = c0835y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0244b4.l().f5493c.a().executeDelayed(new io.appmetrica.analytics.impl.RunnableC0758v1(this.f7072a.f7128a), java.util.concurrent.TimeUnit.SECONDS.toMillis(5L));
    }
}
