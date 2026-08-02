package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

/* loaded from: classes13.dex */
public final class PostOnboardingViewModel_Factory_Impl implements com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.Factory {
    private final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.C0378PostOnboardingViewModel_Factory getHighSpeedVideoSizes;

    private PostOnboardingViewModel_Factory_Impl(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.C0378PostOnboardingViewModel_Factory c0378PostOnboardingViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0378PostOnboardingViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.Factory
    public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel create(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams postOnboardingDeepLinkParams) {
        return this.getHighSpeedVideoSizes.get(postOnboardingDeepLinkParams);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.Factory> create(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.C0378PostOnboardingViewModel_Factory c0378PostOnboardingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel_Factory_Impl(c0378PostOnboardingViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.C0378PostOnboardingViewModel_Factory c0378PostOnboardingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel_Factory_Impl(c0378PostOnboardingViewModel_Factory));
    }
}
