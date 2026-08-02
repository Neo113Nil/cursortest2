package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/zettle/sdk/core/auth/ConnectionOAuthToken;", "Lcom/zettle/sdk/core/auth/OAuthTokensInternal;", "Lcom/zettle/sdk/core/log/Loggable;", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "", "expirationSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getAccessToken", "Ljava/lang/Long;", "getExpirationSeconds", "()Ljava/lang/Long;", "getExpiresInSeconds", "()J", "expiresInSeconds", "", "failedToRetrieveToken", "Z", "getFailedToRetrieveToken$core_publicRelease", "()Z", "setFailedToRetrieveToken$core_publicRelease", "(Z)V", "getRefreshToken", "refreshToken"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ConnectionOAuthToken implements com.zettle.sdk.core.auth.OAuthTokensInternal, com.zettle.sdk.core.log.Loggable {
    private final java.lang.String accessToken;
    private final java.lang.Long expirationSeconds;
    private boolean failedToRetrieveToken;

    @Override // com.zettle.sdk.core.auth.OAuthTokensInternal
    public final java.lang.String getRefreshToken() {
        return null;
    }

    public ConnectionOAuthToken(java.lang.String str, java.lang.Long l) {
        this.accessToken = str;
        this.expirationSeconds = l;
    }

    public /* synthetic */ ConnectionOAuthToken(java.lang.String str, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l);
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.core.auth.OAuthTokensInternal
    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    public final java.lang.Long getExpirationSeconds() {
        return this.expirationSeconds;
    }

    public final java.lang.String toString() {
        java.lang.String accessToken = getAccessToken();
        java.lang.String safe = accessToken != null ? com.zettle.sdk.extensions.StringExtKt.getSafe(accessToken) : null;
        java.lang.String refreshToken = getRefreshToken();
        java.lang.String safe2 = refreshToken != null ? com.zettle.sdk.extensions.StringExtKt.getSafe(refreshToken) : null;
        long expiresInSeconds = getExpiresInSeconds();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionOAuthTokens(accessToken: ");
        sb.append(safe);
        sb.append(", refreshToken: ");
        sb.append(safe2);
        sb.append(", expiresInSeconds: ");
        sb.append(expiresInSeconds);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.zettle.sdk.core.auth.OAuthTokensInternal
    public final long getExpiresInSeconds() {
        java.lang.Long l = this.expirationSeconds;
        if (l != null) {
            return l.longValue();
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: getFailedToRetrieveToken$core_publicRelease, reason: from getter */
    public final boolean getFailedToRetrieveToken() {
        return this.failedToRetrieveToken;
    }

    public final void setFailedToRetrieveToken$core_publicRelease(boolean z) {
        this.failedToRetrieveToken = z;
    }
}
