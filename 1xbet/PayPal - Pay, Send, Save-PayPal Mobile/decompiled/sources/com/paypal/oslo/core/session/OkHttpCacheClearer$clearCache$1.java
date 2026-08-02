package com.paypal.oslo.core.session;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.session.OkHttpCacheClearer", f = "OkHttpCacheClearer.kt", i = {}, l = {46}, m = "clearCache", n = {}, nl = {49}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class OkHttpCacheClearer$clearCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.session.OkHttpCacheClearer Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.clearCache(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpCacheClearer$clearCache$1(com.paypal.oslo.core.session.OkHttpCacheClearer okHttpCacheClearer, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.session.OkHttpCacheClearer$clearCache$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = okHttpCacheClearer;
    }
}
