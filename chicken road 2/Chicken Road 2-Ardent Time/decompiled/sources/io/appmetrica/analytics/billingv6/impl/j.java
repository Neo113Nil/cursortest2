package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class j extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv6.impl.k f3582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.BillingResult f3583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3584c;

    public j(io.appmetrica.analytics.billingv6.impl.k kVar, com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3582a = kVar;
        this.f3583b = billingResult;
        this.f3584c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        io.appmetrica.analytics.billinginterface.internal.ProductInfo productInfo;
        java.lang.String originalJson;
        java.lang.String str;
        java.lang.String originalJson2;
        io.appmetrica.analytics.billingv6.impl.k kVar = this.f3582a;
        com.android.billingclient.api.BillingResult billingResult = this.f3583b;
        java.util.List<com.android.billingclient.api.Purchase> list = this.f3584c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f3590f.onUpdateFinished();
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (com.android.billingclient.api.Purchase purchase : list) {
                java.util.Iterator it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put((java.lang.String) it.next(), purchase);
                }
            }
            java.util.List<com.android.billingclient.api.PurchaseHistoryRecord> list2 = kVar.f3587c;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (com.android.billingclient.api.PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                java.util.Iterator it2 = purchaseHistoryRecord.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((java.lang.String) it2.next(), purchaseHistoryRecord);
                }
            }
            java.util.List<com.android.billingclient.api.ProductDetails> list3 = kVar.f3588d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.android.billingclient.api.ProductDetails productDetails : list3) {
                com.android.billingclient.api.PurchaseHistoryRecord purchaseHistoryRecord2 = (com.android.billingclient.api.PurchaseHistoryRecord) linkedHashMap2.get(productDetails.getProductId());
                if (purchaseHistoryRecord2 != null) {
                    com.android.billingclient.api.Purchase purchase2 = (com.android.billingclient.api.Purchase) linkedHashMap.get(productDetails.getProductId());
                    java.lang.String productType = productDetails.getProductType();
                    int hashCode = productType.hashCode();
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && productType.equals("inapp")) {
                            java.lang.String productType2 = productDetails.getProductType();
                            io.appmetrica.analytics.billinginterface.internal.ProductType productType3 = kotlin.jvm.internal.i.a(productType2, "inapp") ? io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP : kotlin.jvm.internal.i.a(productType2, "subs") ? io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS : io.appmetrica.analytics.billinginterface.internal.ProductType.UNKNOWN;
                            java.lang.String productId = productDetails.getProductId();
                            int quantity = purchaseHistoryRecord2.getQuantity();
                            com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (str = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                str = "";
                            }
                            productInfo = new io.appmetrica.analytics.billinginterface.internal.ProductInfo(productType3, productId, quantity, priceAmountMicros, str, 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson2 = purchase2.getOriginalJson()) == null) ? "{}" : originalJson2);
                        }
                    } else if (productType.equals("subs")) {
                        java.lang.String productType4 = productDetails.getProductType();
                        productInfo = new io.appmetrica.analytics.billinginterface.internal.ProductInfo(kotlin.jvm.internal.i.a(productType4, "inapp") ? io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP : kotlin.jvm.internal.i.a(productType4, "subs") ? io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS : io.appmetrica.analytics.billinginterface.internal.ProductType.UNKNOWN, productDetails.getProductId(), purchaseHistoryRecord2.getQuantity(), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson = purchase2.getOriginalJson()) == null) ? "{}" : originalJson);
                    }
                    if (productInfo == null) {
                        arrayList.add(productInfo);
                    }
                }
                productInfo = null;
                if (productInfo == null) {
                }
            }
            kVar.f3585a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f3586b.invoke();
            kVar.f3590f.onUpdateFinished();
        }
        io.appmetrica.analytics.billingv6.impl.k kVar2 = this.f3582a;
        kVar2.f3589e.a(kVar2);
    }
}
