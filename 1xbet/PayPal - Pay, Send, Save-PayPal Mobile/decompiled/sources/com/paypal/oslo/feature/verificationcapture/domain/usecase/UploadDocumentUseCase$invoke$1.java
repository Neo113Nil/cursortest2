package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase", f = "UploadDocumentUseCase.kt", i = {0, 0, 0, 0}, l = {55}, m = "invoke", n = {"imageBytes", "documentType", "documentSide", "metadata"}, nl = {54}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class UploadDocumentUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadDocumentUseCase$invoke$1(com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase uploadDocumentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = uploadDocumentUseCase;
    }
}
