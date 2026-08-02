package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

/* loaded from: classes13.dex */
public final class AddressSelectionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private AddressSelectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel(formatAddressUseCase, coroutineDispatcher);
    }
}
