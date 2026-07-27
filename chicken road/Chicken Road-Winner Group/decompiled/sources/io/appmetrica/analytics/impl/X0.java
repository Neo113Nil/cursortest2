package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f6808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6809b;

    public X0(C0817s1 c0817s1, ECommerceEvent eCommerceEvent) {
        this.f6809b = c0817s1;
        this.f6808a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f6809b).reportECommerce(this.f6808a);
    }
}
