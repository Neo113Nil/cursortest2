package com.paypal.oslo.feature.mosaic.ui.legacy;

/* renamed from: com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0376MosaicLegacyFlowViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase> getHighSpeedVideoFpsRangesFor;

    private C0376MosaicLegacyFlowViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel get(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination) {
        return newInstance(mosaicLegacyDestination, this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.mosaic.ui.legacy.C0376MosaicLegacyFlowViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer> provider2) {
        return new com.paypal.oslo.feature.mosaic.ui.legacy.C0376MosaicLegacyFlowViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel newInstance(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase getMosaicEligibilityUseCase, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer mosaicLegacyFlowReducer) {
        return new com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel(mosaicLegacyDestination, getMosaicEligibilityUseCase, mosaicLegacyFlowReducer);
    }
}
