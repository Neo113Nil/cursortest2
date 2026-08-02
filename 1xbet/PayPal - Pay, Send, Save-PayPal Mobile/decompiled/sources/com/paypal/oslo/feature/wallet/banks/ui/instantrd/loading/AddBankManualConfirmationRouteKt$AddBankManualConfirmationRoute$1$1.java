package com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1", f = "AddBankManualConfirmationRoute.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo access$AddBankManualConfirmationRoute$lambda$1 = com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.access$AddBankManualConfirmationRoute$lambda$1(this.getHighSpeedVideoSizes);
        if (access$AddBankManualConfirmationRoute$lambda$1 instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$AddBankManualConfirmationRoute$lambda$1 instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$AddBankManualConfirmationRoute$lambda$1 != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.access$AddBankManualConfirmationRoute$lambda$1(this.getHighSpeedVideoSizes) != null) {
            this.Camera2StreamConfigurationMap.resetNavigation();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo navigateTo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(((com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen) navigateTo).getDestination());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo navigateTo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(((com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult) navigateTo).getResult());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt$AddBankManualConfirmationRoute$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.Camera2StreamConfigurationMap = instantRDLoadingViewModel;
        this.getHighSpeedVideoSizes = state;
    }
}
