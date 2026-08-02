package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl", f = "PaymentSummaryRepositoryImpl.kt", i = {0, 0}, l = {41}, m = "fetchPaymentSummary", n = {"request", "query"}, nl = {46}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentSummaryRepositoryImpl$fetchPaymentSummary$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.fetchPaymentSummary(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSummaryRepositoryImpl$fetchPaymentSummary$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl paymentSummaryRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$fetchPaymentSummary$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = paymentSummaryRepositoryImpl;
    }
}
