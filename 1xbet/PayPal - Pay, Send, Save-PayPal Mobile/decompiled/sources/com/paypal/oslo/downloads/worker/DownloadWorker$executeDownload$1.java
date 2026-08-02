package com.paypal.oslo.downloads.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.worker.DownloadWorker", f = "DownloadWorker.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6}, l = {74, 75, 76, 81, 84, 87, 92}, m = "executeDownload", n = {"downloadId", "entity", "downloadId", "entity", "downloadId", "entity", "downloadId", "entity", "e", "downloadId", "entity", "e", "downloadId", "entity", "e", "downloadId", "entity", "e"}, nl = {75, 76, 77, 82, 85, 88, 73}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadWorker$executeDownload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.downloads.worker.DownloadWorker getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputFormats.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadWorker$executeDownload$1(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.worker.DownloadWorker$executeDownload$1> continuation) {
        super(continuation);
        this.getInputFormats = downloadWorker;
    }
}
