package com.paypal.oslo.feature.identity.biometriclogin.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl", f = "BiometricEligibilityRepositoryImpl.kt", i = {}, l = {53}, m = "isEligibleForLogin", n = {}, nl = {54}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class BiometricEligibilityRepositoryImpl$isEligibleForLogin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.isEligibleForLogin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiometricEligibilityRepositoryImpl$isEligibleForLogin$1(com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl biometricEligibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl$isEligibleForLogin$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = biometricEligibilityRepositoryImpl;
    }
}
