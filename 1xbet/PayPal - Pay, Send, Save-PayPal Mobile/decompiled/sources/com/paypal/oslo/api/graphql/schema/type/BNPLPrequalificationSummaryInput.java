package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifiers", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;", "flowContext", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCreditProductIdentifiers", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;", "getFlowContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLPrequalificationSummaryInput {
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> creditProductIdentifiers;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput flowContext;

    /* JADX WARN: Multi-variable type inference failed */
    public BNPLPrequalificationSummaryInput(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> list, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput bNPLAcquisitionFlowContextInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAcquisitionFlowContextInput, "");
        this.creditProductIdentifiers = list;
        this.flowContext = bNPLAcquisitionFlowContextInput;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> getCreditProductIdentifiers() {
        return this.creditProductIdentifiers;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> list = this.creditProductIdentifiers;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput bNPLAcquisitionFlowContextInput = this.flowContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLPrequalificationSummaryInput(creditProductIdentifiers=");
        sb.append(list);
        sb.append(", flowContext=");
        sb.append(bNPLAcquisitionFlowContextInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.creditProductIdentifiers.hashCode() * 31) + this.flowContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput = (com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifiers, bNPLPrequalificationSummaryInput.creditProductIdentifiers) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, bNPLPrequalificationSummaryInput.flowContext);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> creditProductIdentifiers, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput flowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifiers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput(creditProductIdentifiers, flowContext);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> component1() {
        return this.creditProductIdentifiers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput, java.util.List list, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput bNPLAcquisitionFlowContextInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = bNPLPrequalificationSummaryInput.creditProductIdentifiers;
        }
        if ((i & 2) != 0) {
            bNPLAcquisitionFlowContextInput = bNPLPrequalificationSummaryInput.flowContext;
        }
        return bNPLPrequalificationSummaryInput.copy(list, bNPLAcquisitionFlowContextInput);
    }
}
