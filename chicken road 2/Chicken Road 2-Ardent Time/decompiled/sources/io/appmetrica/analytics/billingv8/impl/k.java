package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class k implements com.android.billingclient.api.PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider f3638a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.InterfaceC0991a f3639b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f3640c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f3641d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv8.impl.d f3642e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv8.impl.n f3643f;

    public k(io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider, s1.InterfaceC0991a interfaceC0991a, java.util.List list, java.util.List list2, io.appmetrica.analytics.billingv8.impl.d dVar, io.appmetrica.analytics.billingv8.impl.n nVar) {
        this.f3638a = utilsProvider;
        this.f3639b = interfaceC0991a;
        this.f3640c = list;
        this.f3641d = list2;
        this.f3642e = dVar;
        this.f3643f = nVar;
    }

    public final void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3638a.getWorkerExecutor().execute(new io.appmetrica.analytics.billingv8.impl.j(this, billingResult, list));
    }
}
