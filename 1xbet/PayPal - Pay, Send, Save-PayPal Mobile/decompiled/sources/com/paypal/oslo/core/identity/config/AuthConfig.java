package com.paypal.oslo.core.identity.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/identity/config/AuthConfig;", "", "", "appID", "firstPartyClientId", "proxyClientId", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/identity/config/AuthConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAppID", "getFirstPartyClientId", "getProxyClientId", "getRedirectUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AuthConfig {
    private final java.lang.String appID;
    private final java.lang.String firstPartyClientId;
    private final java.lang.String proxyClientId;
    private final java.lang.String redirectUri;

    public AuthConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.appID = str;
        this.firstPartyClientId = str2;
        this.proxyClientId = str3;
        this.redirectUri = str4;
    }

    public final java.lang.String getAppID() {
        return this.appID;
    }

    public final java.lang.String getFirstPartyClientId() {
        return this.firstPartyClientId;
    }

    public final java.lang.String getProxyClientId() {
        return this.proxyClientId;
    }

    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.appID;
        java.lang.String str2 = this.firstPartyClientId;
        java.lang.String str3 = this.proxyClientId;
        java.lang.String str4 = this.redirectUri;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthConfig(appID=");
        sb.append(str);
        sb.append(", firstPartyClientId=");
        sb.append(str2);
        sb.append(", proxyClientId=");
        sb.append(str3);
        sb.append(", redirectUri=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.appID.hashCode() * 31) + this.firstPartyClientId.hashCode()) * 31) + this.proxyClientId.hashCode()) * 31) + this.redirectUri.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.identity.config.AuthConfig)) {
            return false;
        }
        com.paypal.oslo.core.identity.config.AuthConfig authConfig = (com.paypal.oslo.core.identity.config.AuthConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.appID, authConfig.appID) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstPartyClientId, authConfig.firstPartyClientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.proxyClientId, authConfig.proxyClientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUri, authConfig.redirectUri);
    }

    public final com.paypal.oslo.core.identity.config.AuthConfig copy(java.lang.String appID, java.lang.String firstPartyClientId, java.lang.String proxyClientId, java.lang.String redirectUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appID, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyClientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxyClientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUri, "");
        return new com.paypal.oslo.core.identity.config.AuthConfig(appID, firstPartyClientId, proxyClientId, redirectUri);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getProxyClientId() {
        return this.proxyClientId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFirstPartyClientId() {
        return this.firstPartyClientId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppID() {
        return this.appID;
    }

    public static /* synthetic */ com.paypal.oslo.core.identity.config.AuthConfig copy$default(com.paypal.oslo.core.identity.config.AuthConfig authConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authConfig.appID;
        }
        if ((i & 2) != 0) {
            str2 = authConfig.firstPartyClientId;
        }
        if ((i & 4) != 0) {
            str3 = authConfig.proxyClientId;
        }
        if ((i & 8) != 0) {
            str4 = authConfig.redirectUri;
        }
        return authConfig.copy(str, str2, str3, str4);
    }
}
