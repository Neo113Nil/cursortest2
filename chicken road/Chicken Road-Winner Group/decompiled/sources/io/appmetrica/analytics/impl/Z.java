package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f6882a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6883b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f6882a);
        sb.append(", unit='");
        return B0.c.l(sb, this.f6883b, "'}");
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f6882a = bigDecimal;
        this.f6883b = str;
    }
}
