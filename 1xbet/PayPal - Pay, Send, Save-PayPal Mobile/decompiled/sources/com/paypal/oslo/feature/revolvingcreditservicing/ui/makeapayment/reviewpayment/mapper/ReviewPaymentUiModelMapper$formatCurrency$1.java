package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper", f = "ReviewPaymentUiModelMapper.kt", i = {0}, l = {152}, m = "formatCurrency", n = {"amount"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class ReviewPaymentUiModelMapper$formatCurrency$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPaymentUiModelMapper$formatCurrency$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper reviewPaymentUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$formatCurrency$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = reviewPaymentUiModelMapper;
    }
}
