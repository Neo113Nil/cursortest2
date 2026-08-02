package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase", f = "ExecuteWithAuthRetryUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {64, 70}, m = "executeWith", n = {"authenticationState", "action", "raise$iv$iv$iv", "$this$executeWith_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ExecuteWithAuthRetryUseCase$executeWith$2", "authenticationState", "action", "raise$iv$iv$iv", "$this$executeWith_u24lambda_u240", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ExecuteWithAuthRetryUseCase$executeWith$2"}, nl = {66, 86}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes16.dex */
final class ExecuteWithAuthRetryUseCase$executeWith$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExecuteWithAuthRetryUseCase$executeWith$1(com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase executeWithAuthRetryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase$executeWith$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = executeWithAuthRetryUseCase;
    }
}
