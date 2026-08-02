package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABScreen$4$1", f = "ShoppingIABScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABScreenKt$ShoppingIABScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails = this.getHighSpeedVideoFpsRangesFor;
        if (iabOfferDetails != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.loadOffer(iabOfferDetails);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Screen closed - missing initial offer details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasInitialDetails", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))), null, 4, null);
            this.getHighSpeedVideoSizes.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABScreen$4$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABScreenKt$ShoppingIABScreen$4$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = iabOfferDetails;
        this.getHighResolutionOutputSizeshNQ4ISI = shoppingIABViewModel;
        this.getHighSpeedVideoSizes = function0;
    }
}
