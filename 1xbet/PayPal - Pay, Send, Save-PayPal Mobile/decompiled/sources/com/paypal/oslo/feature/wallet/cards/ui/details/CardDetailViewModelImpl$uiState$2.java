package com.paypal.oslo.feature.wallet.cards.ui.details;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailScreenState;", "state", "localUpdate", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailViewModelImpl$LocalUpdate;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$2", f = "CardDetailViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CardDetailViewModelImpl$uiState$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState, com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl.LocalUpdate, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState.Success success;
        com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState cardDetailScreenState = (com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState) this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl.LocalUpdate localUpdate = (com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl.LocalUpdate) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (localUpdate.getHighResolutionOutputSizeshNQ4ISI == null) {
            return cardDetailScreenState;
        }
        if (cardDetailScreenState instanceof com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState.Success) {
            success = ((com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState.Success) cardDetailScreenState).copy(localUpdate.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            success = new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState.Success(localUpdate.getHighResolutionOutputSizeshNQ4ISI);
        }
        return success;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState cardDetailScreenState, com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl.LocalUpdate localUpdate, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState> continuation) {
        com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$2 cardDetailViewModelImpl$uiState$2 = new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$2(continuation);
        cardDetailViewModelImpl$uiState$2.getHighSpeedVideoSizes = cardDetailScreenState;
        cardDetailViewModelImpl$uiState$2.Camera2StreamConfigurationMap = localUpdate;
        return cardDetailViewModelImpl$uiState$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    CardDetailViewModelImpl$uiState$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$2> continuation) {
        super(3, continuation);
    }
}
