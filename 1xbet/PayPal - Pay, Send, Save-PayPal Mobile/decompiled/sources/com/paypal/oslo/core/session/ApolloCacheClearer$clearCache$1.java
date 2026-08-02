package com.paypal.oslo.core.session;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.session.ApolloCacheClearer", f = "ApolloCacheClearer.kt", i = {}, l = {42}, m = "clearCache", n = {}, nl = {45}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class ApolloCacheClearer$clearCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.session.ApolloCacheClearer getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.clearCache(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloCacheClearer$clearCache$1(com.paypal.oslo.core.session.ApolloCacheClearer apolloCacheClearer, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.session.ApolloCacheClearer$clearCache$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = apolloCacheClearer;
    }
}
