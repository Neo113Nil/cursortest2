package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$observePayments$2", f = "PayModeViewModel.kt", i = {}, l = {500}, m = "invokeSuspend", n = {}, nl = {504}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeViewModel$observePayments$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase payPalObservePaymentUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            payPalObservePaymentUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> invoke = payPalObservePaymentUseCase.invoke();
            final com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$observePayments$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState = (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState) obj2;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Received payment state: ".concat(java.lang.String.valueOf(paymentState.toLogString())), null, null, 6, null);
                    java.lang.Object access$handlePaymentStateChange = com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.access$handlePaymentStateChange(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.this, paymentState, continuation);
                    return access$handlePaymentStateChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? access$handlePaymentStateChange : kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$observePayments$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$observePayments$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeViewModel$observePayments$2(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$observePayments$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = payModeViewModel;
    }
}
