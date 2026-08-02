package com.paypal.oslo.feature.home.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository", f = "MockHomeFeedRepository.kt", i = {0, 0}, l = {100}, m = "retrySection", n = {"sectionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE}, nl = {103}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class MockHomeFeedRepository$retrySection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.retrySection(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockHomeFeedRepository$retrySection$1(com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository mockHomeFeedRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$retrySection$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockHomeFeedRepository;
    }
}
