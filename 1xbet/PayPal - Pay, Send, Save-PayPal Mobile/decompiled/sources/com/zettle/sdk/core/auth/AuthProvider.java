package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 '2\u00020\u0001:\u0001'J1\u0010\t\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\"J7\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b%\u0010&"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthProvider;", "", "", "", "scopes", "Lkotlin/Function1;", "", "", "onResult", "containsScopes", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "exact", "getAccessTokenOrNull", "(Lcom/zettle/sdk/commons/network/Scope;Z)Ljava/lang/String;", "onComplete", "getAccessTokenOrNullAsync", "(Lcom/zettle/sdk/commons/network/Scope;ZLkotlin/jvm/functions/Function1;)V", "isLoggedIn", "()Z", "Lcom/izettle/android/auth/LoginSpec;", "loginSpec", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/AuthData;", "", "login", "(Lcom/izettle/android/auth/LoginSpec;Lkotlin/jvm/functions/Function1;)V", "logout", "()Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/OAuthTokens;", "refreshAccessToken", "", "resolveScopes", "(Lcom/zettle/sdk/commons/network/Scope;)[Ljava/lang/String;", "Lcom/izettle/android/auth/VerifySpec;", "verifySpec", "verify", "(Lcom/izettle/android/auth/VerifySpec;Lkotlin/jvm/functions/Function1;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AuthProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.auth.AuthProvider.Companion INSTANCE = com.zettle.sdk.core.auth.AuthProvider.Companion.Camera2StreamConfigurationMap;

    void containsScopes(java.util.List<java.lang.String> scopes, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult);

    java.lang.String getAccessTokenOrNull(com.zettle.sdk.commons.network.Scope scope, boolean exact);

    void getAccessTokenOrNullAsync(com.zettle.sdk.commons.network.Scope scope, boolean exact, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onComplete);

    boolean isLoggedIn();

    void login(com.izettle.android.auth.LoginSpec loginSpec, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit> onResult);

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> logout();

    com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> refreshAccessToken();

    java.lang.String[] resolveScopes(com.zettle.sdk.commons.network.Scope scope);

    void verify(com.izettle.android.auth.VerifySpec verifySpec, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit> onResult);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.String getAccessTokenOrNull$default(com.zettle.sdk.core.auth.AuthProvider authProvider, com.zettle.sdk.commons.network.Scope scope, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccessTokenOrNull");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return authProvider.getAccessTokenOrNull(scope, z);
        }

        public static /* synthetic */ void getAccessTokenOrNullAsync$default(com.zettle.sdk.core.auth.AuthProvider authProvider, com.zettle.sdk.commons.network.Scope scope, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccessTokenOrNullAsync");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            authProvider.getAccessTokenOrNullAsync(scope, z, function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthProvider$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/ZettleAuth;", "auth", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "scopeProvider", "Lcom/zettle/sdk/core/auth/AuthProvider;", "create", "(Lcom/izettle/android/auth/ZettleAuth;Lcom/zettle/sdk/core/auth/ScopeProvider;)Lcom/zettle/sdk/core/auth/AuthProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.auth.AuthProvider.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.core.auth.AuthProvider.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.core.auth.AuthProvider create(com.izettle.android.auth.ZettleAuth auth, com.zettle.sdk.core.auth.ScopeProvider scopeProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auth, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeProvider, "");
            return new com.zettle.sdk.core.auth.AuthProviderImpl(auth, scopeProvider);
        }
    }
}
