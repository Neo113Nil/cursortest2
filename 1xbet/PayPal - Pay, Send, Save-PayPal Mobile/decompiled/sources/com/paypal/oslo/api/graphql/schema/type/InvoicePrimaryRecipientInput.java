package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoicePrimaryRecipientInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceActorInput;", "billingDetails", "Lcom/apollographql/apollo/api/Optional;", "shippingDetails", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/InvoiceActorInput;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/InvoiceActorInput;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/InvoiceActorInput;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/InvoicePrimaryRecipientInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceActorInput;", "getBillingDetails", "Lcom/apollographql/apollo/api/Optional;", "getShippingDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InvoicePrimaryRecipientInput {
    private final com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput billingDetails;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput> shippingDetails;

    public InvoicePrimaryRecipientInput(com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput invoiceActorInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceActorInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.billingDetails = invoiceActorInput;
        this.shippingDetails = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput getBillingDetails() {
        return this.billingDetails;
    }

    public /* synthetic */ InvoicePrimaryRecipientInput(com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput invoiceActorInput, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(invoiceActorInput, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput> getShippingDetails() {
        return this.shippingDetails;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput invoiceActorInput = this.billingDetails;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput> optional = this.shippingDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoicePrimaryRecipientInput(billingDetails=");
        sb.append(invoiceActorInput);
        sb.append(", shippingDetails=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.billingDetails.hashCode() * 31) + this.shippingDetails.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput invoicePrimaryRecipientInput = (com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.billingDetails, invoicePrimaryRecipientInput.billingDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingDetails, invoicePrimaryRecipientInput.shippingDetails);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput copy(com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput billingDetails, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput> shippingDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingDetails, "");
        return new com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput(billingDetails, shippingDetails);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput> component2() {
        return this.shippingDetails;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput getBillingDetails() {
        return this.billingDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput copy$default(com.paypal.oslo.api.graphql.schema.type.InvoicePrimaryRecipientInput invoicePrimaryRecipientInput, com.paypal.oslo.api.graphql.schema.type.InvoiceActorInput invoiceActorInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            invoiceActorInput = invoicePrimaryRecipientInput.billingDetails;
        }
        if ((i & 2) != 0) {
            optional = invoicePrimaryRecipientInput.shippingDetails;
        }
        return invoicePrimaryRecipientInput.copy(invoiceActorInput, optional);
    }
}
