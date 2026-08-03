package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class i implements com.android.billingclient.api.PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.config.BillingConfig f3629a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.BillingClient f3630b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider f3631c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f3632d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv8.impl.d f3633e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv8.impl.n f3634f;

    public i(io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig, com.android.billingclient.api.BillingClient billingClient, io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider, java.lang.String str, io.appmetrica.analytics.billingv8.impl.d dVar, io.appmetrica.analytics.billingv8.impl.n nVar) {
        this.f3629a = billingConfig;
        this.f3630b = billingClient;
        this.f3631c = utilsProvider;
        this.f3632d = str;
        this.f3633e = dVar;
        this.f3634f = nVar;
    }

    public final void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3631c.getWorkerExecutor().execute(new io.appmetrica.analytics.billingv8.impl.g(this, billingResult, list));
    }
}
