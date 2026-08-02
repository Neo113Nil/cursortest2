package com.paypal.oslo.feature.paymentreadylite.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl", f = "PaymentRecommendationLocalDataSourceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {64}, m = "savePaymentRecommendationData", n = {"snapshot", "this_$iv", "entity", "$i$f$catch", "$i$f$catch", "$i$f$catch", "$i$a$-catch-RaiseKt__RaiseKt$catch$value$1$iv$iv", "$i$a$-catch-PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$2", "$i$a$-let-PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$2$1"}, nl = {65}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes13.dex */
final class PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.savePaymentRecommendationData(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1(com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl paymentRecommendationLocalDataSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = paymentRecommendationLocalDataSourceImpl;
    }
}
