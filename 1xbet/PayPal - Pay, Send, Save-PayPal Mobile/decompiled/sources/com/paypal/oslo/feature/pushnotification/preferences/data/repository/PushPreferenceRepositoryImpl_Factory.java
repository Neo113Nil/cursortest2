package com.paypal.oslo.feature.pushnotification.preferences.data.repository;

/* loaded from: classes13.dex */
public final class PushPreferenceRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService> Camera2StreamConfigurationMap;

    private PushPreferenceRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService> provider) {
        return new com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl newInstance(com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService pushPreferenceDataService) {
        return new com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl(pushPreferenceDataService);
    }
}
