package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

/* renamed from: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0378PostOnboardingViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> getHighSpeedVideoFpsRangesFor;

    private C0378PostOnboardingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel get(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams postOnboardingDeepLinkParams) {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), postOnboardingDeepLinkParams);
    }

    public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.C0378PostOnboardingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager> provider3) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.C0378PostOnboardingViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel newInstance(com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService, com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher imagePrefetcher, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager postOnboardingFlowContextManager, com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams postOnboardingDeepLinkParams) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel(backstackFlowStepService, imagePrefetcher, postOnboardingFlowContextManager, postOnboardingDeepLinkParams);
    }
}
