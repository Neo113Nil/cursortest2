package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

/* compiled from: BillingClientAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientAdapter;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientBuilderBridge", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;)V", "billingClient", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge;", "getAdapterVersion", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "isFeatureSupported", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "purchaseType", "isReady", "", com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, com.ironsource.X3.i.m, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "startConnection", "billingClientStateListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge billingClient;
    private final com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBuilderBridge billingClientBuilderBridge;

    public BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBuilderBridge billingClientBuilderBridge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(com.unity3d.services.store.gpbl.listeners.BillingInitializationListener billingInitializationListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon build = this.billingClientBuilderBridge.build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge");
        this.billingClient = (com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge) build;
        startConnection(billingInitializationListener);
        get_isInitialized$unity_ads_defaultRelease().setValue(true);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener billingClientStateListener) {
        com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.startConnection(new com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy(billingClientStateListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public com.unity3d.services.store.gpbl.BillingResultResponseCode isFeatureSupported(java.lang.String purchaseType) {
        com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isFeatureSupported(purchaseType);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isReady();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(java.lang.String purchaseType, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener purchasesResponseListener) {
        com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryPurchasesAsync(purchaseType, new com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(java.lang.String productId, java.lang.String productType, final com.unity3d.services.store.gpbl.listeners.ProductDetailsListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productId, "productId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge build = com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge.INSTANCE.newBuilder().setProductList(kotlin.collections.CollectionsKt.listOf(com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBridge.INSTANCE.newBuilder().setProductId(productId).setProductType(productType).build())).build();
        com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy = new com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy(new com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener
            public void onProductDetailsResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge queryProductDetailsResults) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryProductDetailsResults, "queryProductDetailsResults");
                java.util.List<com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductDetailsBridge> productDetailsList = queryProductDetailsResults.getProductDetailsList();
                if (productDetailsList.isEmpty()) {
                    com.unity3d.services.store.gpbl.listeners.ProductDetailsListener.this.onProductDetailsResponse(billingResult, null);
                } else {
                    org.json.JSONObject originalJson = productDetailsList.get(0).getOriginalJson();
                    com.unity3d.services.store.gpbl.listeners.ProductDetailsListener.this.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
                }
            }
        });
        com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryProductDetailsAsync(build, productDetailsResponseListenerProxy);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public java.lang.String getAdapterVersion() {
        return "8";
    }
}
