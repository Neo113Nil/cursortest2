package com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt$ChooseAccountsScreen$3$1", f = "ChooseAccountsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ChooseAccountsScreenKt$ChooseAccountsScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.ChooseAccountsEvent> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.ChooseAccountsEvent access$ChooseAccountsScreen$lambda$1 = com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt.access$ChooseAccountsScreen$lambda$1(this.getHighSpeedVideoFpsRangesFor);
        if (access$ChooseAccountsScreen$lambda$1 instanceof com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.ChooseAccountsEvent.NavigateToSummary) {
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.ChooseAccountsEvent access$ChooseAccountsScreen$lambda$12 = com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt.access$ChooseAccountsScreen$lambda$1(this.getHighSpeedVideoFpsRangesFor);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$ChooseAccountsScreen$lambda$12, "");
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.ChooseAccountsEvent.NavigateToSummary navigateToSummary = (com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.ChooseAccountsEvent.NavigateToSummary) access$ChooseAccountsScreen$lambda$12;
            final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen addBankSummaryScreen = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen(navigateToSummary.getLinkedBankAccounts(), navigateToSummary.getFailedBankAccounts(), navigateToSummary.getBankName(), navigateToSummary.getBankLogo());
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt$ChooseAccountsScreen$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt$ChooseAccountsScreen$3$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$ChooseAccountsScreen$lambda$1 != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen addBankSummaryScreen, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(addBankSummaryScreen);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt$ChooseAccountsScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt$ChooseAccountsScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChooseAccountsScreenKt$ChooseAccountsScreen$3$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.ChooseAccountsEvent> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt$ChooseAccountsScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
