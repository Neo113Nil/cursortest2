package com.paypal.oslo.feature.paymentreadylite.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl", f = "PaymentRecommendationRepositoryImpl.kt", i = {}, l = {77}, m = "fetchPaymentRecommendation", n = {}, nl = {150}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PaymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.fetchPaymentRecommendation(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1(com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl paymentRecommendationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = paymentRecommendationRepositoryImpl;
    }
}
