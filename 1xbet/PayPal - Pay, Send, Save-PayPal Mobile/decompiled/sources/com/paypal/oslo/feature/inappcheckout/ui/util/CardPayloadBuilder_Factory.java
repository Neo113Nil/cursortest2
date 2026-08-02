package com.paypal.oslo.feature.inappcheckout.ui.util;

/* loaded from: classes13.dex */
public final class CardPayloadBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> getHighSpeedVideoFpsRanges;

    private CardPayloadBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder newInstance(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        return new com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder(localeProvider, appSwitchSession);
    }
}
