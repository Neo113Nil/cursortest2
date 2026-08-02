package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

/* loaded from: classes12.dex */
public final class InboundConnectViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase> getHighSpeedVideoSizes;

    private InboundConnectViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer> provider4) {
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel newInstance(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase inboundConnectUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper.Factory factory, com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectReducer inboundConnectReducer) {
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel(inboundConnectUseCase, featureGate, factory, inboundConnectReducer);
    }
}
