package com.unity3d.ads.core.domain.billing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ProductDetailsFetcherWithFallback.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", i = {0, 2}, l = {16, 20, 24}, m = "fetchProductDetails", n = {"productId", "primaryResult"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
final class ProductDetailsFetcherWithFallback$fetchProductDetails$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductDetailsFetcherWithFallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductDetailsFetcherWithFallback$fetchProductDetails$1(ProductDetailsFetcherWithFallback productDetailsFetcherWithFallback, Continuation<? super ProductDetailsFetcherWithFallback$fetchProductDetails$1> continuation) {
        super(continuation);
        this.this$0 = productDetailsFetcherWithFallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchProductDetails(null, this);
    }
}
