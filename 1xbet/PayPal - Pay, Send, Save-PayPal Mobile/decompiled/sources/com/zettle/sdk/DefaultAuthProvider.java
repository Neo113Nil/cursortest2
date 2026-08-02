package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/DefaultAuthProvider;", "Lcom/zettle/sdk/core/auth/TokenProviderSuspending;", "Lcom/zettle/sdk/core/auth/AuthProvider;", "authProvider", "<init>", "(Lcom/zettle/sdk/core/auth/AuthProvider;)V", "", "", "scopes", "Lcom/zettle/sdk/core/auth/OAuthTokens;", "provideTokens", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/core/auth/AuthProvider;", "getAuthProvider$core_publicRelease", "()Lcom/zettle/sdk/core/auth/AuthProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DefaultAuthProvider implements com.zettle.sdk.core.auth.TokenProviderSuspending {
    private final com.zettle.sdk.core.auth.AuthProvider authProvider;

    public DefaultAuthProvider(com.zettle.sdk.core.auth.AuthProvider authProvider) {
        this.authProvider = authProvider;
    }

    public /* synthetic */ DefaultAuthProvider(com.zettle.sdk.core.auth.AuthProvider authProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authProvider);
    }

    /* renamed from: getAuthProvider$core_publicRelease, reason: from getter */
    public final com.zettle.sdk.core.auth.AuthProvider getAuthProvider() {
        return this.authProvider;
    }

    @Override // com.zettle.sdk.core.auth.TokenProviderSuspending
    public final java.lang.Object provideTokens(java.lang.String[] strArr, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.OAuthTokens> continuation) {
        throw new java.lang.AssertionError("Unreachable state, should call ZettleAuth wrapper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAuthProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
