package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class RewardsSummaryScreenKt$RewardsSummaryScreen$9$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick onClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "");
        ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel) this.receiver).onClick(onClick);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick onClick) {
        getHighSpeedVideoFpsRangesFor(onClick);
        return kotlin.Unit.INSTANCE;
    }

    RewardsSummaryScreenKt$RewardsSummaryScreen$9$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel.class, "onClick", "onClick(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;)V", 0);
    }
}
