package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "transactionCountRemaining", "transactionCountCompleted", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getTransactionCountRemaining", "getTransactionCountCompleted"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DiscreteRewardSummaryProgressFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.Integer transactionCountCompleted;
    private final java.lang.Integer transactionCountRemaining;

    public DiscreteRewardSummaryProgressFragment(java.lang.Integer num, java.lang.Integer num2) {
        this.transactionCountRemaining = num;
        this.transactionCountCompleted = num2;
    }

    public final java.lang.Integer getTransactionCountRemaining() {
        return this.transactionCountRemaining;
    }

    public final java.lang.Integer getTransactionCountCompleted() {
        return this.transactionCountCompleted;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.transactionCountRemaining;
        java.lang.Integer num2 = this.transactionCountCompleted;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DiscreteRewardSummaryProgressFragment(transactionCountRemaining=");
        sb.append(num);
        sb.append(", transactionCountCompleted=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.transactionCountRemaining;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.transactionCountCompleted;
        return (hashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCountRemaining, discreteRewardSummaryProgressFragment.transactionCountRemaining) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCountCompleted, discreteRewardSummaryProgressFragment.transactionCountCompleted);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment copy(java.lang.Integer transactionCountRemaining, java.lang.Integer transactionCountCompleted) {
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment(transactionCountRemaining, transactionCountCompleted);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getTransactionCountCompleted() {
        return this.transactionCountCompleted;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getTransactionCountRemaining() {
        return this.transactionCountRemaining;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = discreteRewardSummaryProgressFragment.transactionCountRemaining;
        }
        if ((i & 2) != 0) {
            num2 = discreteRewardSummaryProgressFragment.transactionCountCompleted;
        }
        return discreteRewardSummaryProgressFragment.copy(num, num2);
    }
}
