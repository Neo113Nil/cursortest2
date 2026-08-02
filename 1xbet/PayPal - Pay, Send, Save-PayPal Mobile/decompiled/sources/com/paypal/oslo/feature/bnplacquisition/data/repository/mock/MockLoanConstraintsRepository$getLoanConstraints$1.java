package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockLoanConstraintsRepository", f = "MockLoanConstraintsRepository.kt", i = {0}, l = {30}, m = "getLoanConstraints", n = {"request"}, nl = {31}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockLoanConstraintsRepository$getLoanConstraints$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockLoanConstraintsRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getLoanConstraints(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockLoanConstraintsRepository$getLoanConstraints$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockLoanConstraintsRepository mockLoanConstraintsRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockLoanConstraintsRepository$getLoanConstraints$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockLoanConstraintsRepository;
    }
}
