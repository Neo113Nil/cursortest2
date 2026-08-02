package com.paypal.oslo.app.identity;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AppTokenProvider", f = "AppTokenProvider.kt", i = {0, 1, 1, 1, 1, 1}, l = {105, 114}, m = "getToken", n = {"tokenType", "tokenType", "this_$iv", "tokenError", "$i$f$fold", "$i$a$-fold-AppTokenProvider$getToken$2"}, nl = {106, 117}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes4.dex */
final class AppTokenProvider$getToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.app.identity.AppTokenProvider getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getToken(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppTokenProvider$getToken$1(com.paypal.oslo.app.identity.AppTokenProvider appTokenProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.identity.AppTokenProvider$getToken$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = appTokenProvider;
    }
}
