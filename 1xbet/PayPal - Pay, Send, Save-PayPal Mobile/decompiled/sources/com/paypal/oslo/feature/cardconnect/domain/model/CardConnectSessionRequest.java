package com.paypal.oslo.feature.cardconnect.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionRequest;", "", "Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "cardProduct", "", "instrumentId", "merchantId", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "getCardProduct", "Ljava/lang/String;", "getInstrumentId", "getMerchantId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardConnectSessionRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct cardProduct;
    private final java.lang.String instrumentId;
    private final java.lang.String merchantId;

    public CardConnectSessionRequest(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProduct, "");
        this.cardProduct = debitCardProduct;
        this.instrumentId = str;
        this.merchantId = str2;
    }

    public /* synthetic */ CardConnectSessionRequest(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitCardProduct, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct getCardProduct() {
        return this.cardProduct;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String getMerchantId() {
        return this.merchantId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct = this.cardProduct;
        java.lang.String str = this.instrumentId;
        java.lang.String str2 = this.merchantId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardConnectSessionRequest(cardProduct=");
        sb.append(debitCardProduct);
        sb.append(", instrumentId=");
        sb.append(str);
        sb.append(", merchantId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardProduct.hashCode();
        java.lang.String str = this.instrumentId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.merchantId;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest)) {
            return false;
        }
        com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest cardConnectSessionRequest = (com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest) other;
        return this.cardProduct == cardConnectSessionRequest.cardProduct && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, cardConnectSessionRequest.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantId, cardConnectSessionRequest.merchantId);
    }

    public final com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest copy(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct cardProduct, java.lang.String instrumentId, java.lang.String merchantId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProduct, "");
        return new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest(cardProduct, instrumentId, merchantId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMerchantId() {
        return this.merchantId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct getCardProduct() {
        return this.cardProduct;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest copy$default(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest cardConnectSessionRequest, com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardProduct = cardConnectSessionRequest.cardProduct;
        }
        if ((i & 2) != 0) {
            str = cardConnectSessionRequest.instrumentId;
        }
        if ((i & 4) != 0) {
            str2 = cardConnectSessionRequest.merchantId;
        }
        return cardConnectSessionRequest.copy(debitCardProduct, str, str2);
    }
}
