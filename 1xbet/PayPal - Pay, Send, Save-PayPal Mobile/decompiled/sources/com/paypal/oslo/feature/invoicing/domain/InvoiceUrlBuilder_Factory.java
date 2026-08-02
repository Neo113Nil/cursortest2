package com.paypal.oslo.feature.invoicing.domain;

/* loaded from: classes13.dex */
public final class InvoiceUrlBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighSpeedVideoSizes;

    private InvoiceUrlBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider4) {
        return new com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        return new com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder(webEnvironmentProvider, dynamicConfiguration, localeInformation, appInformation);
    }
}
