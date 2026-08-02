package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanOverviewInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanOverviewFlowContextInput;", "flowContext", "creditAccountId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanOverviewFlowContextInput;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanOverviewFlowContextInput;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanOverviewFlowContextInput;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanOverviewInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanOverviewFlowContextInput;", "getFlowContext", "Ljava/lang/Object;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLServicingPlanOverviewInput {
    private final java.lang.Object creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewFlowContextInput flowContext;

    public BNPLServicingPlanOverviewInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewFlowContextInput bNPLServicingPlanOverviewFlowContextInput, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLServicingPlanOverviewFlowContextInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.flowContext = bNPLServicingPlanOverviewFlowContextInput;
        this.creditAccountId = obj;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewFlowContextInput bNPLServicingPlanOverviewFlowContextInput = this.flowContext;
        java.lang.Object obj = this.creditAccountId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLServicingPlanOverviewInput(flowContext=");
        sb.append(bNPLServicingPlanOverviewFlowContextInput);
        sb.append(", creditAccountId=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.flowContext.hashCode() * 31) + this.creditAccountId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewInput bNPLServicingPlanOverviewInput = (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, bNPLServicingPlanOverviewInput.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, bNPLServicingPlanOverviewInput.creditAccountId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewInput copy(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewFlowContextInput flowContext, java.lang.Object creditAccountId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewInput(flowContext, creditAccountId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewInput bNPLServicingPlanOverviewInput, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanOverviewFlowContextInput bNPLServicingPlanOverviewFlowContextInput, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            bNPLServicingPlanOverviewFlowContextInput = bNPLServicingPlanOverviewInput.flowContext;
        }
        if ((i & 2) != 0) {
            obj = bNPLServicingPlanOverviewInput.creditAccountId;
        }
        return bNPLServicingPlanOverviewInput.copy(bNPLServicingPlanOverviewFlowContextInput, obj);
    }
}
