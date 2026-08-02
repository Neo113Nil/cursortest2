package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase", f = "ProcessCapturedDocumentUseCase.kt", i = {0, 0, 1, 1, 1}, l = {35, 45}, m = "invoke", n = {"bitmap", "captureResult", "bitmap", "captureResult", "isQualityValid"}, nl = {37, 47}, s = {"L$0", "L$1", "L$0", "L$1", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class ProcessCapturedDocumentUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProcessCapturedDocumentUseCase$invoke$1(com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase processCapturedDocumentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = processCapturedDocumentUseCase;
    }
}
