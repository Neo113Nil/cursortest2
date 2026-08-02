package com.paypal.oslo.feature.identity.llslogin.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase", f = "LLSLoginUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {67, 75, 91, 107}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-LLSLoginUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "signature", "nonce", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-LLSLoginUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "signature", "nonce", "refreshToken", "base64EncodedNonce", "userPreviewRequest", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-LLSLoginUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "signature", "nonce", "refreshToken", "base64EncodedNonce", "userPreviewRequest", "loginAttemptResult", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-LLSLoginUseCase$invoke$2"}, nl = {70, 76, 92, 108}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class LLSLoginUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LLSLoginUseCase$invoke$1(com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase lLSLoginUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = lLSLoginUseCase;
    }
}
