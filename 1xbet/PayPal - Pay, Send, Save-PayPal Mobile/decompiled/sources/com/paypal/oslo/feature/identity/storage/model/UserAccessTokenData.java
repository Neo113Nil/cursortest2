package com.paypal.oslo.feature.identity.storage.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "authenticationTier", "", "expiresAtElapsedRealtime", "payerId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "component3", "()J", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;JLjava/lang/String;)Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccessToken", "Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "getAuthenticationTier", "J", "getExpiresAtElapsedRealtime", "getPayerId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAccessTokenData {
    public static final int $stable = 0;
    private final java.lang.String accessToken;
    private final com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier;
    private final long expiresAtElapsedRealtime;
    private final java.lang.String payerId;

    public UserAccessTokenData(java.lang.String str, com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier, long j, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationTier, "");
        this.accessToken = str;
        this.authenticationTier = authenticationTier;
        this.expiresAtElapsedRealtime = j;
        this.payerId = str2;
    }

    public /* synthetic */ UserAccessTokenData(java.lang.String str, com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier, long j, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, authenticationTier, (i & 4) != 0 ? Long.MAX_VALUE : j, (i & 8) != 0 ? null : str2);
    }

    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    public final com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier getAuthenticationTier() {
        return this.authenticationTier;
    }

    public final long getExpiresAtElapsedRealtime() {
        return this.expiresAtElapsedRealtime;
    }

    public final java.lang.String getPayerId() {
        return this.payerId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.accessToken;
        com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier = this.authenticationTier;
        long j = this.expiresAtElapsedRealtime;
        java.lang.String str2 = this.payerId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAccessTokenData(accessToken=");
        sb.append(str);
        sb.append(", authenticationTier=");
        sb.append(authenticationTier);
        sb.append(", expiresAtElapsedRealtime=");
        sb.append(j);
        sb.append(", payerId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.accessToken.hashCode();
        int hashCode2 = this.authenticationTier.hashCode();
        int hashCode3 = java.lang.Long.hashCode(this.expiresAtElapsedRealtime);
        java.lang.String str = this.payerId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData)) {
            return false;
        }
        com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accessToken, userAccessTokenData.accessToken) && this.authenticationTier == userAccessTokenData.authenticationTier && this.expiresAtElapsedRealtime == userAccessTokenData.expiresAtElapsedRealtime && kotlin.jvm.internal.Intrinsics.areEqual(this.payerId, userAccessTokenData.payerId);
    }

    public final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData copy(java.lang.String accessToken, com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier, long expiresAtElapsedRealtime, java.lang.String payerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationTier, "");
        return new com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData(accessToken, authenticationTier, expiresAtElapsedRealtime, payerId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPayerId() {
        return this.payerId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getExpiresAtElapsedRealtime() {
        return this.expiresAtElapsedRealtime;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier getAuthenticationTier() {
        return this.authenticationTier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAccessToken() {
        return this.accessToken;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData copy$default(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, java.lang.String str, com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier, long j, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userAccessTokenData.accessToken;
        }
        if ((i & 2) != 0) {
            authenticationTier = userAccessTokenData.authenticationTier;
        }
        com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier2 = authenticationTier;
        if ((i & 4) != 0) {
            j = userAccessTokenData.expiresAtElapsedRealtime;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str2 = userAccessTokenData.payerId;
        }
        return userAccessTokenData.copy(str, authenticationTier2, j2, str2);
    }
}
