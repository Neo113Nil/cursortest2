package io.appmetrica.analytics.ecommerce;

import B0.c;
import io.appmetrica.analytics.impl.AbstractC0711no;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f5490a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5491b;

    public ECommerceAmount(long j3, String str) {
        this(AbstractC0711no.a(j3), str);
    }

    public BigDecimal getAmount() {
        return this.f5490a;
    }

    public String getUnit() {
        return this.f5491b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f5490a);
        sb.append(", unit='");
        return c.l(sb, this.f5491b, "'}");
    }

    public ECommerceAmount(double d3, String str) {
        this(new BigDecimal(AbstractC0711no.a(d3)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f5490a = bigDecimal;
        this.f5491b = str;
    }
}
