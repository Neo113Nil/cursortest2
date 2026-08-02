package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository$observePayment$1", f = "ThalesPaymentRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ThalesPaymentRepository$observePayment$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.android.taptopay.domain.model.payment.PaymentState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Emitting new payment state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", (com.paypal.android.taptopay.domain.model.payment.PaymentState) this.getHighResolutionOutputSizeshNQ4ISI)), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.android.taptopay.domain.model.payment.PaymentState paymentState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository$observePayment$1) create(paymentState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository$observePayment$1 thalesPaymentRepository$observePayment$1 = new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository$observePayment$1(continuation);
        thalesPaymentRepository$observePayment$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return thalesPaymentRepository$observePayment$1;
    }

    ThalesPaymentRepository$observePayment$1(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository$observePayment$1> continuation) {
        super(2, continuation);
    }
}
