package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ExecutePaymentTransferInput;", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "intent", "Lcom/apollographql/apollo/api/Optional;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ExecutePaymentTransferInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "getIntent", "Lcom/apollographql/apollo/api/Optional;", "getFundingOptionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExecutePaymentTransferInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> fundingOptionId;
    private final java.lang.Object id;
    private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent intent;

    public ExecutePaymentTransferInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.id = obj;
        this.intent = paymentTransferIntent;
        this.fundingOptionId = optional;
    }

    public final java.lang.Object getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent getIntent() {
        return this.intent;
    }

    public /* synthetic */ ExecutePaymentTransferInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, paymentTransferIntent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent = this.intent;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.fundingOptionId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecutePaymentTransferInput(id=");
        sb.append(obj);
        sb.append(", intent=");
        sb.append(paymentTransferIntent);
        sb.append(", fundingOptionId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.intent.hashCode()) * 31) + this.fundingOptionId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput executePaymentTransferInput = (com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, executePaymentTransferInput.id) && this.intent == executePaymentTransferInput.intent && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, executePaymentTransferInput.fundingOptionId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput copy(java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent intent, com.apollographql.apollo.api.Optional<? extends java.lang.Object> fundingOptionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
        return new com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput(id, intent, fundingOptionId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.fundingOptionId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput copy$default(com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput executePaymentTransferInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = executePaymentTransferInput.id;
        }
        if ((i & 2) != 0) {
            paymentTransferIntent = executePaymentTransferInput.intent;
        }
        if ((i & 4) != 0) {
            optional = executePaymentTransferInput.fundingOptionId;
        }
        return executePaymentTransferInput.copy(obj, paymentTransferIntent, optional);
    }
}
