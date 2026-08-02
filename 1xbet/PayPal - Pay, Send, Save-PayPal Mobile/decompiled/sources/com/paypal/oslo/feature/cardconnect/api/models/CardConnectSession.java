package com.paypal.oslo.feature.cardconnect.api.models;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "", "", "sessionId", "clientId", "", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectMerchant;", "merchants", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId", "getClientId", "Ljava/util/List;", "getMerchants"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardConnectSession {
    private final java.lang.String clientId;
    private final java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> merchants;
    private final java.lang.String sessionId;

    public CardConnectSession(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.sessionId = str;
        this.clientId = str2;
        this.merchants = list;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> getMerchants() {
        return this.merchants;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sessionId;
        java.lang.String str2 = this.clientId;
        java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> list = this.merchants;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardConnectSession(sessionId=");
        sb.append(str);
        sb.append(", clientId=");
        sb.append(str2);
        sb.append(", merchants=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.sessionId.hashCode() * 31) + this.clientId.hashCode()) * 31) + this.merchants.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession)) {
            return false;
        }
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, cardConnectSession.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, cardConnectSession.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchants, cardConnectSession.merchants);
    }

    public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession copy(java.lang.String sessionId, java.lang.String clientId, java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> merchants) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchants, "");
        return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession(sessionId, clientId, merchants);
    }

    public final java.util.List<com.paypal.oslo.feature.cardconnect.api.models.CardConnectMerchant> component3() {
        return this.merchants;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession copy$default(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession cardConnectSession, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardConnectSession.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = cardConnectSession.clientId;
        }
        if ((i & 4) != 0) {
            list = cardConnectSession.merchants;
        }
        return cardConnectSession.copy(str, str2, list);
    }
}
