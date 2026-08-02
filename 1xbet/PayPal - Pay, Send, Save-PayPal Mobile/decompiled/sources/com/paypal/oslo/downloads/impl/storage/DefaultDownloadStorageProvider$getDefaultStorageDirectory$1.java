package com.paypal.oslo.downloads.impl.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider", f = "DefaultDownloadStorageProvider.kt", i = {}, l = {36}, m = "getDefaultStorageDirectory", n = {}, nl = {40}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DefaultDownloadStorageProvider$getDefaultStorageDirectory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getDefaultStorageDirectory(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDownloadStorageProvider$getDefaultStorageDirectory$1(com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider defaultDownloadStorageProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider$getDefaultStorageDirectory$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = defaultDownloadStorageProvider;
    }
}
