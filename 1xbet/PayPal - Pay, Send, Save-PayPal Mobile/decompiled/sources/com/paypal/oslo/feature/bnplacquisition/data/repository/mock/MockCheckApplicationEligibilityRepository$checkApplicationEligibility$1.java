package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCheckApplicationEligibilityRepository", f = "MockCheckApplicationEligibilityRepository.kt", i = {0}, l = {32}, m = "checkApplicationEligibility", n = {"request"}, nl = {33}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockCheckApplicationEligibilityRepository$checkApplicationEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCheckApplicationEligibilityRepository getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.checkApplicationEligibility(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCheckApplicationEligibilityRepository$checkApplicationEligibility$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCheckApplicationEligibilityRepository mockCheckApplicationEligibilityRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCheckApplicationEligibilityRepository$checkApplicationEligibility$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockCheckApplicationEligibilityRepository;
    }
}
