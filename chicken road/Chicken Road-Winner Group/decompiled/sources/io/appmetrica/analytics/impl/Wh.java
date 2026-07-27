package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f6797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6798b;

    public Wh(C0653li c0653li, ECommerceEvent eCommerceEvent) {
        this.f6798b = c0653li;
        this.f6797a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6798b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportECommerce(this.f6797a);
    }
}
