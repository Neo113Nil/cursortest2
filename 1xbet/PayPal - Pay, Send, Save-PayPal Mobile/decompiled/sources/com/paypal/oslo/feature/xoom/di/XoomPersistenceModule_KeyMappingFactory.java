package com.paypal.oslo.feature.xoom.di;

/* loaded from: classes5.dex */
public final class XoomPersistenceModule_KeyMappingFactory implements dagger.internal.Factory<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> get() {
        return keyMapping();
    }

    public static com.paypal.oslo.feature.xoom.di.XoomPersistenceModule_KeyMappingFactory create() {
        return com.paypal.oslo.feature.xoom.di.XoomPersistenceModule_KeyMappingFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> keyMapping() {
        return (kotlin.Pair) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.xoom.di.XoomPersistenceModule.INSTANCE.keyMapping());
    }

    /* loaded from: classes16.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.xoom.di.XoomPersistenceModule_KeyMappingFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.xoom.di.XoomPersistenceModule_KeyMappingFactory();

        private InstanceHolder() {
        }
    }
}
