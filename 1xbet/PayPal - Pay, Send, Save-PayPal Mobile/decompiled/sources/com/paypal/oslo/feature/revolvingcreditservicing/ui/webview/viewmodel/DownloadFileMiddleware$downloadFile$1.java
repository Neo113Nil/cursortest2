package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware", f = "DownloadFileMiddleware.kt", i = {0, 0, 0}, l = {45}, m = "downloadFile", n = {"state", "eventDispatcher", "headers"}, nl = {51}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class DownloadFileMiddleware$downloadFile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputFormats.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadFileMiddleware$downloadFile$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware downloadFileMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware$downloadFile$1> continuation) {
        super(continuation);
        this.getOutputFormats = downloadFileMiddleware;
    }
}
