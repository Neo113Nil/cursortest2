package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferFxQuoteInput;", "", "id", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CurrencyInput;", "senderAmount", "receiverAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TARGET_CURRENCY_CODE, "<init>", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "copy", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferFxQuoteInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Lcom/apollographql/apollo/api/Optional;", "getSenderAmount", "getReceiverAmount", "getTargetCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentTransferFxQuoteInput {
    private final java.lang.Object id;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> receiverAmount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> senderAmount;
    private final java.lang.Object targetCurrencyCode;

    public PaymentTransferFxQuoteInput(java.lang.Object obj, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> optional2, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        this.id = obj;
        this.senderAmount = optional;
        this.receiverAmount = optional2;
        this.targetCurrencyCode = obj2;
    }

    public final java.lang.Object getId() {
        return this.id;
    }

    public /* synthetic */ PaymentTransferFxQuoteInput(java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, java.lang.Object obj2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, obj2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> getSenderAmount() {
        return this.senderAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> getReceiverAmount() {
        return this.receiverAmount;
    }

    public final java.lang.Object getTargetCurrencyCode() {
        return this.targetCurrencyCode;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> optional = this.senderAmount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> optional2 = this.receiverAmount;
        java.lang.Object obj2 = this.targetCurrencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferFxQuoteInput(id=");
        sb.append(obj);
        sb.append(", senderAmount=");
        sb.append(optional);
        sb.append(", receiverAmount=");
        sb.append(optional2);
        sb.append(", targetCurrencyCode=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.senderAmount.hashCode()) * 31) + this.receiverAmount.hashCode()) * 31) + this.targetCurrencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PaymentTransferFxQuoteInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferFxQuoteInput paymentTransferFxQuoteInput = (com.paypal.oslo.api.graphql.schema.type.PaymentTransferFxQuoteInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentTransferFxQuoteInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderAmount, paymentTransferFxQuoteInput.senderAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiverAmount, paymentTransferFxQuoteInput.receiverAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetCurrencyCode, paymentTransferFxQuoteInput.targetCurrencyCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferFxQuoteInput copy(java.lang.Object id, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> senderAmount, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> receiverAmount, java.lang.Object targetCurrencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetCurrencyCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.PaymentTransferFxQuoteInput(id, senderAmount, receiverAmount, targetCurrencyCode);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Object getTargetCurrencyCode() {
        return this.targetCurrencyCode;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> component3() {
        return this.receiverAmount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CurrencyInput> component2() {
        return this.senderAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentTransferFxQuoteInput copy$default(com.paypal.oslo.api.graphql.schema.type.PaymentTransferFxQuoteInput paymentTransferFxQuoteInput, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = paymentTransferFxQuoteInput.id;
        }
        if ((i & 2) != 0) {
            optional = paymentTransferFxQuoteInput.senderAmount;
        }
        if ((i & 4) != 0) {
            optional2 = paymentTransferFxQuoteInput.receiverAmount;
        }
        if ((i & 8) != 0) {
            obj2 = paymentTransferFxQuoteInput.targetCurrencyCode;
        }
        return paymentTransferFxQuoteInput.copy(obj, optional, optional2, obj2);
    }
}
