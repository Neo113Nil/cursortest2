package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1", f = "SavingsTermsScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel getOutputFormats;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult getHighSpeedVideoSizesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect savingsTermsEffect = (com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect) obj;
            if (savingsTermsEffect instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else if (savingsTermsEffect instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (savingsTermsEffect instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToFdicInsuranceSheet) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (savingsTermsEffect instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToApyInfoSheet) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult = this.getHighSpeedVideoSizesFor;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (savingsTermsEffect instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToOnboardingFlow) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(savingsTermsEffect, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToAddMoneyGeneralSavingsFlow.INSTANCE)) {
                this.getOutputMinFrameDuration.invoke();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(savingsTermsEffect, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingFailed.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.invoke();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(savingsTermsEffect, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingCancelled.INSTANCE)) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(savingsTermsEffect, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingInReview.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.ApyInfoSheetDestination(savingsLandingPageResult.getAnnualPercentageYield(), savingsLandingPageResult.getMarketingRateEffectiveDate()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination(new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings(null, 1, null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.savings.di.navigation.FdicInsuranceSheetDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect savingsTermsEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView navigateToWebView = (com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView) savingsTermsEffect;
            navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.SavingsWebViewDestination(navigateToWebView.getUrl(), navigateToWebView.getTitle(), false, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult) {
            this.getHighResolutionOutputSizeshNQ4ISI = function0;
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getOutputMinFrameDuration = function02;
            this.getHighSpeedVideoFpsRanges = function03;
            this.Camera2StreamConfigurationMap = function04;
            this.getHighSpeedVideoSizesFor = savingsLandingPageResult;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (this.getOutputFormats.getEffects().collect(new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = savingsTermsViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoSizesFor = function02;
        this.getHighSpeedVideoFpsRangesFor = function03;
        this.getHighSpeedVideoFpsRanges = function04;
        this.getInputSizeshNQ4ISI = savingsLandingPageResult;
    }
}
