package com.paypal.oslo.feature.p2p.ui.viewmodel;

/* loaded from: classes13.dex */
public final class SendTabViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> Camera2StreamConfigurationMap;

    private SendTabViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider) {
        return new com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel newInstance(com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager) {
        return new com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel(p2pFeatureGateManager);
    }
}
