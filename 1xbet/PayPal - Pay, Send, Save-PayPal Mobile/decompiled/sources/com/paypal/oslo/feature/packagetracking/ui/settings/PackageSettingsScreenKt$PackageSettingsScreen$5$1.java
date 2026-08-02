package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsScreen$5$1", f = "PackageSettingsScreen.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageSettingsScreenKt$PackageSettingsScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowInput, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect> uiEffect = this.getHighSpeedVideoFpsRangesFor.getUiEffect();
            final androidx.view.compose.ManagedActivityResultLauncher<com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowInput, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult> managedActivityResultLauncher = this.Camera2StreamConfigurationMap;
            final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.State<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState> state = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsScreen$5$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect packageSettingsUiEffect = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect) obj2;
                    if (packageSettingsUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow) {
                        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow launchOAuthFlow = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow) packageSettingsUiEffect;
                        managedActivityResultLauncher.launch(new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowInput(launchOAuthFlow.getProvider(), launchOAuthFlow.getAuthUrl()));
                    } else if (packageSettingsUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink) {
                        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState access$PackageSettingsScreen$lambda$1 = com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt.access$PackageSettingsScreen$lambda$1(state);
                        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success success = access$PackageSettingsScreen$lambda$1 instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success ? (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success) access$PackageSettingsScreen$lambda$1 : null;
                        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink relinkDeepLink = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink) packageSettingsUiEffect;
                        packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck(relinkDeepLink.getLinkedAccounts(), relinkDeepLink.getEmailProvider(), relinkDeepLink.getShowErrorBanner(), (success != null ? success.getDeeplinkState() : null) instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.RelinkReminderPush));
                    } else if (packageSettingsUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.ShowToast) {
                        java.lang.Object showToast = toastHostState.showToast(((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.ShowToast) packageSettingsUiEffect).getMessage(), continuation);
                        return showToast == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? showToast : kotlin.Unit.INSTANCE;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsScreen$5$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PackageSettingsScreenKt$PackageSettingsScreen$5$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, androidx.view.compose.ManagedActivityResultLauncher<com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowInput, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult> managedActivityResultLauncher, com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = packageSettingsViewModel;
        this.Camera2StreamConfigurationMap = managedActivityResultLauncher;
        this.getHighSpeedVideoSizes = toastHostState;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
