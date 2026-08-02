package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CancelPaymentRequestInput;", "", "paymentRequestId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;", "reason", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;)Lcom/paypal/oslo/api/graphql/schema/type/CancelPaymentRequestInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPaymentRequestId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CancelPaymentRequestInput {
    private final java.lang.Object paymentRequestId;
    private final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason reason;

    public CancelPaymentRequestInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason paymentRequestCancelReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestCancelReason, "");
        this.paymentRequestId = obj;
        this.reason = paymentRequestCancelReason;
    }

    public final java.lang.Object getPaymentRequestId() {
        return this.paymentRequestId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason getReason() {
        return this.reason;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.paymentRequestId;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason paymentRequestCancelReason = this.reason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelPaymentRequestInput(paymentRequestId=");
        sb.append(obj);
        sb.append(", reason=");
        sb.append(paymentRequestCancelReason);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.paymentRequestId.hashCode() * 31) + this.reason.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CancelPaymentRequestInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CancelPaymentRequestInput cancelPaymentRequestInput = (com.paypal.oslo.api.graphql.schema.type.CancelPaymentRequestInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentRequestId, cancelPaymentRequestInput.paymentRequestId) && this.reason == cancelPaymentRequestInput.reason;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CancelPaymentRequestInput copy(java.lang.Object paymentRequestId, com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return new com.paypal.oslo.api.graphql.schema.type.CancelPaymentRequestInput(paymentRequestId, reason);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason getReason() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getPaymentRequestId() {
        return this.paymentRequestId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CancelPaymentRequestInput copy$default(com.paypal.oslo.api.graphql.schema.type.CancelPaymentRequestInput cancelPaymentRequestInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason paymentRequestCancelReason, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = cancelPaymentRequestInput.paymentRequestId;
        }
        if ((i & 2) != 0) {
            paymentRequestCancelReason = cancelPaymentRequestInput.reason;
        }
        return cancelPaymentRequestInput.copy(obj, paymentRequestCancelReason);
    }
}
