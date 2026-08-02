package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl", f = "DownloadEngineImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {211, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m = "streamToFile", n = {"$this$streamToFile", "response", "targetFile", "resumeInfo", "progressTracker", "inputStream", "outputStream", "buffer", "bytesRead", "progress", "startingBytes", "totalBytes", "$i$a$-use-DownloadEngineImpl$streamToFile$2", "$i$a$-use-DownloadEngineImpl$streamToFile$2$1", "downloadedBytes", "$i$a$-let-DownloadEngineImpl$streamToFile$2$1$2", "$this$streamToFile", "response", "targetFile", "resumeInfo", "progressTracker", "inputStream", "outputStream", "buffer", "bytesRead", "startingBytes", "totalBytes", "$i$a$-use-DownloadEngineImpl$streamToFile$2", "$i$a$-use-DownloadEngineImpl$streamToFile$2$1", "downloadedBytes"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 226}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$8", "L$9", "L$10", "L$11", "J$0", "J$1", "I$0", "I$1", "J$2", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$8", "L$9", "L$10", "J$0", "J$1", "I$0", "I$1", "J$2"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadEngineImpl$streamToFile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl CoroutineDebuggingKt;
    long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    long getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    /* synthetic */ java.lang.Object isOutputSupportedFor;
    int isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.isOutputSupportedFor = obj;
        this.isOutputSupportedForhNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.CoroutineDebuggingKt.getHighSpeedVideoSizes(null, null, null, null, 0L, 0L, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadEngineImpl$streamToFile$1(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$streamToFile$1> continuation) {
        super(continuation);
        this.CoroutineDebuggingKt = downloadEngineImpl;
    }
}
