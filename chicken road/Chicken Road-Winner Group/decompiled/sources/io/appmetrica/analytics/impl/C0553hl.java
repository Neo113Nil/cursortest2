package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553hl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f7434a;

    /* renamed from: b, reason: collision with root package name */
    public final Cg f7435b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0540h8 f7436c;

    public C0553hl(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Mf(eCommerceProduct), eCommerceReferrer == null ? null : new Cg(eCommerceReferrer), new C0578il());
    }

    public final InterfaceC0540h8 a() {
        return this.f7436c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f7436c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f7434a + ", referrer=" + this.f7435b + ", converter=" + this.f7436c + '}';
    }

    public C0553hl(Mf mf, Cg cg, InterfaceC0540h8 interfaceC0540h8) {
        this.f7434a = mf;
        this.f7435b = cg;
        this.f7436c = interfaceC0540h8;
    }
}
