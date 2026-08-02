package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase;

/* loaded from: classes11.dex */
public final class InitializeZettleUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager> getHighSpeedVideoSizes;

    private InitializeZettleUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange> provider2) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager tapToPaySDKManager, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange zettleTokenExchange) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase(tapToPaySDKManager, zettleTokenExchange);
    }
}
