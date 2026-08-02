package com.paypal.oslo.feature.identity.sna.domain.usecase;

/* loaded from: classes13.dex */
public final class GetSNAConsentStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> getHighSpeedVideoFpsRangesFor;

    private GetSNAConsentStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository> provider) {
        return new com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase newInstance(com.paypal.oslo.feature.identity.sna.domain.repository.SNAConsentRepository sNAConsentRepository) {
        return new com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase(sNAConsentRepository);
    }
}
