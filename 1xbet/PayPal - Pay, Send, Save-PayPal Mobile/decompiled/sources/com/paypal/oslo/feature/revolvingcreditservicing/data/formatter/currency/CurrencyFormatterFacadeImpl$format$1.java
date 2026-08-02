package com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl", f = "CurrencyFormatterFacadeImpl.kt", i = {0, 0, 0, 0, 0}, l = {39}, m = "format", n = {"amount", "format", "it", "digits", "$i$a$-let-CurrencyFormatterFacadeImpl$format$2"}, nl = {46}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class CurrencyFormatterFacadeImpl$format$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.format(null, null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyFormatterFacadeImpl$format$1(com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl currencyFormatterFacadeImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$format$1> continuation) {
        super(continuation);
        this.getOutputFormats = currencyFormatterFacadeImpl;
    }
}
