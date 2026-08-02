package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class HandleInAppLinkUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private HandleInAppLinkUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase formatLocalizedUrlUseCase, com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase(formatLocalizedUrlUseCase, inAppCheckoutStringsProvider);
    }
}
