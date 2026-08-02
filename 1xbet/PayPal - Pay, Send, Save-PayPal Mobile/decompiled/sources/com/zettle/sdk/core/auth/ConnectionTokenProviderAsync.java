package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/core/auth/ConnectionTokenProviderAsync;", "Lcom/zettle/sdk/core/auth/ConnectionTokenProvider;", "Lcom/zettle/sdk/core/auth/ConnectionTokenProviderCallback;", com.sun.jna.Callback.METHOD_NAME, "", "provideTokens", "(Lcom/zettle/sdk/core/auth/ConnectionTokenProviderCallback;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ConnectionTokenProviderAsync extends com.zettle.sdk.core.auth.ConnectionTokenProvider {
    void provideTokens(com.zettle.sdk.core.auth.ConnectionTokenProviderCallback callback);
}
