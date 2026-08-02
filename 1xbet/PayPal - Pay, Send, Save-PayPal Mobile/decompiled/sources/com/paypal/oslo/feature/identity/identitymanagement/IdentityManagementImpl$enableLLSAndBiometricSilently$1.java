package com.paypal.oslo.feature.identity.identitymanagement;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl", f = "IdentityManagementImpl.kt", i = {0}, l = {74}, m = "enableLLSAndBiometricSilently", n = {"flowInfo"}, nl = {78}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class IdentityManagementImpl$enableLLSAndBiometricSilently$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.enableLLSAndBiometricSilently(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityManagementImpl$enableLLSAndBiometricSilently$1(com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl identityManagementImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$enableLLSAndBiometricSilently$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = identityManagementImpl;
    }
}
