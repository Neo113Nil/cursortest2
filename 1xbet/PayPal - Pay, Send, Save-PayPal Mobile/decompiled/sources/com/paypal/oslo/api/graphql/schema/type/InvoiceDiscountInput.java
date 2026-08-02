package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDiscountInput;", "", "Lcom/apollographql/apollo/api/Optional;", "percent", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "amount", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDiscountInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getPercent", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InvoiceDiscountInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> percent;

    public InvoiceDiscountInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.percent = optional;
        this.amount = optional2;
    }

    public /* synthetic */ InvoiceDiscountInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getPercent() {
        return this.percent;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.percent;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2 = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceDiscountInput(percent=");
        sb.append(optional);
        sb.append(", amount=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.percent.hashCode() * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput invoiceDiscountInput = (com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.percent, invoiceDiscountInput.percent) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, invoiceDiscountInput.amount);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> percent, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput(percent, amount);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component2() {
        return this.amount;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.percent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput copy$default(com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountInput invoiceDiscountInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = invoiceDiscountInput.percent;
        }
        if ((i & 2) != 0) {
            optional2 = invoiceDiscountInput.amount;
        }
        return invoiceDiscountInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvoiceDiscountInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
