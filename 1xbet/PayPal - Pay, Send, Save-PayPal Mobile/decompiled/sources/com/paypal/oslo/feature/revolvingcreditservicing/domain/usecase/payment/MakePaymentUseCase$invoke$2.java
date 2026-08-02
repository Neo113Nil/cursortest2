package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase$invoke$2", f = "MakePaymentUseCase.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class MakePaymentUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository paymentReviewRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        paymentReviewRepository = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object makePayment = paymentReviewRepository.makePayment(this.Camera2StreamConfigurationMap, this);
        return makePayment == coroutine_suspended ? coroutine_suspended : makePayment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse>> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase$invoke$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakePaymentUseCase$invoke$2(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase makePaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest makePaymentRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = makePaymentUseCase;
        this.Camera2StreamConfigurationMap = makePaymentRequest;
    }
}
