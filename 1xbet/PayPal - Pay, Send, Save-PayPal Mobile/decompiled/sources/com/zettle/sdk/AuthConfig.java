package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\"\u0010\u0013\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/AuthConfig;", "Lcom/zettle/sdk/AuthConfigType;", "<init>", "()V", "", "clientId", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "Lcom/zettle/sdk/core/auth/TokenProvider;", "getProvider$core_publicRelease", "()Lcom/zettle/sdk/core/auth/TokenProvider;", "provider", "redirectUrl", "getRedirectUrl", "setRedirectUrl", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "scopeProvider", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "getScopeProvider", "()Lcom/zettle/sdk/core/auth/ScopeProvider;", "setScopeProvider", "(Lcom/zettle/sdk/core/auth/ScopeProvider;)V", "tokenProvider", "Lcom/zettle/sdk/core/auth/TokenProvider;", "getTokenProvider", "setTokenProvider", "(Lcom/zettle/sdk/core/auth/TokenProvider;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AuthConfig implements com.zettle.sdk.AuthConfigType {
    private java.lang.String clientId;
    private java.lang.String redirectUrl;
    private com.zettle.sdk.core.auth.ScopeProvider scopeProvider = com.zettle.sdk.core.auth.ScopeProviderKt.getDefaultScopeProvider();
    private com.zettle.sdk.core.auth.TokenProvider tokenProvider;

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final void setClientId(java.lang.String str) {
        this.clientId = str;
    }

    public final java.lang.String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(java.lang.String str) {
        this.redirectUrl = str;
    }

    public final com.zettle.sdk.core.auth.TokenProvider getTokenProvider() {
        return this.tokenProvider;
    }

    public final void setTokenProvider(com.zettle.sdk.core.auth.TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    public final com.zettle.sdk.core.auth.ScopeProvider getScopeProvider() {
        return this.scopeProvider;
    }

    public final void setScopeProvider(com.zettle.sdk.core.auth.ScopeProvider scopeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeProvider, "");
        this.scopeProvider = scopeProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.zettle.sdk.core.auth.TokenProvider getProvider$core_publicRelease() {
        com.zettle.sdk.core.auth.TokenProvider tokenProvider = this.tokenProvider;
        if (tokenProvider != null) {
            return tokenProvider;
        }
        return new com.zettle.sdk.DefaultAuthProvider(null, 1, 0 == true ? 1 : 0);
    }
}
