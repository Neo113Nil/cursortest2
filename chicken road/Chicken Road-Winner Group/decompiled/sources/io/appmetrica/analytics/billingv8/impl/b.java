package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;
import m0.AbstractC1115c;
import m0.C1120h;
import m0.InterfaceC1117e;

/* loaded from: classes.dex */
public final class b implements InterfaceC1117e {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f5291a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1115c f5292b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f5293c;

    /* renamed from: d, reason: collision with root package name */
    public final d f5294d;

    /* renamed from: e, reason: collision with root package name */
    public final n f5295e;

    public b(BillingConfig billingConfig, AbstractC1115c abstractC1115c, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f5291a = billingConfig;
        this.f5292b = abstractC1115c;
        this.f5293c = billingLibraryMonitor$updateBilling$1;
        this.f5294d = dVar;
        this.f5295e = nVar;
    }

    @Override // m0.InterfaceC1117e
    public final void onBillingServiceDisconnected() {
    }

    @Override // m0.InterfaceC1117e
    public final void onBillingSetupFinished(C1120h c1120h) {
        this.f5293c.getWorkerExecutor().execute(new a(this, c1120h));
    }
}
