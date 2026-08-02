package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentSortOptionsInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentSortField;", "field", "Lcom/paypal/oslo/api/graphql/schema/type/SortOrder;", "order", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentSortField;Lcom/paypal/oslo/api/graphql/schema/type/SortOrder;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentSortField;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SortOrder;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentSortField;Lcom/paypal/oslo/api/graphql/schema/type/SortOrder;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentSortOptionsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentSortField;", "getField", "Lcom/paypal/oslo/api/graphql/schema/type/SortOrder;", "getOrder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditServicingPaymentSortOptionsInput {
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentSortField field;
    private final com.paypal.oslo.api.graphql.schema.type.SortOrder order;

    public RevolvingCreditServicingPaymentSortOptionsInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentSortField revolvingCreditPaymentSortField, com.paypal.oslo.api.graphql.schema.type.SortOrder sortOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentSortField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortOrder, "");
        this.field = revolvingCreditPaymentSortField;
        this.order = sortOrder;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentSortField getField() {
        return this.field;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SortOrder getOrder() {
        return this.order;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentSortField revolvingCreditPaymentSortField = this.field;
        com.paypal.oslo.api.graphql.schema.type.SortOrder sortOrder = this.order;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingPaymentSortOptionsInput(field=");
        sb.append(revolvingCreditPaymentSortField);
        sb.append(", order=");
        sb.append(sortOrder);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.field.hashCode() * 31) + this.order.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentSortOptionsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentSortOptionsInput revolvingCreditServicingPaymentSortOptionsInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentSortOptionsInput) other;
        return this.field == revolvingCreditServicingPaymentSortOptionsInput.field && this.order == revolvingCreditServicingPaymentSortOptionsInput.order;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentSortOptionsInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentSortField field, com.paypal.oslo.api.graphql.schema.type.SortOrder order) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(order, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentSortOptionsInput(field, order);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SortOrder getOrder() {
        return this.order;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentSortField getField() {
        return this.field;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentSortOptionsInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentSortOptionsInput revolvingCreditServicingPaymentSortOptionsInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentSortField revolvingCreditPaymentSortField, com.paypal.oslo.api.graphql.schema.type.SortOrder sortOrder, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditPaymentSortField = revolvingCreditServicingPaymentSortOptionsInput.field;
        }
        if ((i & 2) != 0) {
            sortOrder = revolvingCreditServicingPaymentSortOptionsInput.order;
        }
        return revolvingCreditServicingPaymentSortOptionsInput.copy(revolvingCreditPaymentSortField, sortOrder);
    }
}
