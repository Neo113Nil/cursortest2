package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fi/AddFIFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$1$1", f = "PaymentReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PaymentReviewScreenKt$PaymentReviewUiEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome outcome = addFIFlowNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Success) {
            this.getHighSpeedVideoFpsRanges.handleIntent(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCompleted.INSTANCE);
        } else if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Error) {
            this.getHighSpeedVideoFpsRanges.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowFailed(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.FUNDING_OPTIONS_UNAVAILABLE));
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.handleIntent(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCancelled.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$1$1) create(addFIFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$1$1 paymentReviewScreenKt$PaymentReviewUiEffect$1$1 = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$1$1(this.getHighSpeedVideoFpsRanges, continuation);
        paymentReviewScreenKt$PaymentReviewUiEffect$1$1.Camera2StreamConfigurationMap = obj;
        return paymentReviewScreenKt$PaymentReviewUiEffect$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentReviewScreenKt$PaymentReviewUiEffect$1$1(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt$PaymentReviewUiEffect$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = paymentReviewViewModel;
    }
}
