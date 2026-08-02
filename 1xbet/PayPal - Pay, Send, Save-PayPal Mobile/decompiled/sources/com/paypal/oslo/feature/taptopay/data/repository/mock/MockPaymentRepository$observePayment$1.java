package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$observePayment$1", f = "MockPaymentRepository.kt", i = {0}, l = {62}, m = "invokeSuspend", n = {"$this$channelFlow"}, nl = {63}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class MockPaymentRepository$observePayment$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.Camera2StreamConfigurationMap = 1;
            if (com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository.access$producePaymentStateSuccess(this.getHighResolutionOutputSizeshNQ4ISI, producerScope, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$observePayment$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$observePayment$1 mockPaymentRepository$observePayment$1 = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$observePayment$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        mockPaymentRepository$observePayment$1.getHighSpeedVideoSizes = obj;
        return mockPaymentRepository$observePayment$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPaymentRepository$observePayment$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository mockPaymentRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$observePayment$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockPaymentRepository;
    }
}
