package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final java.math.BigDecimal f5367a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5368b;

    public Z(io.appmetrica.analytics.ecommerce.ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountWrapper{amount=");
        sb.append(this.f5367a);
        sb.append(", unit='");
        return B1.a.j(sb, this.f5368b, "'}");
    }

    public Z(java.math.BigDecimal bigDecimal, java.lang.String str) {
        this.f5367a = bigDecimal;
        this.f5368b = str;
    }
}
