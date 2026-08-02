package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/AddMoneyNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$2$1", f = "PaymentReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PaymentReviewScreenKt$PaymentReviewUiEffect$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult addMoneyNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome outcome = addMoneyNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome.Success) {
            this.getHighSpeedVideoFpsRanges.handleIntent(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCompleted.INSTANCE);
        } else if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome.Error) {
            this.getHighSpeedVideoFpsRanges.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowFailed(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.INTERNAL_ERROR));
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.handleIntent(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCancelled.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult addMoneyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$2$1) create(addMoneyNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$2$1 paymentReviewScreenKt$PaymentReviewUiEffect$2$1 = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$2$1(this.getHighSpeedVideoFpsRanges, continuation);
        paymentReviewScreenKt$PaymentReviewUiEffect$2$1.getHighSpeedVideoSizes = obj;
        return paymentReviewScreenKt$PaymentReviewUiEffect$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentReviewScreenKt$PaymentReviewUiEffect$2$1(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = paymentReviewViewModel;
    }
}
