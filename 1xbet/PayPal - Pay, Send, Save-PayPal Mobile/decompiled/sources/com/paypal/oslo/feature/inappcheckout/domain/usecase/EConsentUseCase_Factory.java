package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class EConsentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository> getHighSpeedVideoSizes;

    private EConsentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository eConsentRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase(eConsentRepository);
    }
}
