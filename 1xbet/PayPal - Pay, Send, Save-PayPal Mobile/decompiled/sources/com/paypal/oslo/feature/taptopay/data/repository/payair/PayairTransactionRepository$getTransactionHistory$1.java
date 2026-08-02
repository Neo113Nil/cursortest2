package com.paypal.oslo.feature.taptopay.data.repository.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository", f = "PayairTransactionRepository.kt", i = {0, 0}, l = {48}, m = "getTransactionHistory", n = {"digitizedCardId", "from"}, nl = {47}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class PayairTransactionRepository$getTransactionHistory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getTransactionHistory(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairTransactionRepository$getTransactionHistory$1(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository payairTransactionRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$getTransactionHistory$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = payairTransactionRepository;
    }
}
