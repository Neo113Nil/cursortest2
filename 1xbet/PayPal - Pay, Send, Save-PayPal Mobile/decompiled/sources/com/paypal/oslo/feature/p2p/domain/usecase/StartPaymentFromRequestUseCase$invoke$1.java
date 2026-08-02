package com.paypal.oslo.feature.p2p.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase", f = "StartPaymentFromRequestUseCase.kt", i = {0}, l = {35}, m = "invoke", n = {"requestId"}, nl = {36}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class StartPaymentFromRequestUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartPaymentFromRequestUseCase$invoke$1(com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase startPaymentFromRequestUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = startPaymentFromRequestUseCase;
    }
}
