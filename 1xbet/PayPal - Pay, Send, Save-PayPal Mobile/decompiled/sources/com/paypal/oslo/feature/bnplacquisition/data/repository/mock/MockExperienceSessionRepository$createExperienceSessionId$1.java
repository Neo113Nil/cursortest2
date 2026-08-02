package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockExperienceSessionRepository", f = "MockExperienceSessionRepository.kt", i = {0}, l = {27}, m = "createExperienceSessionId", n = {"request"}, nl = {28}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockExperienceSessionRepository$createExperienceSessionId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockExperienceSessionRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.createExperienceSessionId(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockExperienceSessionRepository$createExperienceSessionId$1(com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockExperienceSessionRepository mockExperienceSessionRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockExperienceSessionRepository$createExperienceSessionId$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockExperienceSessionRepository;
    }
}
