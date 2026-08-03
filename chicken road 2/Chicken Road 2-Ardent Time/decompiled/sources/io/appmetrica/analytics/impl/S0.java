package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f4929b;

    public S0(io.appmetrica.analytics.impl.C0706t1 c0706t1, boolean z2) {
        this.f4929b = c0706t1;
        this.f4928a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = this.f4929b.f6831a;
        boolean z2 = this.f4928a;
        c0861z0.getClass();
        io.appmetrica.analytics.impl.C0835y0.c().setDataSendingEnabled(z2);
    }
}
