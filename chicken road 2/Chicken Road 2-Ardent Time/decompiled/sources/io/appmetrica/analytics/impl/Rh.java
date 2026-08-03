package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Rh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ecommerce.ECommerceEvent f4908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4909b;

    public Rh(io.appmetrica.analytics.impl.C0387gi c0387gi, io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
        this.f4909b = c0387gi;
        this.f4908a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4909b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportECommerce(this.f4908a);
    }
}
