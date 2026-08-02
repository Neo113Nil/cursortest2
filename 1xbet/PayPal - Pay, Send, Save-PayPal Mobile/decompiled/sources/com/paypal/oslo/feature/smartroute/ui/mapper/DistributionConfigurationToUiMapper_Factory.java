package com.paypal.oslo.feature.smartroute.ui.mapper;

/* loaded from: classes15.dex */
public final class DistributionConfigurationToUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private DistributionConfigurationToUiMapper_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper(context);
    }
}
