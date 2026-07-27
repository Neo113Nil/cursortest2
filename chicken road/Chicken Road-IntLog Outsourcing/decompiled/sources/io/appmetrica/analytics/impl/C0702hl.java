package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702hl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f8338a;

    /* renamed from: b, reason: collision with root package name */
    public final Cg f8339b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0689h8 f8340c;

    public C0702hl(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Mf(eCommerceProduct), eCommerceReferrer == null ? null : new Cg(eCommerceReferrer), new C0727il());
    }

    public final InterfaceC0689h8 a() {
        return this.f8340c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f8340c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f8338a + ", referrer=" + this.f8339b + ", converter=" + this.f8340c + '}';
    }

    public C0702hl(Mf mf, Cg cg, InterfaceC0689h8 interfaceC0689h8) {
        this.f8338a = mf;
        this.f8339b = cg;
        this.f8340c = interfaceC0689h8;
    }
}
