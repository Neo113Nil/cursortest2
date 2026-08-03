package com.unity3d.services.store.gpbl;

/* loaded from: classes6.dex */
public class StoreBilling {
    private final com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient _billingClientBridge;

    public StoreBilling(android.content.Context context, com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener purchaseUpdatedResponseListener) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        this._billingClientBridge = com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientBuilderFactory.getBillingClientBuilder(context).setListener(new com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy(purchaseUpdatedResponseListener)).enablePendingPurchases().build();
    }

    public void initialize(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener billingClientStateListener) throws java.lang.ClassNotFoundException {
        this._billingClientBridge.startConnection(new com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy(billingClientStateListener));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int isFeatureSupported(java.lang.String str) {
        if (str.equals("inapp")) {
            return this._billingClientBridge.isReady() ? 0 : -1;
        }
        if (str.equals("subs")) {
            str = "subscriptions";
        }
        if (this._billingClientBridge.isFeatureSupported(str) == com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
        }
    }

    public void getPurchases(java.lang.String str, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener purchasesResponseListener) throws java.lang.ClassNotFoundException {
        this._billingClientBridge.queryPurchasesAsync(str, new com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    public void getSkuDetails(java.lang.String str, java.util.List<java.lang.String> list, com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener skuDetailsResponseListener) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        this._billingClientBridge.querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.newBuilder().setSkuList(list).setType(str).build(), new com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy(skuDetailsResponseListener));
    }

    public void getPurchaseHistory(java.lang.String str, int i, com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener purchaseHistoryResponseListener) throws java.lang.ClassNotFoundException {
        this._billingClientBridge.queryPurchaseHistoryAsync(str, new com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy(purchaseHistoryResponseListener, i));
    }
}
