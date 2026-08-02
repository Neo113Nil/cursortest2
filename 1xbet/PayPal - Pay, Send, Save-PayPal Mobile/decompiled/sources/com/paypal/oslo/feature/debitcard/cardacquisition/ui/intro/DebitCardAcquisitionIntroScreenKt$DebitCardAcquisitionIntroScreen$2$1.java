package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1", f = "DebitCardAcquisitionIntroScreen.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, nl = {112}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect debitCardAcquisitionIntroEffect = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect) obj;
            if (debitCardAcquisitionIntroEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.ShowTermsBottomSheet) {
                this.getHighSpeedVideoSizes.showSheet();
            } else if (debitCardAcquisitionIntroEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.NavigateToAcquisitionWebView) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
                final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel = this.getHighSpeedVideoFpsRanges;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (debitCardAcquisitionIntroEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.NavigateToCardManagement) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.Camera2StreamConfigurationMap;
                appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(debitCardAcquisitionIntroEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.NavigateBack)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.replaceTopIfNotCurrent(new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination(debitCardProductName, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) null, (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction) null, (com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.debitcard.shared.di.DebitCardWebViewDestination(debitCardAcquisitionIntroViewModel.getWebViewUrlBuilder().getBDMCAcquisitionUrl(), false, (java.lang.String) null, debitCardAcquisitionIntroViewModel.getProductName(), 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            this.getHighSpeedVideoSizes = bottomSheetController;
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = debitCardAcquisitionIntroViewModel;
            this.Camera2StreamConfigurationMap = debitCardProductName;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            if (this.Camera2StreamConfigurationMap.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = debitCardAcquisitionIntroViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = debitCardProductName;
    }
}
