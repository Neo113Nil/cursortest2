package com.paypal.oslo.downloads.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.worker.DownloadWorker", f = "DownloadWorker.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {231, 247}, m = "handleDownloadException", n = {"downloadId", "entity", "exception", "errorMessage", "retriesRemaining", "shouldNotify", "downloadId", "entity", "exception", "errorMessage", "retriesRemaining", "shouldNotify"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadWorker$handleDownloadException$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.downloads.worker.DownloadWorker getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    boolean getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor(null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadWorker$handleDownloadException$1(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.worker.DownloadWorker$handleDownloadException$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = downloadWorker;
    }
}
