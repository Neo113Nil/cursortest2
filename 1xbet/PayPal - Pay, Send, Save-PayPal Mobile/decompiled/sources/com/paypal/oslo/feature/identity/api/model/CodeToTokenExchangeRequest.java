package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeRequest;", "", "", "authorizationCode", "nonce", "codeVerifier", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "authenticationContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;)Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthorizationCode", "getNonce", "getCodeVerifier", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "getAuthenticationContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CodeToTokenExchangeRequest {
    private final com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext;
    private final java.lang.String authorizationCode;
    private final java.lang.String codeVerifier;
    private final java.lang.String nonce;

    public CodeToTokenExchangeRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        this.authorizationCode = str;
        this.nonce = str2;
        this.codeVerifier = str3;
        this.authenticationContext = authenticationContext;
    }

    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getCodeVerifier() {
        return this.codeVerifier;
    }

    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
        return this.authenticationContext;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.authorizationCode;
        java.lang.String str2 = this.nonce;
        java.lang.String str3 = this.codeVerifier;
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = this.authenticationContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CodeToTokenExchangeRequest(authorizationCode=");
        sb.append(str);
        sb.append(", nonce=");
        sb.append(str2);
        sb.append(", codeVerifier=");
        sb.append(str3);
        sb.append(", authenticationContext=");
        sb.append(authenticationContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.authorizationCode.hashCode();
        int hashCode2 = this.nonce.hashCode();
        java.lang.String str = this.codeVerifier;
        return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.authenticationContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest codeToTokenExchangeRequest = (com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, codeToTokenExchangeRequest.authorizationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, codeToTokenExchangeRequest.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeVerifier, codeToTokenExchangeRequest.codeVerifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationContext, codeToTokenExchangeRequest.authenticationContext);
    }

    public final com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest copy(java.lang.String authorizationCode, java.lang.String nonce, java.lang.String codeVerifier, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        return new com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest(authorizationCode, nonce, codeVerifier, authenticationContext);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
        return this.authenticationContext;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCodeVerifier() {
        return this.codeVerifier;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest copy$default(com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest codeToTokenExchangeRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = codeToTokenExchangeRequest.authorizationCode;
        }
        if ((i & 2) != 0) {
            str2 = codeToTokenExchangeRequest.nonce;
        }
        if ((i & 4) != 0) {
            str3 = codeToTokenExchangeRequest.codeVerifier;
        }
        if ((i & 8) != 0) {
            authenticationContext = codeToTokenExchangeRequest.authenticationContext;
        }
        return codeToTokenExchangeRequest.copy(str, str2, str3, authenticationContext);
    }
}
