package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel", f = "PaymentTypeAccordionViewModel.kt", i = {0, 0, 0, 0}, l = {com.visa.cbp.getCertUsage.getODAData}, m = "selectPaymentTypeAndUpdateBackend", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, "shippingAddressId", "attemptId", "p2pPaymentType"}, nl = {com.visa.cbp.getCertUsage.setODAData}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes13.dex */
final class PaymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.selectPaymentTypeAndUpdateBackend(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = paymentTypeAccordionViewModel;
    }
}
