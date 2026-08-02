package com.paypal.oslo.feature.taptopay.domain.usecase.sdk;

/* loaded from: classes15.dex */
public final class InitializeTapToPaySdkUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> Camera2StreamConfigurationMap;

    private InitializeTapToPaySdkUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl newInstance(com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer sdkInitializer) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl(sdkInitializer);
    }
}
