package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase", f = "DownloadFileUseCase.kt", i = {0, 1, 1}, l = {107, 109}, m = "awaitDownloadCompletion", n = {"request", "request", "downloadId"}, nl = {108, 108}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class DownloadFileUseCase$awaitDownloadCompletion$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadFileUseCase$awaitDownloadCompletion$1(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase downloadFileUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = downloadFileUseCase;
    }
}
