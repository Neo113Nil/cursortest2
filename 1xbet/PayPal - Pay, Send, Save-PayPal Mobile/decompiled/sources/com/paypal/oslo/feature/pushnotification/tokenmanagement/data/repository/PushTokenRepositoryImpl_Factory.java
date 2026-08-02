package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository;

/* loaded from: classes13.dex */
public final class PushTokenRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource> getHighResolutionOutputSizeshNQ4ISI;

    private PushTokenRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService> provider2) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl newInstance(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSource pushTokenLocalDataSource, com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService pushTokenDataService) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl(pushTokenLocalDataSource, pushTokenDataService);
    }
}
