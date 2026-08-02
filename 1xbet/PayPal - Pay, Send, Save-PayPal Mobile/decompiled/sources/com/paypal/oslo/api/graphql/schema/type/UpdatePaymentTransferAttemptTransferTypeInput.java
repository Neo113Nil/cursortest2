package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptTransferTypeInput;", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_TYPE, "Lcom/apollographql/apollo/api/Optional;", "shippingAddressId", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptTransferTypeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "getTransferType", "Lcom/apollographql/apollo/api/Optional;", "getShippingAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePaymentTransferAttemptTransferTypeInput {
    private final java.lang.Object id;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> shippingAddressId;
    private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType transferType;

    public UpdatePaymentTransferAttemptTransferTypeInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.id = obj;
        this.transferType = paymentTransferType;
        this.shippingAddressId = optional;
    }

    public final java.lang.Object getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getTransferType() {
        return this.transferType;
    }

    public /* synthetic */ UpdatePaymentTransferAttemptTransferTypeInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, paymentTransferType, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getShippingAddressId() {
        return this.shippingAddressId;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = this.transferType;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.shippingAddressId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentTransferAttemptTransferTypeInput(id=");
        sb.append(obj);
        sb.append(", transferType=");
        sb.append(paymentTransferType);
        sb.append(", shippingAddressId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.transferType.hashCode()) * 31) + this.shippingAddressId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput updatePaymentTransferAttemptTransferTypeInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, updatePaymentTransferAttemptTransferTypeInput.id) && this.transferType == updatePaymentTransferAttemptTransferTypeInput.transferType && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAddressId, updatePaymentTransferAttemptTransferTypeInput.shippingAddressId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput copy(java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType transferType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> shippingAddressId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddressId, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput(id, transferType, shippingAddressId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.shippingAddressId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getTransferType() {
        return this.transferType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput updatePaymentTransferAttemptTransferTypeInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = updatePaymentTransferAttemptTransferTypeInput.id;
        }
        if ((i & 2) != 0) {
            paymentTransferType = updatePaymentTransferAttemptTransferTypeInput.transferType;
        }
        if ((i & 4) != 0) {
            optional = updatePaymentTransferAttemptTransferTypeInput.shippingAddressId;
        }
        return updatePaymentTransferAttemptTransferTypeInput.copy(obj, paymentTransferType, optional);
    }
}
