package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockBnplPlansRepository", f = "MockBnplPlansRepository.kt", i = {0}, l = {33}, m = "getBnplPlans", n = {"request"}, nl = {34}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockBnplPlansRepository$getBnplPlans$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockBnplPlansRepository getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getBnplPlans(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockBnplPlansRepository$getBnplPlans$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockBnplPlansRepository mockBnplPlansRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockBnplPlansRepository$getBnplPlans$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockBnplPlansRepository;
    }
}
