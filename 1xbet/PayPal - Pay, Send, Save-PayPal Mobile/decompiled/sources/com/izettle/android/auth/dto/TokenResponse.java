package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/izettle/android/auth/dto/TokenResponse;", "", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "refreshToken", "", "expiresInSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/izettle/android/auth/dto/TokenResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccessToken", "Ljava/lang/Integer;", "getExpiresInSeconds", "getRefreshToken"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TokenResponse {
    private final java.lang.String accessToken;
    private final java.lang.Integer expiresInSeconds;
    private final java.lang.String refreshToken;

    public TokenResponse(@com.izettle.android.serialization.annotations.JsonDeserialize("access_token") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("refresh_token") java.lang.String str2, @com.izettle.android.serialization.annotations.JsonDeserialize("expires_in") java.lang.Integer num) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.expiresInSeconds = num;
    }

    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    public final java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    public final java.lang.Integer getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.accessToken;
        java.lang.String str2 = this.refreshToken;
        java.lang.Integer num = this.expiresInSeconds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenResponse(accessToken=");
        sb.append(str);
        sb.append(", refreshToken=");
        sb.append(str2);
        sb.append(", expiresInSeconds=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.accessToken;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.refreshToken;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.expiresInSeconds;
        return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.izettle.android.auth.dto.TokenResponse)) {
            return false;
        }
        com.izettle.android.auth.dto.TokenResponse tokenResponse = (com.izettle.android.auth.dto.TokenResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accessToken, tokenResponse.accessToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.refreshToken, tokenResponse.refreshToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiresInSeconds, tokenResponse.expiresInSeconds);
    }

    public final com.izettle.android.auth.dto.TokenResponse copy(@com.izettle.android.serialization.annotations.JsonDeserialize("access_token") java.lang.String accessToken, @com.izettle.android.serialization.annotations.JsonDeserialize("refresh_token") java.lang.String refreshToken, @com.izettle.android.serialization.annotations.JsonDeserialize("expires_in") java.lang.Integer expiresInSeconds) {
        return new com.izettle.android.auth.dto.TokenResponse(accessToken, refreshToken, expiresInSeconds);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    public static /* synthetic */ com.izettle.android.auth.dto.TokenResponse copy$default(com.izettle.android.auth.dto.TokenResponse tokenResponse, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = tokenResponse.refreshToken;
        }
        if ((i & 4) != 0) {
            num = tokenResponse.expiresInSeconds;
        }
        return tokenResponse.copy(str, str2, num);
    }
}
