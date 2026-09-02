package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.s;

/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final int f1671a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1672b;

    public BillingConfig(int i2, int i3) {
        this.f1671a = i2;
        this.f1672b = i3;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f1672b;
    }

    public final int getSendFrequencySeconds() {
        return this.f1671a;
    }

    public String toString() {
        return "BillingConfig(sendFrequencySeconds=" + this.f1671a + ", firstCollectingInappMaxAgeSeconds=" + this.f1672b + ')';
    }

    public BillingConfig() {
        this(new s().f1612a, new s().f1613b);
    }
}
