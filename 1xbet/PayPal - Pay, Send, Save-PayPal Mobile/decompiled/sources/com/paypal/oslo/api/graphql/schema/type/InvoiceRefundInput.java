package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceRefundInput;", "", "", "id", "Lcom/apollographql/apollo/api/Optional;", "refundDate", "Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;", "method", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "amount", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;", "component4", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceRefundInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/apollographql/apollo/api/Optional;", "getRefundDate", "Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;", "getMethod", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InvoiceRefundInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount;
    private final java.lang.String id;
    private final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod method;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> refundDate;

    public InvoiceRefundInput(java.lang.String str, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoicePaymentMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.id = str;
        this.refundDate = optional;
        this.method = invoicePaymentMethod;
        this.amount = optional2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ InvoiceRefundInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, invoicePaymentMethod, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getRefundDate() {
        return this.refundDate;
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod getMethod() {
        return this.method;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.refundDate;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod = this.method;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2 = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceRefundInput(id=");
        sb.append(str);
        sb.append(", refundDate=");
        sb.append(optional);
        sb.append(", method=");
        sb.append(invoicePaymentMethod);
        sb.append(", amount=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.refundDate.hashCode()) * 31) + this.method.hashCode()) * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InvoiceRefundInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InvoiceRefundInput invoiceRefundInput = (com.paypal.oslo.api.graphql.schema.type.InvoiceRefundInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, invoiceRefundInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.refundDate, invoiceRefundInput.refundDate) && this.method == invoiceRefundInput.method && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, invoiceRefundInput.amount);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoiceRefundInput copy(java.lang.String id, com.apollographql.apollo.api.Optional<? extends java.lang.Object> refundDate, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod method, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.api.graphql.schema.type.InvoiceRefundInput(id, refundDate, method, amount);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component4() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod getMethod() {
        return this.method;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.refundDate;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoiceRefundInput copy$default(com.paypal.oslo.api.graphql.schema.type.InvoiceRefundInput invoiceRefundInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = invoiceRefundInput.id;
        }
        if ((i & 2) != 0) {
            optional = invoiceRefundInput.refundDate;
        }
        if ((i & 4) != 0) {
            invoicePaymentMethod = invoiceRefundInput.method;
        }
        if ((i & 8) != 0) {
            optional2 = invoiceRefundInput.amount;
        }
        return invoiceRefundInput.copy(str, optional, invoicePaymentMethod, optional2);
    }
}
