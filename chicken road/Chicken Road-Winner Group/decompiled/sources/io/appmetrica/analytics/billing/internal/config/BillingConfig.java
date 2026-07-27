package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.s;

/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final int f5232a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5233b;

    public BillingConfig(int i3, int i4) {
        this.f5232a = i3;
        this.f5233b = i4;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f5233b;
    }

    public final int getSendFrequencySeconds() {
        return this.f5232a;
    }

    public String toString() {
        return "BillingConfig(sendFrequencySeconds=" + this.f5232a + ", firstCollectingInappMaxAgeSeconds=" + this.f5233b + ')';
    }

    public BillingConfig() {
        this(new s().f5177a, new s().f5178b);
    }
}
