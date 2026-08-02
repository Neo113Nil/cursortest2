package com.paypal.oslo.feature.cryptocurrency.ui.loyalty;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoProvisioningNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1", f = "LoyaltyCryptoEntryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult cryptoProvisioningNavResult = (com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.Outcome outcome = cryptoProvisioningNavResult.getOutcome();
        if (kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.Outcome.Completed.INSTANCE)) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.Outcome.Canceled.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.LOYALTY_REDEEM));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult cryptoProvisioningNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1) create(cryptoProvisioningNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1 loyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1 = new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        loyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1.getHighSpeedVideoSizes = obj;
        return loyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
