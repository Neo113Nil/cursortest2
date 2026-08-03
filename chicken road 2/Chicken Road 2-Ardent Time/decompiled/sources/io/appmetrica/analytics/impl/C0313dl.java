package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313dl extends io.appmetrica.analytics.ecommerce.ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Hf f5730a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0825xg f5731b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0248b8 f5732c;

    public C0313dl(io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct, io.appmetrica.analytics.ecommerce.ECommerceReferrer eCommerceReferrer) {
        this(new io.appmetrica.analytics.impl.Hf(eCommerceProduct), eCommerceReferrer == null ? null : new io.appmetrica.analytics.impl.C0825xg(eCommerceReferrer), new io.appmetrica.analytics.impl.C0338el());
    }

    public final io.appmetrica.analytics.impl.InterfaceC0248b8 a() {
        return this.f5732c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final java.lang.String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final java.util.List<io.appmetrica.analytics.impl.Di> toProto() {
        return (java.util.List) this.f5732c.fromModel(this);
    }

    public final java.lang.String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f5730a + ", referrer=" + this.f5731b + ", converter=" + this.f5732c + '}';
    }

    public C0313dl(io.appmetrica.analytics.impl.Hf hf, io.appmetrica.analytics.impl.C0825xg c0825xg, io.appmetrica.analytics.impl.InterfaceC0248b8 interfaceC0248b8) {
        this.f5730a = hf;
        this.f5731b = c0825xg;
        this.f5732c = interfaceC0248b8;
    }
}
