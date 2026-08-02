package com.paypal.oslo.feature.identity.devicebinding;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider", f = "BiometricBindSchemeProvider.kt", i = {0, 1, 1}, l = {65, 66}, m = "getBindSchemeEnrolled", n = {"schemes", "schemes", "biometricToken"}, nl = {66, 68}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class BiometricBindSchemeProvider$getBindSchemeEnrolled$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getBindSchemeEnrolled(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiometricBindSchemeProvider$getBindSchemeEnrolled$1(com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider biometricBindSchemeProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider$getBindSchemeEnrolled$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = biometricBindSchemeProvider;
    }
}
