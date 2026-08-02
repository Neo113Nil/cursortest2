package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper", f = "ReviewPaymentUiModelMapper.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {57, 70}, m = "toReviewPaymentUiModel", n = {"args", "paymentDate", "localeBasedOnCPI", "formattedDateLong", "formattedDateShort", "isToday", "args", "paymentDate", "localeBasedOnCPI", "formattedDateLong", "formattedDateShort", "formattedAmount", "backupPaymentMethod", "isToday", "isPayPalBalance", "isFuturePayment"}, nl = {58, 75}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "Z$1"}, v = 2)
/* loaded from: classes14.dex */
final class ReviewPaymentUiModelMapper$toReviewPaymentUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.toReviewPaymentUiModel(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPaymentUiModelMapper$toReviewPaymentUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper reviewPaymentUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$toReviewPaymentUiModel$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = reviewPaymentUiModelMapper;
    }
}
