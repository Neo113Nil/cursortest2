package com.paypal.oslo.core.persistence.appstorage;

/* loaded from: classes10.dex */
public final class SharedPreferenceMigrationHelper_Factory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.encryption.EncryptionManager> getHighSpeedVideoFpsRanges;

    private SharedPreferenceMigrationHelper_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.encryption.EncryptionManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.encryption.EncryptionManager> provider) {
        return new com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper_Factory(provider);
    }

    public static com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper newInstance(com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager) {
        return new com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper(encryptionManager);
    }
}
