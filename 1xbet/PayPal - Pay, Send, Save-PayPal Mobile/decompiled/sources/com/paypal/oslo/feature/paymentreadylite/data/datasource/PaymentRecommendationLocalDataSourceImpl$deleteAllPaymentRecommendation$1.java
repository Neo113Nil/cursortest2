package com.paypal.oslo.feature.paymentreadylite.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl", f = "PaymentRecommendationLocalDataSourceImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {70, 71}, m = "deleteAllPaymentRecommendation", n = {"this_$iv", "$i$f$catch", "$i$f$catch", "$i$f$catch", "$i$a$-catch-RaiseKt__RaiseKt$catch$value$1$iv$iv", "$i$a$-catch-PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$2", "this_$iv", "$i$f$catch", "$i$f$catch", "$i$f$catch", "$i$a$-catch-RaiseKt__RaiseKt$catch$value$1$iv$iv", "$i$a$-catch-PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$2"}, nl = {71, 72}, s = {"L$0", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes13.dex */
final class PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.deleteAllPaymentRecommendation(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1(com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl paymentRecommendationLocalDataSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = paymentRecommendationLocalDataSourceImpl;
    }
}
