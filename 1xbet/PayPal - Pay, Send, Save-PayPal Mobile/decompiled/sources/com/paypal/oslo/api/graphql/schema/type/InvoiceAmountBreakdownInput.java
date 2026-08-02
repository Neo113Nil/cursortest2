package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J¼\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b/\u0010\u0013R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0013R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b1\u0010\u0013R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b2\u0010\u0013R\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b3\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceAmountBreakdownInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "amount", "Lcom/apollographql/apollo/api/Optional;", "dueAmount", "gratuity", "itemTotal", "invoiceDiscount", "itemDiscount", "taxTotal", "customAmount", "shippingAmount", "shippingTaxAmount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceAmountBreakdownInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "getAmount", "Lcom/apollographql/apollo/api/Optional;", "getDueAmount", "getGratuity", "getItemTotal", "getInvoiceDiscount", "getItemDiscount", "getTaxTotal", "getCustomAmount", "getShippingAmount", "getShippingTaxAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InvoiceAmountBreakdownInput {
    private final com.paypal.oslo.api.graphql.schema.type.MoneyInput amount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> customAmount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> dueAmount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> gratuity;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> invoiceDiscount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> itemDiscount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> itemTotal;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> shippingAmount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> shippingTaxAmount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> taxTotal;

    public InvoiceAmountBreakdownInput(com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional3, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional4, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional5, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional6, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional7, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional8, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional9, "");
        this.amount = moneyInput;
        this.dueAmount = optional;
        this.gratuity = optional2;
        this.itemTotal = optional3;
        this.invoiceDiscount = optional4;
        this.itemDiscount = optional5;
        this.taxTotal = optional6;
        this.customAmount = optional7;
        this.shippingAmount = optional8;
        this.shippingTaxAmount = optional9;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyInput getAmount() {
        return this.amount;
    }

    public /* synthetic */ InvoiceAmountBreakdownInput(com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, com.apollographql.apollo.api.Optional optional7, com.apollographql.apollo.api.Optional optional8, com.apollographql.apollo.api.Optional optional9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(moneyInput, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional7, (i & 256) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional8, (i & 512) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional9);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getDueAmount() {
        return this.dueAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getGratuity() {
        return this.gratuity;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getItemTotal() {
        return this.itemTotal;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getInvoiceDiscount() {
        return this.invoiceDiscount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getItemDiscount() {
        return this.itemDiscount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getTaxTotal() {
        return this.taxTotal;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getCustomAmount() {
        return this.customAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getShippingAmount() {
        return this.shippingAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getShippingTaxAmount() {
        return this.shippingTaxAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = this.amount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional = this.dueAmount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2 = this.gratuity;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional3 = this.itemTotal;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional4 = this.invoiceDiscount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional5 = this.itemDiscount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional6 = this.taxTotal;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional7 = this.customAmount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional8 = this.shippingAmount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional9 = this.shippingTaxAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceAmountBreakdownInput(amount=");
        sb.append(moneyInput);
        sb.append(", dueAmount=");
        sb.append(optional);
        sb.append(", gratuity=");
        sb.append(optional2);
        sb.append(", itemTotal=");
        sb.append(optional3);
        sb.append(", invoiceDiscount=");
        sb.append(optional4);
        sb.append(", itemDiscount=");
        sb.append(optional5);
        sb.append(", taxTotal=");
        sb.append(optional6);
        sb.append(", customAmount=");
        sb.append(optional7);
        sb.append(", shippingAmount=");
        sb.append(optional8);
        sb.append(", shippingTaxAmount=");
        sb.append(optional9);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((this.amount.hashCode() * 31) + this.dueAmount.hashCode()) * 31) + this.gratuity.hashCode()) * 31) + this.itemTotal.hashCode()) * 31) + this.invoiceDiscount.hashCode()) * 31) + this.itemDiscount.hashCode()) * 31) + this.taxTotal.hashCode()) * 31) + this.customAmount.hashCode()) * 31) + this.shippingAmount.hashCode()) * 31) + this.shippingTaxAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InvoiceAmountBreakdownInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InvoiceAmountBreakdownInput invoiceAmountBreakdownInput = (com.paypal.oslo.api.graphql.schema.type.InvoiceAmountBreakdownInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, invoiceAmountBreakdownInput.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueAmount, invoiceAmountBreakdownInput.dueAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.gratuity, invoiceAmountBreakdownInput.gratuity) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemTotal, invoiceAmountBreakdownInput.itemTotal) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceDiscount, invoiceAmountBreakdownInput.invoiceDiscount) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemDiscount, invoiceAmountBreakdownInput.itemDiscount) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxTotal, invoiceAmountBreakdownInput.taxTotal) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, invoiceAmountBreakdownInput.customAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAmount, invoiceAmountBreakdownInput.shippingAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingTaxAmount, invoiceAmountBreakdownInput.shippingTaxAmount);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoiceAmountBreakdownInput copy(com.paypal.oslo.api.graphql.schema.type.MoneyInput amount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> dueAmount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> gratuity, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> itemTotal, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> invoiceDiscount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> itemDiscount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> taxTotal, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> customAmount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> shippingAmount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> shippingTaxAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gratuity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemTotal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceDiscount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemDiscount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxTotal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingTaxAmount, "");
        return new com.paypal.oslo.api.graphql.schema.type.InvoiceAmountBreakdownInput(amount, dueAmount, gratuity, itemTotal, invoiceDiscount, itemDiscount, taxTotal, customAmount, shippingAmount, shippingTaxAmount);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component9() {
        return this.shippingAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component8() {
        return this.customAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component7() {
        return this.taxTotal;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component6() {
        return this.itemDiscount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component5() {
        return this.invoiceDiscount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component4() {
        return this.itemTotal;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component3() {
        return this.gratuity;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component2() {
        return this.dueAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component10() {
        return this.shippingTaxAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyInput getAmount() {
        return this.amount;
    }
}
