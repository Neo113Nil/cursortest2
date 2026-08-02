package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper", f = "PaymentSummaryUiModelMapper.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {143, 149, 155}, m = "groupRepaymentsIntoSections", n = {"repayments", "formattingLocale", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "groupedByStatus", "upcomingRepayments", "$i$a$-let-PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$2", "repayments", "formattingLocale", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "groupedByStatus", "pendingRepayments", "$i$a$-let-PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$3", "repayments", "formattingLocale", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "groupedByStatus", "completedRepayments", "$i$a$-let-PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$4"}, nl = {141, 147, 153}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputStallDurationlomOqCM.getHighSpeedVideoSizes(null, null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper paymentSummaryUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = paymentSummaryUiModelMapper;
    }
}
