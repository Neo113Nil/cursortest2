package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationEligibilityInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;", "flowContext", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifiers", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationEligibilityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;", "getFlowContext", "Ljava/util/List;", "getCreditProductIdentifiers"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLApplicationEligibilityInput {
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> creditProductIdentifiers;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput flowContext;

    /* JADX WARN: Multi-variable type inference failed */
    public BNPLApplicationEligibilityInput(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput bNPLAcquisitionFlowContextInput, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAcquisitionFlowContextInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.flowContext = bNPLAcquisitionFlowContextInput;
        this.creditProductIdentifiers = list;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> getCreditProductIdentifiers() {
        return this.creditProductIdentifiers;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput bNPLAcquisitionFlowContextInput = this.flowContext;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> list = this.creditProductIdentifiers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLApplicationEligibilityInput(flowContext=");
        sb.append(bNPLAcquisitionFlowContextInput);
        sb.append(", creditProductIdentifiers=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.flowContext.hashCode() * 31) + this.creditProductIdentifiers.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput bNPLApplicationEligibilityInput = (com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, bNPLApplicationEligibilityInput.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifiers, bNPLApplicationEligibilityInput.creditProductIdentifiers);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput copy(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput flowContext, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> creditProductIdentifiers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifiers, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput(flowContext, creditProductIdentifiers);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> component2() {
        return this.creditProductIdentifiers;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput bNPLApplicationEligibilityInput, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput bNPLAcquisitionFlowContextInput, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLAcquisitionFlowContextInput = bNPLApplicationEligibilityInput.flowContext;
        }
        if ((i & 2) != 0) {
            list = bNPLApplicationEligibilityInput.creditProductIdentifiers;
        }
        return bNPLApplicationEligibilityInput.copy(bNPLAcquisitionFlowContextInput, list);
    }
}
