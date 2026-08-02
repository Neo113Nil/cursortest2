package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase", f = "CheckBiometricLoginEligibilityUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {45, 50}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CheckBiometricLoginEligibilityUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "rememberedUser", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CheckBiometricLoginEligibilityUseCase$invoke$2"}, nl = {46, 51}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CheckBiometricLoginEligibilityUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckBiometricLoginEligibilityUseCase$invoke$1(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase checkBiometricLoginEligibilityUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = checkBiometricLoginEligibilityUseCase;
    }
}
