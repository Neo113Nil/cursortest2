package com.paypal.oslo.feature.identity.identitymanagement.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase", f = "DisableAuthenticationMethodUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {63, 81, 85}, m = "invoke", n = {"authenticationMethod", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "input", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-DisableAuthenticationMethodUseCase$invoke$2", "authenticationMethod", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "input", "this_$iv", "it", "deviceAuthMethod", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-DisableAuthenticationMethodUseCase$invoke$2", "$i$f$fold", "$i$a$-fold-DisableAuthenticationMethodUseCase$invoke$2$2", "authenticationMethod", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "input", "this_$iv", "it", "deviceAuthMethod", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-DisableAuthenticationMethodUseCase$invoke$2", "$i$f$fold", "$i$a$-fold-DisableAuthenticationMethodUseCase$invoke$2$2"}, nl = {146, 84, 86}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes5.dex */
final class DisableAuthenticationMethodUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.isOutputSupportedForhNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisableAuthenticationMethodUseCase$invoke$1(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase disableAuthenticationMethodUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase$invoke$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = disableAuthenticationMethodUseCase;
    }
}
