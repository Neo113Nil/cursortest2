package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$launchPaymentActivity$2", f = "PaymentActivityLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class PaymentActivityLauncher$launchPaymentActivity$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.taptopay.domain.model.payment.PaymentState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Launching Payment Activity", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paymentState", this.getHighSpeedVideoSizes)), null, 4, null);
            android.content.Intent intent = new android.content.Intent(this.getHighSpeedVideoFpsRangesFor.getContext(), com.paypal.android.taptopay.data.thales.init.ThalesInitializer.INSTANCE.getPaymentActivityClass());
            intent.setFlags(268435456);
            intent.putExtra(com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.INTENT_EXTRA_PAYMENT_STATE, this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor.getContext().startActivity(intent);
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to launch payment activity", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paymentState", this.getHighSpeedVideoSizes)), null, th, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$launchPaymentActivity$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$launchPaymentActivity$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentActivityLauncher$launchPaymentActivity$2(com.paypal.android.taptopay.domain.model.payment.PaymentState paymentState, com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher paymentActivityLauncher, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$launchPaymentActivity$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = paymentState;
        this.getHighSpeedVideoFpsRangesFor = paymentActivityLauncher;
    }
}
