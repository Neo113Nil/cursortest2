package com.paypal.oslo.core.session;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.session.CronetCacheClearer", f = "CronetCacheClearer.kt", i = {}, l = {71}, m = "clearCache", n = {}, nl = {74}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class CronetCacheClearer$clearCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.session.CronetCacheClearer Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.clearCache(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CronetCacheClearer$clearCache$1(com.paypal.oslo.core.session.CronetCacheClearer cronetCacheClearer, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.session.CronetCacheClearer$clearCache$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cronetCacheClearer;
    }
}
