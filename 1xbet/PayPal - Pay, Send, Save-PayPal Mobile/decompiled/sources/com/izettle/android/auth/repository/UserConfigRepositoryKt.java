package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Landroid/content/Context;", "context", "Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/services/ApiService;", "apiService", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/Logger;", "logger", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "makeUserConfigRepository", "(Landroid/content/Context;Lcom/izettle/android/auth/executor/Executor;Lcom/izettle/android/auth/services/ApiService;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/Logger;)Lcom/izettle/android/auth/repository/UserConfigRepository;", "Landroid/content/SharedPreferences;", "", "migrateToAuthStorage", "(Landroid/content/SharedPreferences;Lcom/izettle/android/auth/storage/AuthStorage;)V", "Lcom/zettle/android/entities/UserConfig;", "Lcom/izettle/android/auth/dto/RevisitDto;", "revisitResponsePayload", "", "shouldRefresh", "(Lcom/zettle/android/entities/UserConfig;Lcom/izettle/android/auth/dto/RevisitDto;)Z", "", "PREFS_USER_CONFIG", "Ljava/lang/String;", "PREF_KEY_USER_CONFIG"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserConfigRepositoryKt {
    private static final java.lang.String PREFS_USER_CONFIG = "com.izettle.android.auth.UserConfig";
    private static final java.lang.String PREF_KEY_USER_CONFIG = "CONFIG_PAYLOAD";

    public static final com.izettle.android.auth.repository.UserConfigRepository makeUserConfigRepository(android.content.Context context, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.services.ApiService apiService, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        return new com.izettle.android.auth.repository.UserConfigRepositoryImpl(context, logger, executor, apiService, authStorage, null, null, null, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldRefresh(com.zettle.android.entities.UserConfig userConfig, com.izettle.android.auth.dto.RevisitDto revisitDto) {
        if ((revisitDto != null ? revisitDto.getTransactionConfigHash() : null) == null || revisitDto.getUserInfoHash() == null) {
            return false;
        }
        return (kotlin.jvm.internal.Intrinsics.areEqual(revisitDto.getUserInfoHash(), userConfig.getUserInfoHash()) && kotlin.jvm.internal.Intrinsics.areEqual(revisitDto.getTransactionConfigHash(), userConfig.getTransactionConfigHash())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void migrateToAuthStorage(android.content.SharedPreferences sharedPreferences, com.izettle.android.auth.storage.AuthStorage authStorage) {
        java.lang.String string = sharedPreferences.getString(PREF_KEY_USER_CONFIG, null);
        if (string != null) {
            com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> store = authStorage.store(PREF_KEY_USER_CONFIG, string);
            if (store instanceof com.izettle.android.core.data.result.Success) {
                sharedPreferences.edit().clear().apply();
            }
        }
    }
}
