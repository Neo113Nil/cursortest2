package com.paypal.oslo.downloads.impl.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider", f = "DefaultDownloadStorageProvider.kt", i = {0}, l = {43}, m = "getStorageDirectory", n = {"category"}, nl = {48}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DefaultDownloadStorageProvider$getStorageDirectory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getStorageDirectory(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDownloadStorageProvider$getStorageDirectory$1(com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider defaultDownloadStorageProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getStorageDirectory$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = defaultDownloadStorageProvider;
    }
}
