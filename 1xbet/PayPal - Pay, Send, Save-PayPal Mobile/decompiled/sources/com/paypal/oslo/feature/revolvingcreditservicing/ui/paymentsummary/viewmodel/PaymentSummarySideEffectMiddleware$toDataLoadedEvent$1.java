package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware", f = "PaymentSummarySideEffectMiddleware.kt", i = {0, 0}, l = {100}, m = "toDataLoadedEvent", n = {"overview", "currentCreditAccountId"}, nl = {104}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentSummarySideEffectMiddleware$toDataLoadedEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSummarySideEffectMiddleware$toDataLoadedEvent$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware paymentSummarySideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$toDataLoadedEvent$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = paymentSummarySideEffectMiddleware;
    }
}
