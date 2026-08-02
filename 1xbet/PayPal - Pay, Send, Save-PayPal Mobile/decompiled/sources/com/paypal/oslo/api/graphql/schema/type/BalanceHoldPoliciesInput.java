package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BalanceHoldPoliciesInput;", "", "", "", "policyDefinitionIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/BalanceHoldPoliciesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPolicyDefinitionIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BalanceHoldPoliciesInput {
    private final java.util.List<java.lang.String> policyDefinitionIds;

    public BalanceHoldPoliciesInput(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.policyDefinitionIds = list;
    }

    public final java.util.List<java.lang.String> getPolicyDefinitionIds() {
        return this.policyDefinitionIds;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.policyDefinitionIds;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceHoldPoliciesInput(policyDefinitionIds=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.policyDefinitionIds.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.BalanceHoldPoliciesInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.policyDefinitionIds, ((com.paypal.oslo.api.graphql.schema.type.BalanceHoldPoliciesInput) other).policyDefinitionIds);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BalanceHoldPoliciesInput copy(java.util.List<java.lang.String> policyDefinitionIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policyDefinitionIds, "");
        return new com.paypal.oslo.api.graphql.schema.type.BalanceHoldPoliciesInput(policyDefinitionIds);
    }

    public final java.util.List<java.lang.String> component1() {
        return this.policyDefinitionIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BalanceHoldPoliciesInput copy$default(com.paypal.oslo.api.graphql.schema.type.BalanceHoldPoliciesInput balanceHoldPoliciesInput, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = balanceHoldPoliciesInput.policyDefinitionIds;
        }
        return balanceHoldPoliciesInput.copy(list);
    }
}
