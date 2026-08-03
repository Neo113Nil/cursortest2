package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class k implements com.android.billingclient.api.PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider f3585a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.InterfaceC0991a f3586b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f3587c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f3588d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv6.impl.d f3589e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.billingv6.impl.n f3590f;

    public k(io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider, s1.InterfaceC0991a interfaceC0991a, java.util.List list, java.util.List list2, io.appmetrica.analytics.billingv6.impl.d dVar, io.appmetrica.analytics.billingv6.impl.n nVar) {
        this.f3585a = utilsProvider;
        this.f3586b = interfaceC0991a;
        this.f3587c = list;
        this.f3588d = list2;
        this.f3589e = dVar;
        this.f3590f = nVar;
    }

    public final void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3585a.getWorkerExecutor().execute(new io.appmetrica.analytics.billingv6.impl.j(this, billingResult, list));
    }
}
