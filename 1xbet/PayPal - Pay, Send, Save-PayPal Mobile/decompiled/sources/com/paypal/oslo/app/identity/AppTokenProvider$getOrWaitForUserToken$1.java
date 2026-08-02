package com.paypal.oslo.app.identity;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AppTokenProvider", f = "AppTokenProvider.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {337, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 348, 359, 359}, m = "getOrWaitForUserToken", n = {"tokenType", "$this$withLock_u24default$iv", "$i$f$withLock", "tokenType", "deferredToWait", "activeDeferred", "tokenType", "deferredToWait", "activeDeferred", "tokenType", "deferredToWait", "activeDeferred", "result", "$this$withLock_u24default$iv", "$i$f$withLock", "tokenType", "deferredToWait", "activeDeferred", "$this$withLock_u24default$iv", "$i$f$withLock", "tokenType", "deferredToWait", "activeDeferred", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {338, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 175, 349, 360, 360}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$4", "I$0", "L$0", "L$1", "L$2", "L$4", "I$0"}, v = 2)
/* loaded from: classes4.dex */
final class AppTokenProvider$getOrWaitForUserToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.app.identity.AppTokenProvider getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDuration.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppTokenProvider$getOrWaitForUserToken$1(com.paypal.oslo.app.identity.AppTokenProvider appTokenProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.identity.AppTokenProvider$getOrWaitForUserToken$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = appTokenProvider;
    }
}
