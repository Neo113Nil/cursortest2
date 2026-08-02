package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel", f = "SavingsGoalDetailsViewModel.kt", i = {0, 0, 0, 0}, l = {299}, m = "deleteGoal", n = {"goalId", "goalName", "eventDispatcher", "isAfterTransfer"}, nl = {302}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsGoalDetailsViewModel$deleteGoal$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(null, null, null, false, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsGoalDetailsViewModel$deleteGoal$1(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel savingsGoalDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$deleteGoal$1> continuation) {
        super(continuation);
        this.getInputFormats = savingsGoalDetailsViewModel;
    }
}
