package com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl", f = "CurrencyFormatterFacadeImpl.kt", i = {0, 0, 0}, l = {57}, m = "requireFormat", n = {"amount", "format", "digits"}, nl = {-1}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class CurrencyFormatterFacadeImpl$requireFormat$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.requireFormat(null, null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyFormatterFacadeImpl$requireFormat$1(com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl currencyFormatterFacadeImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$requireFormat$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = currencyFormatterFacadeImpl;
    }
}
