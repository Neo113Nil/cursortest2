package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository", f = "PayPalMockCardRepository.kt", i = {0}, l = {329}, m = "notifyCardDeleted", n = {"id"}, nl = {com.visa.cbp.getCertUsage.setAucAID}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayPalMockCardRepository$notifyCardDeleted$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.notifyCardDeleted(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalMockCardRepository$notifyCardDeleted$1(com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository payPalMockCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository$notifyCardDeleted$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = payPalMockCardRepository;
    }
}
