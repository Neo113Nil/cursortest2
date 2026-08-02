package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$showExclusionDialog$1", f = "ShoppingIABViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABViewModel$showExclusionDialog$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState copy;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel = this.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
                mutableStateFlow2 = shoppingIABViewModel.getInputSizeshNQ4ISI;
                copy = r4.copy((r28 & 1) != 0 ? r4.isLoadingData : false, (r28 & 2) != 0 ? r4.iabOfferDetails : null, (r28 & 4) != 0 ? r4.benefitDetails : null, (r28 & 8) != 0 ? r4.showInterstitial : false, (r28 & 16) != 0 ? r4.dialog : new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDialog.ExclusionTerms(((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState) mutableStateFlow2.getValue()).getIabOfferDetails().getAffiliateRestrictions()), (r28 & 32) != 0 ? r4.toolBarInfo : null, (r28 & 64) != 0 ? r4.navBarInfo : null, (r28 & 128) != 0 ? r4.bannerContent : null, (r28 & 256) != 0 ? r4.webViewConfig : null, (r28 & 512) != 0 ? r4.dataError : null, (r28 & 1024) != 0 ? r4.shouldDestroyWebView : false, (r28 & 2048) != 0 ? r4.showContinueButton : false, (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState) value).continueClicked : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$showExclusionDialog$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$showExclusionDialog$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABViewModel$showExclusionDialog$1(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$showExclusionDialog$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = shoppingIABViewModel;
    }
}
