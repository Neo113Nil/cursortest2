package com.paypal.oslo.feature.pushnotification.tokenmanagement.di;

/* loaded from: classes5.dex */
public final class TokenManagementModule_ProvideAppStorageFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.AppStorage> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private TokenManagementModule_ProvideAppStorageFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage get() {
        return provideAppStorage(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.di.TokenManagementModule_ProvideAppStorageFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.di.TokenManagementModule_ProvideAppStorageFactory(provider);
    }

    public static com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(android.content.Context context) {
        return (com.paypal.oslo.core.persistence.appstorage.AppStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.pushnotification.tokenmanagement.di.TokenManagementModule.INSTANCE.provideAppStorage(context));
    }
}
