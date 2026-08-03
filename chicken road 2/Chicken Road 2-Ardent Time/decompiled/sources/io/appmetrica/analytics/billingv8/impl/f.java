package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class f implements com.android.billingclient.api.ProductDetailsResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3616a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.BillingClient f3617b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider f3618c;

    /* renamed from: d, reason: collision with root package name */
    public final s1.InterfaceC0991a f3619d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f3620e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv8.impl.d f3621f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv8.impl.n f3622g;

    public f(java.lang.String str, com.android.billingclient.api.BillingClient billingClient, io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider, io.appmetrica.analytics.billingv8.impl.h hVar, java.util.List list, io.appmetrica.analytics.billingv8.impl.d dVar, io.appmetrica.analytics.billingv8.impl.n nVar) {
        this.f3616a = str;
        this.f3617b = billingClient;
        this.f3618c = utilsProvider;
        this.f3619d = hVar;
        this.f3620e = list;
        this.f3621f = dVar;
        this.f3622g = nVar;
    }

    public final void onProductDetailsResponse(com.android.billingclient.api.BillingResult billingResult, com.android.billingclient.api.QueryProductDetailsResult queryProductDetailsResult) {
        this.f3618c.getWorkerExecutor().execute(new io.appmetrica.analytics.billingv8.impl.e(this, billingResult, queryProductDetailsResult));
    }
}
