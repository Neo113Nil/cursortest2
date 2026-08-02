package com.izettle.android.auth.storage;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t\"\u0004\b\u0000\u0010\u000f*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t\"\u0004\b\u0000\u0010\u000f*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t0\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Lcom/izettle/android/auth/storage/Transaction;", "", "userUuid", "", "applyCanonicalUserUuid", "(Lcom/izettle/android/auth/storage/Transaction;Ljava/lang/String;)V", "applyDeleteCanonicalUserUuid", "(Lcom/izettle/android/auth/storage/Transaction;)V", "Lcom/izettle/android/auth/storage/AuthStorage;", "Lcom/izettle/android/core/data/result/Result;", "", "checkAgainstCanonicalUserUuid", "(Lcom/izettle/android/auth/storage/AuthStorage;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "getCanonicalUserUuid", "(Lcom/izettle/android/auth/storage/AuthStorage;)Ljava/lang/String;", "T", "Lkotlin/Function0;", "block", "runIfCanonicalOtherwiseFail", "(Lcom/izettle/android/auth/storage/AuthStorage;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/izettle/android/core/data/result/Result;", "runIfCanonicalToResultOtherwiseFail", "KEY_CANONICAL_USER_UUID", "Ljava/lang/String;", "PREFS_NAME"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthStorageKt {
    private static final java.lang.String KEY_CANONICAL_USER_UUID = "CANONICAL_USER_UUID";
    private static final java.lang.String PREFS_NAME = "com.zettle.android.auth.AuthStorage";

    private static final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> checkAgainstCanonicalUserUuid(com.izettle.android.auth.storage.AuthStorage authStorage, java.lang.String str) {
        java.lang.String canonicalUserUuid = getCanonicalUserUuid(authStorage);
        if (canonicalUserUuid == null || !kotlin.jvm.internal.Intrinsics.areEqual(canonicalUserUuid, str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Trying to save a non-canonical user config: ");
            sb.append(str);
            sb.append("; canon is ");
            sb.append(canonicalUserUuid);
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException(sb.toString());
            authStorage.error(illegalArgumentException);
            return com.izettle.android.core.data.result.ResultKt.asFailure(illegalArgumentException);
        }
        return com.izettle.android.core.data.result.ResultKt.asSuccess(kotlin.Unit.INSTANCE);
    }

    public static final <T> com.izettle.android.core.data.result.Result<T, java.lang.Throwable> runIfCanonicalOtherwiseFail(com.izettle.android.auth.storage.AuthStorage authStorage, java.lang.String str, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        com.izettle.android.core.data.result.Success success = (com.izettle.android.core.data.result.Result<T, java.lang.Throwable>) checkAgainstCanonicalUserUuid(authStorage, str);
        if (success instanceof com.izettle.android.core.data.result.Success) {
            return new com.izettle.android.core.data.result.Success(function0.invoke());
        }
        if (success instanceof com.izettle.android.core.data.result.Failure) {
            return success;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T> com.izettle.android.core.data.result.Result<T, java.lang.Throwable> runIfCanonicalToResultOtherwiseFail(com.izettle.android.auth.storage.AuthStorage authStorage, java.lang.String str, kotlin.jvm.functions.Function0<? extends com.izettle.android.core.data.result.Result<? extends T, ? extends java.lang.Throwable>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        com.izettle.android.core.data.result.Success success = (com.izettle.android.core.data.result.Result<T, java.lang.Throwable>) checkAgainstCanonicalUserUuid(authStorage, str);
        if (success instanceof com.izettle.android.core.data.result.Success) {
            return function0.invoke();
        }
        if (success instanceof com.izettle.android.core.data.result.Failure) {
            return success;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final void applyCanonicalUserUuid(com.izettle.android.auth.storage.Transaction transaction, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        transaction.put(KEY_CANONICAL_USER_UUID, str);
    }

    public static final void applyDeleteCanonicalUserUuid(com.izettle.android.auth.storage.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        transaction.remove(KEY_CANONICAL_USER_UUID);
    }

    public static final java.lang.String getCanonicalUserUuid(com.izettle.android.auth.storage.AuthStorage authStorage) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        java.util.concurrent.locks.Lock lock = authStorage.lock;
        lock.lock();
        try {
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                str = authStorage.sharedPrefs.getString(KEY_CANONICAL_USER_UUID, null);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE))) {
                str = (java.lang.String) java.lang.Boolean.valueOf(authStorage.sharedPrefs.getBoolean(KEY_CANONICAL_USER_UUID, false));
            } else {
                java.lang.String name2 = java.lang.String.class.getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported type ");
                sb.append(name2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return str;
        } finally {
            lock.unlock();
        }
    }
}
