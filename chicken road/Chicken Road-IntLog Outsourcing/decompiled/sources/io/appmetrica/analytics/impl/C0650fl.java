package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650fl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f8192a;

    /* renamed from: b, reason: collision with root package name */
    public final C0700hj f8193b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0689h8 f8194c;

    public C0650fl(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new Mf(eCommerceProduct), new C0700hj(eCommerceScreen), new C0676gl());
    }

    public final InterfaceC0689h8 a() {
        return this.f8194c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f8194c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f8192a + ", screen=" + this.f8193b + ", converter=" + this.f8194c + '}';
    }

    public C0650fl(Mf mf, C0700hj c0700hj, InterfaceC0689h8 interfaceC0689h8) {
        this.f8192a = mf;
        this.f8193b = c0700hj;
        this.f8194c = interfaceC0689h8;
    }
}
