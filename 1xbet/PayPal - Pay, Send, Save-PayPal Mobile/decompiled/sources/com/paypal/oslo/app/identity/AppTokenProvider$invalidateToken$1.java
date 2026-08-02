package com.paypal.oslo.app.identity;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AppTokenProvider", f = "AppTokenProvider.kt", i = {0, 0, 0, 1}, l = {337, 328}, m = "invalidateToken", n = {"tokenType", "$this$withLock_u24default$iv", "$i$f$withLock", "tokenType"}, nl = {338, 329}, s = {"L$0", "L$1", "I$0", "L$0"}, v = 2)
/* loaded from: classes4.dex */
final class AppTokenProvider$invalidateToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.app.identity.AppTokenProvider getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.invalidateToken(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppTokenProvider$invalidateToken$1(com.paypal.oslo.app.identity.AppTokenProvider appTokenProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.identity.AppTokenProvider$invalidateToken$1> continuation) {
        super(continuation);
        this.getOutputFormats = appTokenProvider;
    }
}
