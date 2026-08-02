package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class ConnectedAppsAndSitesViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.GetConnectedAppsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getOutputFormats;

    private ConnectedAppsAndSitesViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.GetConnectedAppsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase> provider6) {
        this.getOutputFormats = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel get() {
        return newInstance(this.getOutputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.GetConnectedAppsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase> provider6) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper connectedAppsMapper, com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.GetConnectedAppsUseCase getConnectedAppsUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase deleteAuthConsentUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase deactivateAuthConsentUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase removeProviderConsentUseCase) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel(webEnvironmentProvider, connectedAppsMapper, getConnectedAppsUseCase, deleteAuthConsentUseCase, deactivateAuthConsentUseCase, removeProviderConsentUseCase);
    }
}
