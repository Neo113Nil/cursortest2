package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class V0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.Revenue f5099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5100b;

    public V0(io.appmetrica.analytics.impl.C0706t1 c0706t1, io.appmetrica.analytics.Revenue revenue) {
        this.f5100b = c0706t1;
        this.f5099a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f5100b).reportRevenue(this.f5099a);
    }
}
