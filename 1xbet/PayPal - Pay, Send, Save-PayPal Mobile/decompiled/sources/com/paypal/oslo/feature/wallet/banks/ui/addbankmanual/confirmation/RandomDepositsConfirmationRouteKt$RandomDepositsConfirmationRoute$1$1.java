package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1", f = "RandomDepositsConfirmationRoute.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo access$RandomDepositsConfirmationRoute$lambda$8 = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.access$RandomDepositsConfirmationRoute$lambda$8(this.getHighSpeedVideoFpsRanges);
        if (access$RandomDepositsConfirmationRoute$lambda$8 instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(access$RandomDepositsConfirmationRoute$lambda$8, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.IbcFlow.INSTANCE)) {
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination confirmBankDestination = this.Camera2StreamConfigurationMap;
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$RandomDepositsConfirmationRoute$lambda$8 != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.access$RandomDepositsConfirmationRoute$lambda$8(this.getHighSpeedVideoFpsRanges) != null) {
            this.getHighSpeedVideoFpsRangesFor.resetNavigation();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination confirmBankDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(confirmBankDestination);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo navigateTo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult) navigateTo).getResult());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> state, com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination confirmBankDestination, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt$RandomDepositsConfirmationRoute$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = confirmBankAccountViewModel;
        this.getHighSpeedVideoFpsRanges = state;
        this.Camera2StreamConfigurationMap = confirmBankDestination;
    }
}
