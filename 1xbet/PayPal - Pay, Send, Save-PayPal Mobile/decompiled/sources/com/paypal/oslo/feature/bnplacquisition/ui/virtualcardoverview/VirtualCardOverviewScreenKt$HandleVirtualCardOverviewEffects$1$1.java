package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1", f = "VirtualCardOverviewScreen.kt", i = {}, l = {672}, m = "invokeSuspend", n = {}, nl = {com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameStart}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.starpay.api.StarPayClient getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
        final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.feature.starpay.api.StarPayClient getHighSpeedVideoSizesFor;
        final /* synthetic */ java.lang.String getInputFormats;
        final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getInputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState getOutputFormats;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getOutputMinFrameDuration;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel getOutputStallDuration;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardToastsContent toasts;
            com.paypal.oslo.core.commonui.utils.RefText relinkingSuccess;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardToastsContent toasts2;
            com.paypal.oslo.core.commonui.utils.RefText provisionedSuccess;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect virtualCardOverviewUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect) obj;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState value = this.getOutputStallDuration.getUiState().getValue();
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success success = value instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success ? (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success) value : null;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel uiModel = success != null ? success.getUiModel() : null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.NavigateToRequireScreenLock.INSTANCE)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowExitConfirmationModal.INSTANCE)) {
                    this.getHighSpeedVideoSizes.showSheet();
                } else if (virtualCardOverviewUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition) {
                    this.getOutputMinFrameDuration.closeAcquisition$bnpl_acquisition_prodRelease();
                    this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (virtualCardOverviewUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.FetchProvisionedTokens) {
                    com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.PushProvisioningHelperKt.initializeInStoreVCCWithExternalWalletTokens(this.getHighSpeedVideoSizesFor, this.getOutputStallDuration, ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.FetchProvisionedTokens) virtualCardOverviewUiEffect).getMxlType());
                } else if (virtualCardOverviewUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.AddToWallet) {
                    com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.PushProvisioningHelperKt.addCardToWallet(this.getHighSpeedVideoSizesFor, this.getOutputStallDuration, this.getInputSizeshNQ4ISI);
                } else if (virtualCardOverviewUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.LaunchWalletSetup) {
                    com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.PushProvisioningHelperKt.setupWallet(this.getHighSpeedVideoSizesFor, this.getOutputStallDuration);
                } else if (virtualCardOverviewUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.SendProvisioningMetaData) {
                    com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.SendProvisioningMetaData sendProvisioningMetaData = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.SendProvisioningMetaData) virtualCardOverviewUiEffect;
                    com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.PushProvisioningHelperKt.sendProvisioningMetaData(this.getOutputStallDuration.getProvisioningMetadata$bnpl_acquisition_prodRelease(sendProvisioningMetaData.getMetadata(), sendProvisioningMetaData.getUiModel()));
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowProvisionedSuccessToast.INSTANCE)) {
                    if (uiModel != null && (toasts2 = uiModel.getToasts()) != null && (provisionedSuccess = toasts2.getProvisionedSuccess()) != null) {
                        this.getOutputFormats.display(provisionedSuccess);
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowRelinkingSuccessToast.INSTANCE)) {
                    if (uiModel != null && (toasts = uiModel.getToasts()) != null && (relinkingSuccess = toasts.getRelinkingSuccess()) != null) {
                        this.getOutputFormats.display(relinkingSuccess);
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.OpenWalletSettings.INSTANCE)) {
                    com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.PushProvisioningHelperKt.openGoogleWalletApp(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputStallDuration);
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowChangeAmountModal.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.DismissChangeAmountModal.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowCancelModal.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(virtualCardOverviewUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.DismissCancelModal.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt.access$handleModalEffects(virtualCardOverviewUiEffect, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
                }
            } else {
                this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.getInputFormats, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination(com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint.PL2GO, (com.paypal.oslo.feature.taptopay.api.domain.model.topbar.TopBarConfig) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.BnplAcquisitionFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher, android.content.Context context, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.pds.components.BottomSheetController bottomSheetController3, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState) {
            this.getOutputStallDuration = virtualCardOverviewViewModel;
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getInputFormats = str;
            this.getHighSpeedVideoSizes = bottomSheetController;
            this.getOutputMinFrameDuration = bnplAcquisitionSharedViewModel;
            this.getHighSpeedVideoSizesFor = starPayClient;
            this.getInputSizeshNQ4ISI = managedActivityResultLauncher;
            this.getHighResolutionOutputSizeshNQ4ISI = context;
            this.Camera2StreamConfigurationMap = bottomSheetController2;
            this.getHighSpeedVideoFpsRangesFor = bottomSheetController3;
            this.getOutputFormats = toastState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputSizes = 1;
            if (this.getOutputMinFrameDurationlomOqCM.getUiEffect().collect(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1.AnonymousClass1(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputFormats), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher, android.content.Context context, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.pds.components.BottomSheetController bottomSheetController3, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewScreenKt$HandleVirtualCardOverviewEffects$1$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = virtualCardOverviewViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getOutputFormats = str;
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.getHighSpeedVideoSizesFor = bnplAcquisitionSharedViewModel;
        this.getInputSizeshNQ4ISI = starPayClient;
        this.getOutputMinFrameDuration = managedActivityResultLauncher;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.Camera2StreamConfigurationMap = bottomSheetController2;
        this.getHighSpeedVideoFpsRanges = bottomSheetController3;
        this.getInputFormats = toastState;
    }
}
