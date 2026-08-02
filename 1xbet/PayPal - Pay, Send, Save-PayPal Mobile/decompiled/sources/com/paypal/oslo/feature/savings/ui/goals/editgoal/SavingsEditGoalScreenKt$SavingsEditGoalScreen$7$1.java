package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SavingsEditGoalScreenKt$SavingsEditGoalScreen$7$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent savingsEditGoalIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsEditGoalIntent, "");
        ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel) this.receiver).processIntent(savingsEditGoalIntent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent savingsEditGoalIntent) {
        Camera2StreamConfigurationMap(savingsEditGoalIntent);
        return kotlin.Unit.INSTANCE;
    }

    SavingsEditGoalScreenKt$SavingsEditGoalScreen$7$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel.class, "processIntent", "processIntent(Lcom/paypal/oslo/feature/savings/ui/goals/editgoal/SavingsEditGoalIntent;)V", 0);
    }
}
