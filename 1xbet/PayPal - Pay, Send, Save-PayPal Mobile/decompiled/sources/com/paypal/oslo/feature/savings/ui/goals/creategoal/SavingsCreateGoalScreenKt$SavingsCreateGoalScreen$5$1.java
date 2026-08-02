package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent savingsCreateGoalIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsCreateGoalIntent, "");
        ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel) this.receiver).processIntent(savingsCreateGoalIntent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent savingsCreateGoalIntent) {
        getHighSpeedVideoFpsRanges(savingsCreateGoalIntent);
        return kotlin.Unit.INSTANCE;
    }

    SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel.class, "processIntent", "processIntent(Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/SavingsCreateGoalIntent;)V", 0);
    }
}
