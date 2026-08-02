package com.paypal.oslo.feature.taptopay.data.payair.csdk;

/* loaded from: classes15.dex */
public final class CsdkListener_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> getHighSpeedVideoSizesFor;

    private CsdkListener_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoSizesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener newInstance(com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher, com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager sdkConfigurationManager, com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener(payairCardPaymentKeysReplenisher, payairPaymentListener, sdkTokenManager, sdkConfigurationManager, authToken, coroutineDispatcher);
    }
}
