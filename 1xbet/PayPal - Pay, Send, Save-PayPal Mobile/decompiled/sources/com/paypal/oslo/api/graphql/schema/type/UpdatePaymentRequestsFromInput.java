package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentRequestsFromInput;", "", "", "allowFindByIdentifiers", "allowPaymentRequests", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "paymentRequestsFrom", "<init>", "(ZZLcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;)V", "component1", "()Z", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "copy", "(ZZLcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentRequestsFromInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getAllowFindByIdentifiers", "getAllowPaymentRequests", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "getPaymentRequestsFrom"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePaymentRequestsFromInput {
    private final boolean allowFindByIdentifiers;
    private final boolean allowPaymentRequests;
    private final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFrom;

    public UpdatePaymentRequestsFromInput(boolean z, boolean z2, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestsFromType, "");
        this.allowFindByIdentifiers = z;
        this.allowPaymentRequests = z2;
        this.paymentRequestsFrom = paymentRequestsFromType;
    }

    public final boolean getAllowFindByIdentifiers() {
        return this.allowFindByIdentifiers;
    }

    public final boolean getAllowPaymentRequests() {
        return this.allowPaymentRequests;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType getPaymentRequestsFrom() {
        return this.paymentRequestsFrom;
    }

    public final java.lang.String toString() {
        boolean z = this.allowFindByIdentifiers;
        boolean z2 = this.allowPaymentRequests;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType = this.paymentRequestsFrom;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentRequestsFromInput(allowFindByIdentifiers=");
        sb.append(z);
        sb.append(", allowPaymentRequests=");
        sb.append(z2);
        sb.append(", paymentRequestsFrom=");
        sb.append(paymentRequestsFromType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.allowFindByIdentifiers) * 31) + java.lang.Boolean.hashCode(this.allowPaymentRequests)) * 31) + this.paymentRequestsFrom.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdatePaymentRequestsFromInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdatePaymentRequestsFromInput updatePaymentRequestsFromInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePaymentRequestsFromInput) other;
        return this.allowFindByIdentifiers == updatePaymentRequestsFromInput.allowFindByIdentifiers && this.allowPaymentRequests == updatePaymentRequestsFromInput.allowPaymentRequests && this.paymentRequestsFrom == updatePaymentRequestsFromInput.paymentRequestsFrom;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentRequestsFromInput copy(boolean allowFindByIdentifiers, boolean allowPaymentRequests, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFrom) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestsFrom, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentRequestsFromInput(allowFindByIdentifiers, allowPaymentRequests, paymentRequestsFrom);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType getPaymentRequestsFrom() {
        return this.paymentRequestsFrom;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllowPaymentRequests() {
        return this.allowPaymentRequests;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowFindByIdentifiers() {
        return this.allowFindByIdentifiers;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdatePaymentRequestsFromInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdatePaymentRequestsFromInput updatePaymentRequestsFromInput, boolean z, boolean z2, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = updatePaymentRequestsFromInput.allowFindByIdentifiers;
        }
        if ((i & 2) != 0) {
            z2 = updatePaymentRequestsFromInput.allowPaymentRequests;
        }
        if ((i & 4) != 0) {
            paymentRequestsFromType = updatePaymentRequestsFromInput.paymentRequestsFrom;
        }
        return updatePaymentRequestsFromInput.copy(z, z2, paymentRequestsFromType);
    }
}
