package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository", f = "MockMakeAPaymentRepository.kt", i = {0}, l = {55}, m = "getEligibleFi", n = {"input"}, nl = {56}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockMakeAPaymentRepository$getEligibleFi$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getEligibleFi(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockMakeAPaymentRepository$getEligibleFi$1(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository mockMakeAPaymentRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getEligibleFi$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockMakeAPaymentRepository;
    }
}
