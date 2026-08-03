package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.location.Location f4802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f4803b;

    public P0(io.appmetrica.analytics.impl.C0706t1 c0706t1, android.location.Location location) {
        this.f4803b = c0706t1;
        this.f4802a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = this.f4803b.f6831a;
        android.location.Location location = this.f4802a;
        c0861z0.getClass();
        io.appmetrica.analytics.impl.C0835y0.c().a(location);
    }
}
