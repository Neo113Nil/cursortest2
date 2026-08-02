package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor", f = "DownloadFileExecutor.kt", i = {0, 0, 0}, l = {129}, m = "validateDownloadedContent", n = {"request", "targetFile", "checksumConfig"}, nl = {136}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class DownloadFileExecutor$validateDownloadedContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputFormats.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadFileExecutor$validateDownloadedContent$1(com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor downloadFileExecutor, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$validateDownloadedContent$1> continuation) {
        super(continuation);
        this.getInputFormats = downloadFileExecutor;
    }
}
