package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class e extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv6.impl.f f3560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.BillingResult f3561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3562c;

    public e(io.appmetrica.analytics.billingv6.impl.f fVar, com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3560a = fVar;
        this.f3561b = billingResult;
        this.f3562c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.billingv6.impl.f fVar = this.f3560a;
        com.android.billingclient.api.BillingResult billingResult = this.f3561b;
        java.util.List list = this.f3562c;
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || list.isEmpty()) {
            fVar.f3569g.onUpdateFinished();
        } else {
            io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider = fVar.f3565c;
            s1.InterfaceC0991a interfaceC0991a = fVar.f3566d;
            java.util.List list2 = fVar.f3567e;
            io.appmetrica.analytics.billingv6.impl.d dVar = fVar.f3568f;
            io.appmetrica.analytics.billingv6.impl.k kVar = new io.appmetrica.analytics.billingv6.impl.k(utilsProvider, interfaceC0991a, list2, list, dVar, fVar.f3569g);
            dVar.f3559b.add(kVar);
            if (fVar.f3564b.isReady()) {
                fVar.f3564b.queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams.newBuilder().setProductType(fVar.f3563a).build(), kVar);
            } else {
                fVar.f3568f.a(kVar);
                fVar.f3569g.onUpdateFinished();
            }
        }
        io.appmetrica.analytics.billingv6.impl.f fVar2 = this.f3560a;
        fVar2.f3568f.a(fVar2);
    }
}
