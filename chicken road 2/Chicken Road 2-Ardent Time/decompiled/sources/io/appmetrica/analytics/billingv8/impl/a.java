package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class a extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv8.impl.b f3601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.BillingResult f3602b;

    public a(io.appmetrica.analytics.billingv8.impl.b bVar, com.android.billingclient.api.BillingResult billingResult) {
        this.f3601a = bVar;
        this.f3602b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.billingv8.impl.b bVar = this.f3601a;
        com.android.billingclient.api.BillingResult billingResult = this.f3602b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f3607e.onUpdateFinished();
            return;
        }
        if (!bVar.f3604b.isReady()) {
            bVar.f3607e.onUpdateFinished();
            return;
        }
        for (java.lang.String str : i1.AbstractC0191j.H("inapp", "subs")) {
            io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig = bVar.f3603a;
            com.android.billingclient.api.BillingClient billingClient = bVar.f3604b;
            io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider = bVar.f3605c;
            io.appmetrica.analytics.billingv8.impl.d dVar = bVar.f3606d;
            io.appmetrica.analytics.billingv8.impl.i iVar = new io.appmetrica.analytics.billingv8.impl.i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f3607e);
            dVar.f3612b.add(iVar);
            bVar.f3604b.queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams.newBuilder().setProductType(str).build(), iVar);
        }
    }
}
