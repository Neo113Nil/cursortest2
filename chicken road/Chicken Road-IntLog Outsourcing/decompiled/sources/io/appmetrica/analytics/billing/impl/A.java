package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f5948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5949b;

    public A(int i2, int i3) {
        this.f5948a = i2;
        this.f5949b = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideBillingConfig(sendFrequencySeconds=");
        sb.append(this.f5948a);
        sb.append(", firstCollectingInappMaxAgeSeconds=");
        return B0.o.k(sb, this.f5949b, ')');
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
