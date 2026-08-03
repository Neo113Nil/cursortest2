package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f3445a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3446b;

    public A(int i2, int i3) {
        this.f3445a = i2;
        this.f3446b = i3;
    }

    public final java.lang.String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.f3445a + ", firstCollectingInappMaxAgeSeconds=" + this.f3446b + ')';
    }

    public A(io.appmetrica.analytics.billing.internal.config.BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
