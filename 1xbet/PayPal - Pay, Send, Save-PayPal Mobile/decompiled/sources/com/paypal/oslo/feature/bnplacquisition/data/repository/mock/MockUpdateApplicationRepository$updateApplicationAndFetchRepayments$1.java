package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository", f = "MockUpdateApplicationRepository.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "updateApplicationAndFetchRepayments", n = {"request"}, nl = {225}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.updateApplicationAndFetchRepayments(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository mockUpdateApplicationRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockUpdateApplicationRepository$updateApplicationAndFetchRepayments$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockUpdateApplicationRepository;
    }
}
