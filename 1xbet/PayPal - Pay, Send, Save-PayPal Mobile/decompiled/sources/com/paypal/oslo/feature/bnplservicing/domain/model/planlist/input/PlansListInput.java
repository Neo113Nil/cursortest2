package com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;", "activePlansInput", "historyPlansInput", "", "includeActive", "includeHistory", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;", "component2", "component3", "()Z", "component4", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;ZZ)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;", "getActivePlansInput", "getHistoryPlansInput", "Z", "getIncludeActive", "getIncludeHistory", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlansListInput {
    private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput activePlansInput;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput historyPlansInput;
    private final boolean includeActive;
    private final boolean includeHistory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput.Companion(null);
    public static final int $stable = 8;

    public PlansListInput(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput2, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planOverviewInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planOverviewInput2, "");
        this.activePlansInput = planOverviewInput;
        this.historyPlansInput = planOverviewInput2;
        this.includeActive = z;
        this.includeHistory = z2;
    }

    public /* synthetic */ PlansListInput(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput2, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(planOverviewInput, planOverviewInput2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput getActivePlansInput() {
        return this.activePlansInput;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput getHistoryPlansInput() {
        return this.historyPlansInput;
    }

    public final boolean getIncludeActive() {
        return this.includeActive;
    }

    public final boolean getIncludeHistory() {
        return this.includeHistory;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "supportedCpis", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;", "getDefaultPlansListInput", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;", "getPlhPlansListInput", "getReadyToUsePlansListInput", "p0", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "p1", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;", "getHighSpeedVideoSizes", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanOverviewInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput getDefaultPlansListInput(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> supportedCpis) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCpis, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput(getHighSpeedVideoSizes(supportedCpis, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus[]{com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.READY_TO_USE, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.DELINQUENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.PAST_DUE, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ON_TRACK, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.COMPLETED, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.PENDING, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ALMOST_COMPLETE})), getHighSpeedVideoFpsRanges(supportedCpis), false, false, 12, null);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput getPlhPlansListInput(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> supportedCpis) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCpis, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput(getHighSpeedVideoSizes(supportedCpis, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus[]{com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.DELINQUENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.PAST_DUE, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ON_TRACK, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.COMPLETED, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.PENDING, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ALMOST_COMPLETE})), getHighSpeedVideoFpsRanges(supportedCpis), false, false, 12, null);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput getReadyToUsePlansListInput(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> supportedCpis) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCpis, "");
            if (supportedCpis.isEmpty()) {
                return null;
            }
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.ACTIVE, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.READY_TO_USE), null, supportedCpis, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag[]{com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.FRAUD, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.DECEASED, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.BANKRUPTCY, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.CHARGED_OFF}), null, 32, null)), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions(null, null, null, null, null, null, 63, null)), false, false, 4, null);
        }

        private static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput getHighSpeedVideoSizes(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> p0, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> p1) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.ACTIVE, p1, null, p0, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag[]{com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.FRAUD, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.DECEASED, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.BANKRUPTCY, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.CHARGED_OFF}), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus[]{com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus.ACTIVE, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus.PENDING})));
        }

        private static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput getHighSpeedVideoFpsRanges(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> p0) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.HISTORY, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus[]{com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.COMPLETED, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.MATURED}), null, p0, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag[]{com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.FRAUD, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.DECEASED, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.BANKRUPTCY, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.CHARGED_OFF, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.DELINQUENT, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.PAST_DUE}), null, 36, null));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput = this.activePlansInput;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput2 = this.historyPlansInput;
        boolean z = this.includeActive;
        boolean z2 = this.includeHistory;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlansListInput(activePlansInput=");
        sb.append(planOverviewInput);
        sb.append(", historyPlansInput=");
        sb.append(planOverviewInput2);
        sb.append(", includeActive=");
        sb.append(z);
        sb.append(", includeHistory=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.activePlansInput.hashCode() * 31) + this.historyPlansInput.hashCode()) * 31) + java.lang.Boolean.hashCode(this.includeActive)) * 31) + java.lang.Boolean.hashCode(this.includeHistory);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansListInput = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activePlansInput, plansListInput.activePlansInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.historyPlansInput, plansListInput.historyPlansInput) && this.includeActive == plansListInput.includeActive && this.includeHistory == plansListInput.includeHistory;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput copy(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput activePlansInput, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput historyPlansInput, boolean includeActive, boolean includeHistory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activePlansInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyPlansInput, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput(activePlansInput, historyPlansInput, includeActive, includeHistory);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncludeHistory() {
        return this.includeHistory;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeActive() {
        return this.includeActive;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput getHistoryPlansInput() {
        return this.historyPlansInput;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput getActivePlansInput() {
        return this.activePlansInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansListInput, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanOverviewInput planOverviewInput2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planOverviewInput = plansListInput.activePlansInput;
        }
        if ((i & 2) != 0) {
            planOverviewInput2 = plansListInput.historyPlansInput;
        }
        if ((i & 4) != 0) {
            z = plansListInput.includeActive;
        }
        if ((i & 8) != 0) {
            z2 = plansListInput.includeHistory;
        }
        return plansListInput.copy(planOverviewInput, planOverviewInput2, z, z2);
    }
}
