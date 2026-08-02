package com.paypal.oslo.feature.wallet.banks.ui.confirmation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.confirmation.ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1", f = "ConfirmInstructionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult confirmBankFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome bankFlowNavResult = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.toBankFlowNavResult(confirmBankFlowNavResult.getOutcome());
        if (bankFlowNavResult instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.confirmation.ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.confirmation.ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(outcome));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult confirmBankFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.confirmation.ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1) create(confirmBankFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.banks.ui.confirmation.ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1 confirmInstructionScreenKt$ConfirmInstructionScreen$3$1 = new com.paypal.oslo.feature.wallet.banks.ui.confirmation.ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        confirmInstructionScreenKt$ConfirmInstructionScreen$3$1.Camera2StreamConfigurationMap = obj;
        return confirmInstructionScreenKt$ConfirmInstructionScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.confirmation.ConfirmInstructionScreenKt$ConfirmInstructionScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
