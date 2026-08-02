package com.paypal.oslo.feature.identity.clienttoken.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientAccessToken;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "", "tokenType", "tokenValue", "expires", "", "expirationInSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientAccessToken;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getTokenType", "getTokenValue", "getExpires", com.visa.cbp.getEncExpo.warmup, "getExpirationInSeconds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientAccessToken extends com.paypal.oslo.feature.identity.foundation.model.Token {
    public static final int $stable = 0;
    private final int expirationInSeconds;
    private final java.lang.String expires;
    private final java.lang.String tokenType;
    private final java.lang.String tokenValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientAccessToken(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        super(str, str2, str3, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.tokenType = str;
        this.tokenValue = str2;
        this.expires = str3;
        this.expirationInSeconds = i;
    }

    @Override // com.paypal.oslo.feature.identity.foundation.model.Token
    public final java.lang.String getTokenType() {
        return this.tokenType;
    }

    @Override // com.paypal.oslo.feature.identity.foundation.model.Token
    public final java.lang.String getTokenValue() {
        return this.tokenValue;
    }

    public /* synthetic */ ClientAccessToken(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, i);
    }

    @Override // com.paypal.oslo.feature.identity.foundation.model.Token
    public final java.lang.String getExpires() {
        return this.expires;
    }

    @Override // com.paypal.oslo.feature.identity.foundation.model.Token
    public final int getExpirationInSeconds() {
        return this.expirationInSeconds;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.tokenType;
        java.lang.String str2 = this.tokenValue;
        java.lang.String str3 = this.expires;
        int i = this.expirationInSeconds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClientAccessToken(tokenType=");
        sb.append(str);
        sb.append(", tokenValue=");
        sb.append(str2);
        sb.append(", expires=");
        sb.append(str3);
        sb.append(", expirationInSeconds=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.tokenType.hashCode() * 31) + this.tokenValue.hashCode()) * 31) + this.expires.hashCode()) * 31) + java.lang.Integer.hashCode(this.expirationInSeconds);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken)) {
            return false;
        }
        com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken clientAccessToken = (com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tokenType, clientAccessToken.tokenType) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenValue, clientAccessToken.tokenValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.expires, clientAccessToken.expires) && this.expirationInSeconds == clientAccessToken.expirationInSeconds;
    }

    public final com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken copy(java.lang.String tokenType, java.lang.String tokenValue, java.lang.String expires, int expirationInSeconds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expires, "");
        return new com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken(tokenType, tokenValue, expires, expirationInSeconds);
    }

    /* renamed from: component4, reason: from getter */
    public final int getExpirationInSeconds() {
        return this.expirationInSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExpires() {
        return this.expires;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTokenValue() {
        return this.tokenValue;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTokenType() {
        return this.tokenType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken copy$default(com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken clientAccessToken, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = clientAccessToken.tokenType;
        }
        if ((i2 & 2) != 0) {
            str2 = clientAccessToken.tokenValue;
        }
        if ((i2 & 4) != 0) {
            str3 = clientAccessToken.expires;
        }
        if ((i2 & 8) != 0) {
            i = clientAccessToken.expirationInSeconds;
        }
        return clientAccessToken.copy(str, str2, str3, i);
    }
}
