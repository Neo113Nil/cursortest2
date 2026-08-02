package com.paypal.oslo.feature.identity.sna.domain.usecase;

/* loaded from: classes13.dex */
public final class GetMobileNumbersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetMobileNumbersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> provider) {
        return new com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase newInstance(com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository sNAConsentRepository) {
        return new com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase(sNAConsentRepository);
    }
}
