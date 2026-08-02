package com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase", f = "DownloadFileUseCase.kt", i = {0, 1, 1}, l = {57, 60}, m = "awaitDownloadCompletion", n = {"request", "request", "downloadId"}, nl = {59, 59}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class DownloadFileUseCase$awaitDownloadCompletion$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadFileUseCase$awaitDownloadCompletion$1(com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase downloadFileUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = downloadFileUseCase;
    }
}
