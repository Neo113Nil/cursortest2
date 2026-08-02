package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository", f = "MockCachedTransactionRepository.kt", i = {0, 0, 0}, l = {47}, m = "addTransaction", n = {"transaction", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {48}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class MockCachedTransactionRepository$addTransaction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.addTransaction(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCachedTransactionRepository$addTransaction$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository mockCachedTransactionRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$addTransaction$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = mockCachedTransactionRepository;
    }
}
