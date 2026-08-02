package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1", f = "WithdrawMoneyReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = addCardFlowNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) {
            this.getHighSpeedVideoSizes.onFIAdded(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.FinancialInstrument.LinkedCard(((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) outcome).getCard()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1) create(addCardFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1 withdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1 = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1(this.getHighSpeedVideoSizes, continuation);
        withdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1.getHighSpeedVideoFpsRangesFor = obj;
        return withdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = withdrawMoneyReviewViewModel;
    }
}
