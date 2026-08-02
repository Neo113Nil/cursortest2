package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

/* loaded from: classes11.dex */
public final class AddressOverviewUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContentProvider> getHighSpeedVideoFpsRanges;

    private AddressOverviewUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContentProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContentProvider> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContentProvider addressOverviewContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper(addressOverviewContentProvider);
    }
}
