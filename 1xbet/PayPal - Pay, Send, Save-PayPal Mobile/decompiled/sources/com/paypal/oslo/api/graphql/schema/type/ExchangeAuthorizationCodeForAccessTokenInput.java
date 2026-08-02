package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ@\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ExchangeAuthorizationCodeForAccessTokenInput;", "", "", "clientId", "authorizationCode", "Lcom/apollographql/apollo/api/Optional;", "codeVerifier", "nonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ExchangeAuthorizationCodeForAccessTokenInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getClientId", "getAuthorizationCode", "Lcom/apollographql/apollo/api/Optional;", "getCodeVerifier", "getNonce"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExchangeAuthorizationCodeForAccessTokenInput {
    private final java.lang.String authorizationCode;
    private final java.lang.String clientId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> codeVerifier;
    private final java.lang.String nonce;

    public ExchangeAuthorizationCodeForAccessTokenInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.clientId = str;
        this.authorizationCode = str2;
        this.codeVerifier = optional;
        this.nonce = str3;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public /* synthetic */ ExchangeAuthorizationCodeForAccessTokenInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, str3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCodeVerifier() {
        return this.codeVerifier;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.clientId;
        java.lang.String str2 = this.authorizationCode;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.codeVerifier;
        java.lang.String str3 = this.nonce;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeAuthorizationCodeForAccessTokenInput(clientId=");
        sb.append(str);
        sb.append(", authorizationCode=");
        sb.append(str2);
        sb.append(", codeVerifier=");
        sb.append(optional);
        sb.append(", nonce=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.clientId.hashCode() * 31) + this.authorizationCode.hashCode()) * 31) + this.codeVerifier.hashCode()) * 31) + this.nonce.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput exchangeAuthorizationCodeForAccessTokenInput = (com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, exchangeAuthorizationCodeForAccessTokenInput.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, exchangeAuthorizationCodeForAccessTokenInput.authorizationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeVerifier, exchangeAuthorizationCodeForAccessTokenInput.codeVerifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, exchangeAuthorizationCodeForAccessTokenInput.nonce);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput copy(java.lang.String clientId, java.lang.String authorizationCode, com.apollographql.apollo.api.Optional<java.lang.String> codeVerifier, java.lang.String nonce) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeVerifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        return new com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput(clientId, authorizationCode, codeVerifier, nonce);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput copy$default(com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput exchangeAuthorizationCodeForAccessTokenInput, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = exchangeAuthorizationCodeForAccessTokenInput.clientId;
        }
        if ((i & 2) != 0) {
            str2 = exchangeAuthorizationCodeForAccessTokenInput.authorizationCode;
        }
        if ((i & 4) != 0) {
            optional = exchangeAuthorizationCodeForAccessTokenInput.codeVerifier;
        }
        if ((i & 8) != 0) {
            str3 = exchangeAuthorizationCodeForAccessTokenInput.nonce;
        }
        return exchangeAuthorizationCodeForAccessTokenInput.copy(str, str2, optional, str3);
    }
}
