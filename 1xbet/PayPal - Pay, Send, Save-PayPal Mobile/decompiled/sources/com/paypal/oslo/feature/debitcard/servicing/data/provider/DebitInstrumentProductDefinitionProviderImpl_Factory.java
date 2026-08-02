package com.paypal.oslo.feature.debitcard.servicing.data.provider;

/* loaded from: classes12.dex */
public final class DebitInstrumentProductDefinitionProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentProductDefinitionUseCase> getHighSpeedVideoFpsRanges;

    private DebitInstrumentProductDefinitionProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentProductDefinitionUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentProductDefinitionUseCase> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentProductDefinitionUseCase getDebitInstrumentProductDefinitionUseCase) {
        return new com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl(getDebitInstrumentProductDefinitionUseCase);
    }
}
