package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewFlowContextInput;", "flowContext", "creditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewFlowContextInput;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewFlowContextInput;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewFlowContextInput;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewFlowContextInput;", "getFlowContext", "Ljava/lang/Object;", "getCreditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLAutopaySetupOverviewInput {
    private final java.lang.Object creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewFlowContextInput flowContext;

    public BNPLAutopaySetupOverviewInput(com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewFlowContextInput bNPLAutopaySetupOverviewFlowContextInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAutopaySetupOverviewFlowContextInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLCreditProductIdentifier, "");
        this.flowContext = bNPLAutopaySetupOverviewFlowContextInput;
        this.creditAccountId = obj;
        this.creditProductIdentifier = bNPLCreditProductIdentifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewFlowContextInput bNPLAutopaySetupOverviewFlowContextInput = this.flowContext;
        java.lang.Object obj = this.creditAccountId;
        com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLAutopaySetupOverviewInput(flowContext=");
        sb.append(bNPLAutopaySetupOverviewFlowContextInput);
        sb.append(", creditAccountId=");
        sb.append(obj);
        sb.append(", creditProductIdentifier=");
        sb.append(bNPLCreditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.flowContext.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.creditProductIdentifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput bNPLAutopaySetupOverviewInput = (com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, bNPLAutopaySetupOverviewInput.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, bNPLAutopaySetupOverviewInput.creditAccountId) && this.creditProductIdentifier == bNPLAutopaySetupOverviewInput.creditProductIdentifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput copy(com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewFlowContextInput flowContext, java.lang.Object creditAccountId, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput(flowContext, creditAccountId, creditProductIdentifier);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput bNPLAutopaySetupOverviewInput, com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewFlowContextInput bNPLAutopaySetupOverviewFlowContextInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            bNPLAutopaySetupOverviewFlowContextInput = bNPLAutopaySetupOverviewInput.flowContext;
        }
        if ((i & 2) != 0) {
            obj = bNPLAutopaySetupOverviewInput.creditAccountId;
        }
        if ((i & 4) != 0) {
            bNPLCreditProductIdentifier = bNPLAutopaySetupOverviewInput.creditProductIdentifier;
        }
        return bNPLAutopaySetupOverviewInput.copy(bNPLAutopaySetupOverviewFlowContextInput, obj, bNPLCreditProductIdentifier);
    }
}
