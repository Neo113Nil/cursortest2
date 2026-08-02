package com.paypal.oslo.feature.wallet.amexandp3.domain.usecase;

/* loaded from: classes15.dex */
public final class ProvisionInstrumentsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.ProvisionInstrumentsRepository> getHighSpeedVideoFpsRanges;

    private ProvisionInstrumentsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.ProvisionInstrumentsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.repository.ProvisionInstrumentsRepository> provider) {
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase newInstance(com.paypal.oslo.feature.wallet.amexandp3.domain.repository.ProvisionInstrumentsRepository provisionInstrumentsRepository) {
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase(provisionInstrumentsRepository);
    }
}
