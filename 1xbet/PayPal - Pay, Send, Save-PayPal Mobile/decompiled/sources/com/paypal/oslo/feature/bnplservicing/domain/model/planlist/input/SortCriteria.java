package com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortCriteria;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy;", "sortBy", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder;", "sortOrder", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy;Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy;Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortCriteria;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortBy;", "getSortBy", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/SortOrder;", "getSortOrder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SortCriteria {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder;

    public SortCriteria(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortBy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortOrder, "");
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy getSortBy() {
        return this.sortBy;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder getSortOrder() {
        return this.sortOrder;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy = this.sortBy;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder = this.sortOrder;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SortCriteria(sortBy=");
        sb.append(sortBy);
        sb.append(", sortOrder=");
        sb.append(sortOrder);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.sortBy.hashCode() * 31) + this.sortOrder.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortCriteria)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortCriteria sortCriteria = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortCriteria) other;
        return this.sortBy == sortCriteria.sortBy && this.sortOrder == sortCriteria.sortOrder;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortCriteria copy(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortBy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortOrder, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortCriteria(sortBy, sortOrder);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder getSortOrder() {
        return this.sortOrder;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy getSortBy() {
        return this.sortBy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortCriteria copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortCriteria sortCriteria, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortBy sortBy, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.SortOrder sortOrder, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sortBy = sortCriteria.sortBy;
        }
        if ((i & 2) != 0) {
            sortOrder = sortCriteria.sortOrder;
        }
        return sortCriteria.copy(sortBy, sortOrder);
    }
}
