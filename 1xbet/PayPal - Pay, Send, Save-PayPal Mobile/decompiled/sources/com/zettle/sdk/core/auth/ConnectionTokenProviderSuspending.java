package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/ConnectionTokenProviderSuspending;", "Lcom/zettle/sdk/core/auth/ConnectionTokenProvider;", "Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult;", "provideTokens", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ConnectionTokenProviderSuspending extends com.zettle.sdk.core.auth.ConnectionTokenProvider {
    java.lang.Object provideTokens(kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.ConnectionTokenProviderResult> continuation);
}
