package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RewardsDetailScreenKt$RewardsDetailScreen$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent rewardsDetailEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel) this.receiver).processEvent(rewardsDetailEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent rewardsDetailEvent) {
        getHighSpeedVideoFpsRangesFor(rewardsDetailEvent);
        return kotlin.Unit.INSTANCE;
    }

    RewardsDetailScreenKt$RewardsDetailScreen$2$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;)V", 0);
    }
}
