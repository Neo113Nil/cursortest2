package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase", f = "ExecuteWithAuthRetryUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {45, 51}, m = "invoke", n = {"action", "action", "result", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-ExecuteWithAuthRetryUseCase$invoke$2"}, nl = {47, 53}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes16.dex */
final class ExecuteWithAuthRetryUseCase$invoke$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExecuteWithAuthRetryUseCase$invoke$1(com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase executeWithAuthRetryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = executeWithAuthRetryUseCase;
    }
}
