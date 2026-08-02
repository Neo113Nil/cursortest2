package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/result/RedeemNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$3$1", f = "RewardsSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RewardsSummaryScreenKt$RewardsSummaryScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.result.RedeemNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.result.RedeemNavResult redeemNavResult = (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.result.RedeemNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (redeemNavResult.getHasRedeemed()) {
            this.getHighResolutionOutputSizeshNQ4ISI.onRedemptionCompleted();
        }
        if (redeemNavResult.getNavigateToActivity()) {
            this.getHighResolutionOutputSizeshNQ4ISI.onChangeTab(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryDestinations.INSTANCE.getIndexFromDestination(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryActivityDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.result.RedeemNavResult redeemNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$3$1) create(redeemNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$3$1 rewardsSummaryScreenKt$RewardsSummaryScreen$3$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        rewardsSummaryScreenKt$RewardsSummaryScreen$3$1.getHighSpeedVideoFpsRangesFor = obj;
        return rewardsSummaryScreenKt$RewardsSummaryScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsSummaryScreenKt$RewardsSummaryScreen$3$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel rewardsSummaryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = rewardsSummaryViewModel;
    }
}
