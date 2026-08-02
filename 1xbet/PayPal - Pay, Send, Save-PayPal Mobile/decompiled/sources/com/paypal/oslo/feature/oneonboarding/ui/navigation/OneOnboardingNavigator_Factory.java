package com.paypal.oslo.feature.oneonboarding.ui.navigation;

/* loaded from: classes13.dex */
public final class OneOnboardingNavigator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator> {
    private final dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator<?>>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private OneOnboardingNavigator_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator<?>>> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator<?>>> provider2) {
        return new com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator<?>> map) {
        return new com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator(appNavigator, map);
    }
}
