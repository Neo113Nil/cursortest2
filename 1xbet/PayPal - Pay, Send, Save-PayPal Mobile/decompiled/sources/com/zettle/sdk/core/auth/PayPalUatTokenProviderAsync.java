package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\nH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/auth/PayPalUatTokenProviderAsync;", "Lcom/zettle/sdk/core/auth/TokenProvider;", "", "", "scopes", "", "isRetryAfter401", "Lkotlin/Function1;", "Lcom/zettle/sdk/core/auth/PayPalUatOAuthTokens;", "", "Lcom/zettle/sdk/core/auth/PayPalUatTokenProviderCallback;", com.sun.jna.Callback.METHOD_NAME, "provideTokens", "([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PayPalUatTokenProviderAsync extends com.zettle.sdk.core.auth.TokenProvider {
    void provideTokens(java.lang.String[] scopes, boolean isRetryAfter401, kotlin.jvm.functions.Function1<? super com.zettle.sdk.core.auth.PayPalUatOAuthTokens, kotlin.Unit> callback);
}
