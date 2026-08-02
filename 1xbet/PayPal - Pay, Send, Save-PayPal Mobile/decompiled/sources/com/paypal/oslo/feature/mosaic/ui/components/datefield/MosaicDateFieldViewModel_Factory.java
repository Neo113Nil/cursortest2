package com.paypal.oslo.feature.mosaic.ui.components.datefield;

/* loaded from: classes13.dex */
public final class MosaicDateFieldViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldReducer> getHighSpeedVideoFpsRanges;

    private MosaicDateFieldViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldReducer> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldReducer> provider) {
        return new com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel newInstance(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldReducer mosaicDateFieldReducer) {
        return new com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel(mosaicDateFieldReducer);
    }
}
