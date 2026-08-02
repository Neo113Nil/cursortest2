package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl", f = "RewardsSummaryRepositoryImpl.kt", i = {0}, l = {66}, m = "getRewardsSummary", n = {"input"}, nl = {75}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class RewardsSummaryRepositoryImpl$getRewardsSummary$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getRewardsSummary(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsSummaryRepositoryImpl$getRewardsSummary$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl rewardsSummaryRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl$getRewardsSummary$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = rewardsSummaryRepositoryImpl;
    }
}
