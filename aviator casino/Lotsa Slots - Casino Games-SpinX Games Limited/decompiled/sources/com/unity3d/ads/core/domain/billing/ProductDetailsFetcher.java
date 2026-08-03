package com.unity3d.ads.core.domain.billing;

/* compiled from: ProductDetailsFetcher.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "", "fetchProductDetails", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ProductDetailsFetcher {
    java.lang.Object fetchProductDetails(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.billing.ProductDetailsResult> continuation);
}
