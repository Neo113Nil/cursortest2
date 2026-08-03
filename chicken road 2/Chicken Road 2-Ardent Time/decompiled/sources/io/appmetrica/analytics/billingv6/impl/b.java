package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class b implements com.android.billingclient.api.BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.config.BillingConfig f3550a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.BillingClient f3551b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider f3552c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv6.impl.d f3553d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv6.impl.n f3554e;

    public b(io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig, com.android.billingclient.api.BillingClient billingClient, io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, io.appmetrica.analytics.billingv6.impl.d dVar, io.appmetrica.analytics.billingv6.impl.n nVar) {
        this.f3550a = billingConfig;
        this.f3551b = billingClient;
        this.f3552c = billingLibraryMonitor$updateBilling$1;
        this.f3553d = dVar;
        this.f3554e = nVar;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(com.android.billingclient.api.BillingResult billingResult) {
        this.f3552c.getWorkerExecutor().execute(new io.appmetrica.analytics.billingv6.impl.a(this, billingResult));
    }
}
