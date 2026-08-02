package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddFinancialInstrumentsToPaymentTransferAttemptInput;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "", "", "preferredFundingInstrumentIds", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/AddFinancialInstrumentsToPaymentTransferAttemptInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getTransferAttemptId", "Ljava/util/List;", "getPreferredFundingInstrumentIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddFinancialInstrumentsToPaymentTransferAttemptInput {
    private final java.util.List<java.lang.String> preferredFundingInstrumentIds;
    private final java.lang.Object transferAttemptId;

    public AddFinancialInstrumentsToPaymentTransferAttemptInput(java.lang.Object obj, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.transferAttemptId = obj;
        this.preferredFundingInstrumentIds = list;
    }

    public final java.lang.Object getTransferAttemptId() {
        return this.transferAttemptId;
    }

    public final java.util.List<java.lang.String> getPreferredFundingInstrumentIds() {
        return this.preferredFundingInstrumentIds;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.transferAttemptId;
        java.util.List<java.lang.String> list = this.preferredFundingInstrumentIds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFinancialInstrumentsToPaymentTransferAttemptInput(transferAttemptId=");
        sb.append(obj);
        sb.append(", preferredFundingInstrumentIds=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.transferAttemptId.hashCode() * 31) + this.preferredFundingInstrumentIds.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput addFinancialInstrumentsToPaymentTransferAttemptInput = (com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, addFinancialInstrumentsToPaymentTransferAttemptInput.transferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrumentIds, addFinancialInstrumentsToPaymentTransferAttemptInput.preferredFundingInstrumentIds);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput copy(java.lang.Object transferAttemptId, java.util.List<java.lang.String> preferredFundingInstrumentIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredFundingInstrumentIds, "");
        return new com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput(transferAttemptId, preferredFundingInstrumentIds);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.preferredFundingInstrumentIds;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getTransferAttemptId() {
        return this.transferAttemptId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput copy$default(com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput addFinancialInstrumentsToPaymentTransferAttemptInput, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = addFinancialInstrumentsToPaymentTransferAttemptInput.transferAttemptId;
        }
        if ((i & 2) != 0) {
            list = addFinancialInstrumentsToPaymentTransferAttemptInput.preferredFundingInstrumentIds;
        }
        return addFinancialInstrumentsToPaymentTransferAttemptInput.copy(obj, list);
    }
}
