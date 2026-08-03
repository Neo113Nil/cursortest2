package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475k3 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Hf f6246a;

    /* renamed from: b, reason: collision with root package name */
    public final java.math.BigDecimal f6247b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0876zf f6248c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0825xg f6249d;

    public C0475k3(io.appmetrica.analytics.ecommerce.ECommerceCartItem eCommerceCartItem) {
        this(new io.appmetrica.analytics.impl.Hf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new io.appmetrica.analytics.impl.C0876zf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new io.appmetrica.analytics.impl.C0825xg(eCommerceCartItem.getReferrer()));
    }

    public final java.lang.String toString() {
        return "CartItemWrapper{product=" + this.f6246a + ", quantity=" + this.f6247b + ", revenue=" + this.f6248c + ", referrer=" + this.f6249d + '}';
    }

    public C0475k3(io.appmetrica.analytics.impl.Hf hf, java.math.BigDecimal bigDecimal, io.appmetrica.analytics.impl.C0876zf c0876zf, io.appmetrica.analytics.impl.C0825xg c0825xg) {
        this.f6246a = hf;
        this.f6247b = bigDecimal;
        this.f6248c = c0876zf;
        this.f6249d = c0825xg;
    }
}
