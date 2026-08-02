package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository", f = "MockProvisionedCardOverviewRepository.kt", i = {0}, l = {42}, m = "fetchProvisionedCardOverview", n = {"request"}, nl = {44}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.fetchProvisionedCardOverview(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository mockProvisionedCardOverviewRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository$fetchProvisionedCardOverview$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockProvisionedCardOverviewRepository;
    }
}
