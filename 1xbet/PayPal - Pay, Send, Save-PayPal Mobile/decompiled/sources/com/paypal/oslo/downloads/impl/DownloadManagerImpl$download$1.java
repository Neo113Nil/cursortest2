package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl", f = "DownloadManagerImpl.kt", i = {0}, l = {66}, m = "download-xebedEM", n = {"request"}, nl = {101}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$download$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        java.lang.Object mo11709downloadxebedEM = this.Camera2StreamConfigurationMap.mo11709downloadxebedEM(null, this);
        return mo11709downloadxebedEM == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo11709downloadxebedEM : com.paypal.oslo.downloads.api.model.DownloadId.m11725boximpl((java.lang.String) mo11709downloadxebedEM);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$download$1(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$download$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = downloadManagerImpl;
    }
}
