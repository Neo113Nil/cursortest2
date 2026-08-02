package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$hideExclusionDialog$1", f = "ShoppingIABViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABViewModel$hideExclusionDialog$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState copy;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r28 & 1) != 0 ? r3.isLoadingData : false, (r28 & 2) != 0 ? r3.iabOfferDetails : null, (r28 & 4) != 0 ? r3.benefitDetails : null, (r28 & 8) != 0 ? r3.showInterstitial : false, (r28 & 16) != 0 ? r3.dialog : null, (r28 & 32) != 0 ? r3.toolBarInfo : null, (r28 & 64) != 0 ? r3.navBarInfo : null, (r28 & 128) != 0 ? r3.bannerContent : null, (r28 & 256) != 0 ? r3.webViewConfig : null, (r28 & 512) != 0 ? r3.dataError : null, (r28 & 1024) != 0 ? r3.shouldDestroyWebView : false, (r28 & 2048) != 0 ? r3.showContinueButton : false, (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState) value).continueClicked : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$hideExclusionDialog$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$hideExclusionDialog$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABViewModel$hideExclusionDialog$1(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$hideExclusionDialog$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = shoppingIABViewModel;
    }
}
