package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class b implements com.android.billingclient.api.BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.config.BillingConfig f3603a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.BillingClient f3604b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider f3605c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv8.impl.d f3606d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv8.impl.n f3607e;

    public b(io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig, com.android.billingclient.api.BillingClient billingClient, io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, io.appmetrica.analytics.billingv8.impl.d dVar, io.appmetrica.analytics.billingv8.impl.n nVar) {
        this.f3603a = billingConfig;
        this.f3604b = billingClient;
        this.f3605c = billingLibraryMonitor$updateBilling$1;
        this.f3606d = dVar;
        this.f3607e = nVar;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(com.android.billingclient.api.BillingResult billingResult) {
        this.f3605c.getWorkerExecutor().execute(new io.appmetrica.analytics.billingv8.impl.a(this, billingResult));
    }
}
