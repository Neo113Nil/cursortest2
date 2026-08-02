package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u000b\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\u00122\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u0012\u0004\u0012\u00020\u00120\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00028\u0000H&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0012H\u0004¢\u0006\u0004\b%\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000f\u001a\u00020\u000e8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\f8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R2\u00100\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u0012\u0004\u0012\u00020\u00120\u001b0/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0007\u001a\u00020\u00068\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107R\u001a\u0010\t\u001a\u00020\b8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:"}, d2 = {"Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "Lcom/izettle/android/auth/AuthTaskSpec;", "T", "Lcom/izettle/android/auth/tasks/AuthTask;", "", "taskId", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager", "Lcom/izettle/android/auth/executor/Executor;", "executor", "<init>", "(Ljava/lang/String;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/repository/UserConfigRepository;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/LogFileManager;Lcom/izettle/android/auth/executor/Executor;)V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/AuthData;", "", "result", "notifyResult", "(Lcom/izettle/android/core/data/result/Result;)V", "Lkotlin/Function1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerResultListener", "(Lkotlin/jvm/functions/Function1;)V", "code", "resume", "(Ljava/lang/String;)V", "authSpec", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Lcom/izettle/android/auth/AuthTaskSpec;)V", "syncLogFile", "Lcom/izettle/android/auth/storage/AuthStorage;", "getAuthStorage", "()Lcom/izettle/android/auth/storage/AuthStorage;", "Lcom/izettle/android/auth/executor/Executor;", "getExecutor", "()Lcom/izettle/android/auth/executor/Executor;", "Lcom/izettle/android/auth/log/LogFileManager;", "getLogFileManager", "()Lcom/izettle/android/auth/log/LogFileManager;", "", "resultListeners", "Ljava/util/List;", "Ljava/lang/String;", "getTaskId", "()Ljava/lang/String;", "Lcom/izettle/android/auth/token/TokenManager;", "getTokenManager", "()Lcom/izettle/android/auth/token/TokenManager;", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "getUserConfigRepository", "()Lcom/izettle/android/auth/repository/UserConfigRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class AbstractAuthTask<T extends com.izettle.android.auth.AuthTaskSpec> implements com.izettle.android.auth.tasks.AuthTask {
    private final com.izettle.android.auth.storage.AuthStorage authStorage;
    private final com.izettle.android.auth.executor.Executor executor;
    private final com.izettle.android.auth.log.LogFileManager logFileManager;
    private final java.util.List<kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit>> resultListeners;
    private final java.lang.String taskId;
    private final com.izettle.android.auth.token.TokenManager tokenManager;
    private final com.izettle.android.auth.repository.UserConfigRepository userConfigRepository;

    public abstract void start(T authSpec);

    public AbstractAuthTask(java.lang.String str, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.LogFileManager logFileManager, com.izettle.android.auth.executor.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logFileManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.taskId = str;
        this.tokenManager = tokenManager;
        this.userConfigRepository = userConfigRepository;
        this.authStorage = authStorage;
        this.logFileManager = logFileManager;
        this.executor = executor;
        this.resultListeners = new java.util.concurrent.CopyOnWriteArrayList();
    }

    @Override // com.izettle.android.auth.tasks.AuthTask
    public java.lang.String getTaskId() {
        return this.taskId;
    }

    protected final com.izettle.android.auth.token.TokenManager getTokenManager() {
        return this.tokenManager;
    }

    protected final com.izettle.android.auth.repository.UserConfigRepository getUserConfigRepository() {
        return this.userConfigRepository;
    }

    protected final com.izettle.android.auth.storage.AuthStorage getAuthStorage() {
        return this.authStorage;
    }

    protected final com.izettle.android.auth.log.LogFileManager getLogFileManager() {
        return this.logFileManager;
    }

    protected final com.izettle.android.auth.executor.Executor getExecutor() {
        return this.executor;
    }

    @Override // com.izettle.android.auth.tasks.AuthTask
    public void registerResultListener(kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.resultListeners.add(listener);
    }

    protected final void syncLogFile() {
        com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> tokens = this.tokenManager.getTokens(new com.izettle.android.auth.token.DefaultGetTokensSpec.Builder().build());
        if (tokens instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.auth.log.LogFileManager.syncLogFileAsync$default(this.logFileManager, ((com.izettle.android.auth.model.OAuthTokens) ((com.izettle.android.core.data.result.Success) tokens).getValue()).getAccessToken(), true, null, 4, null);
        }
    }

    protected void notifyResult(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        java.util.Iterator<T> it = this.resultListeners.iterator();
        while (it.hasNext()) {
            ((kotlin.jvm.functions.Function1) it.next()).invoke(result);
        }
        this.resultListeners.clear();
    }

    public void cancel() {
        notifyResult(com.izettle.android.core.data.result.ResultKt.asFailure(new com.izettle.android.auth.exceptions.LoginCancelledException()));
    }

    public void resume(java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
    }
}
