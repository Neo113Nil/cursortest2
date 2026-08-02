package com.paypal.oslo.core.appidentity.di;

/* loaded from: classes4.dex */
public final class PersistenceModule_RememberedUserNameEncryptedKeyMappingFactory implements dagger.internal.Factory<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> get() {
        return rememberedUserNameEncryptedKeyMapping();
    }

    public static com.paypal.oslo.core.appidentity.di.PersistenceModule_RememberedUserNameEncryptedKeyMappingFactory create() {
        return com.paypal.oslo.core.appidentity.di.PersistenceModule_RememberedUserNameEncryptedKeyMappingFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> rememberedUserNameEncryptedKeyMapping() {
        return (kotlin.Pair) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.appidentity.di.PersistenceModule.INSTANCE.rememberedUserNameEncryptedKeyMapping());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.appidentity.di.PersistenceModule_RememberedUserNameEncryptedKeyMappingFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.appidentity.di.PersistenceModule_RememberedUserNameEncryptedKeyMappingFactory();

        private InstanceHolder() {
        }
    }
}
