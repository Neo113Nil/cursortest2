package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class a extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv6.impl.b f3548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.BillingResult f3549b;

    public a(io.appmetrica.analytics.billingv6.impl.b bVar, com.android.billingclient.api.BillingResult billingResult) {
        this.f3548a = bVar;
        this.f3549b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.billingv6.impl.b bVar = this.f3548a;
        com.android.billingclient.api.BillingResult billingResult = this.f3549b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f3554e.onUpdateFinished();
            return;
        }
        for (java.lang.String str : i1.AbstractC0191j.H("inapp", "subs")) {
            io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig = bVar.f3550a;
            com.android.billingclient.api.BillingClient billingClient = bVar.f3551b;
            io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider = bVar.f3552c;
            io.appmetrica.analytics.billingv6.impl.d dVar = bVar.f3553d;
            io.appmetrica.analytics.billingv6.impl.i iVar = new io.appmetrica.analytics.billingv6.impl.i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f3554e);
            dVar.f3559b.add(iVar);
            if (bVar.f3551b.isReady()) {
                bVar.f3551b.queryPurchaseHistoryAsync(com.android.billingclient.api.QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), iVar);
            } else {
                bVar.f3553d.a(iVar);
                bVar.f3554e.onUpdateFinished();
            }
        }
    }
}
