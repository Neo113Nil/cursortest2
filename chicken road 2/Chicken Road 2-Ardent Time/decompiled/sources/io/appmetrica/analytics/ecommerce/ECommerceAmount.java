package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final java.math.BigDecimal f3807a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3808b;

    public ECommerceAmount(long j2, java.lang.String str) {
        this(io.appmetrica.analytics.impl.AbstractC0522lo.a(j2), str);
    }

    public java.math.BigDecimal getAmount() {
        return this.f3807a;
    }

    public java.lang.String getUnit() {
        return this.f3808b;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f3807a);
        sb.append(", unit='");
        return B1.a.j(sb, this.f3808b, "'}");
    }

    public ECommerceAmount(double d2, java.lang.String str) {
        this(new java.math.BigDecimal(io.appmetrica.analytics.impl.AbstractC0522lo.a(d2)), str);
    }

    public ECommerceAmount(java.math.BigDecimal bigDecimal, java.lang.String str) {
        this.f3807a = bigDecimal;
        this.f3808b = str;
    }
}
