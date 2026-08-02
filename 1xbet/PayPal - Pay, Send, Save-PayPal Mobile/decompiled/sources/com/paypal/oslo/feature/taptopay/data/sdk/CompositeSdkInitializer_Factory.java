package com.paypal.oslo.feature.taptopay.data.sdk;

/* loaded from: classes15.dex */
public final class CompositeSdkInitializer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> getHighSpeedVideoSizes;

    private CompositeSdkInitializer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer get() {
        return newInstance(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    public static com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer newInstance(javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer(provider, provider2);
    }
}
