package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockSubmitCreditApplicationRepository", f = "MockSubmitCreditApplicationRepository.kt", i = {0}, l = {29}, m = "submitCreditApplication", n = {"request"}, nl = {30}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockSubmitCreditApplicationRepository$submitCreditApplication$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockSubmitCreditApplicationRepository getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.submitCreditApplication(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockSubmitCreditApplicationRepository$submitCreditApplication$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockSubmitCreditApplicationRepository mockSubmitCreditApplicationRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockSubmitCreditApplicationRepository$submitCreditApplication$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockSubmitCreditApplicationRepository;
    }
}
