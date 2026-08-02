package com.paypal.oslo.core.i18n.data.repository;

/* loaded from: classes10.dex */
public final class NetworkRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService> getHighSpeedVideoFpsRanges;

    private NetworkRepository_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.repository.NetworkRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.data.repository.NetworkRepository_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService> provider) {
        return new com.paypal.oslo.core.i18n.data.repository.NetworkRepository_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.data.repository.NetworkRepository newInstance(com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService i18nMetadataApiService) {
        return new com.paypal.oslo.core.i18n.data.repository.NetworkRepository(i18nMetadataApiService);
    }
}
