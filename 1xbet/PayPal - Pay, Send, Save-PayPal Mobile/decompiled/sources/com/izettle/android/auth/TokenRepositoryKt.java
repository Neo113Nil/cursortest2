package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f"}, d2 = {"Landroid/content/Context;", "context", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/Logger;", "logger", "Lcom/izettle/android/auth/TokenRepository;", "makeTokenRepository", "(Landroid/content/Context;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/Logger;)Lcom/izettle/android/auth/TokenRepository;", "Landroid/content/SharedPreferences;", "", "migrateToAuthStorage", "(Landroid/content/SharedPreferences;Lcom/izettle/android/auth/storage/AuthStorage;)V", "", "KEY_IS_NATIVE_LOGIN", "Ljava/lang/String;", "KEY_REFRESH_TOKEN", com.izettle.android.auth.TokenRepositoryKt.PREFS_TOKEN}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TokenRepositoryKt {
    private static final java.lang.String KEY_IS_NATIVE_LOGIN = "IS_NATIVE_LOGIN";
    private static final java.lang.String KEY_REFRESH_TOKEN = "REFRESH_TOKEN";
    private static final java.lang.String PREFS_TOKEN = "PREFS_TOKEN";

    public static final com.izettle.android.auth.TokenRepository makeTokenRepository(android.content.Context context, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        return new com.izettle.android.auth.TokenRepositoryImpl(context, authStorage, logger, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void migrateToAuthStorage(android.content.SharedPreferences sharedPreferences, com.izettle.android.auth.storage.AuthStorage authStorage) {
        java.lang.String string = sharedPreferences.getString(KEY_REFRESH_TOKEN, null);
        if (string != null) {
            com.izettle.android.auth.storage.Transaction beginTransaction = authStorage.beginTransaction();
            beginTransaction.put(KEY_REFRESH_TOKEN, string);
            beginTransaction.put(KEY_IS_NATIVE_LOGIN, sharedPreferences.getBoolean(KEY_IS_NATIVE_LOGIN, false));
            com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> commit = beginTransaction.commit();
            if (commit instanceof com.izettle.android.core.data.result.Success) {
                sharedPreferences.edit().clear().apply();
            }
        }
    }
}
