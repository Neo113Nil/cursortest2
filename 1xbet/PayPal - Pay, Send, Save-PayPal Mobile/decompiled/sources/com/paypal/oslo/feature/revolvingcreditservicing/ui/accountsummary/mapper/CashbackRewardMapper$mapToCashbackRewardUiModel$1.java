package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper", f = "CashbackRewardMapper.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2}, l = {51, 55, 59}, m = "mapToCashbackRewardUiModel", n = {"rewardsSummary", "creditProductIdentifier", "rewardsSummary", "creditProductIdentifier", "currentRewardsAmount", "rewardsSummary", "creditProductIdentifier", "currentRewardsAmount", "yearToDateRewardsAmount"}, nl = {53, 57, 61}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class CashbackRewardMapper$mapToCashbackRewardUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.mapToCashbackRewardUiModel(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashbackRewardMapper$mapToCashbackRewardUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper cashbackRewardMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper$mapToCashbackRewardUiModel$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = cashbackRewardMapper;
    }
}
