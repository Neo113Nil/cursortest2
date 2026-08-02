package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel", f = "SavingsCreateGoalViewModel.kt", i = {0, 0}, l = {110}, m = "validateDuplicateName", n = {"goalName", "eventDispatcher"}, nl = {113}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsCreateGoalViewModel$validateDuplicateName$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel.access$validateDuplicateName(this.getHighSpeedVideoSizes, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsCreateGoalViewModel$validateDuplicateName$1(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel savingsCreateGoalViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validateDuplicateName$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = savingsCreateGoalViewModel;
    }
}
