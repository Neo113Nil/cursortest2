package com.paypal.oslo.feature.verificationcapture.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl", f = "VerificationCaptureServiceImpl.kt", i = {0, 0, 0, 0, 0}, l = {74}, m = "uploadDocument", n = {"imageBytes", "metadata", "repoMetadata", "docType", "docSide"}, nl = {75}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes5.dex */
final class VerificationCaptureServiceImpl$uploadDocument$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.uploadDocument(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureServiceImpl$uploadDocument$1(com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl verificationCaptureServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$uploadDocument$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = verificationCaptureServiceImpl;
    }
}
