package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1", f = "ReviewPaymentScreen.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, nl = {127}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ReviewPaymentScreenKt$ReviewPaymentScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1$1", f = "ReviewPaymentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel getHighSpeedVideoSizesFor;
        int getInputFormats;
        /* synthetic */ java.lang.Object getOutputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect reviewPaymentUiEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect) this.getOutputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (reviewPaymentUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateBack) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (reviewPaymentUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.ShowAfterDueDateBottomSheet) {
                this.getHighResolutionOutputSizeshNQ4ISI.showSheet();
            } else if (reviewPaymentUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (reviewPaymentUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank) {
                this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (reviewPaymentUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
                java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel reviewPaymentViewModel = this.getHighSpeedVideoSizesFor;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel.this, reviewPaymentUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(reviewPaymentUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs(((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions) reviewPaymentUiEffect).getTermsUrl(), (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, false, (java.lang.String) null, false, false, false, 250, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel reviewPaymentViewModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect reviewPaymentUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination(reviewPaymentViewModel.getArgs().getCreditProductIdentifier(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment) reviewPaymentUiEffect).getFundingInstruments(), 14, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect reviewPaymentUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination(((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank) reviewPaymentUiEffect).getArgs()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect reviewPaymentUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination(((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation) reviewPaymentUiEffect).getArgs()));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect reviewPaymentUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1) create(reviewPaymentUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, continuation);
            anonymousClass1.getOutputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel reviewPaymentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighSpeedVideoSizes = function1;
            this.getHighSpeedVideoSizesFor = reviewPaymentViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getInputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewPaymentScreenKt$ReviewPaymentScreen$1$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel reviewPaymentViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt$ReviewPaymentScreen$1$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = reviewPaymentViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = bottomSheetController;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
