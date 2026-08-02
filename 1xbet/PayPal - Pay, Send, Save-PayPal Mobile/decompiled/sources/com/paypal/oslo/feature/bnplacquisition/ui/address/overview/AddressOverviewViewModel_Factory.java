package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

/* loaded from: classes11.dex */
public final class AddressOverviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper> getHighResolutionOutputSizeshNQ4ISI;

    private AddressOverviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewReducer addressOverviewReducer, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper addressOverviewUiMapper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel(addressOverviewReducer, addressOverviewUiMapper);
    }
}
