package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository", f = "MockPayLaterHubRepository.kt", i = {0}, l = {73}, m = "getOverview", n = {"input"}, nl = {74}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockPayLaterHubRepository$getOverview$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getOverview(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPayLaterHubRepository$getOverview$1(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository mockPayLaterHubRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getOverview$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockPayLaterHubRepository;
    }
}
