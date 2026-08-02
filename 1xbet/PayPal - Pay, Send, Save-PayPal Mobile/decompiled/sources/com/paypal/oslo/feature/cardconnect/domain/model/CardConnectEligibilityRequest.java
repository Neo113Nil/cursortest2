package com.paypal.oslo.feature.cardconnect.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityRequest;", "", "Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "cardProduct", "", "instrumentId", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "getCardProduct", "Ljava/lang/String;", "getInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardConnectEligibilityRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct cardProduct;
    private final java.lang.String instrumentId;

    public CardConnectEligibilityRequest(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProduct, "");
        this.cardProduct = debitCardProduct;
        this.instrumentId = str;
    }

    public /* synthetic */ CardConnectEligibilityRequest(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitCardProduct, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct getCardProduct() {
        return this.cardProduct;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct = this.cardProduct;
        java.lang.String str = this.instrumentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardConnectEligibilityRequest(cardProduct=");
        sb.append(debitCardProduct);
        sb.append(", instrumentId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardProduct.hashCode();
        java.lang.String str = this.instrumentId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest)) {
            return false;
        }
        com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest cardConnectEligibilityRequest = (com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest) other;
        return this.cardProduct == cardConnectEligibilityRequest.cardProduct && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, cardConnectEligibilityRequest.instrumentId);
    }

    public final com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest copy(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct cardProduct, java.lang.String instrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProduct, "");
        return new com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest(cardProduct, instrumentId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct getCardProduct() {
        return this.cardProduct;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest copy$default(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest cardConnectEligibilityRequest, com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardProduct = cardConnectEligibilityRequest.cardProduct;
        }
        if ((i & 2) != 0) {
            str = cardConnectEligibilityRequest.instrumentId;
        }
        return cardConnectEligibilityRequest.copy(debitCardProduct, str);
    }
}
