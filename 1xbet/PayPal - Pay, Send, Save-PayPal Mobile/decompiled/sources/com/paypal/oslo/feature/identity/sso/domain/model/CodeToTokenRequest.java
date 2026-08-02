package com.paypal.oslo.feature.identity.sso.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/domain/model/CodeToTokenRequest;", "", "", "clientId", "authorizationCode", "codeVerifier", "nonce", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "authenticationContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;)Lcom/paypal/oslo/feature/identity/sso/domain/model/CodeToTokenRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getClientId", "getAuthorizationCode", "getCodeVerifier", "getNonce", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "getAuthenticationContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CodeToTokenRequest {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext;
    private final java.lang.String authorizationCode;
    private final java.lang.String clientId;
    private final java.lang.String codeVerifier;
    private final java.lang.String nonce;

    public CodeToTokenRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        this.clientId = str;
        this.authorizationCode = str2;
        this.codeVerifier = str3;
        this.nonce = str4;
        this.authenticationContext = authenticationContext;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public final java.lang.String getCodeVerifier() {
        return this.codeVerifier;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
        return this.authenticationContext;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.clientId;
        java.lang.String str2 = this.authorizationCode;
        java.lang.String str3 = this.codeVerifier;
        java.lang.String str4 = this.nonce;
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = this.authenticationContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CodeToTokenRequest(clientId=");
        sb.append(str);
        sb.append(", authorizationCode=");
        sb.append(str2);
        sb.append(", codeVerifier=");
        sb.append(str3);
        sb.append(", nonce=");
        sb.append(str4);
        sb.append(", authenticationContext=");
        sb.append(authenticationContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.clientId.hashCode();
        int hashCode2 = this.authorizationCode.hashCode();
        java.lang.String str = this.codeVerifier;
        return (((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.nonce.hashCode()) * 31) + this.authenticationContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest codeToTokenRequest = (com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, codeToTokenRequest.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, codeToTokenRequest.authorizationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeVerifier, codeToTokenRequest.codeVerifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, codeToTokenRequest.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationContext, codeToTokenRequest.authenticationContext);
    }

    public final com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest copy(java.lang.String clientId, java.lang.String authorizationCode, java.lang.String codeVerifier, java.lang.String nonce, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        return new com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest(clientId, authorizationCode, codeVerifier, nonce, authenticationContext);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
        return this.authenticationContext;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCodeVerifier() {
        return this.codeVerifier;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest copy$default(com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest codeToTokenRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = codeToTokenRequest.clientId;
        }
        if ((i & 2) != 0) {
            str2 = codeToTokenRequest.authorizationCode;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = codeToTokenRequest.codeVerifier;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = codeToTokenRequest.nonce;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            authenticationContext = codeToTokenRequest.authenticationContext;
        }
        return codeToTokenRequest.copy(str, str5, str6, str7, authenticationContext);
    }
}
