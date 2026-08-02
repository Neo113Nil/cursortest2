package com.paypal.oslo.core.network.sse.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase", f = "SubscribeToSseUseCase.kt", i = {0, 0, 0, 0}, l = {128}, m = "emit", n = {"$this$emit", "dataBuffer", "completeData", "$i$a$-let-SubscribeToSseUseCase$emit$3"}, nl = {129}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes10.dex */
final class SubscribeToSseUseCase$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.access$emit(this.getInputSizeshNQ4ISI, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribeToSseUseCase$emit$1(com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> subscribeToSseUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$emit$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = subscribeToSseUseCase;
    }
}
