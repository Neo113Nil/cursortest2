package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository", f = "MockUpdateApplicationRepository.kt", i = {0}, l = {65}, m = "updateApplicationAndFetchTerms", n = {"request"}, nl = {66}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockUpdateApplicationRepository$updateApplicationAndFetchTerms$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.updateApplicationAndFetchTerms(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockUpdateApplicationRepository$updateApplicationAndFetchTerms$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository mockUpdateApplicationRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchTerms$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockUpdateApplicationRepository;
    }
}
