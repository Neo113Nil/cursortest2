package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1", f = "RewardsSummaryScreen.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RewardsSummaryScreenKt$RewardsSummaryScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1$1", f = "RewardsSummaryScreen.kt", i = {0}, l = {174}, m = "invokeSuspend", n = {"uiEffect"}, nl = {175}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect rewardsSummaryUiEffect = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (rewardsSummaryUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToScreen) {
                    this.getHighSpeedVideoFpsRangesFor = rewardsSummaryUiEffect;
                    this.getHighSpeedVideoSizesFor = 1;
                    if (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt.access$delayForDeeplinkNavigation(((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToScreen) rewardsSummaryUiEffect).getFromDeeplink(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (rewardsSummaryUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToCategorySelectionFlow) {
                        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.result.CategoryNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    } else if (rewardsSummaryUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToOfferDetails) {
                        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shoppingrewards.api.rewards.offerdetails.navigation.result.OfferDetailsNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1$1$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    } else if (rewardsSummaryUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToCategoryConfirmation) {
                        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1$1$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    } else if (!(rewardsSummaryUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.UpdateTab)) {
                        if (!(rewardsSummaryUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToRedeemFlow)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.result.RedeemNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1$1$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect rewardsSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToCategoryConfirmation navigateToCategoryConfirmation = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToCategoryConfirmation) rewardsSummaryUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.CategoryConfirmationDestination(navigateToCategoryConfirmation.getOfferId(), navigateToCategoryConfirmation.getTouchpointId()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.CategorySelectionDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect rewardsSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToRedeemFlow) rewardsSummaryUiEffect).getDestination());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect rewardsSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToScreen) rewardsSummaryUiEffect).getDestination());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect rewardsSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToOfferDetails navigateToOfferDetails = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToOfferDetails) rewardsSummaryUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.shoppingrewards.api.rewards.offerdetails.navigation.OfferDetailsDestination(navigateToOfferDetails.getOfferId(), navigateToOfferDetails.getTouchpointId(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect rewardsSummaryUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1) create(rewardsSummaryUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighSpeedVideoFpsRanges = str;
            this.Camera2StreamConfigurationMap = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect(), new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsSummaryScreenKt$RewardsSummaryScreen$1$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel rewardsSummaryViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.RewardsSummaryScreenKt$RewardsSummaryScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = rewardsSummaryViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = str3;
    }
}
