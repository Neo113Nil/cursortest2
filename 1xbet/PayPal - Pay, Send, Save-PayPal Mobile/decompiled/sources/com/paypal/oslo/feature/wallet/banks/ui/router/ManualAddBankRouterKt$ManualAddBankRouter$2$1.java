package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1", f = "ManualAddBankRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualAddBankRouterKt$ManualAddBankRouter$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = (com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if ((bankFlowNavResult.getOutcome() instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled) && (((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled) bankFlowNavResult.getOutcome()).getReason() instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserNavigatedBack)) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else {
            this.getHighSpeedVideoFpsRangesFor.finishFlowWithResult(bankFlowNavResult.getOutcome());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1) create(bankFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1 manualAddBankRouterKt$ManualAddBankRouter$2$1 = new com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        manualAddBankRouterKt$ManualAddBankRouter$2$1.getHighSpeedVideoSizes = obj;
        return manualAddBankRouterKt$ManualAddBankRouter$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualAddBankRouterKt$ManualAddBankRouter$2$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt$ManualAddBankRouter$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = bankSharedViewModel;
    }
}
