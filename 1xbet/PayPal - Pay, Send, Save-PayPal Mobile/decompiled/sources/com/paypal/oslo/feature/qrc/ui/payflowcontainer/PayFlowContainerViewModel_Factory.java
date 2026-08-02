package com.paypal.oslo.feature.qrc.ui.payflowcontainer;

/* loaded from: classes14.dex */
public final class PayFlowContainerViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer> getHighSpeedVideoFpsRangesFor;

    private PayFlowContainerViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig> provider2) {
        return new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel newInstance(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerReducer payFlowContainerReducer, com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig qrcFeatureGateConfig) {
        return new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel(payFlowContainerReducer, qrcFeatureGateConfig);
    }
}
