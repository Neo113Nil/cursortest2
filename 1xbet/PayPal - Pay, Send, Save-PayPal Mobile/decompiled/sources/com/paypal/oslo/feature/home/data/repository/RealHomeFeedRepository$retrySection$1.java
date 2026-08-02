package com.paypal.oslo.feature.home.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository", f = "RealHomeFeedRepository.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {138, 166}, m = "retrySection", n = {"sectionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "currentRetryCount", "newRetryCount", "isExhausted", "sectionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "currentRetryCount", "newRetryCount", "isExhausted"}, nl = {445, 449}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes5.dex */
final class RealHomeFeedRepository$retrySection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.retrySection(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealHomeFeedRepository$retrySection$1(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository realHomeFeedRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$retrySection$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = realHomeFeedRepository;
    }
}
