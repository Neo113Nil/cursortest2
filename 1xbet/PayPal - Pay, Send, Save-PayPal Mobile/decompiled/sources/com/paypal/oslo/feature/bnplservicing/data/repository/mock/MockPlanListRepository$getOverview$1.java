package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository", f = "MockPlanListRepository.kt", i = {0}, l = {38}, m = "getOverview", n = {"plansListInput"}, nl = {39}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockPlanListRepository$getOverview$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getOverview(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPlanListRepository$getOverview$1(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository mockPlanListRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository$getOverview$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockPlanListRepository;
    }
}
