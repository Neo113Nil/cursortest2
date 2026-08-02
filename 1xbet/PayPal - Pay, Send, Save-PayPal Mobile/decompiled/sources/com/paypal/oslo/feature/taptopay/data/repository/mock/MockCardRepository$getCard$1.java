package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository", f = "MockCardRepository.kt", i = {0}, l = {93}, m = "getCard", n = {"digitizedCardId"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class MockCardRepository$getCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCardRepository$getCard$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository mockCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$getCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockCardRepository;
    }
}
