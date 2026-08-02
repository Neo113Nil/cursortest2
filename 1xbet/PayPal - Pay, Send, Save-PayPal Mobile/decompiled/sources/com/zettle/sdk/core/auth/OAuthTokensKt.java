package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\r\"\u0014\u0010\u000e\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\n*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/core/auth/OAuthTokensInternal;", "", "failedToRetrieveToken", "(Lcom/zettle/sdk/core/auth/OAuthTokensInternal;)V", "Lcom/zettle/sdk/core/auth/OAuthTokens;", "", "", "scopes", "", "ttl", "", "isValid", "(Lcom/zettle/sdk/core/auth/OAuthTokens;[Ljava/lang/String;J)Z", "(Lcom/zettle/sdk/core/auth/OAuthTokensInternal;[Ljava/lang/String;J)Z", "DEFAULT_MINIMUM_TOKEN_TTL", "J", "isRefreshable", "(Lcom/zettle/sdk/core/auth/OAuthTokensInternal;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OAuthTokensKt {
    public static final long DEFAULT_MINIMUM_TOKEN_TTL = 30000;

    public static final boolean isValid(com.zettle.sdk.core.auth.OAuthTokens oAuthTokens, java.lang.String[] strArr, long j) {
        java.util.List<java.lang.String> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long expiresInSeconds = oAuthTokens.getExpiresInSeconds();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.izettle.android.auth.dto.Jwt decodedAccessToken$core_publicRelease = oAuthTokens.getDecodedAccessToken$core_publicRelease();
        if (decodedAccessToken$core_publicRelease == null || (emptyList = decodedAccessToken$core_publicRelease.getScopes()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        boolean z = emptyList.containsAll(kotlin.collections.ArraysKt.toList(strArr)) && (currentTimeMillis + (expiresInSeconds * 1000)) - currentTimeMillis2 >= j;
        java.lang.String joinToString$default = kotlin.collections.ArraysKt.joinToString$default(strArr, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Valid (");
        sb.append(z);
        sb.append("): Granted ");
        sb.append(emptyList);
        sb.append(" :: Requested ");
        sb.append(joinToString$default);
        com.zettle.sdk.core.log.LogKt.debug(oAuthTokens, sb.toString());
        return z;
    }

    public static final void failedToRetrieveToken(com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokensInternal, "");
        if (oAuthTokensInternal instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken) {
            ((com.zettle.sdk.core.auth.ConnectionOAuthToken) oAuthTokensInternal).setFailedToRetrieveToken$core_publicRelease(true);
        }
    }

    public static final boolean isRefreshable(com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokensInternal, "");
        java.lang.String refreshToken = oAuthTokensInternal.getRefreshToken();
        return !(refreshToken == null || kotlin.text.StringsKt.isBlank(refreshToken));
    }

    public static final boolean isValid(com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal, java.lang.String[] strArr, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokensInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        if (oAuthTokensInternal instanceof com.zettle.sdk.core.auth.OAuthTokens) {
            return isValid((com.zettle.sdk.core.auth.OAuthTokens) oAuthTokensInternal, strArr, j);
        }
        if (oAuthTokensInternal instanceof com.zettle.sdk.core.auth.PayPalUatOAuthTokens) {
            return oAuthTokensInternal.getAccessToken() != null;
        }
        if (oAuthTokensInternal instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken) {
            return oAuthTokensInternal.getAccessToken() != null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isValid$default(com.zettle.sdk.core.auth.OAuthTokens oAuthTokens, java.lang.String[] strArr, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strArr = new java.lang.String[0];
        }
        if ((i & 2) != 0) {
            j = 30000;
        }
        return isValid(oAuthTokens, strArr, j);
    }

    public static /* synthetic */ boolean isValid$default(com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal, java.lang.String[] strArr, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strArr = new java.lang.String[0];
        }
        if ((i & 2) != 0) {
            j = 30000;
        }
        return isValid(oAuthTokensInternal, strArr, j);
    }
}
