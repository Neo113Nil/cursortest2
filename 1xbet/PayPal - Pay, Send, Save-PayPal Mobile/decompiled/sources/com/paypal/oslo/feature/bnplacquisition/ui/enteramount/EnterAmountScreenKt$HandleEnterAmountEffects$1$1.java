package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1", f = "EnterAmountScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class EnterAmountScreenKt$HandleEnterAmountEffects$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect enterAmountUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect) obj;
            if (enterAmountUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToRequireScreenLock) {
                this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (enterAmountUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo) {
                this.getHighSpeedVideoSizes.setCreateCreditApplicationData(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo) enterAmountUiEffect).getData());
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (enterAmountUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers) {
                this.getHighSpeedVideoSizes.setAvailableOffersCreditApplication(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers) enterAmountUiEffect).getAvailableOffersCreditApplication());
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
                final com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel = this.getHighSpeedVideoSizes;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel.this, enterAmountUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (enterAmountUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowHowItWorks) {
                this.getHighSpeedVideoFpsRanges.showSheet();
            } else if (enterAmountUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly) {
                final java.lang.String url = ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly) enterAmountUiEffect).getUrl();
                if (url != null) {
                    this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(url, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            } else if (enterAmountUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayIn4) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (enterAmountUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToSpendingPowerFaq) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (enterAmountUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.CloseAcquisition) {
                this.getHighSpeedVideoSizes.closeAcquisition$bnpl_acquisition_prodRelease();
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.BnplAcquisitionFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect enterAmountUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination(bnplAcquisitionSharedViewModel.getExperienceSessionId$bnpl_acquisition_prodRelease(), ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers) enterAmountUiEffect).getAvailableOffersCreditApplication().getLoanAmount().getValue(), bnplAcquisitionSharedViewModel.getAnalyticsFlowName$bnpl_acquisition_prodRelease()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.navigation.PersonalInfoDestination((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination(com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint.PL2GO, (com.paypal.oslo.feature.taptopay.api.domain.model.topbar.TopBarConfig) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination(str, "bnpl-acquisition-pay-monthly", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController) {
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = bnplAcquisitionSharedViewModel;
            this.getHighSpeedVideoFpsRanges = bottomSheetController;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect().collect(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAmountScreenKt$HandleEnterAmountEffects$1$1(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$HandleEnterAmountEffects$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = enterAmountViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = bnplAcquisitionSharedViewModel;
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
    }
}
