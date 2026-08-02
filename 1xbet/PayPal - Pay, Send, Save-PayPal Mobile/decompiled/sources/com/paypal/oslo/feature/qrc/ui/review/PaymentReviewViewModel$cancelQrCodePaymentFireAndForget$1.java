package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$cancelQrCodePaymentFireAndForget$1", f = "PaymentReviewViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {}, nl = {202}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PaymentReviewViewModel$cancelQrCodePaymentFireAndForget$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase cancelQrCodePaymentUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cancelQrCodePaymentUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (cancelQrCodePaymentUseCase.invoke(new com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest(this.getHighSpeedVideoFpsRanges.getNavArgs().getSessionId(), this.getHighSpeedVideoFpsRanges.getNavArgs().getSessionId(), this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$cancelQrCodePaymentFireAndForget$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$cancelQrCodePaymentFireAndForget$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentReviewViewModel$cancelQrCodePaymentFireAndForget$1(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$cancelQrCodePaymentFireAndForget$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = paymentReviewViewModel;
        this.Camera2StreamConfigurationMap = qrcPaymentCancellationReason;
    }
}
