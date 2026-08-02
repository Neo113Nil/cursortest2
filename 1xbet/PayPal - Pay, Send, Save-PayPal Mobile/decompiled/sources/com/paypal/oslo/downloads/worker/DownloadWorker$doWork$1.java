package com.paypal.oslo.downloads.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.worker.DownloadWorker", f = "DownloadWorker.kt", i = {0, 0, 0, 1, 1}, l = {63, 68}, m = "doWork", n = {"downloadId", "it", "$i$a$-let-DownloadWorker$doWork$entity$1", "downloadId", "entity"}, nl = {63, 70}, s = {"L$0", "L$1", "I$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.downloads.worker.DownloadWorker getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadWorker$doWork$1(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.worker.DownloadWorker$doWork$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = downloadWorker;
    }
}
