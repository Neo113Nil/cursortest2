package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

/* loaded from: classes6.dex */
public class BillingClientBridge extends com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon {
    private static final java.lang.String queryPurchasesAsyncMethodName = "queryPurchasesAsync";
    private static final java.lang.String querySkuDetailsAsyncMethodName = "querySkuDetailsAsync";

    public BillingClientBridge(java.lang.Object obj) throws java.lang.ClassNotFoundException {
        super(obj, new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.1
            {
                put(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.querySkuDetailsAsyncMethodName, new java.lang.Class[]{com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.getClassForBridge(), com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy.getProxyListenerClass()});
                put("queryPurchasesAsync", new java.lang.Class[]{java.lang.String.class, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy.getProxyListenerClass()});
            }
        });
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(java.lang.String str, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws java.lang.ClassNotFoundException {
        callVoidMethod("queryPurchasesAsync", this._billingClientInternalInstance, str, purchasesResponseListenerProxy.getProxyInstance());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge skuDetailsParamsBridge, com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws java.lang.ClassNotFoundException {
        callVoidMethod(querySkuDetailsAsyncMethodName, this._billingClientInternalInstance, skuDetailsParamsBridge.getInternalInstance(), skuDetailsResponseListenerProxy.getProxyInstance());
    }

    public static com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge newBuilder(android.content.Context context) throws java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
        return new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge(callNonVoidStaticMethod("newBuilder", context));
    }
}
