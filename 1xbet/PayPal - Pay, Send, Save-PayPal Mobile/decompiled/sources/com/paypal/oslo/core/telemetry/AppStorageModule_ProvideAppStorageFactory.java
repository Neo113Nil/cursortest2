package com.paypal.oslo.core.telemetry;

/* loaded from: classes5.dex */
public final class AppStorageModule_ProvideAppStorageFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.AppStorage> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private AppStorageModule_ProvideAppStorageFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage get() {
        return provideAppStorage(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.telemetry.AppStorageModule_ProvideAppStorageFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.telemetry.AppStorageModule_ProvideAppStorageFactory(provider);
    }

    public static com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(android.content.Context context) {
        return (com.paypal.oslo.core.persistence.appstorage.AppStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.AppStorageModule.INSTANCE.provideAppStorage(context));
    }
}
