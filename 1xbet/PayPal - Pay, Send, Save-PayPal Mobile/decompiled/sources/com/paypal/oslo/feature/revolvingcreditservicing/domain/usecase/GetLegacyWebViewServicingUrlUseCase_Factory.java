package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class GetLegacyWebViewServicingUrlUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository> getHighSpeedVideoFpsRangesFor;

    private GetLegacyWebViewServicingUrlUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository legacyWebViewServicingUrlsRepository, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase(legacyWebViewServicingUrlsRepository, webEnvironmentProvider);
    }
}
