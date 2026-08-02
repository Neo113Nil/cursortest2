package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl", f = "PaymentSummaryRepositoryImpl.kt", i = {0, 0}, l = {60}, m = "cancelScheduledPayment", n = {"request", "mutation"}, nl = {65}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentSummaryRepositoryImpl$cancelScheduledPayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.cancelScheduledPayment(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSummaryRepositoryImpl$cancelScheduledPayment$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl paymentSummaryRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl$cancelScheduledPayment$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = paymentSummaryRepositoryImpl;
    }
}
