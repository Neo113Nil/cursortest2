package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

/* compiled from: BillingClientBridge.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0016"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBridgeCommon;", "billingClientInternalInstance", "", "(Ljava/lang/Object;)V", com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, "", "queryProductDetailsParamsBridge", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "productDetailsResponseListenerProxy", "Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy;", com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchaseType", "", "purchasesResponseListenerProxy", "Lcom/unity3d/services/store/gpbl/proxies/PurchasesResponseListenerProxy;", "querySkuDetailsAsync", "params", "Lcom/unity3d/services/store/gpbl/bridges/SkuDetailsParamsBridge;", "skuDetailsResponseListenerProxy", "Lcom/unity3d/services/store/gpbl/proxies/SkuDetailsResponseListenerProxy;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingClientBridge extends com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion INSTANCE = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion(null);
    public static final java.lang.String QUERY_PRODUCT_DETAILS_ASYNC_METHOD = "queryProductDetailsAsync";
    public static final java.lang.String QUERY_PURCHASES_ASYNC_METHOD = "queryPurchasesAsync";

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBuilderBridge newBuilder(android.content.Context context) throws java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
        return INSTANCE.newBuilder(context);
    }

    public BillingClientBridge(java.lang.Object obj) {
        super(obj, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(QUERY_PURCHASES_ASYNC_METHOD, new java.lang.Class[]{com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryPurchasesParamsBridge.INSTANCE.getClassForParams(), com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy.getProxyListenerClass()}), kotlin.TuplesKt.to(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, new java.lang.Class[]{com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge.INSTANCE.getClassForParams(), com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy.INSTANCE.getProxyListenerClass()})));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(java.lang.String purchaseType, com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws java.lang.ClassNotFoundException {
        if (purchaseType != null) {
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge build = com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryPurchasesParamsBridge.INSTANCE.newBuilder().setProductType(purchaseType).build();
            java.lang.Object obj = this._billingClientInternalInstance;
            java.lang.Object queryProductDetailsParamsInternalInstance = build.getQueryProductDetailsParamsInternalInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNull(purchasesResponseListenerProxy);
            callVoidMethod(QUERY_PURCHASES_ASYNC_METHOD, obj, queryProductDetailsParamsInternalInstance, purchasesResponseListenerProxy.getProxyInstance());
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge params, com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws java.lang.ClassNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skuDetailsResponseListenerProxy, "skuDetailsResponseListenerProxy");
        throw new java.lang.NoSuchMethodException("querySkuDetailsAsync does not exist in Billing Library v8, use queryProductDetailsAsync instead");
    }

    public final void queryProductDetailsAsync(com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge queryProductDetailsParamsBridge, com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryProductDetailsParamsBridge, "queryProductDetailsParamsBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productDetailsResponseListenerProxy, "productDetailsResponseListenerProxy");
        callVoidMethod(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, this._billingClientInternalInstance, queryProductDetailsParamsBridge.getQueryProductDetailsParamsInternalInstance(), productDetailsResponseListenerProxy.getProxyInstance());
    }

    /* compiled from: BillingClientBridge.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge$Companion;", "", "()V", "QUERY_PRODUCT_DETAILS_ASYNC_METHOD", "", "QUERY_PURCHASES_ASYNC_METHOD", "newBuilder", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;", "context", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBuilderBridge newBuilder(android.content.Context context) throws java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBuilderBridge(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.callNonVoidStaticMethod("newBuilder", context));
        }
    }
}
