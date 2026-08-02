package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter", f = "BnplAcquisitionFormatter.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {132}, m = "formatCurrency", n = {"currencyCode", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "locale", "this_$iv", "config", "amount", "digits", "$i$f$catch", "$i$f$catch", "$i$f$catch", "$i$a$-catch-RaiseKt__RaiseKt$catch$value$1$iv$iv", "$i$a$-catch-BnplAcquisitionFormatter$formatCurrency$3"}, nl = {com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "D$0", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes11.dex */
final class BnplAcquisitionFormatter$formatCurrency$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    double getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.formatCurrency(0.0d, null, null, 0, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BnplAcquisitionFormatter$formatCurrency$2(com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter$formatCurrency$2> continuation) {
        super(continuation);
        this.getOutputStallDuration = bnplAcquisitionFormatter;
    }
}
