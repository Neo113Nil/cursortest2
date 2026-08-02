package com.paypal.oslo.feature.verificationcapture.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl", f = "VerificationCaptureServiceImpl.kt", i = {}, l = {96}, m = "getSessionInfo", n = {}, nl = {98}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class VerificationCaptureServiceImpl$getSessionInfo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getSessionInfo(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureServiceImpl$getSessionInfo$1(com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl verificationCaptureServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$getSessionInfo$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = verificationCaptureServiceImpl;
    }
}
