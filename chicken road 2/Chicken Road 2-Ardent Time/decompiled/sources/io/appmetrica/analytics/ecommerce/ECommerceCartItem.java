package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.ecommerce.ECommerceProduct f3809a;

    /* renamed from: b, reason: collision with root package name */
    private final java.math.BigDecimal f3810b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.ecommerce.ECommercePrice f3811c;

    /* renamed from: d, reason: collision with root package name */
    private io.appmetrica.analytics.ecommerce.ECommerceReferrer f3812d;

    public ECommerceCartItem(io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct, io.appmetrica.analytics.ecommerce.ECommercePrice eCommercePrice, long j2) {
        this(eCommerceProduct, eCommercePrice, io.appmetrica.analytics.impl.AbstractC0522lo.a(j2));
    }

    public io.appmetrica.analytics.ecommerce.ECommerceProduct getProduct() {
        return this.f3809a;
    }

    public java.math.BigDecimal getQuantity() {
        return this.f3810b;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceReferrer getReferrer() {
        return this.f3812d;
    }

    public io.appmetrica.analytics.ecommerce.ECommercePrice getRevenue() {
        return this.f3811c;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceCartItem setReferrer(io.appmetrica.analytics.ecommerce.ECommerceReferrer eCommerceReferrer) {
        this.f3812d = eCommerceReferrer;
        return this;
    }

    public java.lang.String toString() {
        return "ECommerceCartItem{product=" + this.f3809a + ", quantity=" + this.f3810b + ", revenue=" + this.f3811c + ", referrer=" + this.f3812d + '}';
    }

    public ECommerceCartItem(io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct, io.appmetrica.analytics.ecommerce.ECommercePrice eCommercePrice, double d2) {
        this(eCommerceProduct, eCommercePrice, new java.math.BigDecimal(io.appmetrica.analytics.impl.AbstractC0522lo.a(d2)));
    }

    public ECommerceCartItem(io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct, io.appmetrica.analytics.ecommerce.ECommercePrice eCommercePrice, java.math.BigDecimal bigDecimal) {
        this.f3809a = eCommerceProduct;
        this.f3810b = bigDecimal;
        this.f3811c = eCommercePrice;
    }
}
