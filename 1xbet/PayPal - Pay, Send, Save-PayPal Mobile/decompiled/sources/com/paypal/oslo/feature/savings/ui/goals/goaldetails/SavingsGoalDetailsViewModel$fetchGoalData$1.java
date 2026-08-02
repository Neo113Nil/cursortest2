package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel", f = "SavingsGoalDetailsViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m = "fetchGoalData", n = {"eventDispatcher", "isActivityRefreshRequired"}, nl = {com.visa.cbp.getCertUsage.setODAData}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsGoalDetailsViewModel$fetchGoalData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap((kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent, kotlin.Unit>) null, false, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsGoalDetailsViewModel$fetchGoalData$1(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel savingsGoalDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$fetchGoalData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = savingsGoalDetailsViewModel;
    }
}
