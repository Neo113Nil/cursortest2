package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.t;

/* loaded from: classes.dex */
public final class RemoteBillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5234a;

    /* renamed from: b, reason: collision with root package name */
    private final BillingConfig f5235b;

    public RemoteBillingConfig(boolean z3, BillingConfig billingConfig) {
        this.f5234a = z3;
        this.f5235b = billingConfig;
    }

    public final BillingConfig getConfig() {
        return this.f5235b;
    }

    public final boolean getEnabled() {
        return this.f5234a;
    }

    public String toString() {
        return "RemoteBillingConfig(enabled=" + this.f5234a + ", config=" + this.f5235b + ')';
    }

    public RemoteBillingConfig() {
        this(new t().f5180a, new BillingConfig());
    }
}
