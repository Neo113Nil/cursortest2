package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ContinueRevolvingCreditApplicationInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowContextInput;", "flowContext", "Lcom/apollographql/apollo/api/Optional;", "purchaseSessionToken", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowContextInput;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowContextInput;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowContextInput;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ContinueRevolvingCreditApplicationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowContextInput;", "getFlowContext", "Lcom/apollographql/apollo/api/Optional;", "getPurchaseSessionToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContinueRevolvingCreditApplicationInput {
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput flowContext;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> purchaseSessionToken;

    public ContinueRevolvingCreditApplicationInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput revolvingCreditAcquisitionFlowContextInput, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAcquisitionFlowContextInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
        this.flowContext = revolvingCreditAcquisitionFlowContextInput;
        this.purchaseSessionToken = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public /* synthetic */ ContinueRevolvingCreditApplicationInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput revolvingCreditAcquisitionFlowContextInput, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(revolvingCreditProductIdentifier, revolvingCreditAcquisitionFlowContextInput, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getPurchaseSessionToken() {
        return this.purchaseSessionToken;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput revolvingCreditAcquisitionFlowContextInput = this.flowContext;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.purchaseSessionToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContinueRevolvingCreditApplicationInput(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(", flowContext=");
        sb.append(revolvingCreditAcquisitionFlowContextInput);
        sb.append(", purchaseSessionToken=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditProductIdentifier.hashCode() * 31) + this.flowContext.hashCode()) * 31) + this.purchaseSessionToken.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ContinueRevolvingCreditApplicationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ContinueRevolvingCreditApplicationInput continueRevolvingCreditApplicationInput = (com.paypal.oslo.api.graphql.schema.type.ContinueRevolvingCreditApplicationInput) other;
        return this.creditProductIdentifier == continueRevolvingCreditApplicationInput.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, continueRevolvingCreditApplicationInput.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.purchaseSessionToken, continueRevolvingCreditApplicationInput.purchaseSessionToken);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContinueRevolvingCreditApplicationInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput flowContext, com.apollographql.apollo.api.Optional<? extends java.lang.Object> purchaseSessionToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseSessionToken, "");
        return new com.paypal.oslo.api.graphql.schema.type.ContinueRevolvingCreditApplicationInput(creditProductIdentifier, flowContext, purchaseSessionToken);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.purchaseSessionToken;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ContinueRevolvingCreditApplicationInput copy$default(com.paypal.oslo.api.graphql.schema.type.ContinueRevolvingCreditApplicationInput continueRevolvingCreditApplicationInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput revolvingCreditAcquisitionFlowContextInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = continueRevolvingCreditApplicationInput.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            revolvingCreditAcquisitionFlowContextInput = continueRevolvingCreditApplicationInput.flowContext;
        }
        if ((i & 4) != 0) {
            optional = continueRevolvingCreditApplicationInput.purchaseSessionToken;
        }
        return continueRevolvingCreditApplicationInput.copy(revolvingCreditProductIdentifier, revolvingCreditAcquisitionFlowContextInput, optional);
    }
}
