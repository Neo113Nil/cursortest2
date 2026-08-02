package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider", f = "TokenProvider.kt", i = {0, 0}, l = {21}, m = "provideTokens", n = {"scopes", "isRetryAfter401"}, nl = {22}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class TokenProvider$provideTokens$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.provideTokens(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TokenProvider$provideTokens$1(com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider tokenProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider$provideTokens$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = tokenProvider;
    }
}
