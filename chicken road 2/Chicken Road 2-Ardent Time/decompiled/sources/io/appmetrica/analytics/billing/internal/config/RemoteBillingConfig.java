package io.appmetrica.analytics.billing.internal.config;

/* loaded from: classes.dex */
public final class RemoteBillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3542a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.billing.internal.config.BillingConfig f3543b;

    public RemoteBillingConfig(boolean z2, io.appmetrica.analytics.billing.internal.config.BillingConfig billingConfig) {
        this.f3542a = z2;
        this.f3543b = billingConfig;
    }

    public final io.appmetrica.analytics.billing.internal.config.BillingConfig getConfig() {
        return this.f3543b;
    }

    public final boolean getEnabled() {
        return this.f3542a;
    }

    public java.lang.String toString() {
        return "RemoteBillingConfig(enabled=" + this.f3542a + ", config=" + this.f3543b + ')';
    }

    public RemoteBillingConfig() {
        this(new io.appmetrica.analytics.billing.impl.t().f3484a, new io.appmetrica.analytics.billing.internal.config.BillingConfig());
    }
}
