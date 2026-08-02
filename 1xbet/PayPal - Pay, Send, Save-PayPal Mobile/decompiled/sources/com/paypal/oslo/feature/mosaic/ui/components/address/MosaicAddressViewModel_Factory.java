package com.paypal.oslo.feature.mosaic.ui.components.address;

/* loaded from: classes13.dex */
public final class MosaicAddressViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> getHighSpeedVideoFpsRangesFor;

    private MosaicAddressViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer> provider2) {
        return new com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer mosaicAddressReducer) {
        return new com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel(getAddressLayoutUseCase, mosaicAddressReducer);
    }
}
