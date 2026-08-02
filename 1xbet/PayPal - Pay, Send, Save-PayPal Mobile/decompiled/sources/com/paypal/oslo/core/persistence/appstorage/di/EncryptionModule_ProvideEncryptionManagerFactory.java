package com.paypal.oslo.core.persistence.appstorage.di;

/* loaded from: classes5.dex */
public final class EncryptionModule_ProvideEncryptionManagerFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.encryption.EncryptionManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.encryption.EncryptionManager get() {
        return provideEncryptionManager();
    }

    public static com.paypal.oslo.core.persistence.appstorage.di.EncryptionModule_ProvideEncryptionManagerFactory create() {
        return com.paypal.oslo.core.persistence.appstorage.di.EncryptionModule_ProvideEncryptionManagerFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.persistence.encryption.EncryptionManager provideEncryptionManager() {
        return (com.paypal.oslo.core.persistence.encryption.EncryptionManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.persistence.appstorage.di.EncryptionModule.INSTANCE.provideEncryptionManager());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.persistence.appstorage.di.EncryptionModule_ProvideEncryptionManagerFactory getHighSpeedVideoSizes = new com.paypal.oslo.core.persistence.appstorage.di.EncryptionModule_ProvideEncryptionManagerFactory();

        private InstanceHolder() {
        }
    }
}
