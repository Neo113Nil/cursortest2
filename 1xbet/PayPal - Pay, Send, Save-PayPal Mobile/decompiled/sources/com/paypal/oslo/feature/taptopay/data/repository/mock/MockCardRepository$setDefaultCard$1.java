package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository", f = "MockCardRepository.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {105, 106, 108}, m = "setDefaultCard", n = {"digitizedCardId", "$this$setDefaultCard_u24lambda_u240", "$i$a$-run-MockCardRepository$setDefaultCard$2", "digitizedCardId", "$this$setDefaultCard_u24lambda_u240", "$i$a$-run-MockCardRepository$setDefaultCard$2", "digitizedCardId"}, nl = {106, 107, 109}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0"}, v = 2)
/* loaded from: classes5.dex */
final class MockCardRepository$setDefaultCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.setDefaultCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCardRepository$setDefaultCard$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository mockCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockCardRepository$setDefaultCard$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = mockCardRepository;
    }
}
