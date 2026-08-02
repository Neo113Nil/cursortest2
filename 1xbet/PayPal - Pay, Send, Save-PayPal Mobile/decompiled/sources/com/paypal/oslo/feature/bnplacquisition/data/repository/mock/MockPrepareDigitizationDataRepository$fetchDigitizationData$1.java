package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPrepareDigitizationDataRepository", f = "MockPrepareDigitizationDataRepository.kt", i = {0}, l = {28}, m = "fetchDigitizationData", n = {"request"}, nl = {29}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockPrepareDigitizationDataRepository$fetchDigitizationData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPrepareDigitizationDataRepository getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.fetchDigitizationData(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPrepareDigitizationDataRepository$fetchDigitizationData$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPrepareDigitizationDataRepository mockPrepareDigitizationDataRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPrepareDigitizationDataRepository$fetchDigitizationData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = mockPrepareDigitizationDataRepository;
    }
}
