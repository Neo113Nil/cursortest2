package com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b+\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "", "", "clientId", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "redirectUri", "state", "metadataId", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PARAM_CODE_CHALLENGE_METHOD, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PARAM_CODE_CHALLENGE, "intent", "fullDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getClientId", "getScope", "getRedirectUri", "getState", "getMetadataId", "getCodeChallengeMethod", "getCodeChallenge", "getIntent", "getFullDeeplink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InboundConnectRequest {
    public static final int $stable = 0;
    private final java.lang.String clientId;
    private final java.lang.String codeChallenge;
    private final java.lang.String codeChallengeMethod;
    private final java.lang.String fullDeeplink;
    private final java.lang.String intent;
    private final java.lang.String metadataId;
    private final java.lang.String redirectUri;
    private final java.lang.String scope;
    private final java.lang.String state;

    public InboundConnectRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
        this.clientId = str;
        this.scope = str2;
        this.redirectUri = str3;
        this.state = str4;
        this.metadataId = str5;
        this.codeChallengeMethod = str6;
        this.codeChallenge = str7;
        this.intent = str8;
        this.fullDeeplink = str9;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getScope() {
        return this.scope;
    }

    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String getMetadataId() {
        return this.metadataId;
    }

    public final java.lang.String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    public final java.lang.String getCodeChallenge() {
        return this.codeChallenge;
    }

    public final java.lang.String getIntent() {
        return this.intent;
    }

    public final java.lang.String getFullDeeplink() {
        return this.fullDeeplink;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.clientId;
        java.lang.String str2 = this.scope;
        java.lang.String str3 = this.redirectUri;
        java.lang.String str4 = this.state;
        java.lang.String str5 = this.metadataId;
        java.lang.String str6 = this.codeChallengeMethod;
        java.lang.String str7 = this.codeChallenge;
        java.lang.String str8 = this.intent;
        java.lang.String str9 = this.fullDeeplink;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InboundConnectRequest(clientId=");
        sb.append(str);
        sb.append(", scope=");
        sb.append(str2);
        sb.append(", redirectUri=");
        sb.append(str3);
        sb.append(", state=");
        sb.append(str4);
        sb.append(", metadataId=");
        sb.append(str5);
        sb.append(", codeChallengeMethod=");
        sb.append(str6);
        sb.append(", codeChallenge=");
        sb.append(str7);
        sb.append(", intent=");
        sb.append(str8);
        sb.append(", fullDeeplink=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((this.clientId.hashCode() * 31) + this.scope.hashCode()) * 31) + this.redirectUri.hashCode()) * 31) + this.state.hashCode()) * 31) + this.metadataId.hashCode()) * 31) + this.codeChallengeMethod.hashCode()) * 31) + this.codeChallenge.hashCode()) * 31) + this.intent.hashCode()) * 31) + this.fullDeeplink.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest = (com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, inboundConnectRequest.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.scope, inboundConnectRequest.scope) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUri, inboundConnectRequest.redirectUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, inboundConnectRequest.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadataId, inboundConnectRequest.metadataId) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeChallengeMethod, inboundConnectRequest.codeChallengeMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeChallenge, inboundConnectRequest.codeChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, inboundConnectRequest.intent) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullDeeplink, inboundConnectRequest.fullDeeplink);
    }

    public final com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest copy(java.lang.String clientId, java.lang.String scope, java.lang.String redirectUri, java.lang.String state, java.lang.String metadataId, java.lang.String codeChallengeMethod, java.lang.String codeChallenge, java.lang.String intent, java.lang.String fullDeeplink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeChallengeMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeChallenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullDeeplink, "");
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest(clientId, scope, redirectUri, state, metadataId, codeChallengeMethod, codeChallenge, intent, fullDeeplink);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getFullDeeplink() {
        return this.fullDeeplink;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getIntent() {
        return this.intent;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCodeChallenge() {
        return this.codeChallenge;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getMetadataId() {
        return this.metadataId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getScope() {
        return this.scope;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }
}
