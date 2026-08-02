package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$3$1", f = "BalanceDashboardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardScreenKt$BalanceDashboardScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult = (com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult) this.getHighSpeedVideoSizesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String resolveAutoReloadResultMessage = com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt.resolveAutoReloadResultMessage(autoReloadFlowNavResult, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        if (resolveAutoReloadResultMessage != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.processIntent(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage(resolveAutoReloadResultMessage));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$3$1) create(autoReloadFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$3$1 balanceDashboardScreenKt$BalanceDashboardScreen$3$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        balanceDashboardScreenKt$BalanceDashboardScreen$3$1.getHighSpeedVideoSizesFor = obj;
        return balanceDashboardScreenKt$BalanceDashboardScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardScreenKt$BalanceDashboardScreen$3$1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = str2;
        this.Camera2StreamConfigurationMap = str3;
        this.getHighSpeedVideoFpsRangesFor = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = balanceDashboardViewModel;
    }
}
