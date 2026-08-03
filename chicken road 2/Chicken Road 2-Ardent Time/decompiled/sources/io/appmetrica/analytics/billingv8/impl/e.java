package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class e extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv8.impl.f f3613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.BillingResult f3614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.QueryProductDetailsResult f3615c;

    public e(io.appmetrica.analytics.billingv8.impl.f fVar, com.android.billingclient.api.BillingResult billingResult, com.android.billingclient.api.QueryProductDetailsResult queryProductDetailsResult) {
        this.f3613a = fVar;
        this.f3614b = billingResult;
        this.f3615c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.billingv8.impl.f fVar = this.f3613a;
        com.android.billingclient.api.BillingResult billingResult = this.f3614b;
        java.util.List productDetailsList = this.f3615c.getProductDetailsList();
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || productDetailsList.isEmpty()) {
            fVar.f3622g.onUpdateFinished();
        } else {
            io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider = fVar.f3618c;
            s1.InterfaceC0991a interfaceC0991a = fVar.f3619d;
            java.util.List list = fVar.f3620e;
            io.appmetrica.analytics.billingv8.impl.d dVar = fVar.f3621f;
            io.appmetrica.analytics.billingv8.impl.k kVar = new io.appmetrica.analytics.billingv8.impl.k(utilsProvider, interfaceC0991a, list, productDetailsList, dVar, fVar.f3622g);
            dVar.f3612b.add(kVar);
            if (fVar.f3617b.isReady()) {
                fVar.f3617b.queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams.newBuilder().setProductType(fVar.f3616a).build(), kVar);
            } else {
                fVar.f3621f.a(kVar);
                fVar.f3622g.onUpdateFinished();
            }
        }
        io.appmetrica.analytics.billingv8.impl.f fVar2 = this.f3613a;
        fVar2.f3621f.a(fVar2);
    }
}
