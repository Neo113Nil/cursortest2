package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC0711no;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f5492a;

    /* renamed from: b, reason: collision with root package name */
    private final BigDecimal f5493b;

    /* renamed from: c, reason: collision with root package name */
    private final ECommercePrice f5494c;

    /* renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f5495d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j3) {
        this(eCommerceProduct, eCommercePrice, AbstractC0711no.a(j3));
    }

    public ECommerceProduct getProduct() {
        return this.f5492a;
    }

    public BigDecimal getQuantity() {
        return this.f5493b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f5495d;
    }

    public ECommercePrice getRevenue() {
        return this.f5494c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f5495d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f5492a + ", quantity=" + this.f5493b + ", revenue=" + this.f5494c + ", referrer=" + this.f5495d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d3) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC0711no.a(d3)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f5492a = eCommerceProduct;
        this.f5493b = bigDecimal;
        this.f5494c = eCommercePrice;
    }
}
