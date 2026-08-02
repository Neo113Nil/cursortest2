package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentTermInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentTermType;", "termType", "dueDate", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentTermInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getTermType", "getDueDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InvoicePaymentTermInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> dueDate;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType> termType;

    /* JADX WARN: Multi-variable type inference failed */
    public InvoicePaymentTermInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.termType = optional;
        this.dueDate = optional2;
    }

    public /* synthetic */ InvoicePaymentTermInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType> getTermType() {
        return this.termType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getDueDate() {
        return this.dueDate;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType> optional = this.termType;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.dueDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoicePaymentTermInput(termType=");
        sb.append(optional);
        sb.append(", dueDate=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.termType.hashCode() * 31) + this.dueDate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermInput invoicePaymentTermInput = (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.termType, invoicePaymentTermInput.termType) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, invoicePaymentTermInput.dueDate);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType> termType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> dueDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueDate, "");
        return new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermInput(termType, dueDate);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.dueDate;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType> component1() {
        return this.termType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermInput copy$default(com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermInput invoicePaymentTermInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = invoicePaymentTermInput.termType;
        }
        if ((i & 2) != 0) {
            optional2 = invoicePaymentTermInput.dueDate;
        }
        return invoicePaymentTermInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvoicePaymentTermInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
