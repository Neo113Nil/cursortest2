package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RewardsSuccessScreenKt$RewardsSuccessScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent rewardsSuccessEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSuccessEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel) this.receiver).processEvent(rewardsSuccessEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessEvent rewardsSuccessEvent) {
        getHighResolutionOutputSizeshNQ4ISI(rewardsSuccessEvent);
        return kotlin.Unit.INSTANCE;
    }

    RewardsSuccessScreenKt$RewardsSuccessScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/success/viewmodel/RewardsSuccessEvent;)V", 0);
    }
}
