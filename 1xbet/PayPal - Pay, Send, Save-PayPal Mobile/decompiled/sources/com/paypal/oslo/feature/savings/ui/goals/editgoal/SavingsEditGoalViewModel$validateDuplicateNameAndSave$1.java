package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel", f = "SavingsEditGoalViewModel.kt", i = {0, 0, 0}, l = {165}, m = "validateDuplicateNameAndSave", n = {"goalId", "goalName", "eventDispatcher"}, nl = {171}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsEditGoalViewModel$validateDuplicateNameAndSave$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel.access$validateDuplicateNameAndSave(this.getInputFormats, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsEditGoalViewModel$validateDuplicateNameAndSave$1(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$validateDuplicateNameAndSave$1> continuation) {
        super(continuation);
        this.getInputFormats = savingsEditGoalViewModel;
    }
}
