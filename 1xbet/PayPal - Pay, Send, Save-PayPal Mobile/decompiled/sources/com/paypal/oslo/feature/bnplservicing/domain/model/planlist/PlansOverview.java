package com.paypal.oslo.feature.bnplservicing.domain.model.planlist;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanList;", "plans", "", "hasEverUsedBnpl", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanList;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanList;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanList;Z)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanList;", "getPlans", "Z", "getHasEverUsedBnpl", "getNoPlans", "noPlans"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlansOverview {
    public static final int $stable = 8;
    private final boolean hasEverUsedBnpl;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList plans;

    public PlansOverview(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList planList, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planList, "");
        this.plans = planList;
        this.hasEverUsedBnpl = z;
    }

    public /* synthetic */ PlansOverview(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList planList, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(planList, (i & 2) != 0 ? true : z);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList getPlans() {
        return this.plans;
    }

    public final boolean getHasEverUsedBnpl() {
        return this.hasEverUsedBnpl;
    }

    public final boolean getNoPlans() {
        return this.plans.getNoPlansAvailable();
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList planList = this.plans;
        boolean z = this.hasEverUsedBnpl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlansOverview(plans=");
        sb.append(planList);
        sb.append(", hasEverUsedBnpl=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.plans.hashCode() * 31) + java.lang.Boolean.hashCode(this.hasEverUsedBnpl);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.plans, plansOverview.plans) && this.hasEverUsedBnpl == plansOverview.hasEverUsedBnpl;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview copy(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList plans, boolean hasEverUsedBnpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plans, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(plans, hasEverUsedBnpl);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasEverUsedBnpl() {
        return this.hasEverUsedBnpl;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList getPlans() {
        return this.plans;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList planList, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planList = plansOverview.plans;
        }
        if ((i & 2) != 0) {
            z = plansOverview.hasEverUsedBnpl;
        }
        return plansOverview.copy(planList, z);
    }
}
