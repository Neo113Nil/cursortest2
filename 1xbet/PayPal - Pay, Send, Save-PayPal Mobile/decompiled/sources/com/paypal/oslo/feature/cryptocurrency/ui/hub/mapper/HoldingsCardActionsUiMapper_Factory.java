package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

/* loaded from: classes12.dex */
public final class HoldingsCardActionsUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoFpsRanges;

    private HoldingsCardActionsUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper newInstance(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper(featureGateManager);
    }
}
