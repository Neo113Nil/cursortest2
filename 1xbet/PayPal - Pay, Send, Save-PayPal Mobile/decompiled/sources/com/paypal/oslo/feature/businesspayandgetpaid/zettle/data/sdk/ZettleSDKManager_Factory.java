package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk;

/* loaded from: classes11.dex */
public final class ZettleSDKManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk.ZettleSDKManager> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider> getHighSpeedVideoSizes;

    private ZettleSDKManager_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk.ZettleSDKManager get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk.ZettleSDKManager_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper> provider4) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk.ZettleSDKManager_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk.ZettleSDKManager newInstance(android.content.Context context, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange zettleTokenExchange, com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider zettleConfigProvider, com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper deviceRequirementMapper) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk.ZettleSDKManager(context, zettleTokenExchange, zettleConfigProvider, deviceRequirementMapper);
    }
}
