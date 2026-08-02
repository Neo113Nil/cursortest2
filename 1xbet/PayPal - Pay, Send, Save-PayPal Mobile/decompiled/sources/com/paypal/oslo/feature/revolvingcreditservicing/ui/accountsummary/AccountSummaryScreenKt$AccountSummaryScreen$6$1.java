package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/RewardsRedemptionNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$6$1", f = "AccountSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AccountSummaryScreenKt$AccountSummaryScreen$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.RewardsRedemptionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.RewardsRedemptionNavResult rewardsRedemptionNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.RewardsRedemptionNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (rewardsRedemptionNavResult.getRefreshNeeded()) {
            this.getHighSpeedVideoFpsRanges.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnReload.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.RewardsRedemptionNavResult rewardsRedemptionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$6$1) create(rewardsRedemptionNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$6$1 accountSummaryScreenKt$AccountSummaryScreen$6$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$6$1(this.getHighSpeedVideoFpsRanges, continuation);
        accountSummaryScreenKt$AccountSummaryScreen$6$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return accountSummaryScreenKt$AccountSummaryScreen$6$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSummaryScreenKt$AccountSummaryScreen$6$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel accountSummaryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$6$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = accountSummaryViewModel;
    }
}
