package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter", f = "DebitCardI18nFormatter.kt", i = {0, 0, 0, 0, 0, 0}, l = {68}, m = "formatCurrency", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "bigDecimalAmount", "config", "digits"}, nl = {84}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardI18nFormatter$formatCurrency$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.formatCurrency(null, null, null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardI18nFormatter$formatCurrency$1(com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter$formatCurrency$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = debitCardI18nFormatter;
    }
}
