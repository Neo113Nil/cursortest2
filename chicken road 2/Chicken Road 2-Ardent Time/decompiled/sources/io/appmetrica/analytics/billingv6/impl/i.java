package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class i implements com.android.billingclient.api.PurchaseHistoryResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.config.BillingConfig f3576a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.BillingClient f3577b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider f3578c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f3579d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv6.impl.d f3580e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv6.impl.n f3581f;

    public i(io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig, com.android.billingclient.api.BillingClient billingClient, io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider, java.lang.String str, io.appmetrica.analytics.billingv6.impl.d dVar, io.appmetrica.analytics.billingv6.impl.n nVar) {
        this.f3576a = billingConfig;
        this.f3577b = billingClient;
        this.f3578c = utilsProvider;
        this.f3579d = str;
        this.f3580e = dVar;
        this.f3581f = nVar;
    }

    public final void onPurchaseHistoryResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3578c.getWorkerExecutor().execute(new io.appmetrica.analytics.billingv6.impl.g(this, billingResult, list));
    }
}
