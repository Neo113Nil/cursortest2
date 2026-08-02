package com.izettle.android.auth.storage;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0011\u001a\u00028\u0000\"\u0006\b\u0000\u0010\r\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u000e8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%"}, d2 = {"Lcom/izettle/android/auth/storage/AuthStorage;", "Lcom/izettle/android/auth/log/Loggable;", "Landroid/content/Context;", "context", "Lcom/izettle/android/auth/log/Logger;", "logger", "Landroid/content/SharedPreferences;", "sharedPrefs", "<init>", "(Landroid/content/Context;Lcom/izettle/android/auth/log/Logger;Landroid/content/SharedPreferences;)V", "Lcom/izettle/android/auth/storage/Transaction;", "beginTransaction", "()Lcom/izettle/android/auth/storage/Transaction;", "T", "", "key", "defaultValue", "get", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/izettle/android/core/data/result/Result;", "", "", "remove", "(Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "Ljava/util/concurrent/locks/Lock;", "lock", "Ljava/util/concurrent/locks/Lock;", "logTag", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "Lcom/izettle/android/auth/log/Logger;", "getLogger", "()Lcom/izettle/android/auth/log/Logger;", "Landroid/content/SharedPreferences;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthStorage implements com.izettle.android.auth.log.Loggable {
    private final java.util.concurrent.locks.Lock lock;
    private final java.lang.String logTag;
    private final com.izettle.android.auth.log.Logger logger;
    private final android.content.SharedPreferences sharedPrefs;

    public AuthStorage(android.content.Context context, com.izettle.android.auth.log.Logger logger, android.content.SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.logger = logger;
        this.sharedPrefs = sharedPreferences;
        this.logTag = "AuthStorage";
        this.lock = new java.util.concurrent.locks.ReentrantLock();
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void debug(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.debug(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void error(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.error(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void error(java.lang.String str, java.lang.Throwable th) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.error(this, str, th);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void error(java.lang.Throwable th) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.error(this, th);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void info(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.info(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void verbose(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.verbose(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void warn(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.warn(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final com.izettle.android.auth.log.Logger getLogger() {
        return this.logger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AuthStorage(android.content.Context context, com.izettle.android.auth.log.Logger logger, android.content.SharedPreferences sharedPreferences, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, logger, sharedPreferences);
        if ((i & 4) != 0) {
            sharedPreferences = context.getSharedPreferences("com.zettle.android.auth.AuthStorage", 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        }
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final java.lang.String getLogTag() {
        return this.logTag;
    }

    public final com.izettle.android.auth.storage.Transaction beginTransaction() {
        android.content.SharedPreferences.Editor edit = this.sharedPrefs.edit();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(edit, "");
        return new com.izettle.android.auth.storage.Transaction(edit, this.lock);
    }

    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> store(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.concurrent.locks.Lock lock = this.lock;
        lock.lock();
        try {
            com.izettle.android.auth.storage.Transaction beginTransaction = beginTransaction();
            beginTransaction.put(key, value);
            return beginTransaction.commit();
        } finally {
            lock.unlock();
        }
    }

    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> remove(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.concurrent.locks.Lock lock = this.lock;
        lock.lock();
        try {
            com.izettle.android.auth.storage.Transaction beginTransaction = beginTransaction();
            beginTransaction.remove(key);
            return beginTransaction.commit();
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> T get(java.lang.String key, T defaultValue) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.concurrent.locks.Lock lock = this.lock;
        lock.lock();
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                java.lang.String string = this.sharedPrefs.getString(key, defaultValue instanceof java.lang.String ? (java.lang.String) defaultValue : null);
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                t = (T) string;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE))) {
                android.content.SharedPreferences sharedPreferences = this.sharedPrefs;
                java.lang.Boolean bool = defaultValue instanceof java.lang.Boolean ? (java.lang.Boolean) defaultValue : null;
                boolean z = sharedPreferences.getBoolean(key, bool != null ? bool.booleanValue() : false);
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                t = (T) java.lang.Boolean.valueOf(z);
            } else {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                java.lang.String name2 = java.lang.Object.class.getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported type ");
                sb.append(name2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return t;
        } finally {
            lock.unlock();
        }
    }
}
