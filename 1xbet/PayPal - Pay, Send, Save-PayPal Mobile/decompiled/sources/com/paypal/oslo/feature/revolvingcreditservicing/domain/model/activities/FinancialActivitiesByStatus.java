package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesByStatus;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;", "pending", com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.COMPLETED, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesByStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPending", "getCompleted", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FinancialActivitiesByStatus {
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> completed;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> pending;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus.Companion(null);
    public static final int $stable = 8;

    public FinancialActivitiesByStatus(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.pending = list;
        this.completed = list2;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> getPending() {
        return this.pending;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> getCompleted() {
        return this.completed;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesByStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;", "activities", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesByStatus;", "fromActivities", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesByStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus fromActivities(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> activities) {
            if (activities == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : activities) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity) obj).isSettled(), java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus((java.util.List) pair.component2(), (java.util.List) pair.component1());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> list = this.pending;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> list2 = this.completed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FinancialActivitiesByStatus(pending=");
        sb.append(list);
        sb.append(", completed=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.pending.hashCode() * 31) + this.completed.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pending, financialActivitiesByStatus.pending) && kotlin.jvm.internal.Intrinsics.areEqual(this.completed, financialActivitiesByStatus.completed);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> pending, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> completed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pending, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completed, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus(pending, completed);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> component2() {
        return this.completed;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> component1() {
        return this.pending;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = financialActivitiesByStatus.pending;
        }
        if ((i & 2) != 0) {
            list2 = financialActivitiesByStatus.completed;
        }
        return financialActivitiesByStatus.copy(list, list2);
    }
}
