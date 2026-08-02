package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1", f = "DonationSummaryScreen.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, nl = {171}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DonationSummaryScreenKt$DonationSummaryScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1$1", f = "DonationSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect redeemUiEffect = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(redeemUiEffect, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(redeemUiEffect, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreenAfterRedemption.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(redeemUiEffect, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.NavigateToActivity.INSTANCE)) {
                if (redeemUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl) {
                    this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (!(redeemUiEffect instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.setResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.result.RedeemNavResult(false, false, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect redeemUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.core.webview.navigation.SecureWebViewDestination(new com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData(((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl) redeemUiEffect).getUrl(), com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsAnalyticsSources.REDEEM_FLOW, null, false, false, false, 52, null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.setResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.result.RedeemNavResult(true, false, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect redeemUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1.AnonymousClass1) create(redeemUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getUiEffect(), new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DonationSummaryScreenKt$DonationSummaryScreen$1$1(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.DonationSummaryScreenKt$DonationSummaryScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = redeemViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }
}
