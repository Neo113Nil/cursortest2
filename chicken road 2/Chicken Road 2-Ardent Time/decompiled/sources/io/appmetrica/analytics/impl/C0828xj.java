package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828xj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ecommerce.ECommerceEvent f7118a;

    public C0828xj(io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
        this.f7118a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportECommerce(this.f7118a);
    }
}
