package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

/* compiled from: BillingClientAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientAdapter;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientBuilderBridge", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge;", "detectedVersion", "", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge;I)V", "billingClient", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBridge;", "getAdapterVersion", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "isFeatureSupported", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "purchaseType", "isReady", "", com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, com.ironsource.X3.i.m, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "startConnection", "billingClientStateListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge billingClient;
    private final com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge billingClientBuilderBridge;
    private final int detectedVersion;

    public /* synthetic */ BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge billingClientBuilderBridge, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(billingClientBuilderBridge, (i2 & 2) != 0 ? 6 : i);
    }

    public BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge billingClientBuilderBridge, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
        this.detectedVersion = i;
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
        kotlin.jvm.internal.Intrinsics.checkNotNull(build, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge");
        this.billingClient = (com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge) build;
        startConnection(billingInitializationListener);
        get_isInitialized$unity_ads_defaultRelease().setValue(true);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(com.unity3d.services.store.gpbl.listeners.BillingClientStateListener billingClientStateListener) {
        com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.startConnection(new com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy(billingClientStateListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public com.unity3d.services.store.gpbl.BillingResultResponseCode isFeatureSupported(java.lang.String purchaseType) {
        com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isFeatureSupported(purchaseType);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isReady();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(java.lang.String purchaseType, com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener purchasesResponseListener) {
        com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge billingClientBridge = this.billingClient;
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
        com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge build = com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.newBuilder().setSkuList(kotlin.collections.CollectionsKt.listOf(productId)).setType(productType).build();
        com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.querySkuDetailsAsync(build, new com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy(new com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter$queryProductDetailsAsync$1
            @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
            public void onSkuDetailsUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge> skuDetailsList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                java.util.List<? extends com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge> list = skuDetailsList;
                if (list == null || list.isEmpty()) {
                    com.unity3d.services.store.gpbl.listeners.ProductDetailsListener.this.onProductDetailsResponse(billingResult, null);
                    return;
                }
                com.unity3d.services.store.gpbl.listeners.ProductDetailsListener productDetailsListener = com.unity3d.services.store.gpbl.listeners.ProductDetailsListener.this;
                org.json.JSONObject originalJson = skuDetailsList.get(0).getOriginalJson();
                productDetailsListener.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
            }
        }));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public java.lang.String getAdapterVersion() {
        return java.lang.String.valueOf(this.detectedVersion);
    }
}
