package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0018\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0015\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u0018\u001a\u00028\u0000\"\f\b\u0000\u0010\u0015*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u0018\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$"}, d2 = {"Lcom/izettle/android/auth/tasks/AbstractAuthTaskFactory;", "", "Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/OAuthUriManager;", "authUriManager", "Lcom/izettle/android/auth/AuthWebLauncher;", "authWebLauncher", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager", "<init>", "(Lcom/izettle/android/auth/executor/Executor;Lcom/izettle/android/auth/OAuthUriManager;Lcom/izettle/android/auth/AuthWebLauncher;Lcom/izettle/android/auth/ClientDataProvider;Lcom/izettle/android/auth/repository/UserConfigRepository;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/LogFileManager;)V", "Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "T", "", "sessionId", "create", "(Ljava/lang/String;)Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "Lkotlin/reflect/KClass;", "taskType", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "Lcom/izettle/android/auth/storage/AuthStorage;", "Lcom/izettle/android/auth/OAuthUriManager;", "Lcom/izettle/android/auth/AuthWebLauncher;", "Lcom/izettle/android/auth/ClientDataProvider;", "Lcom/izettle/android/auth/executor/Executor;", "Lcom/izettle/android/auth/log/LogFileManager;", "Lcom/izettle/android/auth/token/TokenManager;", "Lcom/izettle/android/auth/repository/UserConfigRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AbstractAuthTaskFactory {
    private final com.izettle.android.auth.storage.AuthStorage authStorage;
    private final com.izettle.android.auth.OAuthUriManager authUriManager;
    private final com.izettle.android.auth.AuthWebLauncher authWebLauncher;
    private final com.izettle.android.auth.ClientDataProvider clientDataProvider;
    private final com.izettle.android.auth.executor.Executor executor;
    private final com.izettle.android.auth.log.LogFileManager logFileManager;
    private final com.izettle.android.auth.token.TokenManager tokenManager;
    private final com.izettle.android.auth.repository.UserConfigRepository userConfigRepository;

    public AbstractAuthTaskFactory(com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.OAuthUriManager oAuthUriManager, com.izettle.android.auth.AuthWebLauncher authWebLauncher, com.izettle.android.auth.ClientDataProvider clientDataProvider, com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.LogFileManager logFileManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthUriManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authWebLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logFileManager, "");
        this.executor = executor;
        this.authUriManager = oAuthUriManager;
        this.authWebLauncher = authWebLauncher;
        this.clientDataProvider = clientDataProvider;
        this.userConfigRepository = userConfigRepository;
        this.tokenManager = tokenManager;
        this.authStorage = authStorage;
        this.logFileManager = logFileManager;
    }

    public final <T extends com.izettle.android.auth.tasks.AbstractAuthTask<?>> T create(java.lang.String sessionId, kotlin.reflect.KClass<T> taskType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(taskType, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.tasks.OAuthLoginTask.class))) {
            return new com.izettle.android.auth.tasks.OAuthLoginTask(sessionId, this.userConfigRepository, this.tokenManager, this.authStorage, this.logFileManager, this.executor, this.authUriManager, this.authWebLauncher, this.clientDataProvider);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(taskType, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.tasks.VerifyTask.class))) {
            return new com.izettle.android.auth.tasks.VerifyTask(sessionId, this.tokenManager, this.userConfigRepository, this.authStorage, this.logFileManager, this.executor, this.authUriManager, this.authWebLauncher, this.clientDataProvider);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(taskType, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.tasks.TokenLoginTask.class))) {
            return new com.izettle.android.auth.tasks.TokenLoginTask(sessionId, this.tokenManager, this.userConfigRepository, this.authStorage, this.logFileManager, this.executor);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(taskType, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.tasks.CredentialsLoginTask.class))) {
            return new com.izettle.android.auth.tasks.CredentialsLoginTask(sessionId, this.tokenManager, this.userConfigRepository, this.authStorage, this.logFileManager, this.executor);
        }
        throw new java.lang.IllegalArgumentException("Unsupported auth task type: ".concat(java.lang.String.valueOf(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) taskType).getName())));
    }

    public final /* synthetic */ <T extends com.izettle.android.auth.tasks.AbstractAuthTask<?>> T create(java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) create(sessionId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.tasks.AbstractAuthTask.class));
    }
}
