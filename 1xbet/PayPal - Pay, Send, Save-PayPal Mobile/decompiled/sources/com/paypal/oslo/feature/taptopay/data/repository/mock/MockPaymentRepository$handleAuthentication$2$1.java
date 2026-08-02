package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$handleAuthentication$2$1", f = "MockPaymentRepository.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, nl = {128}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class MockPaymentRepository$handleAuthentication$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.coroutines.Continuation<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> producerScope = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod = com.paypal.oslo.feature.taptopay.domain.model.payment.AuthenticationMethod.BIOMETRICS;
            final kotlin.coroutines.Continuation<java.lang.Boolean> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            if (producerScope.send(new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired(authenticationMethod, 45000L, null, null, null, null, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$handleAuthentication$2$1.1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                    boolean booleanValue = bool.booleanValue();
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = continuation;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(booleanValue)));
                    return kotlin.Unit.INSTANCE;
                }
            }, 60, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$handleAuthentication$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$handleAuthentication$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MockPaymentRepository$handleAuthentication$2$1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> producerScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$handleAuthentication$2$1> continuation2) {
        super(2, continuation2);
        this.getHighSpeedVideoFpsRanges = producerScope;
        this.getHighResolutionOutputSizeshNQ4ISI = continuation;
    }
}
