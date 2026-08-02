package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl", f = "BiometricAuthenticatorImpl.kt", i = {0, 0}, l = {35}, m = "authenticate", n = {"activity", "signature"}, nl = {36}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class BiometricAuthenticatorImpl$authenticate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.authenticate(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiometricAuthenticatorImpl$authenticate$1(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl biometricAuthenticatorImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl$authenticate$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = biometricAuthenticatorImpl;
    }
}
