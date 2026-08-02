package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase;

/* loaded from: classes11.dex */
public final class ZettleDeviceCompatibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager> getHighSpeedVideoFpsRangesFor;

    private ZettleDeviceCompatibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager tapToPaySDKManager) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase(tapToPaySDKManager);
    }
}
