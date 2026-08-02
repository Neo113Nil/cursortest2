package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCloseCreditLoanRepository", f = "MockCloseCreditLoanRepository.kt", i = {0}, l = {26}, m = "closeLoan", n = {"request"}, nl = {27}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockCloseCreditLoanRepository$closeLoan$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCloseCreditLoanRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.closeLoan(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCloseCreditLoanRepository$closeLoan$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCloseCreditLoanRepository mockCloseCreditLoanRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockCloseCreditLoanRepository$closeLoan$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockCloseCreditLoanRepository;
    }
}
