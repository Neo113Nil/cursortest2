package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCreateCreditApplicationRepository", f = "MockCreateCreditApplicationRepository.kt", i = {0}, l = {55}, m = "createCreditApplication", n = {"request"}, nl = {56}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockCreateCreditApplicationRepository$createCreditApplication$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCreateCreditApplicationRepository getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.createCreditApplication(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCreateCreditApplicationRepository$createCreditApplication$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCreateCreditApplicationRepository mockCreateCreditApplicationRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCreateCreditApplicationRepository$createCreditApplication$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = mockCreateCreditApplicationRepository;
    }
}
