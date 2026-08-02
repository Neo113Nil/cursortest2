package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

/* loaded from: classes13.dex */
public final class GetXORLoadingHeadersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetMerchantUpgradePathUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetPayerIdUseCase> getHighSpeedVideoSizes;

    private GetXORLoadingHeadersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetMerchantUpgradePathUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetPayerIdUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetMerchantUpgradePathUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetPayerIdUseCase> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetMerchantUpgradePathUseCase getMerchantUpgradePathUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetPayerIdUseCase getPayerIdUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase(getMerchantUpgradePathUseCase, getPayerIdUseCase);
    }
}
