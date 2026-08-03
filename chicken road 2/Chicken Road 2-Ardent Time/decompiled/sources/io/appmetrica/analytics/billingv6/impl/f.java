package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class f implements com.android.billingclient.api.ProductDetailsResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3563a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.BillingClient f3564b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider f3565c;

    /* renamed from: d, reason: collision with root package name */
    public final s1.InterfaceC0991a f3566d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f3567e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv6.impl.d f3568f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv6.impl.n f3569g;

    public f(java.lang.String str, com.android.billingclient.api.BillingClient billingClient, io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider, io.appmetrica.analytics.billingv6.impl.h hVar, java.util.List list, io.appmetrica.analytics.billingv6.impl.d dVar, io.appmetrica.analytics.billingv6.impl.n nVar) {
        this.f3563a = str;
        this.f3564b = billingClient;
        this.f3565c = utilsProvider;
        this.f3566d = hVar;
        this.f3567e = list;
        this.f3568f = dVar;
        this.f3569g = nVar;
    }

    public final void onProductDetailsResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3565c.getWorkerExecutor().execute(new io.appmetrica.analytics.billingv6.impl.e(this, billingResult, list));
    }
}
