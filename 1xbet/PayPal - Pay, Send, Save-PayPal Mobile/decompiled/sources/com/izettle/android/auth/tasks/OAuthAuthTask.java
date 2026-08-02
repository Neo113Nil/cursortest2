package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b \u0018\u0000*\f\b\u0000\u0010\u0003*\u00020\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00028\u0000H&¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020%2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020%2\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/"}, d2 = {"Lcom/izettle/android/auth/tasks/OAuthAuthTask;", "Lcom/izettle/android/auth/AuthTaskSpec;", "Lcom/izettle/android/auth/BrowserAuthTaskSpec;", "T", "Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "", "taskId", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager", "Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/OAuthUriManager;", "oAuthUriManager", "Lcom/izettle/android/auth/AuthWebLauncher;", "authWebLauncher", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "<init>", "(Ljava/lang/String;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/repository/UserConfigRepository;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/LogFileManager;Lcom/izettle/android/auth/executor/Executor;Lcom/izettle/android/auth/OAuthUriManager;Lcom/izettle/android/auth/AuthWebLauncher;Lcom/izettle/android/auth/ClientDataProvider;)V", "Lcom/izettle/android/auth/model/OAuthTokens;", "tokenPair", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/AuthData;", "", "finalizeTask", "(Lcom/izettle/android/auth/model/OAuthTokens;)Lcom/izettle/android/core/data/result/Result;", "authSpec", "Lcom/izettle/android/auth/OAuthUriSpec;", "getAuthUriSpec", "(Lcom/izettle/android/auth/AuthTaskSpec;)Lcom/izettle/android/auth/OAuthUriSpec;", "result", "", "notifyResult", "(Lcom/izettle/android/core/data/result/Result;)V", "code", "resume", "(Ljava/lang/String;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Lcom/izettle/android/auth/AuthTaskSpec;)V", "Lcom/izettle/android/auth/AuthWebLauncher;", "Lcom/izettle/android/auth/ClientDataProvider;", "Lcom/izettle/android/auth/OAuthUriManager;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class OAuthAuthTask<T extends com.izettle.android.auth.AuthTaskSpec & com.izettle.android.auth.BrowserAuthTaskSpec> extends com.izettle.android.auth.tasks.AbstractAuthTask<T> {
    private final com.izettle.android.auth.AuthWebLauncher authWebLauncher;
    private final com.izettle.android.auth.ClientDataProvider clientDataProvider;
    private final com.izettle.android.auth.OAuthUriManager oAuthUriManager;

    public abstract com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, java.lang.Throwable> finalizeTask(com.izettle.android.auth.model.OAuthTokens tokenPair);

    public abstract com.izettle.android.auth.OAuthUriSpec getAuthUriSpec(T authSpec);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAuthAuthTask(java.lang.String str, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.LogFileManager logFileManager, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.OAuthUriManager oAuthUriManager, com.izettle.android.auth.AuthWebLauncher authWebLauncher, com.izettle.android.auth.ClientDataProvider clientDataProvider) {
        super(str, tokenManager, userConfigRepository, authStorage, logFileManager, executor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logFileManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthUriManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authWebLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
        this.oAuthUriManager = oAuthUriManager;
        this.authWebLauncher = authWebLauncher;
        this.clientDataProvider = clientDataProvider;
    }

    @Override // com.izettle.android.auth.tasks.AbstractAuthTask
    public void start(final T authSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSpec, "");
        getExecutor().execute(new kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends android.net.Uri, ? extends java.lang.Throwable>>() { // from class: com.izettle.android.auth.tasks.OAuthAuthTask$start$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final com.izettle.android.core.data.result.Result<android.net.Uri, java.lang.Throwable> invoke() {
                com.izettle.android.auth.OAuthUriManager oAuthUriManager;
                oAuthUriManager = ((com.izettle.android.auth.tasks.OAuthAuthTask) com.izettle.android.auth.tasks.OAuthAuthTask.this).oAuthUriManager;
                return oAuthUriManager.createOAuthUriAndStoreCodeVerifier(com.izettle.android.auth.tasks.OAuthAuthTask.this.getTaskId(), com.izettle.android.auth.tasks.OAuthAuthTask.this.getAuthUriSpec(authSpec));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Lcom/izettle/android/auth/tasks/OAuthAuthTask<TT;>;TT;)V */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends android.net.Uri, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.izettle.android.auth.tasks.OAuthAuthTask$start$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends android.net.Uri, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoFpsRanges(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.izettle.android.core.data.result.Result<? extends android.net.Uri, ? extends java.lang.Throwable> result) {
                com.izettle.android.auth.AuthWebLauncher authWebLauncher;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    authWebLauncher = ((com.izettle.android.auth.tasks.OAuthAuthTask) com.izettle.android.auth.tasks.OAuthAuthTask.this).authWebLauncher;
                    authWebLauncher.launchContainerActivity(((com.izettle.android.auth.BrowserAuthTaskSpec) authSpec).getActivity(), (android.net.Uri) ((com.izettle.android.core.data.result.Success) result).getValue(), com.izettle.android.auth.tasks.OAuthAuthTask.this.getTaskId(), ((com.izettle.android.auth.BrowserAuthTaskSpec) authSpec).getToolbarColor());
                } else if (result instanceof com.izettle.android.core.data.result.Failure) {
                    com.izettle.android.auth.tasks.OAuthAuthTask.this.notifyResult(result);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Lcom/izettle/android/auth/tasks/OAuthAuthTask<TT;>;TT;)V */
            {
                super(1);
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>(this) { // from class: com.izettle.android.auth.tasks.OAuthAuthTask$start$3
            final /* synthetic */ com.izettle.android.auth.tasks.OAuthAuthTask<T> getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoSizes(th);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.getHighSpeedVideoSizes.notifyResult(com.izettle.android.core.data.result.ResultKt.asFailure(th));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    @Override // com.izettle.android.auth.tasks.AbstractAuthTask
    public void resume(final java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        getExecutor().execute(new kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>>(this) { // from class: com.izettle.android.auth.tasks.OAuthAuthTask$resume$1
            final /* synthetic */ com.izettle.android.auth.tasks.OAuthAuthTask<T> Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, java.lang.Throwable> invoke() {
                com.izettle.android.auth.OAuthUriManager oAuthUriManager;
                com.izettle.android.auth.ClientDataProvider clientDataProvider;
                com.izettle.android.auth.ClientDataProvider clientDataProvider2;
                oAuthUriManager = ((com.izettle.android.auth.tasks.OAuthAuthTask) this.Camera2StreamConfigurationMap).oAuthUriManager;
                java.lang.String codeVerifier = oAuthUriManager.getCodeVerifier(this.Camera2StreamConfigurationMap.getTaskId());
                if (codeVerifier == null) {
                    return com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalStateException("Invalid session"));
                }
                com.izettle.android.auth.token.OAuthGetTokensSpec.Builder code2 = com.izettle.android.auth.token.OAuthGetTokensSpec.INSTANCE.invoke().setCode(code);
                clientDataProvider = ((com.izettle.android.auth.tasks.OAuthAuthTask) this.Camera2StreamConfigurationMap).clientDataProvider;
                com.izettle.android.auth.token.OAuthGetTokensSpec.Builder clientId = code2.setClientId(clientDataProvider.getClientId());
                clientDataProvider2 = ((com.izettle.android.auth.tasks.OAuthAuthTask) this.Camera2StreamConfigurationMap).clientDataProvider;
                com.izettle.android.core.data.result.Result tokens = this.Camera2StreamConfigurationMap.getTokenManager().getTokens(clientId.setRedirectUri(clientDataProvider2.getOAuthCallbackUrl()).setCodeVerifier(codeVerifier).build());
                com.izettle.android.auth.tasks.OAuthAuthTask<T> oAuthAuthTask = this.Camera2StreamConfigurationMap;
                if (tokens instanceof com.izettle.android.core.data.result.Success) {
                    return oAuthAuthTask.finalizeTask((com.izettle.android.auth.model.OAuthTokens) ((com.izettle.android.core.data.result.Success) tokens).getValue());
                }
                if (tokens instanceof com.izettle.android.core.data.result.Failure) {
                    return tokens;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.Camera2StreamConfigurationMap = this;
            }
        }, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit>(this) { // from class: com.izettle.android.auth.tasks.OAuthAuthTask$resume$2
            final /* synthetic */ com.izettle.android.auth.tasks.OAuthAuthTask<T> getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoFpsRanges(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                this.getHighResolutionOutputSizeshNQ4ISI.notifyResult(result);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>(this) { // from class: com.izettle.android.auth.tasks.OAuthAuthTask$resume$3
            final /* synthetic */ com.izettle.android.auth.tasks.OAuthAuthTask<T> getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                Camera2StreamConfigurationMap(th);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.getHighSpeedVideoSizes.notifyResult(com.izettle.android.core.data.result.ResultKt.asFailure(th));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    @Override // com.izettle.android.auth.tasks.AbstractAuthTask
    protected void notifyResult(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        super.notifyResult(result);
        this.oAuthUriManager.deleteCodeVerifier(getTaskId());
    }
}
