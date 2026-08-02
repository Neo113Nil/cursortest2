package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository", f = "MockUpdateApplicationRepository.kt", i = {0}, l = {136}, m = "updateApplicationAndFetchOffers", n = {"request"}, nl = {137}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockUpdateApplicationRepository$updateApplicationAndFetchOffers$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.updateApplicationAndFetchOffers(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockUpdateApplicationRepository$updateApplicationAndFetchOffers$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository mockUpdateApplicationRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchOffers$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = mockUpdateApplicationRepository;
    }
}
