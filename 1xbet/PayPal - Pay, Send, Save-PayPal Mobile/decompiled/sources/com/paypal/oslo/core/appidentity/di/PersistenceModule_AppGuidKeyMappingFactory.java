package com.paypal.oslo.core.appidentity.di;

/* loaded from: classes4.dex */
public final class PersistenceModule_AppGuidKeyMappingFactory implements dagger.internal.Factory<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> get() {
        return appGuidKeyMapping();
    }

    public static com.paypal.oslo.core.appidentity.di.PersistenceModule_AppGuidKeyMappingFactory create() {
        return com.paypal.oslo.core.appidentity.di.PersistenceModule_AppGuidKeyMappingFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> appGuidKeyMapping() {
        return (kotlin.Pair) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.appidentity.di.PersistenceModule.INSTANCE.appGuidKeyMapping());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.appidentity.di.PersistenceModule_AppGuidKeyMappingFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.appidentity.di.PersistenceModule_AppGuidKeyMappingFactory();

        private InstanceHolder() {
        }
    }
}
