package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAndAggregatePayNowButtonAmount$2$1", f = "ReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ObserveAndAggregatePayNowButtonAmount$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.model.Amount amount;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails = this.getHighSpeedVideoFpsRanges;
        if (fiatDetails != null) {
            amount = new com.paypal.oslo.feature.p2p.domain.model.Amount(fiatDetails.getQuantity(), this.getHighSpeedVideoFpsRanges.getCurrencyCode(), com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenMappersKt.getCurrencySymbol(this.getHighSpeedVideoFpsRanges.getCurrencyCode()));
        } else {
            com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveAndAggregatePayNowButtonAmount$lambda$0(this.getHighSpeedVideoSizes).getUiAmount();
            amount = uiAmount != null ? new com.paypal.oslo.feature.p2p.domain.model.Amount(uiAmount.getAmount(), uiAmount.getCurrency(), com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenMappersKt.getCurrencySymbol(uiAmount.getCurrency())) : null;
        }
        this.getHighSpeedVideoFpsRangesFor.getReviewViewModel().processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdatePayNowButtonAmount(amount));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAndAggregatePayNowButtonAmount$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAndAggregatePayNowButtonAmount$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenKt$ObserveAndAggregatePayNowButtonAmount$2$1(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAndAggregatePayNowButtonAmount$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = fiatDetails;
        this.getHighSpeedVideoFpsRangesFor = reviewScreenViewModels;
        this.getHighSpeedVideoSizes = state;
    }
}
