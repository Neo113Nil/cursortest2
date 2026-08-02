package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper", f = "ReviewPaymentUiModelMapper.kt", i = {0, 0, 0}, l = {131}, m = "getPaymentMethodDetails", n = {"fundingInstrument", "balance", "$i$a$-let-ReviewPaymentUiModelMapper$getPaymentMethodDetails$3"}, nl = {129}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class ReviewPaymentUiModelMapper$getPaymentMethodDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPaymentUiModelMapper$getPaymentMethodDetails$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper reviewPaymentUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper$getPaymentMethodDetails$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = reviewPaymentUiModelMapper;
    }
}
