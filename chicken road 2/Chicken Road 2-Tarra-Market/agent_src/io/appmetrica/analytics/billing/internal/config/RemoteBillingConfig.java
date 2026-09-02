package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.t;

/* loaded from: classes.dex */
public final class RemoteBillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1673a;

    /* renamed from: b, reason: collision with root package name */
    private final BillingConfig f1674b;

    public RemoteBillingConfig(boolean z2, BillingConfig billingConfig) {
        this.f1673a = z2;
        this.f1674b = billingConfig;
    }

    public final BillingConfig getConfig() {
        return this.f1674b;
    }

    public final boolean getEnabled() {
        return this.f1673a;
    }

    public String toString() {
        return "RemoteBillingConfig(enabled=" + this.f1673a + ", config=" + this.f1674b + ')';
    }

    public RemoteBillingConfig() {
        this(new t().f1615a, new BillingConfig());
    }
}
