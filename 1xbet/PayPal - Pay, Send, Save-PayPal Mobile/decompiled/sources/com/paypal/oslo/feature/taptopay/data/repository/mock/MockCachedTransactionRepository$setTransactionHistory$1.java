package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository", f = "MockCachedTransactionRepository.kt", i = {0, 0, 0}, l = {47}, m = "setTransactionHistory", n = {"transactions", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {48}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class MockCachedTransactionRepository$setTransactionHistory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.setTransactionHistory(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCachedTransactionRepository$setTransactionHistory$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository mockCachedTransactionRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$setTransactionHistory$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = mockCachedTransactionRepository;
    }
}
