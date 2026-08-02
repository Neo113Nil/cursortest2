package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

/* loaded from: classes11.dex */
public final class AddressAddUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddContentProvider> getHighSpeedVideoFpsRanges;

    private AddressAddUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddContentProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddContentProvider> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddContentProvider addressAddContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper(addressAddContentProvider);
    }
}
