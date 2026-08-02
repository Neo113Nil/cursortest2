package com.paypal.oslo.feature.wallet.cards.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperation;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", "operationName", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationParameter;", "inputParameters", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", "getOperationName", "Ljava/util/List;", "getInputParameters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardOperation {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter> inputParameters;
    private final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName operationName;

    public CardOperation(com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardOperationName, "");
        this.operationName = cardOperationName;
        this.inputParameters = list;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName getOperationName() {
        return this.operationName;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter> getInputParameters() {
        return this.inputParameters;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName = this.operationName;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter> list = this.inputParameters;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardOperation(operationName=");
        sb.append(cardOperationName);
        sb.append(", inputParameters=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.operationName.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter> list = this.inputParameters;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation cardOperation = (com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation) other;
        return this.operationName == cardOperation.operationName && kotlin.jvm.internal.Intrinsics.areEqual(this.inputParameters, cardOperation.inputParameters);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation copy(com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName operationName, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter> inputParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation(operationName, inputParameters);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter> component2() {
        return this.inputParameters;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName getOperationName() {
        return this.operationName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation copy$default(com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation cardOperation, com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardOperationName = cardOperation.operationName;
        }
        if ((i & 2) != 0) {
            list = cardOperation.inputParameters;
        }
        return cardOperation.copy(cardOperationName, list);
    }
}
