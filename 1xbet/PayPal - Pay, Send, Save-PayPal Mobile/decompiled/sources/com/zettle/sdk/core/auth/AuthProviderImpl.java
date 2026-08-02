package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001f0\u001dH\u0016¢\u0006\u0004\b%\u0010#J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0&2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J7\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthProviderImpl;", "Lcom/zettle/sdk/core/auth/AuthProvider;", "Lcom/izettle/android/auth/ZettleAuth;", "auth", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "scopeProvider", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;Lcom/zettle/sdk/core/auth/ScopeProvider;)V", "", "", "scopes", "Lkotlin/Function1;", "", "", "onResult", "containsScopes", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "exact", "getAccessTokenOrNull", "(Lcom/zettle/sdk/commons/network/Scope;Z)Ljava/lang/String;", "onComplete", "getAccessTokenOrNullAsync", "(Lcom/zettle/sdk/commons/network/Scope;ZLkotlin/jvm/functions/Function1;)V", "isLoggedIn", "()Z", "Lcom/izettle/android/auth/LoginSpec;", "loginSpec", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/AuthData;", "", "login", "(Lcom/izettle/android/auth/LoginSpec;Lkotlin/jvm/functions/Function1;)V", "logout", "()Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/OAuthTokens;", "refreshAccessToken", "", "resolveScopes", "(Lcom/zettle/sdk/commons/network/Scope;)[Ljava/lang/String;", "Lcom/izettle/android/auth/VerifySpec;", "verifySpec", "verify", "(Lcom/izettle/android/auth/VerifySpec;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/izettle/android/auth/ZettleAuth;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/auth/ScopeProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AuthProviderImpl implements com.zettle.sdk.core.auth.AuthProvider {
    private final com.zettle.sdk.core.auth.ScopeProvider getHighSpeedVideoFpsRanges;
    private final com.izettle.android.auth.ZettleAuth getHighSpeedVideoFpsRangesFor;

    public AuthProviderImpl(com.izettle.android.auth.ZettleAuth zettleAuth, com.zettle.sdk.core.auth.ScopeProvider scopeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeProvider, "");
        this.getHighSpeedVideoFpsRangesFor = zettleAuth;
        this.getHighSpeedVideoFpsRanges = scopeProvider;
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final void getAccessTokenOrNullAsync(com.zettle.sdk.commons.network.Scope scope, boolean exact, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onComplete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "");
        com.izettle.android.auth.ZettleAuth zettleAuth = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String[] invoke = this.getHighSpeedVideoFpsRanges.invoke(scope);
        zettleAuth.getAccessTokenOrNullAsync((java.lang.String[]) java.util.Arrays.copyOf(invoke, invoke.length), exact, onComplete);
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final void verify(com.izettle.android.auth.VerifySpec verifySpec, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifySpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        this.getHighSpeedVideoFpsRangesFor.verify(verifySpec, onResult);
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final void containsScopes(final java.util.List<java.lang.String> scopes, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        com.izettle.android.auth.ZettleAuth.DefaultImpls.getAccessTokenOrNullAsync$default(this.getHighSpeedVideoFpsRangesFor, new java.lang.String[0], false, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.AuthProviderImpl$containsScopes$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                Camera2StreamConfigurationMap(str);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(java.lang.String str) {
                com.izettle.android.auth.dto.Jwt decodeAsJwtOrNull;
                java.util.List<java.lang.String> scopes2;
                onResult.invoke(java.lang.Boolean.valueOf((str == null || (decodeAsJwtOrNull = com.izettle.android.auth.dto.JwtKt.decodeAsJwtOrNull(str)) == null || (scopes2 = decodeAsJwtOrNull.getScopes()) == null) ? false : scopes2.containsAll(scopes)));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }, 2, null);
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final void login(com.izettle.android.auth.LoginSpec loginSpec, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        this.getHighSpeedVideoFpsRangesFor.login(loginSpec, onResult);
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> logout() {
        return this.getHighSpeedVideoFpsRangesFor.logout();
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final boolean isLoggedIn() {
        return this.getHighSpeedVideoFpsRangesFor.isLoggedIn();
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> refreshAccessToken() {
        return this.getHighSpeedVideoFpsRangesFor.refreshAccessToken();
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final java.lang.String getAccessTokenOrNull(com.zettle.sdk.commons.network.Scope scope, boolean exact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        com.izettle.android.auth.ZettleAuth zettleAuth = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String[] invoke = this.getHighSpeedVideoFpsRanges.invoke(scope);
        return zettleAuth.getAccessTokenOrNull((java.lang.String[]) java.util.Arrays.copyOf(invoke, invoke.length), exact);
    }

    @Override // com.zettle.sdk.core.auth.AuthProvider
    public final java.lang.String[] resolveScopes(com.zettle.sdk.commons.network.Scope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        return this.getHighSpeedVideoFpsRanges.invoke(scope);
    }
}
