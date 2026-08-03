package io.appmetrica.analytics.billing.internal.config;

/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final int f3540a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3541b;

    public BillingConfig(int i2, int i3) {
        this.f3540a = i2;
        this.f3541b = i3;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f3541b;
    }

    public final int getSendFrequencySeconds() {
        return this.f3540a;
    }

    public java.lang.String toString() {
        return "BillingConfig(sendFrequencySeconds=" + this.f3540a + ", firstCollectingInappMaxAgeSeconds=" + this.f3541b + ')';
    }

    public BillingConfig() {
        this(new io.appmetrica.analytics.billing.impl.s().f3481a, new io.appmetrica.analytics.billing.impl.s().f3482b);
    }
}
