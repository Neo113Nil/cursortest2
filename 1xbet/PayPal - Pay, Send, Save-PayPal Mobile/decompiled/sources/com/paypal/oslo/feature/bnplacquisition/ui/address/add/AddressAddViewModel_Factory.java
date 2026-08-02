package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

/* loaded from: classes11.dex */
public final class AddressAddViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddReducer> getHighSpeedVideoSizes;

    private AddressAddViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper> provider4) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddReducer addressAddReducer, com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper addressAddUiMapper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel(addressAddReducer, getAddressLayoutUseCase, formFieldValidators, addressAddUiMapper);
    }
}
