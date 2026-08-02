package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository", f = "PayPalMockCardRepository.kt", i = {}, l = {312}, m = "getCardIdGroups", n = {}, nl = {372}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PayPalMockCardRepository$getCardIdGroups$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository.access$getCardIdGroups(this.getHighSpeedVideoFpsRanges, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalMockCardRepository$getCardIdGroups$1(com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository payPalMockCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository$getCardIdGroups$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = payPalMockCardRepository;
    }
}
