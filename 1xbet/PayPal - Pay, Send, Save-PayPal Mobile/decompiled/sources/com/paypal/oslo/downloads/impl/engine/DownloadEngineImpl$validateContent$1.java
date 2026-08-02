package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl", f = "DownloadEngineImpl.kt", i = {0, 0}, l = {263}, m = "validateContent", n = {"file", "entity"}, nl = {269}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadEngineImpl$validateContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadEngineImpl$validateContent$1(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$validateContent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = downloadEngineImpl;
    }
}
