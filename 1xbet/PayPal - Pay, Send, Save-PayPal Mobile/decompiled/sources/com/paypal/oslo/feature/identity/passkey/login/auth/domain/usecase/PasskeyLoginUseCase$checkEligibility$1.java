package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase", f = "PasskeyLoginUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {109}, m = "checkEligibility", n = {"raise$iv$iv$iv", "$this$checkEligibility_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyLoginUseCase$checkEligibility$2", "isPasskeyFeatureEnabled"}, nl = {110}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyLoginUseCase$checkEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    boolean getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyLoginUseCase$checkEligibility$1(com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$checkEligibility$1> continuation) {
        super(continuation);
        this.getOutputSizes = passkeyLoginUseCase;
    }
}
