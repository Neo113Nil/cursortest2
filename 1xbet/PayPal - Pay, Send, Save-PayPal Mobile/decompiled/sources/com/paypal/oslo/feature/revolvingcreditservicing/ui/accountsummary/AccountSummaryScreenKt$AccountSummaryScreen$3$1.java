package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "navResult", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/ManageCardNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$3$1", f = "AccountSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AccountSummaryScreenKt$AccountSummaryScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ManageCardNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ManageCardNavResult manageCardNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ManageCardNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (manageCardNavResult.getAction() == com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ManageCardAction.CARD_LOCK_STATUS_CHANGED) {
            this.Camera2StreamConfigurationMap.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnReload.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ManageCardNavResult manageCardNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$3$1) create(manageCardNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$3$1 accountSummaryScreenKt$AccountSummaryScreen$3$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$3$1(this.Camera2StreamConfigurationMap, continuation);
        accountSummaryScreenKt$AccountSummaryScreen$3$1.getHighSpeedVideoSizes = obj;
        return accountSummaryScreenKt$AccountSummaryScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSummaryScreenKt$AccountSummaryScreen$3$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel accountSummaryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = accountSummaryViewModel;
    }
}
