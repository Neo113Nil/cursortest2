package com.paypal.oslo.core.persistence.appstorage;

/* loaded from: classes10.dex */
public final class SharedPrefsMigrationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider> {
    private final dagger.internal.Provider<java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>>> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>>> getHighSpeedVideoFpsRangesFor;

    private SharedPrefsMigrationProvider_Factory(dagger.internal.Provider<java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>>> provider, dagger.internal.Provider<java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>>> provider2, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider_Factory create(dagger.internal.Provider<java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>>> provider, dagger.internal.Provider<java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>>> provider2, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper> provider3) {
        return new com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider newInstance(java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> set, java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> set2, com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper sharedPreferenceMigrationHelper) {
        return new com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider(set, set2, sharedPreferenceMigrationHelper);
    }
}
