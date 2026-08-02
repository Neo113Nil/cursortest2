package com.paypal.oslo.feature.identity.sso;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl", f = "CodeToTokenExchangeImpl.kt", i = {0}, l = {44}, m = "exchange", n = {"request"}, nl = {53}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class CodeToTokenExchangeImpl$exchange$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.exchange(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CodeToTokenExchangeImpl$exchange$1(com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl codeToTokenExchangeImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl$exchange$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = codeToTokenExchangeImpl;
    }
}
