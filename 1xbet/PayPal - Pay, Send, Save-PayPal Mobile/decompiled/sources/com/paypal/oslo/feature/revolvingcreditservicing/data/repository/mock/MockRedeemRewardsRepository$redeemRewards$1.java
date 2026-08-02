package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository", f = "MockRedeemRewardsRepository.kt", i = {0}, l = {97}, m = "redeemRewards", n = {"request"}, nl = {99}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockRedeemRewardsRepository$redeemRewards$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.redeemRewards(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockRedeemRewardsRepository$redeemRewards$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository mockRedeemRewardsRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$redeemRewards$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockRedeemRewardsRepository;
    }
}
