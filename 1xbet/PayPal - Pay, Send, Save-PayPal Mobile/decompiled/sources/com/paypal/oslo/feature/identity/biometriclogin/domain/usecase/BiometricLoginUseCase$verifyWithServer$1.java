package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase", f = "BiometricLoginUseCase.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {134, 142, 144}, m = "verifyWithServer", n = {"unlockedSignature", "nonce", "signedNonce", "unlockedSignature", "nonce", "signedNonce", "bindToken", "loginRequest", "unlockedSignature", "nonce", "signedNonce", "bindToken", "loginRequest", "loginAttemptResult"}, nl = {135, 143, 145}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes12.dex */
final class BiometricLoginUseCase$verifyWithServer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase.access$verifyWithServer(this.getOutputFormats, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiometricLoginUseCase$verifyWithServer$1(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$verifyWithServer$1> continuation) {
        super(continuation);
        this.getOutputFormats = biometricLoginUseCase;
    }
}
