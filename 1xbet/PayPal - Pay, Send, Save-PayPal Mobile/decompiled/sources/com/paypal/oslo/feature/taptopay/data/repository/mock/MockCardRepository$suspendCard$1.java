package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository", f = "MockCardRepository.kt", i = {0, 1}, l = {308, 310}, m = "suspendCard", n = {"digitizedCardId", "digitizedCardId"}, nl = {309, 311}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes5.dex */
final class MockCardRepository$suspendCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.suspendCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCardRepository$suspendCard$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository mockCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$suspendCard$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockCardRepository;
    }
}
