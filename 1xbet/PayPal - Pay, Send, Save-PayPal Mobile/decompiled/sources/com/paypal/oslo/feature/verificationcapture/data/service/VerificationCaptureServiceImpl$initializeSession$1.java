package com.paypal.oslo.feature.verificationcapture.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl", f = "VerificationCaptureServiceImpl.kt", i = {}, l = {144}, m = "initializeSession", n = {}, nl = {145}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class VerificationCaptureServiceImpl$initializeSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.initializeSession(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureServiceImpl$initializeSession$1(com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl verificationCaptureServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$initializeSession$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = verificationCaptureServiceImpl;
    }
}
