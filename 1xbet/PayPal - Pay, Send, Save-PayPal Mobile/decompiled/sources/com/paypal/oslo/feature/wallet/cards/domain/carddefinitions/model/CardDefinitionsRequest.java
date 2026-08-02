package com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsRequest;", "", "", "userCountryCode", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", "operationName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;)Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUserCountryCode", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", "getOperationName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardDefinitionsRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName operationName;
    private final java.lang.String userCountryCode;

    public CardDefinitionsRequest(java.lang.String str, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardOperationName, "");
        this.userCountryCode = str;
        this.operationName = cardOperationName;
    }

    public final java.lang.String getUserCountryCode() {
        return this.userCountryCode;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName getOperationName() {
        return this.operationName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.userCountryCode;
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName = this.operationName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDefinitionsRequest(userCountryCode=");
        sb.append(str);
        sb.append(", operationName=");
        sb.append(cardOperationName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.userCountryCode.hashCode() * 31) + this.operationName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest cardDefinitionsRequest = (com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userCountryCode, cardDefinitionsRequest.userCountryCode) && this.operationName == cardDefinitionsRequest.operationName;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest copy(java.lang.String userCountryCode, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName operationName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userCountryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest(userCountryCode, operationName);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName getOperationName() {
        return this.operationName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserCountryCode() {
        return this.userCountryCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest copy$default(com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest cardDefinitionsRequest, java.lang.String str, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardDefinitionsRequest.userCountryCode;
        }
        if ((i & 2) != 0) {
            cardOperationName = cardDefinitionsRequest.operationName;
        }
        return cardDefinitionsRequest.copy(str, cardOperationName);
    }
}
