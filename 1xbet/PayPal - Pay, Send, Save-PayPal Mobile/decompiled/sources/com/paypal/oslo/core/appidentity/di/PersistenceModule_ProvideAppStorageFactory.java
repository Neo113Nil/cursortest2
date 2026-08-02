package com.paypal.oslo.core.appidentity.di;

/* loaded from: classes4.dex */
public final class PersistenceModule_ProvideAppStorageFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.AppStorage> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private PersistenceModule_ProvideAppStorageFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage get() {
        return provideAppStorage(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.appidentity.di.PersistenceModule_ProvideAppStorageFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.appidentity.di.PersistenceModule_ProvideAppStorageFactory(provider);
    }

    public static com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(android.content.Context context) {
        return (com.paypal.oslo.core.persistence.appstorage.AppStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.appidentity.di.PersistenceModule.INSTANCE.provideAppStorage(context));
    }
}
