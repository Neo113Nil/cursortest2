package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanInput;", "", "creditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowContextInput;", "flowContext", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowContextInput;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowContextInput;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowContextInput;)Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowContextInput;", "getFlowContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CloseBNPLLoanInput {
    private final java.lang.Object creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput flowContext;

    public CloseBNPLLoanInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput closeBNPLLoanFlowContextInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeBNPLLoanFlowContextInput, "");
        this.creditAccountId = obj;
        this.flowContext = closeBNPLLoanFlowContextInput;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.creditAccountId;
        com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput closeBNPLLoanFlowContextInput = this.flowContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseBNPLLoanInput(creditAccountId=");
        sb.append(obj);
        sb.append(", flowContext=");
        sb.append(closeBNPLLoanFlowContextInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.creditAccountId.hashCode() * 31) + this.flowContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput closeBNPLLoanInput = (com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, closeBNPLLoanInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, closeBNPLLoanInput.flowContext);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput copy(java.lang.Object creditAccountId, com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput flowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        return new com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput(creditAccountId, flowContext);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput copy$default(com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput closeBNPLLoanInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput closeBNPLLoanFlowContextInput, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = closeBNPLLoanInput.creditAccountId;
        }
        if ((i & 2) != 0) {
            closeBNPLLoanFlowContextInput = closeBNPLLoanInput.flowContext;
        }
        return closeBNPLLoanInput.copy(obj, closeBNPLLoanFlowContextInput);
    }
}
