package com.paypal.oslo.core.permission.data.storage;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/permission/data/storage/PermissionStorageKeys;", "", "<init>", "()V", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "permissionRequestedBeforeKey", "(Ljava/lang/String;)Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PermissionStorageKeys {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.permission.data.storage.PermissionStorageKeys INSTANCE = new com.paypal.oslo.core.permission.data.storage.PermissionStorageKeys();

    private PermissionStorageKeys() {
    }

    public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted permissionRequestedBeforeKey(java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
        return new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("was_permission_requested_before_".concat(java.lang.String.valueOf(permission)));
    }
}
