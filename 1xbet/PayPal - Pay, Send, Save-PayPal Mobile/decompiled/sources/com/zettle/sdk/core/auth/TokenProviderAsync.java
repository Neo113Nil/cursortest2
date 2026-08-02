package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/core/auth/TokenProviderAsync;", "Lcom/zettle/sdk/core/auth/TokenProvider;", "", "", "scopes", "Lkotlin/Function1;", "Lcom/zettle/sdk/core/auth/OAuthTokens;", "", "Lcom/zettle/sdk/core/auth/TokenProviderCallback;", com.sun.jna.Callback.METHOD_NAME, "provideTokens", "([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface TokenProviderAsync extends com.zettle.sdk.core.auth.TokenProvider {
    void provideTokens(java.lang.String[] scopes, kotlin.jvm.functions.Function1<? super com.zettle.sdk.core.auth.OAuthTokens, kotlin.Unit> callback);
}
