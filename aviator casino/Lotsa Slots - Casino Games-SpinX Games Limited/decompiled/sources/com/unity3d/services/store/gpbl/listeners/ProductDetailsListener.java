package com.unity3d.services.store.gpbl.listeners;

/* compiled from: ProductDetailsListener.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", "", com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy.onProductDetailsResponseMethodName, "", "billingResultBridge", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "productDetailsJson", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ProductDetailsListener {
    void onProductDetailsResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResultBridge, java.lang.String productDetailsJson);
}
