package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/core/auth/PayPalUatOAuthTokens;", "Lcom/zettle/sdk/core/auth/OAuthTokensInternal;", "Lcom/zettle/sdk/core/log/Loggable;", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "", "expiresInSeconds", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getAccessToken", "J", "getExpiresInSeconds", "()J", "", "refreshToken", "Ljava/lang/Void;", "getRefreshToken", "()Ljava/lang/Void;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PayPalUatOAuthTokens implements com.zettle.sdk.core.auth.OAuthTokensInternal, com.zettle.sdk.core.log.Loggable {
    private final java.lang.String accessToken;
    private final long expiresInSeconds;
    private final java.lang.Void refreshToken;

    public PayPalUatOAuthTokens(java.lang.String str, long j) {
        this.accessToken = str;
        this.expiresInSeconds = j;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.core.auth.OAuthTokensInternal
    public final /* bridge */ /* synthetic */ java.lang.String getRefreshToken() {
        return (java.lang.String) getRefreshToken();
    }

    @Override // com.zettle.sdk.core.auth.OAuthTokensInternal
    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    @Override // com.zettle.sdk.core.auth.OAuthTokensInternal
    public final long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    public final java.lang.Void getRefreshToken() {
        return this.refreshToken;
    }

    public final java.lang.String toString() {
        java.lang.String accessToken = getAccessToken();
        java.lang.String safe = accessToken != null ? com.zettle.sdk.extensions.StringExtKt.getSafe(accessToken) : null;
        long expiresInSeconds = getExpiresInSeconds();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalUatOAuthTokens(accessToken: ");
        sb.append(safe);
        sb.append(", expiresInSeconds: ");
        sb.append(expiresInSeconds);
        sb.append(")");
        return sb.toString();
    }
}
