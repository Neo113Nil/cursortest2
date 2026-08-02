package com.paypal.oslo.feature.shoppingrewards;

/* loaded from: classes14.dex */
public final class AppStorageModule_ProvideAppStorageFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.AppStorage> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private AppStorageModule_ProvideAppStorageFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage get() {
        return provideAppStorage(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.AppStorageModule_ProvideAppStorageFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.AppStorageModule_ProvideAppStorageFactory(provider);
    }

    public static com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(android.content.Context context) {
        return (com.paypal.oslo.core.persistence.appstorage.AppStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shoppingrewards.AppStorageModule.INSTANCE.provideAppStorage(context));
    }
}
