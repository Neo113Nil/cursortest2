package com.paypal.oslo.core.persistence.appstorage.di;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/di/AppStorageEntryPoint;", "", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "dataStore", "()Landroidx/datastore/core/DataStore;", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;", "encryptionManager", "()Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefsMigrationProvider;", "sharedPrefsMigrationProvider", "()Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefsMigrationProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AppStorageEntryPoint {
    androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> dataStore();

    com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager();

    com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider sharedPrefsMigrationProvider();
}
