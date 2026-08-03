package com.unity3d.ads.core.domain.billing;

/* compiled from: ProductDetailsFetcherWithFallback.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcherWithFallback;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "primaryFetcher", "secondaryFetcher", "(Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;)V", "fetchProductDetails", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProductDetailsFetcherWithFallback implements com.unity3d.ads.core.domain.billing.ProductDetailsFetcher {
    private final com.unity3d.ads.core.domain.billing.ProductDetailsFetcher primaryFetcher;
    private final com.unity3d.ads.core.domain.billing.ProductDetailsFetcher secondaryFetcher;

    public ProductDetailsFetcherWithFallback(com.unity3d.ads.core.domain.billing.ProductDetailsFetcher primaryFetcher, com.unity3d.ads.core.domain.billing.ProductDetailsFetcher secondaryFetcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryFetcher, "primaryFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object fetchProductDetails(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.billing.ProductDetailsResult> continuation) {
        com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 productDetailsFetcherWithFallback$fetchProductDetails$1;
        int i;
        com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback productDetailsFetcherWithFallback;
        com.unity3d.ads.core.domain.billing.ProductDetailsResult productDetailsResult;
        com.unity3d.ads.core.domain.billing.ProductDetailsResult productDetailsResult2;
        if (continuation instanceof com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1) {
            productDetailsFetcherWithFallback$fetchProductDetails$1 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1) continuation;
            if ((productDetailsFetcherWithFallback$fetchProductDetails$1.label & Integer.MIN_VALUE) != 0) {
                productDetailsFetcherWithFallback$fetchProductDetails$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.domain.billing.ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = this;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$1 = str;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 1;
                    obj = productDetailsFetcher.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    productDetailsFetcherWithFallback = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        productDetailsResult2 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.unity3d.ads.core.domain.billing.ProductDetailsResult productDetailsResult3 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) obj;
                        return !(productDetailsResult3 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success) ? productDetailsResult3 : productDetailsResult2;
                    }
                    str = (java.lang.String) productDetailsFetcherWithFallback$fetchProductDetails$1.L$1;
                    productDetailsFetcherWithFallback = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                productDetailsResult = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) obj;
                if (!(productDetailsResult instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success)) {
                    return productDetailsResult;
                }
                if (productDetailsResult instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound) {
                    com.unity3d.ads.core.domain.billing.ProductDetailsFetcher productDetailsFetcher2 = productDetailsFetcherWithFallback.secondaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = null;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$1 = null;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 2;
                    obj = productDetailsFetcher2.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                if (productDetailsResult instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure) {
                    com.unity3d.ads.core.domain.billing.ProductDetailsFetcher productDetailsFetcher3 = productDetailsFetcherWithFallback.secondaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = productDetailsResult;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$1 = null;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 3;
                    java.lang.Object fetchProductDetails = productDetailsFetcher3.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (fetchProductDetails == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = fetchProductDetails;
                    productDetailsResult2 = productDetailsResult;
                    com.unity3d.ads.core.domain.billing.ProductDetailsResult productDetailsResult32 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) obj;
                    if (!(productDetailsResult32 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success)) {
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        productDetailsFetcherWithFallback$fetchProductDetails$1 = new com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1(this, continuation);
        java.lang.Object obj2 = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
        if (i != 0) {
        }
        productDetailsResult = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) obj2;
        if (!(productDetailsResult instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success)) {
        }
    }
}
