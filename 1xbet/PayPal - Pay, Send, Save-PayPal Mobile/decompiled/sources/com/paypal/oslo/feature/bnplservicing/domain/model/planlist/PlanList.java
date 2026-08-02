package com.paypal.oslo.feature.bnplservicing.domain.model.planlist;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001c\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanList;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "history", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanList;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getActive", "getHistory", "getNoPlansAvailable", "()Z", "noPlansAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlanList {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> active;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> history;

    /* JADX WARN: Multi-variable type inference failed */
    public PlanList(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list2) {
        this.active = list;
        this.history = list2;
    }

    public /* synthetic */ PlanList(java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> getActive() {
        return this.active;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> getHistory() {
        return this.history;
    }

    public final boolean getNoPlansAvailable() {
        java.util.List<java.util.List> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.util.List[]{this.active, this.history});
        if ((listOf instanceof java.util.Collection) && listOf.isEmpty()) {
            return true;
        }
        for (java.util.List list : listOf) {
            if (list != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list = this.active;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list2 = this.history;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanList(active=");
        sb.append(list);
        sb.append(", history=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list = this.active;
        int hashCode = list == null ? 0 : list.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list2 = this.history;
        return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList planList = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.active, planList.active) && kotlin.jvm.internal.Intrinsics.areEqual(this.history, planList.history);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList copy(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> active, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> history) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList(active, history);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> component2() {
        return this.history;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> component1() {
        return this.active;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList planList, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = planList.active;
        }
        if ((i & 2) != 0) {
            list2 = planList.history;
        }
        return planList.copy(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlanList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
