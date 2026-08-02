package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/offerdetails/navigation/result/OfferDetailsNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$2$1", f = "RewardsSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RewardsSummaryScreenKt$RewardsSummaryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.shoppingrewards.api.rewards.offerdetails.navigation.result.OfferDetailsNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.offerdetails.navigation.result.OfferDetailsNavResult offerDetailsNavResult = (com.paypal.oslo.feature.shoppingrewards.api.rewards.offerdetails.navigation.result.OfferDetailsNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (offerDetailsNavResult.getHasActivated()) {
            this.getHighSpeedVideoSizes.onOfferActivated();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.api.rewards.offerdetails.navigation.result.OfferDetailsNavResult offerDetailsNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$2$1) create(offerDetailsNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$2$1 rewardsSummaryScreenKt$RewardsSummaryScreen$2$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$2$1(this.getHighSpeedVideoSizes, continuation);
        rewardsSummaryScreenKt$RewardsSummaryScreen$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return rewardsSummaryScreenKt$RewardsSummaryScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsSummaryScreenKt$RewardsSummaryScreen$2$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel rewardsSummaryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = rewardsSummaryViewModel;
    }
}
