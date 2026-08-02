package com.izettle.android.auth.http;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0007\u001a\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/izettle/android/auth/http/ZettleAuthenticator;", "Lcom/izettle/android/net/Authenticator;", "Lkotlin/Function0;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/OAuthTokens;", "", "Lcom/izettle/android/auth/http/AccessTokenRefresher;", "accessTokenRefresher", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/izettle/android/net/Response;", "response", "Lcom/izettle/android/net/Request;", "authenticate", "(Lcom/izettle/android/net/Response;)Lcom/izettle/android/net/Request;", "Lkotlin/jvm/functions/Function0;", "", "getResponseCount", "(Lcom/izettle/android/net/Response;)I", "responseCount"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ZettleAuthenticator implements com.izettle.android.net.Authenticator {
    private final kotlin.jvm.functions.Function0<com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable>> accessTokenRefresher;

    /* JADX WARN: Multi-variable type inference failed */
    public ZettleAuthenticator(kotlin.jvm.functions.Function0<? extends com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, ? extends java.lang.Throwable>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.accessTokenRefresher = function0;
    }

    private final int getResponseCount(com.izettle.android.net.Response<?> response) {
        int i = 1;
        for (com.izettle.android.net.Response<?> priorResponse = response.getPriorResponse(); priorResponse != null; priorResponse = priorResponse.getPriorResponse()) {
            i++;
        }
        return i;
    }

    @Override // com.izettle.android.net.Authenticator
    public final com.izettle.android.net.Request authenticate(com.izettle.android.net.Response<?> response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (getResponseCount(response) >= 3) {
            return null;
        }
        com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> invoke = this.accessTokenRefresher.invoke();
        if (invoke instanceof com.izettle.android.core.data.result.Success) {
            return response.getRequest().newBuilder().header("Authorization", "Bearer ".concat(java.lang.String.valueOf(((com.izettle.android.auth.model.OAuthTokens) ((com.izettle.android.core.data.result.Success) invoke).getValue()).getAccessToken()))).build();
        }
        if (invoke instanceof com.izettle.android.core.data.result.Failure) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
