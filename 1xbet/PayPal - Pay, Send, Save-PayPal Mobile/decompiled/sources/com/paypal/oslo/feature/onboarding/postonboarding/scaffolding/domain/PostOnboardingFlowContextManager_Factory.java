package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain;

/* loaded from: classes13.dex */
public final class PostOnboardingFlowContextManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager> {
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> Camera2StreamConfigurationMap;

    private PostOnboardingFlowContextManager_Factory(dagger.internal.Provider<androidx.view.SavedStateHandle> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager_Factory create(dagger.internal.Provider<androidx.view.SavedStateHandle> provider) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager newInstance(androidx.view.SavedStateHandle savedStateHandle) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.PostOnboardingFlowContextManager(savedStateHandle);
    }
}
