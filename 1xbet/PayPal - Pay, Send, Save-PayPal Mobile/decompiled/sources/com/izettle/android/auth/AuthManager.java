package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 '2\u00020\u0001:\u0001'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u00020\u00042 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0004\u0012\u00020\u00040\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u0018H&¢\u0006\u0004\b\u001e\u0010\u001bJ#\u0010 \u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u0018H&¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u0018H&¢\u0006\u0004\b%\u0010\u001bJ#\u0010&\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u0018H&¢\u0006\u0004\b&\u0010\u001b"}, d2 = {"Lcom/izettle/android/auth/AuthManager;", "", "", "taskId", "", "cancelAuthTask", "(Ljava/lang/String;)V", "Lcom/izettle/android/auth/tasks/OAuthParams;", "oAuthParams", "Lcom/izettle/android/auth/tasks/AuthTask;", "continueAuthTask", "(Lcom/izettle/android/auth/tasks/OAuthParams;)Lcom/izettle/android/auth/tasks/AuthTask;", "Lcom/izettle/android/auth/BrowserAuthTaskSpec;", "browserAuthTaskSpec", "Lcom/izettle/android/core/data/result/Result;", "Landroid/net/Uri;", "", "getBrowserUriFromSpec", "(Lcom/izettle/android/auth/BrowserAuthTaskSpec;)Lcom/izettle/android/core/data/result/Result;", "", "isLoggedIn", "()Z", "logout", "()Lcom/izettle/android/core/data/result/Result;", "Lkotlin/Function1;", "onComplete", "logoutAsync", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/izettle/android/auth/AuthState;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerAuthStateUpdateListener", "Lcom/izettle/android/auth/tasks/RestoredAuthTaskResultInfo;", "registerRestoredAuthTaskResultListener", "Lcom/izettle/android/auth/AuthTaskSpec;", "authTaskSpec", "startAuthTask", "(Lcom/izettle/android/auth/AuthTaskSpec;)Lcom/izettle/android/auth/tasks/AuthTask;", "unregisterAuthStateUpdateListener", "unregisterRestoredAuthTaskResultListener", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AuthManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.AuthManager.Companion INSTANCE = com.izettle.android.auth.AuthManager.Companion.$$INSTANCE;

    void cancelAuthTask(java.lang.String taskId);

    com.izettle.android.auth.tasks.AuthTask continueAuthTask(com.izettle.android.auth.tasks.OAuthParams oAuthParams);

    com.izettle.android.core.data.result.Result<android.net.Uri, java.lang.Throwable> getBrowserUriFromSpec(com.izettle.android.auth.BrowserAuthTaskSpec browserAuthTaskSpec);

    boolean isLoggedIn();

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> logout();

    void logoutAsync(kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<kotlin.Unit, ? extends java.lang.Throwable>, kotlin.Unit> onComplete);

    void registerAuthStateUpdateListener(kotlin.jvm.functions.Function1<? super com.izettle.android.auth.AuthState, kotlin.Unit> listener);

    void registerRestoredAuthTaskResultListener(kotlin.jvm.functions.Function1<? super com.izettle.android.auth.tasks.RestoredAuthTaskResultInfo, kotlin.Unit> listener);

    com.izettle.android.auth.tasks.AuthTask startAuthTask(com.izettle.android.auth.AuthTaskSpec authTaskSpec);

    void unregisterAuthStateUpdateListener(kotlin.jvm.functions.Function1<? super com.izettle.android.auth.AuthState, kotlin.Unit> listener);

    void unregisterRestoredAuthTaskResultListener(kotlin.jvm.functions.Function1<? super com.izettle.android.auth.tasks.RestoredAuthTaskResultInfo, kotlin.Unit> listener);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logoutAsync$default(com.izettle.android.auth.AuthManager authManager, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logoutAsync");
            }
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends kotlin.Unit, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.izettle.android.auth.AuthManager$logoutAsync$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends kotlin.Unit, ? extends java.lang.Throwable> result) {
                        getHighSpeedVideoFpsRangesFor(result);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.core.data.result.Result<kotlin.Unit, ? extends java.lang.Throwable> result) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    }
                };
            }
            authManager.logoutAsync(function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/izettle/android/auth/AuthManager$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/OAuthUriManager;", "oAuthUriManager", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository", "Lcom/izettle/android/auth/AuthWebLauncher;", "authWebLauncher", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager", "Lcom/izettle/android/auth/log/Logger;", "logger", "Lcom/izettle/android/auth/tasks/AuthTaskRegistry;", "taskRegistry", "Lcom/izettle/android/auth/tasks/AbstractAuthTaskFactory;", "abstractAuthTaskFactory", "Lcom/izettle/android/auth/AuthManager;", "create", "(Lcom/izettle/android/auth/executor/Executor;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/OAuthUriManager;Lcom/izettle/android/auth/repository/UserConfigRepository;Lcom/izettle/android/auth/AuthWebLauncher;Lcom/izettle/android/auth/ClientDataProvider;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/LogFileManager;Lcom/izettle/android/auth/log/Logger;Lcom/izettle/android/auth/tasks/AuthTaskRegistry;Lcom/izettle/android/auth/tasks/AbstractAuthTaskFactory;)Lcom/izettle/android/auth/AuthManager;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.AuthManager.Companion $$INSTANCE = new com.izettle.android.auth.AuthManager.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.AuthManager create(com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.OAuthUriManager oAuthUriManager, com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.AuthWebLauncher authWebLauncher, com.izettle.android.auth.ClientDataProvider clientDataProvider, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.LogFileManager logFileManager, com.izettle.android.auth.log.Logger logger, com.izettle.android.auth.tasks.AuthTaskRegistry taskRegistry, com.izettle.android.auth.tasks.AbstractAuthTaskFactory abstractAuthTaskFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthUriManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authWebLauncher, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logFileManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRegistry, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractAuthTaskFactory, "");
            return new com.izettle.android.auth.AuthManagerImpl(executor, tokenManager, oAuthUriManager, userConfigRepository, taskRegistry, abstractAuthTaskFactory, authStorage, logFileManager, logger);
        }
    }
}
