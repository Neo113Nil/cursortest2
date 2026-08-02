package com.paypal.oslo.feature.identity.storage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/storage/TokenStorageKeys;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "USER_ACCESS_TOKEN", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "getUSER_ACCESS_TOKEN", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "CLIENT_ACCESS_TOKEN", "getCLIENT_ACCESS_TOKEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenStorageKeys {
    public static final com.paypal.oslo.feature.identity.storage.TokenStorageKeys INSTANCE = new com.paypal.oslo.feature.identity.storage.TokenStorageKeys();
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted USER_ACCESS_TOKEN = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("user_access_token");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted CLIENT_ACCESS_TOKEN = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("client_access_token");
    public static final int $stable = 8;

    private TokenStorageKeys() {
    }

    public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getUSER_ACCESS_TOKEN() {
        return USER_ACCESS_TOKEN;
    }

    public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getCLIENT_ACCESS_TOKEN() {
        return CLIENT_ACCESS_TOKEN;
    }
}
