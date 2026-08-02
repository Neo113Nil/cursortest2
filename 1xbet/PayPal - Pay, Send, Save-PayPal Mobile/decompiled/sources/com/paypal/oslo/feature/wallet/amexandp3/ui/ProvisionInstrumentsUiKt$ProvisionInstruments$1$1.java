package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1", f = "ProvisionInstrumentsUi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ProvisionInstrumentsUiKt$ProvisionInstruments$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation access$ProvisionInstruments$lambda$1 = com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.access$ProvisionInstruments$lambda$1(this.getHighResolutionOutputSizeshNQ4ISI);
        if (access$ProvisionInstruments$lambda$1 instanceof com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation.NavigateForResult) {
            this.Camera2StreamConfigurationMap.resetNavigation();
            this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$ProvisionInstruments$lambda$1 instanceof com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation.GoBackWithResult) {
            this.Camera2StreamConfigurationMap.resetNavigation();
            this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$ProvisionInstruments$lambda$1 != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation navigation, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(((com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation.GoBackWithResult) navigation).getResult());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation navigation, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(((com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation.NavigateForResult) navigation).getDestination());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProvisionInstrumentsUiKt$ProvisionInstruments$1$1(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = provisionInstrumentsViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
