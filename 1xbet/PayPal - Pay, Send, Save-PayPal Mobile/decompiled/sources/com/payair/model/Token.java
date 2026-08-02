package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/payair/model/Token;", "", "", "networkTokenReference", com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/Token;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNetworkTokenReference", "getTokenStatus"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Token {
    private final java.lang.String networkTokenReference;
    private final java.lang.String tokenStatus;

    public Token(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.networkTokenReference = str;
        this.tokenStatus = str2;
    }

    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    public final java.lang.String getTokenStatus() {
        return this.tokenStatus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.networkTokenReference;
        java.lang.String str2 = this.tokenStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Token(networkTokenReference=");
        sb.append(str);
        sb.append(", tokenStatus=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.tokenStatus.hashCode() + (this.networkTokenReference.hashCode() * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.Token)) {
            return false;
        }
        com.payair.model.Token token = (com.payair.model.Token) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.networkTokenReference, token.networkTokenReference) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenStatus, token.tokenStatus);
    }

    public final com.payair.model.Token copy(java.lang.String networkTokenReference, java.lang.String tokenStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenStatus, "");
        return new com.payair.model.Token(networkTokenReference, tokenStatus);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTokenStatus() {
        return this.tokenStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    public static /* synthetic */ com.payair.model.Token copy$default(com.payair.model.Token token, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = token.networkTokenReference;
        }
        if ((i & 2) != 0) {
            str2 = token.tokenStatus;
        }
        return token.copy(str, str2);
    }
}
