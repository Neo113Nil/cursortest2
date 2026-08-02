package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABScreen$2$1", f = "ShoppingIABScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABScreenKt$ShoppingIABScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String merchantLogoUrl;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = false;
        pairArr[0] = kotlin.TuplesKt.to("storeId", iabOfferDetails != null ? iabOfferDetails.getHoneyStoreId() : null);
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails2 = this.getHighResolutionOutputSizeshNQ4ISI;
        pairArr[1] = kotlin.TuplesKt.to("merchantName", iabOfferDetails2 != null ? iabOfferDetails2.getMerchantName() : null);
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (iabOfferDetails3 != null && (merchantLogoUrl = iabOfferDetails3.getMerchantLogoUrl()) != null && merchantLogoUrl.length() > 0) {
            z = true;
        }
        pairArr[2] = kotlin.TuplesKt.to("hasLogo", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails4 = this.getHighResolutionOutputSizeshNQ4ISI;
        pairArr[3] = kotlin.TuplesKt.to("benefitsList", iabOfferDetails4 != null ? iabOfferDetails4.getBenefits() : null);
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails5 = this.getHighResolutionOutputSizeshNQ4ISI;
        pairArr[4] = kotlin.TuplesKt.to("metadata", iabOfferDetails5 != null ? iabOfferDetails5.getBenefitsMetadata() : null);
        kotlin.collections.MapsKt.mapOf(pairArr);
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails6 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", iabOfferDetails6 != null ? iabOfferDetails6.getUrl() : null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABScreenKt$ShoppingIABScreen$2$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = iabOfferDetails;
    }
}
