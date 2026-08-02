package com.paypal.oslo.feature.bnplacquisition.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler$4$1", f = "WalletNavigation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class WalletNavigationKt$AddBankFlowResultHandler$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, kotlin.Unit> getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult addBankFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome outcome = addBankFlowNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Add bank flow succeeded", null, null, 6, null);
            java.util.List<com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount> linkedBankAccounts = ((com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) outcome).getLinkedBankAccounts();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(linkedBankAccounts, 10));
            java.util.Iterator<T> it = linkedBankAccounts.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount) it.next()).getAccountId());
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                this.getHighSpeedVideoSizes.invoke("No linked bank accounts were returned");
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Add bank flow failed, no linked bank accounts were returned", null, null, 6, null);
            } else {
                this.getHighSpeedVideoFpsRanges.invoke(arrayList2);
            }
        } else if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error) {
            com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error error = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error) outcome;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Add bank flow failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", error.getErrorMessage())), null, 4, null);
            this.getHighSpeedVideoSizes.invoke(error.getErrorMessage());
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Add bank flow cancelled", null, null, 6, null);
            this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult addBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler$4$1) create(addBankFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler$4$1 walletNavigationKt$AddBankFlowResultHandler$4$1 = new com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler$4$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        walletNavigationKt$AddBankFlowResultHandler$4$1.getHighSpeedVideoFpsRangesFor = obj;
        return walletNavigationKt$AddBankFlowResultHandler$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WalletNavigationKt$AddBankFlowResultHandler$4$1(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = function12;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
