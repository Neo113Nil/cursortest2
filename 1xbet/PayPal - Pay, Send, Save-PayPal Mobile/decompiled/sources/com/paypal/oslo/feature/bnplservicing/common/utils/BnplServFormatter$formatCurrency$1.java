package com.paypal.oslo.feature.bnplservicing.common.utils;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter", f = "BnplServFormatter.kt", i = {0, 0, 0, 0, 0, 0}, l = {91}, m = "formatCurrency", n = {"amount", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "convertToBigDecimal", "config", "digits", "convertToDouble"}, nl = {311}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "D$0"}, v = 2)
/* loaded from: classes11.dex */
final class BnplServFormatter$formatCurrency$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    double Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputFormats.formatCurrency(null, null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BnplServFormatter$formatCurrency$1(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatCurrency$1> continuation) {
        super(continuation);
        this.getInputFormats = bnplServFormatter;
    }
}
