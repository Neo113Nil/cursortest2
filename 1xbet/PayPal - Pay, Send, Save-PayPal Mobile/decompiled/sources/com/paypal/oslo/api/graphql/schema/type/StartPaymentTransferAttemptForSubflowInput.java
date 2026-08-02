package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/StartPaymentTransferAttemptForSubflowInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;", "subflow", "subflowContextId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/StartPaymentTransferAttemptForSubflowInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;", "getSubflow", "Ljava/lang/Object;", "getSubflowContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StartPaymentTransferAttemptForSubflowInput {
    private final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow subflow;
    private final java.lang.Object subflowContextId;

    public StartPaymentTransferAttemptForSubflowInput(com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSubflow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.subflow = paymentSubflow;
        this.subflowContextId = obj;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow getSubflow() {
        return this.subflow;
    }

    public final java.lang.Object getSubflowContextId() {
        return this.subflowContextId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow = this.subflow;
        java.lang.Object obj = this.subflowContextId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StartPaymentTransferAttemptForSubflowInput(subflow=");
        sb.append(paymentSubflow);
        sb.append(", subflowContextId=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.subflow.hashCode() * 31) + this.subflowContextId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput startPaymentTransferAttemptForSubflowInput = (com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput) other;
        return this.subflow == startPaymentTransferAttemptForSubflowInput.subflow && kotlin.jvm.internal.Intrinsics.areEqual(this.subflowContextId, startPaymentTransferAttemptForSubflowInput.subflowContextId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput copy(com.paypal.oslo.api.graphql.schema.type.PaymentSubflow subflow, java.lang.Object subflowContextId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subflow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subflowContextId, "");
        return new com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput(subflow, subflowContextId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getSubflowContextId() {
        return this.subflowContextId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow getSubflow() {
        return this.subflow;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput copy$default(com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput startPaymentTransferAttemptForSubflowInput, com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            paymentSubflow = startPaymentTransferAttemptForSubflowInput.subflow;
        }
        if ((i & 2) != 0) {
            obj = startPaymentTransferAttemptForSubflowInput.subflowContextId;
        }
        return startPaymentTransferAttemptForSubflowInput.copy(paymentSubflow, obj);
    }
}
