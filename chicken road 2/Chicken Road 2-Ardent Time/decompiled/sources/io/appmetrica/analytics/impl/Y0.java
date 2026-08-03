package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ecommerce.ECommerceEvent f5318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5319b;

    public Y0(io.appmetrica.analytics.impl.C0706t1 c0706t1, io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
        this.f5319b = c0706t1;
        this.f5318a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f5319b).reportECommerce(this.f5318a);
    }
}
