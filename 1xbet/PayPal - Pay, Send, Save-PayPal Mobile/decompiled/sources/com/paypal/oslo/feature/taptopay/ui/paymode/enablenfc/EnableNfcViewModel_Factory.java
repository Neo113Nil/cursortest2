package com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc;

/* loaded from: classes15.dex */
public final class EnableNfcViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase> Camera2StreamConfigurationMap;

    private EnableNfcViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase isNfcEnabledUseCase) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel(isNfcEnabledUseCase);
    }
}
