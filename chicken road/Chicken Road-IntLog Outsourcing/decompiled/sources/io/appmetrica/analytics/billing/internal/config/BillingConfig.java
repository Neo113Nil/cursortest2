package io.appmetrica.analytics.billing.internal.config;

import B0.o;
import io.appmetrica.analytics.billing.impl.s;

/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final int f6043a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6044b;

    public BillingConfig(int i2, int i3) {
        this.f6043a = i2;
        this.f6044b = i3;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f6044b;
    }

    public final int getSendFrequencySeconds() {
        return this.f6043a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BillingConfig(sendFrequencySeconds=");
        sb.append(this.f6043a);
        sb.append(", firstCollectingInappMaxAgeSeconds=");
        return o.k(sb, this.f6044b, ')');
    }

    public BillingConfig() {
        this(new s().f5984a, new s().f5985b);
    }
}
