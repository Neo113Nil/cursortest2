package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b!\u0010\u001cJ\u0011\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0017¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010,J\u0013\u0010!\u001a\u00020\u000f*\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0011J#\u0010-\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u001a\u00100\u001a\u00020\u001d8\u0017X\u0096D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u00106\u0012\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0012098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;"}, d2 = {"Lcom/izettle/android/auth/TokenRepositoryImpl;", "Lcom/izettle/android/auth/TokenRepository;", "Lcom/izettle/android/auth/log/Loggable;", "Landroid/content/Context;", "context", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/Logger;", "logger", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/Context;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/Logger;Landroid/content/SharedPreferences;)V", "Lcom/izettle/android/auth/storage/Transaction;", "transaction", "", "applyClearToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;)V", "Lcom/izettle/android/auth/model/OAuthTokens;", "oAuthTokens", "", "isNative", "applyStoreCanonicalTokensToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;Lcom/izettle/android/auth/model/OAuthTokens;Z)V", "applyStoreTokensToTransaction", "Lcom/izettle/android/core/data/result/Result;", "", "clear", "()Lcom/izettle/android/core/data/result/Result;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "deleteAccessToken", "(Ljava/lang/String;)V", "deleteRefreshToken", "getRefreshToken", "()Ljava/lang/String;", "", "getTokens", "()Ljava/util/List;", "isNativeLogin", "()Z", "persistRefreshToken", "(Ljava/lang/String;Z)Lcom/izettle/android/core/data/result/Result;", "storeTokens", "(Lcom/izettle/android/auth/model/OAuthTokens;Z)Lcom/izettle/android/core/data/result/Result;", "storeRefreshToken", "(Lcom/izettle/android/auth/storage/Transaction;Ljava/lang/String;Z)V", "Lcom/izettle/android/auth/storage/AuthStorage;", "logTag", "Ljava/lang/String;", "getLogTag", "Lcom/izettle/android/auth/log/Logger;", "getLogger", "()Lcom/izettle/android/auth/log/Logger;", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "()V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "tokenPairs", "Ljava/util/concurrent/CopyOnWriteArrayList;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TokenRepositoryImpl implements com.izettle.android.auth.TokenRepository, com.izettle.android.auth.log.Loggable {
    private final com.izettle.android.auth.storage.AuthStorage authStorage;
    private final java.lang.String logTag;
    private final com.izettle.android.auth.log.Logger logger;
    private final android.content.SharedPreferences sharedPreferences;
    private final java.util.concurrent.CopyOnWriteArrayList<com.izettle.android.auth.model.OAuthTokens> tokenPairs;

    @kotlin.Deprecated(message = "Deprecate in favour of authStorage")
    private static /* synthetic */ void getSharedPreferences$annotations() {
    }

    public TokenRepositoryImpl(android.content.Context context, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.Logger logger, android.content.SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.authStorage = authStorage;
        this.logger = logger;
        this.sharedPreferences = sharedPreferences;
        this.tokenPairs = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.logTag = "TokenRepositoryImpl";
        com.izettle.android.auth.TokenRepositoryKt.migrateToAuthStorage(sharedPreferences, authStorage);
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
    public /* synthetic */ TokenRepositoryImpl(android.content.Context context, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.Logger logger, android.content.SharedPreferences sharedPreferences, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, authStorage, logger, sharedPreferences);
        if ((i & 8) != 0) {
            sharedPreferences = context.getSharedPreferences("PREFS_TOKEN", 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        }
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final java.lang.String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> persistRefreshToken(java.lang.String token, boolean isNative) {
        com.izettle.android.auth.storage.Transaction beginTransaction = this.authStorage.beginTransaction();
        storeRefreshToken(beginTransaction, token, isNative);
        return beginTransaction.commit();
    }

    private final void storeRefreshToken(com.izettle.android.auth.storage.Transaction transaction, java.lang.String str, boolean z) {
        transaction.put("REFRESH_TOKEN", str);
        if (z) {
            transaction.put("IS_NATIVE_LOGIN", z);
        }
    }

    private final void deleteRefreshToken(com.izettle.android.auth.storage.Transaction transaction) {
        transaction.remove("REFRESH_TOKEN");
        transaction.remove("IS_NATIVE_LOGIN");
    }

    private final void applyStoreTokensToTransaction(com.izettle.android.auth.storage.Transaction transaction, final com.izettle.android.auth.model.OAuthTokens oAuthTokens, boolean isNative) {
        java.lang.String refreshToken = oAuthTokens.getRefreshToken();
        transaction.registerSuccessfulListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.izettle.android.auth.TokenRepositoryImpl$applyStoreTokensToTransaction$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighResolutionOutputSizeshNQ4ISI();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI() {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2;
                copyOnWriteArrayList = com.izettle.android.auth.TokenRepositoryImpl.this.tokenPairs;
                copyOnWriteArrayList.add(oAuthTokens);
                com.izettle.android.auth.TokenRepositoryImpl tokenRepositoryImpl = com.izettle.android.auth.TokenRepositoryImpl.this;
                copyOnWriteArrayList2 = tokenRepositoryImpl.tokenPairs;
                tokenRepositoryImpl.info(com.izettle.android.auth.log.StackTraceKt.withStackTrace(com.izettle.android.auth.model.OAuthTokensKt.withUserIdAndRedactedTokens(copyOnWriteArrayList2)));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        transaction.registerFailureListener(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.izettle.android.auth.TokenRepositoryImpl$applyStoreTokensToTransaction$2
            public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                com.izettle.android.auth.TokenRepositoryImpl.this.error("Failed to store tokens", th);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighResolutionOutputSizeshNQ4ISI(th);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        });
        if (refreshToken != null) {
            storeRefreshToken(transaction, refreshToken, isNative);
        }
    }

    @Override // com.izettle.android.auth.TokenRepository
    @kotlin.Deprecated(message = "The endpoint this API uses under the hood will be sunset in the near future")
    public final boolean isNativeLogin() {
        java.lang.Boolean valueOf;
        com.izettle.android.auth.storage.AuthStorage authStorage = this.authStorage;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.util.concurrent.locks.Lock lock = authStorage.lock;
        lock.lock();
        try {
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                java.lang.Object string = authStorage.sharedPrefs.getString("IS_NATIVE_LOGIN", null);
                if (string == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                valueOf = (java.lang.Boolean) string;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE))) {
                    java.lang.String name2 = java.lang.Boolean.class.getName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported type ");
                    sb.append(name2);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                valueOf = java.lang.Boolean.valueOf(authStorage.sharedPrefs.getBoolean("IS_NATIVE_LOGIN", bool != null ? bool.booleanValue() : false));
            }
            lock.unlock();
            return valueOf.booleanValue();
        } catch (java.lang.Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.izettle.android.auth.TokenRepository
    public final java.lang.String getRefreshToken() {
        java.lang.String str;
        com.izettle.android.auth.storage.AuthStorage authStorage = this.authStorage;
        java.util.concurrent.locks.Lock lock = authStorage.lock;
        lock.lock();
        try {
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                str = authStorage.sharedPrefs.getString("REFRESH_TOKEN", null);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE))) {
                str = (java.lang.String) java.lang.Boolean.valueOf(authStorage.sharedPrefs.getBoolean("REFRESH_TOKEN", false));
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

    @Override // com.izettle.android.auth.TokenRepository
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> storeTokens(final com.izettle.android.auth.model.OAuthTokens oAuthTokens, final boolean isNative) {
        com.izettle.android.auth.dto.Jwt decodeAsJwtOrNull;
        com.izettle.android.auth.dto.JwtUser user;
        java.lang.String userId;
        com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> runIfCanonicalToResultOtherwiseFail;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokens, "");
        kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends kotlin.Unit, ? extends java.lang.Throwable>> function0 = new kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends kotlin.Unit, ? extends java.lang.Throwable>>() { // from class: com.izettle.android.auth.TokenRepositoryImpl$storeTokens$storageAction$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> invoke() {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
                com.izettle.android.core.data.result.Success asSuccess;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3;
                java.lang.String refreshToken = com.izettle.android.auth.model.OAuthTokens.this.getRefreshToken();
                if (refreshToken != null) {
                    asSuccess = this.persistRefreshToken(refreshToken, isNative);
                    com.izettle.android.auth.TokenRepositoryImpl tokenRepositoryImpl = this;
                    com.izettle.android.auth.model.OAuthTokens oAuthTokens2 = com.izettle.android.auth.model.OAuthTokens.this;
                    if (asSuccess instanceof com.izettle.android.core.data.result.Success) {
                        copyOnWriteArrayList3 = tokenRepositoryImpl.tokenPairs;
                        copyOnWriteArrayList3.add(oAuthTokens2);
                    }
                } else {
                    copyOnWriteArrayList = this.tokenPairs;
                    copyOnWriteArrayList.add(com.izettle.android.auth.model.OAuthTokens.this);
                    asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(kotlin.Unit.INSTANCE);
                }
                com.izettle.android.auth.TokenRepositoryImpl tokenRepositoryImpl2 = this;
                if (asSuccess instanceof com.izettle.android.core.data.result.Success) {
                    copyOnWriteArrayList2 = tokenRepositoryImpl2.tokenPairs;
                    tokenRepositoryImpl2.info(com.izettle.android.auth.log.StackTraceKt.withStackTrace(com.izettle.android.auth.model.OAuthTokensKt.withUserIdAndRedactedTokens(copyOnWriteArrayList2)));
                }
                com.izettle.android.auth.TokenRepositoryImpl tokenRepositoryImpl3 = this;
                if (asSuccess instanceof com.izettle.android.core.data.result.Failure) {
                    tokenRepositoryImpl3.error("Failed to store tokens", (java.lang.Throwable) ((com.izettle.android.core.data.result.Failure) asSuccess).getError());
                }
                return asSuccess;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        };
        java.lang.String accessToken = oAuthTokens.getAccessToken();
        return (accessToken == null || (decodeAsJwtOrNull = com.izettle.android.auth.dto.JwtKt.decodeAsJwtOrNull(accessToken)) == null || (user = decodeAsJwtOrNull.getUser()) == null || (userId = user.getUserId()) == null || (runIfCanonicalToResultOtherwiseFail = com.izettle.android.auth.storage.AuthStorageKt.runIfCanonicalToResultOtherwiseFail(this.authStorage, userId, function0)) == null) ? (com.izettle.android.core.data.result.Result) function0.invoke() : runIfCanonicalToResultOtherwiseFail;
    }

    @Override // com.izettle.android.auth.TokenRepository
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> deleteRefreshToken() {
        com.izettle.android.auth.storage.Transaction beginTransaction = this.authStorage.beginTransaction();
        deleteRefreshToken(beginTransaction);
        com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> commit = beginTransaction.commit();
        if (commit instanceof com.izettle.android.core.data.result.Success) {
            java.util.concurrent.CopyOnWriteArrayList<com.izettle.android.auth.model.OAuthTokens> copyOnWriteArrayList = this.tokenPairs;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : copyOnWriteArrayList) {
                if (((com.izettle.android.auth.model.OAuthTokens) obj).getRefreshToken() != null) {
                    arrayList.add(obj);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
        if (commit instanceof com.izettle.android.core.data.result.Failure) {
            error((java.lang.Throwable) ((com.izettle.android.core.data.result.Failure) commit).getError());
        }
        return commit;
    }

    @Override // com.izettle.android.auth.TokenRepository
    public final java.util.List<com.izettle.android.auth.model.OAuthTokens> getTokens() {
        return this.tokenPairs;
    }

    @Override // com.izettle.android.auth.TokenRepository
    public final void deleteAccessToken(java.lang.String token) {
        java.util.concurrent.CopyOnWriteArrayList<com.izettle.android.auth.model.OAuthTokens> copyOnWriteArrayList = this.tokenPairs;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : copyOnWriteArrayList) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.izettle.android.auth.model.OAuthTokens) obj).getAccessToken(), token)) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    @Override // com.izettle.android.auth.TokenRepository
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> clear() {
        com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> deleteRefreshToken = deleteRefreshToken();
        if (deleteRefreshToken instanceof com.izettle.android.core.data.result.Success) {
            this.tokenPairs.clear();
        }
        return deleteRefreshToken;
    }

    @Override // com.izettle.android.auth.TokenRepository
    public final void applyClearToTransaction(com.izettle.android.auth.storage.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        deleteRefreshToken(transaction);
        transaction.registerSuccessfulListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.izettle.android.auth.TokenRepositoryImpl$applyClearToTransaction$1
            public final void getHighResolutionOutputSizeshNQ4ISI() {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
                copyOnWriteArrayList = com.izettle.android.auth.TokenRepositoryImpl.this.tokenPairs;
                copyOnWriteArrayList.clear();
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighResolutionOutputSizeshNQ4ISI();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        });
        transaction.registerFailureListener(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.izettle.android.auth.TokenRepositoryImpl$applyClearToTransaction$2
            public final void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                com.izettle.android.auth.TokenRepositoryImpl.this.error("Failed to clear tokens", th);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoFpsRangesFor(th);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        });
    }

    @Override // com.izettle.android.auth.TokenRepository
    public final void applyStoreCanonicalTokensToTransaction(com.izettle.android.auth.storage.Transaction transaction, com.izettle.android.auth.model.OAuthTokens oAuthTokens, boolean isNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokens, "");
        applyClearToTransaction(transaction);
        applyStoreTokensToTransaction(transaction, oAuthTokens, isNative);
    }
}
