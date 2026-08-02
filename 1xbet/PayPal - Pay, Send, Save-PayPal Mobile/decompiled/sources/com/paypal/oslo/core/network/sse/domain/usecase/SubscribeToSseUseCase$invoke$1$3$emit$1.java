package com.paypal.oslo.core.network.sse.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$3", f = "SubscribeToSseUseCase.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {99, 105, 107, 82}, m = "emit", n = {"result", "this_$iv", "event", "$i$f$fold", "$i$a$-fold-SubscribeToSseUseCase$invoke$1$3$2", "result", "this_$iv", "event", "eventData", "$i$f$fold", "$i$a$-fold-SubscribeToSseUseCase$invoke$1$3$2", "result", "this_$iv", "event", "$i$f$fold", "$i$a$-fold-SubscribeToSseUseCase$invoke$1$3$2", "result", "this_$iv", "networkError", "$i$f$fold", "$i$a$-fold-SubscribeToSseUseCase$invoke$1$3$1"}, nl = {100, 107, 109, 83}, s = {"L$0", "L$1", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes10.dex */
final class SubscribeToSseUseCase$invoke$1$3$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1.AnonymousClass3<T> getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SubscribeToSseUseCase$invoke$1$3$emit$1(com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1.AnonymousClass3<? super T> anonymousClass3, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$3$emit$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = anonymousClass3;
    }
}
