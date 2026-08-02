package com.paypal.oslo.core.persistence.appstorage.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/di/EncryptionModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;", "provideEncryptionManager", "()Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class EncryptionModule {
    public static final com.paypal.oslo.core.persistence.appstorage.di.EncryptionModule INSTANCE = new com.paypal.oslo.core.persistence.appstorage.di.EncryptionModule();

    private EncryptionModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.persistence.encryption.EncryptionManager provideEncryptionManager() {
        return new com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl(null, null, null, 7, null);
    }
}
