package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideGetAutoReloadFundingInstrumentOptionsUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> getHighSpeedVideoFpsRangesFor;

    private UseCaseModule_ProvideGetAutoReloadFundingInstrumentOptionsUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase get() {
        return provideGetAutoReloadFundingInstrumentOptionsUseCase(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideGetAutoReloadFundingInstrumentOptionsUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideGetAutoReloadFundingInstrumentOptionsUseCaseFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase provideGetAutoReloadFundingInstrumentOptionsUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideGetAutoReloadFundingInstrumentOptionsUseCase(autoReloadRepository, formatCurrencyUseCase));
    }
}
