package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl", f = "VerificationCaptureRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {125}, m = "uploadDocument", n = {"imageBytes", "documentType", "documentSide", "metadata", "partyId", "referenceId", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "filename", "request", "requestJson", "requestBody", "filePart"}, nl = {128}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11"}, v = 2)
/* loaded from: classes5.dex */
final class VerificationCaptureRepositoryImpl$uploadDocument$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.uploadDocument(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureRepositoryImpl$uploadDocument$1(com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl verificationCaptureRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadDocument$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = verificationCaptureRepositoryImpl;
    }
}
