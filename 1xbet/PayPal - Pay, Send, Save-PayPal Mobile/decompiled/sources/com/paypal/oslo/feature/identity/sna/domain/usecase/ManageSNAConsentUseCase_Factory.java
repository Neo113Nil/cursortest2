package com.paypal.oslo.feature.identity.sna.domain.usecase;

/* loaded from: classes13.dex */
public final class ManageSNAConsentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sna.domain.usecase.ManageSNAConsentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ManageSNAConsentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sna.domain.usecase.ManageSNAConsentUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.sna.domain.usecase.ManageSNAConsentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> provider) {
        return new com.paypal.oslo.feature.identity.sna.domain.usecase.ManageSNAConsentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.sna.domain.usecase.ManageSNAConsentUseCase newInstance(com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository sNAConsentRepository) {
        return new com.paypal.oslo.feature.identity.sna.domain.usecase.ManageSNAConsentUseCase(sNAConsentRepository);
    }
}
