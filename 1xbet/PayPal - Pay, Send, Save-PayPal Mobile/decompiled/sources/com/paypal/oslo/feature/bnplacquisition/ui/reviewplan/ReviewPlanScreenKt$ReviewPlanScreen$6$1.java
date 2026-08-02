package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1", f = "ReviewPlanScreen.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ReviewPlanScreenKt$ReviewPlanScreen$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getOutputFormats;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication creditApplication;
            final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect reviewPlanUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect) obj;
            if (reviewPlanUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.ShowExitConfirmationModal) {
                this.getHighResolutionOutputSizeshNQ4ISI.showSheet();
            } else if (reviewPlanUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition) {
                this.getHighSpeedVideoFpsRangesFor.closeAcquisition$bnpl_acquisition_prodRelease();
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (reviewPlanUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (reviewPlanUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData) {
                this.getHighSpeedVideoFpsRangesFor.setSubmitCreditApplicationData(((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData) reviewPlanUiEffect).getSubmitApplicationData());
            } else if (reviewPlanUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToVirtualCardOverview) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitCreditApplicationData = this.getHighSpeedVideoFpsRangesFor.getSubmitCreditApplicationData();
                final java.lang.String creditAccountId = (submitCreditApplicationData == null || (creditApplication = submitCreditApplicationData.getCreditApplication()) == null) ? null : creditApplication.getCreditAccountId();
                if (creditAccountId == null) {
                    creditAccountId = "";
                }
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1.AnonymousClass1.getHighSpeedVideoSizes(creditAccountId, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (reviewPlanUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.HandleTokenizationTapToPayMode) {
                final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard buildPayLaterCard$bnpl_acquisition_prodRelease = this.getHighSpeedVideoSizes.buildPayLaterCard$bnpl_acquisition_prodRelease(this.getHighSpeedVideoFpsRangesFor.getSubmitCreditApplicationData());
                this.getHighSpeedVideoFpsRangesFor.closeAcquisition$bnpl_acquisition_prodRelease();
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(reviewPlanUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToSetupFlow)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo buildSetupCardInfo$bnpl_acquisition_prodRelease = this.getHighSpeedVideoSizes.buildSetupCardInfo$bnpl_acquisition_prodRelease(this.getHighSpeedVideoFpsRangesFor.getSubmitCreditApplicationData());
                this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.BnplAcquisitionFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect reviewPlanUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.navigation.ContentViewerDestination(((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl) reviewPlanUiEffect).getUrl(), "review_plan_legal_link", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard payLaterCard, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.setResult(new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult(new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed(payLaterCard)));
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.BnplAcquisitionFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination(setupCardInfo, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.PL2GO, "bnpl_acquisition", "bnpl_contactless_mobile"));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination(str));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
            this.getHighSpeedVideoFpsRangesFor = bnplAcquisitionSharedViewModel;
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighSpeedVideoSizes = reviewPlanViewModel;
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (this.getHighSpeedVideoFpsRanges.getUiEffect().collect(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPlanScreenKt$ReviewPlanScreen$6$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$6$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = reviewPlanViewModel;
        this.Camera2StreamConfigurationMap = bottomSheetController;
        this.getHighSpeedVideoFpsRangesFor = bnplAcquisitionSharedViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
