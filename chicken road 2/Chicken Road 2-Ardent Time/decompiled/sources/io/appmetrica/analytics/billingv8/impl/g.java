package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class g extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv8.impl.i f3623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.BillingResult f3624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3625c;

    public g(io.appmetrica.analytics.billingv8.impl.i iVar, com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3623a = iVar;
        this.f3624b = billingResult;
        this.f3625c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.billingv8.impl.i iVar = this.f3623a;
        com.android.billingclient.api.BillingResult billingResult = this.f3624b;
        java.util.List<com.android.billingclient.api.Purchase> list = this.f3625c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            iVar.f3634f.onUpdateFinished();
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (com.android.billingclient.api.Purchase purchase : list) {
                for (java.lang.String str : purchase.getProducts()) {
                    java.lang.String str2 = iVar.f3632d;
                    io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo = new io.appmetrica.analytics.billinginterface.internal.BillingInfo(kotlin.jvm.internal.i.a(str2, "inapp") ? io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP : kotlin.jvm.internal.i.a(str2, "subs") ? io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS : io.appmetrica.analytics.billinginterface.internal.ProductType.UNKNOWN, str, purchase.getPurchaseToken(), purchase.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            java.util.Map<java.lang.String, io.appmetrica.analytics.billinginterface.internal.BillingInfo> billingInfoToUpdate = iVar.f3631c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f3629a, linkedHashMap, iVar.f3631c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                io.appmetrica.analytics.billingv8.impl.m.a(linkedHashMap, billingInfoToUpdate, iVar.f3632d, iVar.f3631c.getBillingInfoManager());
                iVar.f3634f.onUpdateFinished();
            } else {
                java.util.List X2 = i1.AbstractC0190i.X(billingInfoToUpdate.keySet());
                io.appmetrica.analytics.billingv8.impl.n nVar = iVar.f3634f;
                io.appmetrica.analytics.billingv8.impl.h hVar = new io.appmetrica.analytics.billingv8.impl.h(linkedHashMap, billingInfoToUpdate, iVar);
                java.lang.String str3 = iVar.f3632d;
                com.android.billingclient.api.BillingClient billingClient = iVar.f3630b;
                io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider utilsProvider = iVar.f3631c;
                io.appmetrica.analytics.billingv8.impl.d dVar = iVar.f3633e;
                io.appmetrica.analytics.billingv8.impl.f fVar = new io.appmetrica.analytics.billingv8.impl.f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f3612b.add(fVar);
                if (iVar.f3630b.isReady()) {
                    com.android.billingclient.api.BillingClient billingClient2 = iVar.f3630b;
                    com.android.billingclient.api.QueryProductDetailsParams.Builder newBuilder = com.android.billingclient.api.QueryProductDetailsParams.newBuilder();
                    java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(X2));
                    java.util.Iterator it = X2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.android.billingclient.api.QueryProductDetailsParams.Product.newBuilder().setProductId((java.lang.String) it.next()).setProductType(iVar.f3632d).build());
                    }
                    billingClient2.queryProductDetailsAsync(newBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f3633e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        io.appmetrica.analytics.billingv8.impl.i iVar2 = this.f3623a;
        iVar2.f3633e.a(iVar2);
    }
}
