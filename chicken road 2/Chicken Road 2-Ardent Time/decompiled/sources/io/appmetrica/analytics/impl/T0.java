package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class T0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f4991b;

    public T0(io.appmetrica.analytics.impl.C0706t1 c0706t1, java.lang.String str) {
        this.f4991b = c0706t1;
        this.f4990a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = this.f4991b.f6831a;
        java.lang.String str = this.f4990a;
        c0861z0.getClass();
        io.appmetrica.analytics.impl.C0835y0.c().setUserProfileID(str);
    }
}
