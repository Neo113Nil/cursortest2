package com.paypal.oslo.feature.identity.sna.domain.usecase;

/* loaded from: classes13.dex */
public final class ToggleSNAConsentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> getHighSpeedVideoSizes;

    private ToggleSNAConsentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> provider) {
        return new com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase newInstance(com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository sNAConsentRepository) {
        return new com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase(sNAConsentRepository);
    }
}
