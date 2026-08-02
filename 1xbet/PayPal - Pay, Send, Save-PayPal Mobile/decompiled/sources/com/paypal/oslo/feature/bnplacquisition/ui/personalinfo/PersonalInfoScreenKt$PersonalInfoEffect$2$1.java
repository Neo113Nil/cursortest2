package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1", f = "PersonalInfoScreen.kt", i = {}, l = {360}, m = "invokeSuspend", n = {}, nl = {446}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoScreenKt$PersonalInfoEffect$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getInputFormats;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getInputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect> getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getOutputStallDurationlomOqCM;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizesFor;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getInputFormats;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getInputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> getOutputFormats;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState getOutputMinFrameDuration;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect personalInfoUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(personalInfoUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateBack.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(personalInfoUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.CloseAcquisition.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers) {
                this.getInputFormats.setAvailableOffersCreditApplication(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers) personalInfoUiEffect).getAvailableOffersCreditApplication());
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                final com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel = this.getInputFormats;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel.this, personalInfoUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan) {
                this.getInputFormats.setReviewPlanDetailsData(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan) personalInfoUiEffect).getReviewDetails());
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressBottomSheet) {
                this.getHighSpeedVideoFpsRangesFor.showSheet();
            } else if (personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissAddressBottomSheet) {
                this.getHighSpeedVideoFpsRangesFor.hideSheet();
            } else if (personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal) {
                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal showAddressValidationModal = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal) personalInfoUiEffect;
                this.getOutputFormats.invoke(showAddressValidationModal.getFailedAddressText(), showAddressValidationModal.getFailedAddress());
                this.getInputSizeshNQ4ISI.showSheet();
            } else if (personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast) {
                this.getOutputMinFrameDuration.display(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast) personalInfoUiEffect).getText());
            } else if (personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError) {
                this.Camera2StreamConfigurationMap.invoke(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError) personalInfoUiEffect).getScrollKey());
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(personalInfoUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowRepaymentBottomSheet.INSTANCE)) {
                this.getHighSpeedVideoSizesFor.showSheet();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(personalInfoUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissRepaymentBottomSheet.INSTANCE)) {
                this.getHighSpeedVideoSizesFor.hideSheet();
            } else {
                if (!(personalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizesFor.showSheet();
                int i = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding) personalInfoUiEffect).getType().ordinal()];
                if (i == 1) {
                    com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.m12283navigateToAddCardhN0UB1M(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    if (i != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.m12282navigateToAddBankhN0UB1M(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.BnplAcquisitionFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect personalInfoUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.navigation.OffersDestination(bnplAcquisitionSharedViewModel.getExperienceSessionId$bnpl_acquisition_prodRelease(), ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers) personalInfoUiEffect).getAvailableOffersCreditApplication().getLoanAmount().getValue(), bnplAcquisitionSharedViewModel.getAnalyticsFlowName$bnpl_acquisition_prodRelease()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect personalInfoUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination(((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl) personalInfoUiEffect).getUrl(), "bnpl-acquisition-personal-info", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.bnplacquisition.navigation.ReviewPlanDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType.CARD.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType.BANK.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function2, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, com.paypal.pds.components.BottomSheetController bottomSheetController3, java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoSizes = appNavigator;
            this.getInputFormats = bnplAcquisitionSharedViewModel;
            this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
            this.getOutputFormats = function2;
            this.getInputSizeshNQ4ISI = bottomSheetController2;
            this.getOutputMinFrameDuration = toastState;
            this.Camera2StreamConfigurationMap = function1;
            this.getHighSpeedVideoSizesFor = bottomSheetController3;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRanges = str2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDurationlomOqCM = 1;
            if (this.getOutputFormats.collect(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PersonalInfoScreenKt$PersonalInfoEffect$2$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect> flow, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function2, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, com.paypal.pds.components.BottomSheetController bottomSheetController3, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoEffect$2$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = flow;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getInputFormats = bnplAcquisitionSharedViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.getOutputMinFrameDuration = function2;
        this.getOutputStallDurationlomOqCM = bottomSheetController2;
        this.getHighSpeedVideoSizesFor = toastState;
        this.Camera2StreamConfigurationMap = function1;
        this.getInputSizeshNQ4ISI = bottomSheetController3;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }
}
