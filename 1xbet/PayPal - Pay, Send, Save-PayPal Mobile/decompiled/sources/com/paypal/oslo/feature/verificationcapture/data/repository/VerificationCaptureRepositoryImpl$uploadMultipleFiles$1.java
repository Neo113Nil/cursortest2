package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl", f = "VerificationCaptureRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {263}, m = "uploadMultipleFiles", n = {"files", "documentType", "metadata", "partyId", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "fileMetadataList", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "request", "requestJson", "requestBody", "fileParts"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10"}, v = 2)
/* loaded from: classes5.dex */
final class VerificationCaptureRepositoryImpl$uploadMultipleFiles$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl getOutputSizes;
    int getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputSizes.uploadMultipleFiles(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureRepositoryImpl$uploadMultipleFiles$1(com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl verificationCaptureRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadMultipleFiles$1> continuation) {
        super(continuation);
        this.getOutputSizes = verificationCaptureRepositoryImpl;
    }
}
