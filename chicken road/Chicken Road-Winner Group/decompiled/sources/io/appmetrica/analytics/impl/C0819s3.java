package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819s3 {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f8278a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f8279b;

    /* renamed from: c, reason: collision with root package name */
    public final Ef f8280c;

    /* renamed from: d, reason: collision with root package name */
    public final Cg f8281d;

    public C0819s3(ECommerceCartItem eCommerceCartItem) {
        this(new Mf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Ef(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Cg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f8278a + ", quantity=" + this.f8279b + ", revenue=" + this.f8280c + ", referrer=" + this.f8281d + '}';
    }

    public C0819s3(Mf mf, BigDecimal bigDecimal, Ef ef, Cg cg) {
        this.f8278a = mf;
        this.f8279b = bigDecimal;
        this.f8280c = ef;
        this.f8281d = cg;
    }
}
