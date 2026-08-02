package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl", f = "ZettleTokenExchangeImpl.kt", i = {0}, l = {38}, m = "exchangeTokenForAuthCode", n = {"exchangeContext"}, nl = {53}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class ZettleTokenExchangeImpl$exchangeTokenForAuthCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.exchangeTokenForAuthCode(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZettleTokenExchangeImpl$exchangeTokenForAuthCode$1(com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl zettleTokenExchangeImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl$exchangeTokenForAuthCode$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = zettleTokenExchangeImpl;
    }
}
