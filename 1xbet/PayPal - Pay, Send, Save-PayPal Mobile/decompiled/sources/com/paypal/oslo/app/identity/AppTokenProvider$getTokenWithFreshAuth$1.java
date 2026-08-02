package com.paypal.oslo.app.identity;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AppTokenProvider", f = "AppTokenProvider.kt", i = {0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5}, l = {283, 340, 302, 351, 362, 362}, m = "getTokenWithFreshAuth", n = {"tokenType", "tokenType", "$this$withLock_u24default$iv", "$i$f$withLock", "tokenType", "activeDeferred", "tokenType", "activeDeferred", "result", "$this$withLock_u24default$iv", "$i$f$withLock", "tokenType", "activeDeferred", "$this$withLock_u24default$iv", "$i$f$withLock", "tokenType", "activeDeferred", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {com.visa.cbp.getCertUsage.getAppPrgrmIDAID, 341, 303, 352, 363, 363}, s = {"L$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$3", "I$0"}, v = 2)
/* loaded from: classes4.dex */
final class AppTokenProvider$getTokenWithFreshAuth$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.app.identity.AppTokenProvider getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getTokenWithFreshAuth(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppTokenProvider$getTokenWithFreshAuth$1(com.paypal.oslo.app.identity.AppTokenProvider appTokenProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.identity.AppTokenProvider$getTokenWithFreshAuth$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = appTokenProvider;
    }
}
