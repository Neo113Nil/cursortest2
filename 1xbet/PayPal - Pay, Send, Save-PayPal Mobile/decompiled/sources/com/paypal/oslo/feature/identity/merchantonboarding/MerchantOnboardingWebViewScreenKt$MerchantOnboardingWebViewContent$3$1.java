package com.paypal.oslo.feature.identity.merchantonboarding;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1", f = "MerchantOnboardingWebViewScreen.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.home.api.navigation.HomeDestination homeDestination;
            com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent navigationEvent = (com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent) obj;
            if (navigationEvent instanceof com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.GoBack) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(navigationEvent instanceof com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.NavigateToHome)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (((com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.NavigateToHome) navigationEvent).isBusinessProfile()) {
                    homeDestination = com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination.INSTANCE;
                } else {
                    homeDestination = com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE;
                }
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1.AnonymousClass1.getHighSpeedVideoSizes(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.replaceStack(navKey);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoSizes.getNavigationEvent().collect(new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = merchantOnboardingViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
