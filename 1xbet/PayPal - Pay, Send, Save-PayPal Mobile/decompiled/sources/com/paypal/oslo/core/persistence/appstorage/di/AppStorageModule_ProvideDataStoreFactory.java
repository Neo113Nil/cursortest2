package com.paypal.oslo.core.persistence.appstorage.di;

/* loaded from: classes5.dex */
public final class AppStorageModule_ProvideDataStoreFactory implements dagger.internal.Factory<androidx.content.core.DataStore<androidx.content.preferences.core.Preferences>> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private AppStorageModule_ProvideDataStoreFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> get() {
        return provideDataStore(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.persistence.appstorage.di.AppStorageModule_ProvideDataStoreFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.persistence.appstorage.di.AppStorageModule_ProvideDataStoreFactory(provider);
    }

    public static androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> provideDataStore(android.content.Context context) {
        return (androidx.content.core.DataStore) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.persistence.appstorage.di.AppStorageModule.INSTANCE.provideDataStore(context));
    }
}
