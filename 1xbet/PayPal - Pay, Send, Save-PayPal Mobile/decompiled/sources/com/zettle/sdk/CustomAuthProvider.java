package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/CustomAuthProvider;", "Lcom/zettle/sdk/core/auth/TokenProviderSuspending;", "<init>", "()V", "", "", "scopes", "Lcom/zettle/sdk/core/auth/OAuthTokens;", "provideTokens", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CustomAuthProvider implements com.zettle.sdk.core.auth.TokenProviderSuspending {
    public static final com.zettle.sdk.CustomAuthProvider INSTANCE = new com.zettle.sdk.CustomAuthProvider();

    private CustomAuthProvider() {
    }

    @Override // com.zettle.sdk.core.auth.TokenProviderSuspending
    public final java.lang.Object provideTokens(java.lang.String[] strArr, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.OAuthTokens> continuation) {
        return new com.zettle.sdk.core.auth.OAuthTokens(null, null, 0L);
    }
}
