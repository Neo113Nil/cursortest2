package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!"}, d2 = {"Lcom/izettle/android/auth/tasks/VerifyTask;", "Lcom/izettle/android/auth/tasks/OAuthAuthTask;", "Lcom/izettle/android/auth/VerifySpec;", "", "taskId", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager", "Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/OAuthUriManager;", "oAuthUriManager", "Lcom/izettle/android/auth/AuthWebLauncher;", "authWebLauncher", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "<init>", "(Ljava/lang/String;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/repository/UserConfigRepository;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/log/LogFileManager;Lcom/izettle/android/auth/executor/Executor;Lcom/izettle/android/auth/OAuthUriManager;Lcom/izettle/android/auth/AuthWebLauncher;Lcom/izettle/android/auth/ClientDataProvider;)V", "Lcom/izettle/android/auth/model/OAuthTokens;", "tokenPair", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/AuthData;", "", "finalizeTask", "(Lcom/izettle/android/auth/model/OAuthTokens;)Lcom/izettle/android/core/data/result/Result;", "authSpec", "Lcom/izettle/android/auth/OAuthUriSpec;", "getAuthUriSpec", "(Lcom/izettle/android/auth/VerifySpec;)Lcom/izettle/android/auth/OAuthUriSpec;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VerifyTask extends com.izettle.android.auth.tasks.OAuthAuthTask<com.izettle.android.auth.VerifySpec> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyTask(java.lang.String str, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.log.LogFileManager logFileManager, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.OAuthUriManager oAuthUriManager, com.izettle.android.auth.AuthWebLauncher authWebLauncher, com.izettle.android.auth.ClientDataProvider clientDataProvider) {
        super(str, tokenManager, userConfigRepository, authStorage, logFileManager, executor, oAuthUriManager, authWebLauncher, clientDataProvider);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logFileManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthUriManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authWebLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
    }

    @Override // com.izettle.android.auth.tasks.OAuthAuthTask
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, java.lang.Throwable> finalizeTask(com.izettle.android.auth.model.OAuthTokens tokenPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenPair, "");
        com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, java.lang.Throwable> userConfig$default = com.izettle.android.auth.repository.UserConfigRepository.DefaultImpls.getUserConfig$default(getUserConfigRepository(), null, 1, null);
        if (userConfig$default instanceof com.izettle.android.core.data.result.Success) {
            com.zettle.android.entities.UserConfig userConfig = (com.zettle.android.entities.UserConfig) ((com.izettle.android.core.data.result.Success) userConfig$default).getValue();
            getTokenManager().storeTokenPair(tokenPair, false);
            return new com.izettle.android.core.data.result.Success(new com.izettle.android.auth.model.AuthData(tokenPair, userConfig));
        }
        if (userConfig$default instanceof com.izettle.android.core.data.result.Failure) {
            return userConfig$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.tasks.OAuthAuthTask
    public final com.izettle.android.auth.OAuthUriSpec getAuthUriSpec(com.izettle.android.auth.VerifySpec authSpec) {
        java.util.Locale locale;
        com.zettle.android.entities.UserInfo userInfo;
        com.zettle.android.entities.UserInfo userInfo2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSpec, "");
        java.lang.String str = null;
        java.lang.String encode$default = com.izettle.android.auth.tasks.OAuthParamsKt.encode$default(new com.izettle.android.auth.tasks.OAuthState(getTaskId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(authSpec.getActivity().getClass())), null, 1, null);
        com.zettle.android.entities.UserConfig userConfig = (com.zettle.android.entities.UserConfig) com.izettle.android.core.data.result.ResultKt.getOrNull(com.izettle.android.auth.repository.UserConfigRepository.DefaultImpls.getUserConfig$default(getUserConfigRepository(), null, 1, null));
        com.izettle.android.auth.OAuthUriSpec.Builder type = com.izettle.android.auth.OAuthUriSpec.INSTANCE.invoke().setType(com.izettle.android.auth.OAuthUriType.VERIFY);
        java.lang.String[] scopes = authSpec.getScopes();
        com.izettle.android.auth.OAuthUriSpec.Builder addScopes = type.addScopes((java.lang.String[]) java.util.Arrays.copyOf(scopes, scopes.length));
        kotlin.Pair[] pairArr = (kotlin.Pair[]) kotlin.collections.MapsKt.toList(authSpec.getQueryParams()).toArray(new kotlin.Pair[0]);
        com.izettle.android.auth.OAuthUriSpec.Builder addExtraQueryParams = addScopes.addExtraQueryParams((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        if (userConfig != null && (userInfo2 = userConfig.getUserInfo()) != null) {
            str = userInfo2.getEmailAddress();
        }
        com.izettle.android.auth.OAuthUriSpec.Builder username = addExtraQueryParams.setUsername(str);
        if (userConfig == null || (userInfo = userConfig.getUserInfo()) == null || (locale = userInfo.getTerminalLocale()) == null) {
            locale = java.util.Locale.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(locale);
        return username.setLocale(locale).setState(encode$default).build();
    }
}
