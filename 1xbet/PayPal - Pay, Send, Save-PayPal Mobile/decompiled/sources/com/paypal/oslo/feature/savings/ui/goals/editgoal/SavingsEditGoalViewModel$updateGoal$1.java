package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel", f = "SavingsEditGoalViewModel.kt", i = {0, 0, 0}, l = {200}, m = "updateGoal", n = {"eventDispatcher", "currentState", "targetMoney"}, nl = {207}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsEditGoalViewModel$updateGoal$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputFormats.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsEditGoalViewModel$updateGoal$1(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$updateGoal$1> continuation) {
        super(continuation);
        this.getInputFormats = savingsEditGoalViewModel;
    }
}
