package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper", f = "PaymentSummaryUiModelMapper.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {55, 60, 65}, m = "toUiModel", n = {"paymentSummaryOverview", "creditProductIdentifier", "paymentSummaryOverview", "creditProductIdentifier", "currentBalance", "formattingLocale", "paymentSummaryOverview", "creditProductIdentifier", "currentBalance", "formattingLocale"}, nl = {57, 65, 70}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentSummaryUiModelMapper$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.toUiModel(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSummaryUiModelMapper$toUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper paymentSummaryUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$toUiModel$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = paymentSummaryUiModelMapper;
    }
}
