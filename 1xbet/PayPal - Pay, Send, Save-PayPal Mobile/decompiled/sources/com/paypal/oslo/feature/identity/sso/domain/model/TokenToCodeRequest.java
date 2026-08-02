package com.paypal.oslo.feature.identity.sso.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00060\nj\u0002`\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\f\b\u0002\u0010\f\u001a\u00060\nj\u0002`\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u001e\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/domain/model/TokenToCodeRequest;", "", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "authenticationContext", "", "redirectUri", "clientId", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PARAM_CODE_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEChallengeMethod;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PARAM_CODE_CHALLENGE_METHOD, "Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;", "Lcom/paypal/oslo/feature/identity/graphql/type/AccessTokenExchangeIntent;", "intent", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEChallengeMethod;Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEChallengeMethod;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEChallengeMethod;Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;)Lcom/paypal/oslo/feature/identity/sso/domain/model/TokenToCodeRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "getAuthenticationContext", "Ljava/lang/String;", "getRedirectUri", "getClientId", "getCodeChallenge", "Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEChallengeMethod;", "getCodeChallengeMethod", "Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TokenToCodeRequest {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext;
    private final java.lang.String clientId;
    private final java.lang.String codeChallenge;
    private final com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod codeChallengeMethod;
    private final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent intent;
    private final java.lang.String redirectUri;

    public TokenToCodeRequest(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod pKCEChallengeMethod, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pKCEChallengeMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenExchangeIntent, "");
        this.authenticationContext = authenticationContext;
        this.redirectUri = str;
        this.clientId = str2;
        this.codeChallenge = str3;
        this.codeChallengeMethod = pKCEChallengeMethod;
        this.intent = accessTokenExchangeIntent;
    }

    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
        return this.authenticationContext;
    }

    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getCodeChallenge() {
        return this.codeChallenge;
    }

    public /* synthetic */ TokenToCodeRequest(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod pKCEChallengeMethod, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(authenticationContext, str, str2, str3, (i & 16) != 0 ? com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod.S256 : pKCEChallengeMethod, accessTokenExchangeIntent);
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = this.authenticationContext;
        java.lang.String str = this.redirectUri;
        java.lang.String str2 = this.clientId;
        java.lang.String str3 = this.codeChallenge;
        com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod pKCEChallengeMethod = this.codeChallengeMethod;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenToCodeRequest(authenticationContext=");
        sb.append(authenticationContext);
        sb.append(", redirectUri=");
        sb.append(str);
        sb.append(", clientId=");
        sb.append(str2);
        sb.append(", codeChallenge=");
        sb.append(str3);
        sb.append(", codeChallengeMethod=");
        sb.append(pKCEChallengeMethod);
        sb.append(", intent=");
        sb.append(accessTokenExchangeIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.authenticationContext.hashCode();
        java.lang.String str = this.redirectUri;
        return (((((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.clientId.hashCode()) * 31) + this.codeChallenge.hashCode()) * 31) + this.codeChallengeMethod.hashCode()) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest tokenToCodeRequest = (com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationContext, tokenToCodeRequest.authenticationContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUri, tokenToCodeRequest.redirectUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, tokenToCodeRequest.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeChallenge, tokenToCodeRequest.codeChallenge) && this.codeChallengeMethod == tokenToCodeRequest.codeChallengeMethod && this.intent == tokenToCodeRequest.intent;
    }

    public final com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest copy(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, java.lang.String redirectUri, java.lang.String clientId, java.lang.String codeChallenge, com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod codeChallengeMethod, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeChallenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeChallengeMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest(authenticationContext, redirectUri, clientId, codeChallenge, codeChallengeMethod, intent);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCodeChallenge() {
        return this.codeChallenge;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
        return this.authenticationContext;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest copy$default(com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest tokenToCodeRequest, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod pKCEChallengeMethod, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticationContext = tokenToCodeRequest.authenticationContext;
        }
        if ((i & 2) != 0) {
            str = tokenToCodeRequest.redirectUri;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = tokenToCodeRequest.clientId;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = tokenToCodeRequest.codeChallenge;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            pKCEChallengeMethod = tokenToCodeRequest.codeChallengeMethod;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod pKCEChallengeMethod2 = pKCEChallengeMethod;
        if ((i & 32) != 0) {
            accessTokenExchangeIntent = tokenToCodeRequest.intent;
        }
        return tokenToCodeRequest.copy(authenticationContext, str4, str5, str6, pKCEChallengeMethod2, accessTokenExchangeIntent);
    }
}
