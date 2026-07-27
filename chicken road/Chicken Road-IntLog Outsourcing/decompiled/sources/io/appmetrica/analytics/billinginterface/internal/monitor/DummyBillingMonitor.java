package io.appmetrica.analytics.billinginterface.internal.monitor;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;

/* loaded from: classes.dex */
public final class DummyBillingMonitor implements BillingMonitor {
    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public void onBillingConfigChanged(BillingConfig billingConfig) {
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
    }
}
