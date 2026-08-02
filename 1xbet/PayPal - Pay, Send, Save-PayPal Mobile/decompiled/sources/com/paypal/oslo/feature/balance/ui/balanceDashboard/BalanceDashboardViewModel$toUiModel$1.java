package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel", f = "BalanceDashboardViewModel.kt", i = {0, 0, 0, 1, 1}, l = {98, 99}, m = "toUiModel", n = {"$this$toUiModel", "it", "$i$a$-let-BalanceDashboardViewModel$toUiModel$formattedReservedAmount$1", "$this$toUiModel", "formattedReservedAmount"}, nl = {98, 100}, s = {"L$0", "L$1", "I$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardViewModel$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel.access$toUiModel(this.getOutputMinFrameDuration, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardViewModel$toUiModel$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$toUiModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = balanceDashboardViewModel;
    }
}
