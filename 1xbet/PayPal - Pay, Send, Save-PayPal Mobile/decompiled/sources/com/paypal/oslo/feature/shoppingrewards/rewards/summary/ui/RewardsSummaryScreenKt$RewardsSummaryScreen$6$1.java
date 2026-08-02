package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class RewardsSummaryScreenKt$RewardsSummaryScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(int i) {
        ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel) this.receiver).onChangeTab(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
        getHighSpeedVideoFpsRangesFor(num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    RewardsSummaryScreenKt$RewardsSummaryScreen$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel.class, "onChangeTab", "onChangeTab(I)V", 0);
    }
}
