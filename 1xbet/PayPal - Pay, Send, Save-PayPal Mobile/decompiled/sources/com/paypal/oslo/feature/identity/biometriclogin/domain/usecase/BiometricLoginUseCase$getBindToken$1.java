package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase", f = "BiometricLoginUseCase.kt", i = {}, l = {183}, m = "getBindToken", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class BiometricLoginUseCase$getBindToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiometricLoginUseCase$getBindToken$1(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$getBindToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = biometricLoginUseCase;
    }
}
