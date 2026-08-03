package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class j extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv8.impl.k f3635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.BillingResult f3636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3637c;

    public j(io.appmetrica.analytics.billingv8.impl.k kVar, com.android.billingclient.api.BillingResult billingResult, java.util.List list) {
        this.f3635a = kVar;
        this.f3636b = billingResult;
        this.f3637c = list;
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
        io.appmetrica.analytics.billingv8.impl.k kVar = this.f3635a;
        com.android.billingclient.api.BillingResult billingResult = this.f3636b;
        java.util.List<com.android.billingclient.api.Purchase> list = this.f3637c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f3643f.onUpdateFinished();
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (com.android.billingclient.api.Purchase purchase : list) {
                java.util.Iterator it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put((java.lang.String) it.next(), purchase);
                }
            }
            java.util.List<com.android.billingclient.api.Purchase> list2 = kVar.f3640c;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (com.android.billingclient.api.Purchase purchase2 : list2) {
                java.util.Iterator it2 = purchase2.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((java.lang.String) it2.next(), purchase2);
                }
            }
            java.util.List<com.android.billingclient.api.ProductDetails> list3 = kVar.f3641d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.android.billingclient.api.ProductDetails productDetails : list3) {
                com.android.billingclient.api.Purchase purchase3 = (com.android.billingclient.api.Purchase) linkedHashMap2.get(productDetails.getProductId());
                if (purchase3 != null) {
                    com.android.billingclient.api.Purchase purchase4 = (com.android.billingclient.api.Purchase) linkedHashMap.get(productDetails.getProductId());
                    java.lang.String productType = productDetails.getProductType();
                    int hashCode = productType.hashCode();
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && productType.equals("inapp")) {
                            java.lang.String productType2 = productDetails.getProductType();
                            io.appmetrica.analytics.billinginterface.internal.ProductType productType3 = kotlin.jvm.internal.i.a(productType2, "inapp") ? io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP : kotlin.jvm.internal.i.a(productType2, "subs") ? io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS : io.appmetrica.analytics.billinginterface.internal.ProductType.UNKNOWN;
                            java.lang.String productId = productDetails.getProductId();
                            int quantity = purchase3.getQuantity();
                            com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            com.android.billingclient.api.ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (str = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                str = "";
                            }
                            productInfo = new io.appmetrica.analytics.billinginterface.internal.ProductInfo(productType3, productId, quantity, priceAmountMicros, str, 0L, null, 1, null, purchase3.getSignature(), purchase3.getPurchaseToken(), purchase3.getPurchaseTime(), purchase4 != null ? purchase4.isAutoRenewing() : false, (purchase4 == null || (originalJson2 = purchase4.getOriginalJson()) == null) ? "{}" : originalJson2);
                        }
                    } else if (productType.equals("subs")) {
                        java.lang.String productType4 = productDetails.getProductType();
                        productInfo = new io.appmetrica.analytics.billinginterface.internal.ProductInfo(kotlin.jvm.internal.i.a(productType4, "inapp") ? io.appmetrica.analytics.billinginterface.internal.ProductType.INAPP : kotlin.jvm.internal.i.a(productType4, "subs") ? io.appmetrica.analytics.billinginterface.internal.ProductType.SUBS : io.appmetrica.analytics.billinginterface.internal.ProductType.UNKNOWN, productDetails.getProductId(), purchase3.getQuantity(), 0L, "", 0L, null, 1, null, purchase3.getSignature(), purchase3.getPurchaseToken(), purchase3.getPurchaseTime(), purchase4 != null ? purchase4.isAutoRenewing() : false, (purchase4 == null || (originalJson = purchase4.getOriginalJson()) == null) ? "{}" : originalJson);
                    }
                    if (productInfo == null) {
                        arrayList.add(productInfo);
                    }
                }
                productInfo = null;
                if (productInfo == null) {
                }
            }
            kVar.f3638a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f3639b.invoke();
            kVar.f3643f.onUpdateFinished();
        }
        io.appmetrica.analytics.billingv8.impl.k kVar2 = this.f3635a;
        kVar2.f3642e.a(kVar2);
    }
}
