package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1", f = "RepaymentsScreen.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class RepaymentsScreenKt$RepaymentsScreen$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoSizes;
    int getInputFormats;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect repaymentsUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(repaymentsUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.ShowExitConfirmationModal.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.showSheet();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(repaymentsUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.CloseAcquisition.INSTANCE)) {
                this.Camera2StreamConfigurationMap.closeAcquisition$bnpl_acquisition_prodRelease();
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (repaymentsUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen) {
                com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen navigateToVirtualCardOverviewScreen = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen) repaymentsUiEffect;
                this.Camera2StreamConfigurationMap.setSubmitCreditApplicationData(navigateToVirtualCardOverviewScreen.getData());
                this.getHighResolutionOutputSizeshNQ4ISI.setFlowSpecifier(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.STANDALONE_APPLICATION);
                final java.lang.String creditAccountId = navigateToVirtualCardOverviewScreen.getData().getCreditApplication().getCreditAccountId();
                if (creditAccountId == null) {
                    creditAccountId = "";
                }
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(creditAccountId, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(repaymentsUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToLinkCard.INSTANCE)) {
                com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.m12283navigateToAddCardhN0UB1M(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
            } else {
                if (!(repaymentsUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination(str));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect repaymentsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl openUrl = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl) repaymentsUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination(openUrl.getUrl(), "bnpl-acquisition-repayments", openUrl.getHtml(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.BnplAcquisitionFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel, java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = bottomSheetController;
            this.Camera2StreamConfigurationMap = bnplAcquisitionSharedViewModel;
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = repaymentsViewModel;
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (this.getHighSpeedVideoFpsRanges.getUiEffect().collect(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepaymentsScreenKt$RepaymentsScreen$7$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsScreenKt$RepaymentsScreen$7$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = repaymentsViewModel;
        this.Camera2StreamConfigurationMap = bottomSheetController;
        this.getHighSpeedVideoSizes = bnplAcquisitionSharedViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
