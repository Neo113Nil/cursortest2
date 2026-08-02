package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class LocaleInformationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.LocaleInformationProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> Camera2StreamConfigurationMap;

    private LocaleInformationProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.LocaleInformationProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.appidentity.data.LocaleInformationProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        return new com.paypal.oslo.core.appidentity.data.LocaleInformationProvider_Factory(provider);
    }

    public static com.paypal.oslo.core.appidentity.data.LocaleInformationProvider newInstance(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        return new com.paypal.oslo.core.appidentity.data.LocaleInformationProvider(localeProvider);
    }
}
