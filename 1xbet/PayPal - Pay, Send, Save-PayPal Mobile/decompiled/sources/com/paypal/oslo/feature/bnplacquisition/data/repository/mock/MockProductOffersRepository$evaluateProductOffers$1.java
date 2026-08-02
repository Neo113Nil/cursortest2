package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository", f = "MockProductOffersRepository.kt", i = {0}, l = {34}, m = "evaluateProductOffers", n = {"request"}, nl = {36}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockProductOffersRepository$evaluateProductOffers$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.evaluateProductOffers(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockProductOffersRepository$evaluateProductOffers$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository mockProductOffersRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProductOffersRepository$evaluateProductOffers$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockProductOffersRepository;
    }
}
