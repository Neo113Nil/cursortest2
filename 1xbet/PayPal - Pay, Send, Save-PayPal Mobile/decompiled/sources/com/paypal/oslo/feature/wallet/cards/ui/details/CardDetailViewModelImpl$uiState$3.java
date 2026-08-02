package com.paypal.oslo.feature.wallet.cards.ui.details;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailScreenState;", "state", "isUpdating", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$3", f = "CardDetailViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CardDetailViewModelImpl$uiState$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState, java.lang.Boolean, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState cardDetailScreenState = (com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState) this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return z ? com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState.Loading.INSTANCE : cardDetailScreenState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState cardDetailScreenState, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState> continuation) {
        boolean booleanValue = bool.booleanValue();
        com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$3 cardDetailViewModelImpl$uiState$3 = new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$3(continuation);
        cardDetailViewModelImpl$uiState$3.getHighResolutionOutputSizeshNQ4ISI = cardDetailScreenState;
        cardDetailViewModelImpl$uiState$3.getHighSpeedVideoFpsRanges = booleanValue;
        return cardDetailViewModelImpl$uiState$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    CardDetailViewModelImpl$uiState$3(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$3> continuation) {
        super(3, continuation);
    }
}
