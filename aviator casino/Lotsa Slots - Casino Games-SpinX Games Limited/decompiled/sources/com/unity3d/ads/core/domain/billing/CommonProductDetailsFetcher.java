package com.unity3d.ads.core.domain.billing;

/* compiled from: CommonProductDetailsFetcher.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/CommonProductDetailsFetcher;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "billingClientAdapter", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", com.ironsource.X3.i.m, "", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Ljava/lang/String;)V", "fetchProductDetails", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonProductDetailsFetcher implements com.unity3d.ads.core.domain.billing.ProductDetailsFetcher {
    private final com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter;
    private final java.lang.String productType;

    public CommonProductDetailsFetcher(com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter, java.lang.String productType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
        this.billingClientAdapter = billingClientAdapter;
        this.productType = productType;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public java.lang.Object fetchProductDetails(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.billing.ProductDetailsResult> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        com.unity3d.services.store.gpbl.listeners.ProductDetailsListener productDetailsListener = new com.unity3d.services.store.gpbl.listeners.ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge billingResult, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (str2 != null && billingResult.getResponseCode() == com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
                    kotlinx.coroutines.CancellableContinuation<com.unity3d.ads.core.domain.billing.ProductDetailsResult> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(new com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success(str2)));
                } else if (billingResult.getResponseCode() == com.unity3d.services.store.gpbl.BillingResultResponseCode.OK) {
                    kotlinx.coroutines.CancellableContinuation<com.unity3d.ads.core.domain.billing.ProductDetailsResult> cancellableContinuation2 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    cancellableContinuation2.resumeWith(kotlin.Result.m10798constructorimpl(com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound.INSTANCE));
                } else {
                    kotlinx.coroutines.CancellableContinuation<com.unity3d.ads.core.domain.billing.ProductDetailsResult> cancellableContinuation3 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    cancellableContinuation3.resumeWith(kotlin.Result.m10798constructorimpl(new com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure(billingResult)));
                }
            }
        };
        com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
