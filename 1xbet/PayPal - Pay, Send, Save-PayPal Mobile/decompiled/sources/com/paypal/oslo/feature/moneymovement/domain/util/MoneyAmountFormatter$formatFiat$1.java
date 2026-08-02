package com.paypal.oslo.feature.moneymovement.domain.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter", f = "MoneyAmountFormatter.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {90}, m = "formatFiat", n = {"fiat", "f", "fallback", "config", "amount", "isInternationalFormat", "$i$a$-fold-MoneyAmountFormatter$formatFiat$3"}, nl = {109}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0"}, v = 2)
/* loaded from: classes13.dex */
final class MoneyAmountFormatter$formatFiat$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    boolean getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(null, false, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoneyAmountFormatter$formatFiat$1(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFiat$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = moneyAmountFormatter;
    }
}
