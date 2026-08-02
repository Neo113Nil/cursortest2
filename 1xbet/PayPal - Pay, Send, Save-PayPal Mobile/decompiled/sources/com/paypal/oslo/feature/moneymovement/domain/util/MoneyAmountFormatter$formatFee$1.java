package com.paypal.oslo.feature.moneymovement.domain.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter", f = "MoneyAmountFormatter.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {68, 73}, m = "formatFee", n = {"moneyAmount", "rawQuantity", "it", "isInternationalFormat", "$i$a$-getOrElse-MoneyAmountFormatter$formatFee$quantity$2", "moneyAmount", "rawQuantity", "quantity", "isInternationalFormat"}, nl = {66, 70}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0", "L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes13.dex */
final class MoneyAmountFormatter$formatFee$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.formatFee(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoneyAmountFormatter$formatFee$1(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFee$1> continuation) {
        super(continuation);
        this.getInputFormats = moneyAmountFormatter;
    }
}
