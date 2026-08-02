package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetResult$CardCancelled;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$4$1", f = "BalanceDashboardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardScreenKt$BalanceDashboardScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled cardCancelled = (com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.processIntent(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage(cardCancelled.getToastMessage()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled cardCancelled, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$4$1) create(cardCancelled, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$4$1 balanceDashboardScreenKt$BalanceDashboardScreen$4$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$4$1(this.getHighSpeedVideoFpsRanges, continuation);
        balanceDashboardScreenKt$BalanceDashboardScreen$4$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return balanceDashboardScreenKt$BalanceDashboardScreen$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardScreenKt$BalanceDashboardScreen$4$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = balanceDashboardViewModel;
    }
}
