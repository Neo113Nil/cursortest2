package com.paypal.oslo.feature.taptopay.data.repository.payair;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository$observePayment$1", f = "PayairPaymentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PayairPaymentRepository$observePayment$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState = (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Emitting new payment state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", paymentState.toLogString())), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository$observePayment$1) create(paymentState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository$observePayment$1 payairPaymentRepository$observePayment$1 = new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository$observePayment$1(continuation);
        payairPaymentRepository$observePayment$1.getHighSpeedVideoFpsRanges = obj;
        return payairPaymentRepository$observePayment$1;
    }

    PayairPaymentRepository$observePayment$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository$observePayment$1> continuation) {
        super(2, continuation);
    }
}
