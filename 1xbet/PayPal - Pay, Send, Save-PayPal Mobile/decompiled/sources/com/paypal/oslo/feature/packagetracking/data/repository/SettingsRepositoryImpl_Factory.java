package com.paypal.oslo.feature.packagetracking.data.repository;

/* loaded from: classes13.dex */
public final class SettingsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighResolutionOutputSizeshNQ4ISI;

    private SettingsRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl(appStorage);
    }
}
