package com.paypal.oslo.feature.bnplservicing.ui.plhub.components;

/* loaded from: classes11.dex */
public final class BnplUrlHelper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> getHighSpeedVideoSizes;

    private BnplUrlHelper_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> provider4) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper(webEnvironmentProvider, userStore, localeInformation, supportedCpisConfig);
    }
}
