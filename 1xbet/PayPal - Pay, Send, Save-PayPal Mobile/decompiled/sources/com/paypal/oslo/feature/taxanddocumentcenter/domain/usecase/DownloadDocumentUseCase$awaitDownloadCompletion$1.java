package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase", f = "DownloadDocumentUseCase.kt", i = {0, 1}, l = {111, 112}, m = "awaitDownloadCompletion", n = {"request", "request"}, nl = {112, 117}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class DownloadDocumentUseCase$awaitDownloadCompletion$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadDocumentUseCase$awaitDownloadCompletion$1(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = downloadDocumentUseCase;
    }
}
