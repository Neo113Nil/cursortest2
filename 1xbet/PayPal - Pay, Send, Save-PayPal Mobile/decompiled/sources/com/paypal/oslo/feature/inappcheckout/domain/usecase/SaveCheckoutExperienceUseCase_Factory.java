package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class SaveCheckoutExperienceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRangesFor;

    private SaveCheckoutExperienceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase newInstance(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository saveCheckoutExperienceRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase(appSwitchSession, saveCheckoutExperienceRepository);
    }
}
