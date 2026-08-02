package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

/* loaded from: classes13.dex */
public final class PostOnboardingNavigator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private PostOnboardingNavigator_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator(appNavigator);
    }
}
