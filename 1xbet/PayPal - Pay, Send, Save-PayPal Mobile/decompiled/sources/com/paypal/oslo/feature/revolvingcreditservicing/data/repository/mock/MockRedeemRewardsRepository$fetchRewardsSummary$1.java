package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository", f = "MockRedeemRewardsRepository.kt", i = {0}, l = {45}, m = "fetchRewardsSummary", n = {"creditProductIdentifier"}, nl = {47}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockRedeemRewardsRepository$fetchRewardsSummary$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.fetchRewardsSummary(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockRedeemRewardsRepository$fetchRewardsSummary$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository mockRedeemRewardsRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$fetchRewardsSummary$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockRedeemRewardsRepository;
    }
}
