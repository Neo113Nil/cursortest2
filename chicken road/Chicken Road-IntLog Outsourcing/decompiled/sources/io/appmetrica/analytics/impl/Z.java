package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f7760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7761b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f7760a);
        sb.append(", unit='");
        return AbstractC0279e.h(sb, this.f7761b, "'}");
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f7760a = bigDecimal;
        this.f7761b = str;
    }
}
