package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1", f = "InstantBankConfirmationRouterScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent access$InstantBankConfirmationRouterScreen$lambda$1 = com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt.access$InstantBankConfirmationRouterScreen$lambda$1(this.getHighResolutionOutputSizeshNQ4ISI);
        if (access$InstantBankConfirmationRouterScreen$lambda$1 instanceof com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint) {
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRanges;
            java.lang.String str = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> state = this.getHighResolutionOutputSizeshNQ4ISI;
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1.Camera2StreamConfigurationMap(androidx.compose.runtime.State.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            this.getHighSpeedVideoFpsRangesFor.resetNavigation();
        } else if (access$InstantBankConfirmationRouterScreen$lambda$1 instanceof com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow) {
            com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent access$InstantBankConfirmationRouterScreen$lambda$12 = com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt.access$InstantBankConfirmationRouterScreen$lambda$1(this.getHighResolutionOutputSizeshNQ4ISI);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$InstantBankConfirmationRouterScreen$lambda$12, "");
            final com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome access$toInstantBankConfirmationFlowNavResult = com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt.access$toInstantBankConfirmationFlowNavResult(((com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow) access$InstantBankConfirmationRouterScreen$lambda$12).getResult());
            this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            this.getHighSpeedVideoFpsRangesFor.resetNavigation();
        } else if (access$InstantBankConfirmationRouterScreen$lambda$1 != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent access$InstantBankConfirmationRouterScreen$lambda$1 = com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt.access$InstantBankConfirmationRouterScreen$lambda$1(state);
        kotlin.jvm.internal.Intrinsics.checkNotNull(access$InstantBankConfirmationRouterScreen$lambda$1, "");
        navigationScope.push(((com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint) access$InstantBankConfirmationRouterScreen$lambda$1).getDestination());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome outcome, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult(outcome));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel instantBankConfirmationRouterViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt$InstantBankConfirmationRouterScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = instantBankConfirmationRouterViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
