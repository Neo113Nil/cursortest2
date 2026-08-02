package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl", f = "CommerceItemRepositoryImpl.kt", i = {0, 0, 0}, l = {40}, m = "getVariants", n = {"commerceItemId", "sessionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID}, nl = {48}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class CommerceItemRepositoryImpl$getVariants$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.getVariants(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommerceItemRepositoryImpl$getVariants$1(com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl commerceItemRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl$getVariants$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = commerceItemRepositoryImpl;
    }
}
