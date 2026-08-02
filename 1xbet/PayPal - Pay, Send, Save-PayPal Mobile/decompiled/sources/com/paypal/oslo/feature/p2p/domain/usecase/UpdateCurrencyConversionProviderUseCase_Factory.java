package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class UpdateCurrencyConversionProviderUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> getHighSpeedVideoFpsRanges;

    private UpdateCurrencyConversionProviderUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase(transferFlowRepository);
    }
}
