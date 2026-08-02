package com.paypal.oslo.feature.mosaic.ui.legacy;

/* loaded from: classes13.dex */
public final class MosaicLegacyFlowViewModel_Factory_Impl implements com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.Factory {
    private final com.paypal.oslo.feature.mosaic.ui.legacy.C0376MosaicLegacyFlowViewModel_Factory getHighSpeedVideoSizes;

    private MosaicLegacyFlowViewModel_Factory_Impl(com.paypal.oslo.feature.mosaic.ui.legacy.C0376MosaicLegacyFlowViewModel_Factory c0376MosaicLegacyFlowViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0376MosaicLegacyFlowViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.Factory
    public final com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel create(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination) {
        return this.getHighSpeedVideoSizes.get(mosaicLegacyDestination);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.Factory> create(com.paypal.oslo.feature.mosaic.ui.legacy.C0376MosaicLegacyFlowViewModel_Factory c0376MosaicLegacyFlowViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel_Factory_Impl(c0376MosaicLegacyFlowViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.mosaic.ui.legacy.C0376MosaicLegacyFlowViewModel_Factory c0376MosaicLegacyFlowViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel_Factory_Impl(c0376MosaicLegacyFlowViewModel_Factory));
    }
}
