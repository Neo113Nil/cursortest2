package com.unity3d.ads.core.domain.billing;

/* compiled from: ProductDetailsFetcherWithFallback.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", i = {0, 0, 2}, l = {16, 20, 24}, m = "fetchProductDetails", n = {"this", com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, "primaryResult"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes5.dex */
final class ProductDetailsFetcherWithFallback$fetchProductDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductDetailsFetcherWithFallback$fetchProductDetails$1(com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback productDetailsFetcherWithFallback, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1> continuation) {
        super(continuation);
        this.this$0 = productDetailsFetcherWithFallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchProductDetails(null, this);
    }
}
