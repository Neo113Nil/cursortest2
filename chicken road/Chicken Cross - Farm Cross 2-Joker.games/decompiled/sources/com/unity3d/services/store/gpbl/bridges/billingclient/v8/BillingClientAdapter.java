package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.U3;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: BillingClientAdapter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientAdapter;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientBuilderBridge", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;", "<init>", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;)V", "billingClient", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBridge;", "initialize", "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", InAppPurchaseConstants.METHOD_START_CONNECTION, "billingClientStateListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "isFeatureSupported", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "purchaseType", "", "isReady", "", "queryPurchasesAsync", "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "queryProductDetailsAsync", "productId", U3.i.m, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", "getAdapterVersion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;

    public BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge) {
        Intrinsics.checkNotNullParameter(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(BillingInitializationListener billingInitializationListener) {
        Intrinsics.checkNotNullParameter(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        BillingClientBridgeCommon build = this.billingClientBuilderBridge.build();
        Intrinsics.checkNotNull(build, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge");
        this.billingClient = (BillingClientBridge) build;
        startConnection(billingInitializationListener);
        get_isInitialized$unity_ads_defaultRelease().setValue(true);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public BillingResultResponseCode isFeatureSupported(String purchaseType) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isFeatureSupported(purchaseType);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isReady();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(String purchaseType, PurchasesResponseListener purchasesResponseListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryPurchasesAsync(purchaseType, new PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(String productId, String productType, final ProductDetailsListener listener) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        QueryProductDetailsParamsBridge build = QueryProductDetailsParamsBridge.INSTANCE.newBuilder().setProductList(CollectionsKt.listOf(ProductBridge.INSTANCE.newBuilder().setProductId(productId).setProductType(productType).build())).build();
        ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy = new ProductDetailsResponseListenerProxy(new ProductDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener
            public void onProductDetailsResponse(BillingResultBridge billingResult, QueryProductDetailsResultsBridge queryProductDetailsResults) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                Intrinsics.checkNotNullParameter(queryProductDetailsResults, "queryProductDetailsResults");
                List<ProductDetailsBridge> productDetailsList = queryProductDetailsResults.getProductDetailsList();
                if (productDetailsList.isEmpty()) {
                    ProductDetailsListener.this.onProductDetailsResponse(billingResult, null);
                } else {
                    JSONObject originalJson = productDetailsList.get(0).getOriginalJson();
                    ProductDetailsListener.this.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
                }
            }
        });
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryProductDetailsAsync(build, productDetailsResponseListenerProxy);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public String getAdapterVersion() {
        return "8";
    }
}
