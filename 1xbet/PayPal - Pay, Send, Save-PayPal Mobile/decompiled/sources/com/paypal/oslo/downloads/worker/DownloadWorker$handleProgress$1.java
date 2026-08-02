package com.paypal.oslo.downloads.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.worker.DownloadWorker", f = "DownloadWorker.kt", i = {0, 0, 0}, l = {181}, m = "handleProgress", n = {"downloadId", "entity", "result"}, nl = {186}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadWorker$handleProgress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.downloads.worker.DownloadWorker getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.downloads.worker.DownloadWorker.access$handleProgress(this.getInputFormats, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadWorker$handleProgress$1(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.worker.DownloadWorker$handleProgress$1> continuation) {
        super(continuation);
        this.getInputFormats = downloadWorker;
    }
}
