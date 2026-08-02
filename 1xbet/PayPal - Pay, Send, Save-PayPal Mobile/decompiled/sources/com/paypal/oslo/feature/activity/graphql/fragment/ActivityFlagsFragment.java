package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0004\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "isAnonymousContribution", "isUprTransaction", "isPaypalWorldTransaction", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityFlagsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final boolean isAnonymousContribution;
    private final boolean isPaypalWorldTransaction;
    private final boolean isUprTransaction;

    public ActivityFlagsFragment(boolean z, boolean z2, boolean z3) {
        this.isAnonymousContribution = z;
        this.isUprTransaction = z2;
        this.isPaypalWorldTransaction = z3;
    }

    public final boolean isAnonymousContribution() {
        return this.isAnonymousContribution;
    }

    public final boolean isUprTransaction() {
        return this.isUprTransaction;
    }

    public final boolean isPaypalWorldTransaction() {
        return this.isPaypalWorldTransaction;
    }

    public final java.lang.String toString() {
        boolean z = this.isAnonymousContribution;
        boolean z2 = this.isUprTransaction;
        boolean z3 = this.isPaypalWorldTransaction;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityFlagsFragment(isAnonymousContribution=");
        sb.append(z);
        sb.append(", isUprTransaction=");
        sb.append(z2);
        sb.append(", isPaypalWorldTransaction=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isAnonymousContribution) * 31) + java.lang.Boolean.hashCode(this.isUprTransaction)) * 31) + java.lang.Boolean.hashCode(this.isPaypalWorldTransaction);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment) other;
        return this.isAnonymousContribution == activityFlagsFragment.isAnonymousContribution && this.isUprTransaction == activityFlagsFragment.isUprTransaction && this.isPaypalWorldTransaction == activityFlagsFragment.isPaypalWorldTransaction;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment copy(boolean isAnonymousContribution, boolean isUprTransaction, boolean isPaypalWorldTransaction) {
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment(isAnonymousContribution, isUprTransaction, isPaypalWorldTransaction);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPaypalWorldTransaction() {
        return this.isPaypalWorldTransaction;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsUprTransaction() {
        return this.isUprTransaction;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAnonymousContribution() {
        return this.isAnonymousContribution;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = activityFlagsFragment.isAnonymousContribution;
        }
        if ((i & 2) != 0) {
            z2 = activityFlagsFragment.isUprTransaction;
        }
        if ((i & 4) != 0) {
            z3 = activityFlagsFragment.isPaypalWorldTransaction;
        }
        return activityFlagsFragment.copy(z, z2, z3);
    }
}
