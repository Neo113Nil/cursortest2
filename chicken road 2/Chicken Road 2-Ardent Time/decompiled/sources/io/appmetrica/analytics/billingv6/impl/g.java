package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class g extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv6.impl.i f3570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.BillingResult f3571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3572c;

    public g(io.appmetrica.analytics.billingv6.impl.i iVar, com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3570a = iVar;
        this.f3571b = billingResult;
        this.f3572c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.billingv6.impl.i iVar = this.f3570a;
        com.android.billingclient.api.BillingResult billingResult = this.f3571b;
        java.util.List<com.android.billingclient.api.PurchaseHistoryRecord> list = this.f3572c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f3581f.onUpdateFinished();
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (com.android.billingclient.api.PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (java.lang.String str : purchaseHistoryRecord.getProducts()) {
                    java.lang.String str2 = iVar.f3579d;
                    io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo = new io.appmetrica.analytics.billinginterface.internal.BillingInfo(kotlin.jvm.internal.i.a(str2, "inapp") ? io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP : kotlin.jvm.internal.i.a(str2, "subs") ? io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS : io.appmetrica.analytics.billinginterface.internal.ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            java.util.Map<java.lang.String, io.appmetrica.analytics.billinginterface.internal.BillingInfo> billingInfoToUpdate = iVar.f3578c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f3576a, linkedHashMap, iVar.f3578c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                io.appmetrica.analytics.billingv6.impl.m.a(linkedHashMap, billingInfoToUpdate, iVar.f3579d, iVar.f3578c.getBillingInfoManager());
                iVar.f3581f.onUpdateFinished();
            } else {
                java.util.List X2 = i1.AbstractC0190i.X(billingInfoToUpdate.keySet());
                io.appmetrica.analytics.billingv6.impl.n nVar = iVar.f3581f;
                io.appmetrica.analytics.billingv6.impl.h hVar = new io.appmetrica.analytics.billingv6.impl.h(linkedHashMap, billingInfoToUpdate, iVar);
                java.lang.String str3 = iVar.f3579d;
                com.android.billingclient.api.BillingClient billingClient = iVar.f3577b;
                io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider = iVar.f3578c;
                io.appmetrica.analytics.billingv6.impl.d dVar = iVar.f3580e;
                io.appmetrica.analytics.billingv6.impl.f fVar = new io.appmetrica.analytics.billingv6.impl.f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f3559b.add(fVar);
                if (iVar.f3577b.isReady()) {
                    com.android.billingclient.api.BillingClient billingClient2 = iVar.f3577b;
                    com.android.billingclient.api.QueryProductDetailsParams.Builder newBuilder = com.android.billingclient.api.QueryProductDetailsParams.newBuilder();
                    java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(X2));
                    java.util.Iterator it = X2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.android.billingclient.api.QueryProductDetailsParams.Product.newBuilder().setProductId((java.lang.String) it.next()).setProductType(iVar.f3579d).build());
                    }
                    billingClient2.queryProductDetailsAsync(newBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f3580e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        io.appmetrica.analytics.billingv6.impl.i iVar2 = this.f3570a;
        iVar2.f3580e.a(iVar2);
    }
}
