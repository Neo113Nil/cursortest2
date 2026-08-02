package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\u00020\b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/AuthConfigConnectionToken;", "Lcom/zettle/sdk/AuthConfigType;", "<init>", "()V", "Lcom/zettle/sdk/core/auth/TokenProvider;", "getProvider$core_publicRelease", "()Lcom/zettle/sdk/core/auth/TokenProvider;", "provider", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "scopeProvider", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "getScopeProvider$core_publicRelease", "()Lcom/zettle/sdk/core/auth/ScopeProvider;", "setScopeProvider$core_publicRelease", "(Lcom/zettle/sdk/core/auth/ScopeProvider;)V", "Lcom/zettle/sdk/core/auth/ConnectionTokenProvider;", "tokenProvider", "Lcom/zettle/sdk/core/auth/ConnectionTokenProvider;", "getTokenProvider", "()Lcom/zettle/sdk/core/auth/ConnectionTokenProvider;", "setTokenProvider", "(Lcom/zettle/sdk/core/auth/ConnectionTokenProvider;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AuthConfigConnectionToken implements com.zettle.sdk.AuthConfigType {
    private com.zettle.sdk.core.auth.ScopeProvider scopeProvider = com.zettle.sdk.core.auth.ScopeProviderKt.getDefaultScopeProvider();
    private com.zettle.sdk.core.auth.ConnectionTokenProvider tokenProvider;

    public final com.zettle.sdk.core.auth.ConnectionTokenProvider getTokenProvider() {
        return this.tokenProvider;
    }

    public final void setTokenProvider(com.zettle.sdk.core.auth.ConnectionTokenProvider connectionTokenProvider) {
        this.tokenProvider = connectionTokenProvider;
    }

    /* renamed from: getScopeProvider$core_publicRelease, reason: from getter */
    public final com.zettle.sdk.core.auth.ScopeProvider getScopeProvider() {
        return this.scopeProvider;
    }

    public final void setScopeProvider$core_publicRelease(com.zettle.sdk.core.auth.ScopeProvider scopeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeProvider, "");
        this.scopeProvider = scopeProvider;
    }

    public final com.zettle.sdk.core.auth.TokenProvider getProvider$core_publicRelease() {
        com.zettle.sdk.core.auth.ConnectionTokenProvider connectionTokenProvider = this.tokenProvider;
        if (connectionTokenProvider != null) {
            return connectionTokenProvider;
        }
        throw new java.lang.AssertionError("tokenProvider must be set");
    }
}
