package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261bl extends io.appmetrica.analytics.ecommerce.ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Hf f5593a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0285cj f5594b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0248b8 f5595c;

    public C0261bl(io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct, io.appmetrica.analytics.ecommerce.ECommerceScreen eCommerceScreen) {
        this(new io.appmetrica.analytics.impl.Hf(eCommerceProduct), new io.appmetrica.analytics.impl.C0285cj(eCommerceScreen), new io.appmetrica.analytics.impl.C0287cl());
    }

    public final io.appmetrica.analytics.impl.InterfaceC0248b8 a() {
        return this.f5595c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final java.lang.String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final java.util.List<io.appmetrica.analytics.impl.Di> toProto() {
        return (java.util.List) this.f5595c.fromModel(this);
    }

    public final java.lang.String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f5593a + ", screen=" + this.f5594b + ", converter=" + this.f5595c + '}';
    }

    public C0261bl(io.appmetrica.analytics.impl.Hf hf, io.appmetrica.analytics.impl.C0285cj c0285cj, io.appmetrica.analytics.impl.InterfaceC0248b8 interfaceC0248b8) {
        this.f5593a = hf;
        this.f5594b = c0285cj;
        this.f5595c = interfaceC0248b8;
    }
}
