package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPaymentFundingInstrumentsRepository", f = "MockPaymentFundingInstrumentsRepository.kt", i = {0}, l = {30}, m = "getPaymentFundingInstruments", n = {"applicationSessionId"}, nl = {31}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPaymentFundingInstrumentsRepository getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getPaymentFundingInstruments(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPaymentFundingInstrumentsRepository mockPaymentFundingInstrumentsRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockPaymentFundingInstrumentsRepository;
    }
}
