package com.paypal.oslo.downloads.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.worker.DownloadWorker", f = "DownloadWorker.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {132, 150}, m = "handleError", n = {"downloadId", "entity", "result", "retriesRemaining", "shouldNotify", "downloadId", "entity", "result", "retriesRemaining", "shouldNotify"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 156}, s = {"L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadWorker$handleError$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.downloads.worker.DownloadWorker getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.downloads.worker.DownloadWorker.access$handleError(this.getOutputMinFrameDuration, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadWorker$handleError$1(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.worker.DownloadWorker$handleError$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = downloadWorker;
    }
}
