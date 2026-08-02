package com.paypal.oslo.feature.settings.featureflags.featuregate;

/* loaded from: classes14.dex */
public final class SettingsFeatureGateConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private SettingsFeatureGateConfig_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.settings.featureflags.featuregate.SettingsFeatureGateConfig(featureGate);
    }
}
