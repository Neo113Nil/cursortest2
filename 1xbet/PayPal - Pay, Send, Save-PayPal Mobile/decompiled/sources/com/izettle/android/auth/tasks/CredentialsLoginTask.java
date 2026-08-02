package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/izettle/android/auth/tasks/CredentialsLoginTask;", "Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "Lcom/izettle/android/auth/CredentialsLoginSpec;", "", "taskId", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager", "Lcom/izettle/android/auth/executor/Executor;", "executor", "<init>", "(Ljava/lang/String;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/repository/UserConfigRepository;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/LogFileManager;Lcom/izettle/android/auth/executor/Executor;)V", "authSpec", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Lcom/izettle/android/auth/CredentialsLoginSpec;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CredentialsLoginTask extends com.izettle.android.auth.tasks.AbstractAuthTask<com.izettle.android.auth.CredentialsLoginSpec> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialsLoginTask(java.lang.String str, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.LogFileManager logFileManager, com.izettle.android.auth.executor.Executor executor) {
        super(str, tokenManager, userConfigRepository, authStorage, logFileManager, executor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logFileManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
    }

    @Override // com.izettle.android.auth.tasks.AbstractAuthTask
    public final void start(final com.izettle.android.auth.CredentialsLoginSpec authSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSpec, "");
        getExecutor().execute(new kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>>() { // from class: com.izettle.android.auth.tasks.CredentialsLoginTask$start$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, java.lang.Throwable> invoke() {
                com.izettle.android.core.data.result.Result tokens = com.izettle.android.auth.tasks.CredentialsLoginTask.this.getTokenManager().getTokens(com.izettle.android.auth.token.CredentialsGetTokenSpec.INSTANCE.invoke().setUsername(authSpec.getUsername()).setPassword(authSpec.getPassword()).setUserUuid(authSpec.getUserUuid()).setTotp(authSpec.getTotp()).build());
                com.izettle.android.auth.tasks.CredentialsLoginTask credentialsLoginTask = com.izettle.android.auth.tasks.CredentialsLoginTask.this;
                if (tokens instanceof com.izettle.android.core.data.result.Success) {
                    com.izettle.android.auth.model.OAuthTokens oAuthTokens = (com.izettle.android.auth.model.OAuthTokens) ((com.izettle.android.core.data.result.Success) tokens).getValue();
                    com.izettle.android.core.data.result.Result userConfigWithRawData = credentialsLoginTask.getUserConfigRepository().getUserConfigWithRawData(new com.izettle.android.auth.repository.FetchNew(oAuthTokens.getAccessToken()));
                    if (userConfigWithRawData instanceof com.izettle.android.core.data.result.Success) {
                        com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData2 = (com.izettle.android.auth.model.UserConfigWithRawData) ((com.izettle.android.core.data.result.Success) userConfigWithRawData).getValue();
                        credentialsLoginTask.syncLogFile();
                        com.izettle.android.auth.storage.Transaction beginTransaction = credentialsLoginTask.getAuthStorage().beginTransaction();
                        com.izettle.android.auth.storage.AuthStorageKt.applyCanonicalUserUuid(beginTransaction, userConfigWithRawData2.getUserConfig().getUserInfo().getUserUUID());
                        credentialsLoginTask.getTokenManager().applyStoreCanonicalTokensToTransaction(beginTransaction, oAuthTokens, true);
                        credentialsLoginTask.getUserConfigRepository().applyStoreCanonicalUserConfigToTransaction(beginTransaction, userConfigWithRawData2);
                        com.izettle.android.core.data.result.Result commit = beginTransaction.commit();
                        if (commit instanceof com.izettle.android.core.data.result.Success) {
                            return new com.izettle.android.core.data.result.Success(new com.izettle.android.auth.model.AuthData(oAuthTokens, userConfigWithRawData2.getUserConfig()));
                        }
                        if (commit instanceof com.izettle.android.core.data.result.Failure) {
                            return commit;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (userConfigWithRawData instanceof com.izettle.android.core.data.result.Failure) {
                        return userConfigWithRawData;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (tokens instanceof com.izettle.android.core.data.result.Failure) {
                    return tokens;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.izettle.android.auth.tasks.CredentialsLoginTask$start$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoFpsRangesFor(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                com.izettle.android.auth.tasks.CredentialsLoginTask.this.notifyResult(result);
            }

            {
                super(1);
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.izettle.android.auth.tasks.CredentialsLoginTask$start$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                Camera2StreamConfigurationMap(th);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                com.izettle.android.auth.tasks.CredentialsLoginTask.this.notifyResult(com.izettle.android.core.data.result.ResultKt.asFailure(th));
            }

            {
                super(1);
            }
        });
    }
}
