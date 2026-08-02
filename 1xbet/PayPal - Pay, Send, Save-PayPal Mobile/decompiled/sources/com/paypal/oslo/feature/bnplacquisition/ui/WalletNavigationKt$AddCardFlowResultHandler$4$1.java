package com.paypal.oslo.feature.bnplacquisition.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler$4$1", f = "WalletNavigation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class WalletNavigationKt$AddCardFlowResultHandler$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = addCardFlowNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Add card flow succeeded", null, null, 6, null);
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card = ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) outcome).getCard();
            kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, java.lang.String, kotlin.Unit> function3 = this.getHighSpeedVideoSizes;
            java.lang.String id = card.getId();
            java.lang.String issuerName = card.getIssuerName();
            if (issuerName == null) {
                issuerName = "";
            }
            java.lang.String lastNChars = card.getLastNChars();
            function3.invoke(id, issuerName, lastNChars != null ? lastNChars : "");
        } else if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) {
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error error = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) outcome;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Add card flow failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMsg", error.getErrorMsg())), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.invoke(error.getErrorMsg());
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Add card flow cancelled", null, null, 6, null);
            this.getHighSpeedVideoFpsRanges.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler$4$1) create(addCardFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler$4$1 walletNavigationKt$AddCardFlowResultHandler$4$1 = new com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler$4$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        walletNavigationKt$AddCardFlowResultHandler$4$1.Camera2StreamConfigurationMap = obj;
        return walletNavigationKt$AddCardFlowResultHandler$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WalletNavigationKt$AddCardFlowResultHandler$4$1(kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function3;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = function0;
    }
}
