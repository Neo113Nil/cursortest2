package com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel;

/* loaded from: classes13.dex */
public final class CurrencyPickerViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetCurrenciesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.P2PCurrencyItemToCurrencyItemMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.CryptoToItemStateMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getOutputMinFrameDuration;

    private CurrencyPickerViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetCurrenciesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.P2PCurrencyItemToCurrencyItemMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.CryptoToItemStateMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider7) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getInputSizeshNQ4ISI = provider6;
        this.getOutputMinFrameDuration = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetCurrenciesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.P2PCurrencyItemToCurrencyItemMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.CryptoToItemStateMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider7) {
        return new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.GetCurrenciesUseCase getCurrenciesUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase getCryptosUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase getCurrencyDetailsUseCase, com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.P2PCurrencyItemToCurrencyItemMapper p2PCurrencyItemToCurrencyItemMapper, com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.CryptoToItemStateMapper cryptoToItemStateMapper, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel(getCurrenciesUseCase, getCryptosUseCase, getCurrencyDetailsUseCase, p2PCurrencyItemToCurrencyItemMapper, cryptoToItemStateMapper, p2pFeatureGateManager, coroutineDispatcher);
    }
}
