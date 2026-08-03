package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class X0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.AdRevenue f5249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5250b;

    public X0(io.appmetrica.analytics.impl.C0706t1 c0706t1, io.appmetrica.analytics.AdRevenue adRevenue) {
        this.f5250b = c0706t1;
        this.f5249a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f5250b).reportAdRevenue(this.f5249a);
    }
}
