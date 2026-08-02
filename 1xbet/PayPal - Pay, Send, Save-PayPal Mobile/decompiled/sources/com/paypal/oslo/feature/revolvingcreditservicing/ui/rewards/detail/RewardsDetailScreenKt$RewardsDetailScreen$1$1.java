package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1", f = "RewardsDetailScreen.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, nl = {138}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class RewardsDetailScreenKt$RewardsDetailScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1$1", f = "RewardsDetailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState> getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect rewardsDetailUiEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (rewardsDetailUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (rewardsDetailUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (rewardsDetailUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore) {
                com.paypal.oslo.feature.revolvingcreditservicing.utils.WebViewUtilsKt.navigateToWebView(((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore) rewardsDetailUiEffect).getUrl(), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getNavArgs().getCpi());
            } else if (rewardsDetailUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms) {
                com.paypal.oslo.feature.revolvingcreditservicing.utils.WebViewUtilsKt.navigateToWebView(((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms) rewardsDetailUiEffect).getUrl(), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getNavArgs().getCpi());
            } else {
                if (!(rewardsDetailUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState access$RewardsDetailScreen$lambda$0 = com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.access$RewardsDetailScreen$lambda$0(this.getHighSpeedVideoFpsRangesFor);
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError paymentPastDueError = access$RewardsDetailScreen$lambda$0 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError ? (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError) access$RewardsDetailScreen$lambda$0 : null;
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel = this.Camera2StreamConfigurationMap;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError.this, rewardsDetailUiEffect, rewardsDetailViewModel, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect rewardsDetailUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards navigateToRedeemRewards = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards) rewardsDetailUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RedeemRewardsArgs(navigateToRedeemRewards.getCreditProductIdentifier(), navigateToRedeemRewards.getAvailableRewards(), navigateToRedeemRewards.getCreditAccountId(), navigateToRedeemRewards.isPayPalPlusEligible(), navigateToRedeemRewards.isPayPalPlusEnrolled(), navigateToRedeemRewards.isPayPalPlusCbmcEnabled(), navigateToRedeemRewards.getPayPalPlusConversionRate(), navigateToRedeemRewards.getRewardsProgramTermsUrl(), navigateToRedeemRewards.getLoyaltyProgramLearnMoreUrl(), navigateToRedeemRewards.getLoyaltyProgramTermsUrl(), navigateToRedeemRewards.getRewardsCalculation())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError paymentPastDueError, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect rewardsDetailUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            if (paymentPastDueError != null && paymentPastDueError.getEntryWasFromAccountSummary()) {
                navigationScope.replaceTop(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs(rewardsDetailViewModel.getNavArgs().getCpi(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError) rewardsDetailUiEffect).getCreditAccountId(), (java.lang.String) null, false, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            } else {
                navigationScope.goBack();
                navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs(rewardsDetailViewModel.getNavArgs().getCpi(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError) rewardsDetailUiEffect).getCreditAccountId(), (java.lang.String) null, false, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect rewardsDetailUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1.AnonymousClass1) create(rewardsDetailUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.Camera2StreamConfigurationMap = rewardsDetailViewModel;
            this.getHighSpeedVideoFpsRangesFor = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RewardsDetailScreenKt$RewardsDetailScreen$1$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt$RewardsDetailScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = rewardsDetailViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
