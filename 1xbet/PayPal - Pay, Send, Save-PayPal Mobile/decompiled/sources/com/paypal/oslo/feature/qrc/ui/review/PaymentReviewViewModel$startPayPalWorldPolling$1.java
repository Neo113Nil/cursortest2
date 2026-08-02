package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$startPayPalWorldPolling$1", f = "PaymentReviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PaymentReviewViewModel$startPayPalWorldPolling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error, ? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.Ior ior = (arrow.core.Ior) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Either either = ior.toEither();
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action action = (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action) ((arrow.core.Either.Right) either).getValue();
            if (action instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction) {
                com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse = ((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action.ProcessPaymentAction) action).getQrcPaymentAmountNavArgs().getPaymentResponse();
                if (paymentResponse != null) {
                    paymentReviewViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentSuccess(paymentResponse));
                } else {
                    paymentReviewViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed(false, 1, null));
                }
            }
        } else if (either instanceof arrow.core.Either.Left) {
            paymentReviewViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed(((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error) ((arrow.core.Either.Left) either).getValue()).isRecoverable()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error, ? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action> ior, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$startPayPalWorldPolling$1) create(ior, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$startPayPalWorldPolling$1 paymentReviewViewModel$startPayPalWorldPolling$1 = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$startPayPalWorldPolling$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        paymentReviewViewModel$startPayPalWorldPolling$1.Camera2StreamConfigurationMap = obj;
        return paymentReviewViewModel$startPayPalWorldPolling$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentReviewViewModel$startPayPalWorldPolling$1(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$startPayPalWorldPolling$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = paymentReviewViewModel;
    }
}
