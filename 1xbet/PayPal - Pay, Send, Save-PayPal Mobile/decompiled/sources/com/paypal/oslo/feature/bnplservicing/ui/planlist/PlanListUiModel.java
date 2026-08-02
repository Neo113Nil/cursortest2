package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\u0002 !B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/PlanModel;", "activePlans", "historyPlans", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$PlanListContent;", "content", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$PlanListContent;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$PlanListContent;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$PlanListContent;)Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getActivePlans", "getHistoryPlans", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$PlanListContent;", "getContent", "PlanListContent", "EmptyContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlanListUiModel {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> activePlans;
    private final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent content;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> historyPlans;

    /* JADX WARN: Multi-variable type inference failed */
    public PlanListUiModel(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> list, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> list2, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent planListContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListContent, "");
        this.activePlans = list;
        this.historyPlans = list2;
        this.content = planListContent;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> getActivePlans() {
        return this.activePlans;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> getHistoryPlans() {
        return this.historyPlans;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent getContent() {
        return this.content;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$PlanListContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "activePlanTab", "planHistoryTab", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$EmptyContent;", "emptyContent", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$EmptyContent;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$EmptyContent;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$EmptyContent;)Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$PlanListContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getActivePlanTab", "getPlanHistoryTab", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$EmptyContent;", "getEmptyContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PlanListContent {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText activePlanTab;
        private final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent emptyContent;
        private final com.paypal.oslo.core.commonui.utils.RefText planHistoryTab;

        public PlanListContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent emptyContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyContent, "");
            this.activePlanTab = refText;
            this.planHistoryTab = refText2;
            this.emptyContent = emptyContent;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getActivePlanTab() {
            return this.activePlanTab;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getPlanHistoryTab() {
            return this.planHistoryTab;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent getEmptyContent() {
            return this.emptyContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.activePlanTab;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.planHistoryTab;
            com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent emptyContent = this.emptyContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanListContent(activePlanTab=");
            sb.append(refText);
            sb.append(", planHistoryTab=");
            sb.append(refText2);
            sb.append(", emptyContent=");
            sb.append(emptyContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.activePlanTab.hashCode() * 31) + this.planHistoryTab.hashCode()) * 31) + this.emptyContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent planListContent = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activePlanTab, planListContent.activePlanTab) && kotlin.jvm.internal.Intrinsics.areEqual(this.planHistoryTab, planListContent.planHistoryTab) && kotlin.jvm.internal.Intrinsics.areEqual(this.emptyContent, planListContent.emptyContent);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent copy(com.paypal.oslo.core.commonui.utils.RefText activePlanTab, com.paypal.oslo.core.commonui.utils.RefText planHistoryTab, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent emptyContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activePlanTab, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planHistoryTab, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyContent, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent(activePlanTab, planHistoryTab, emptyContent);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent getEmptyContent() {
            return this.emptyContent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getPlanHistoryTab() {
            return this.planHistoryTab;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getActivePlanTab() {
            return this.activePlanTab;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent copy$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent planListContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent emptyContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = planListContent.activePlanTab;
            }
            if ((i & 2) != 0) {
                refText2 = planListContent.planHistoryTab;
            }
            if ((i & 4) != 0) {
                emptyContent = planListContent.emptyContent;
            }
            return planListContent.copy(refText, refText2, emptyContent);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$EmptyContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "activePlansTitle", "historyPlansTitle", "historyPlansDescription", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel$EmptyContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getActivePlansTitle", "getHistoryPlansTitle", "getHistoryPlansDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyContent {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText activePlansTitle;
        private final com.paypal.oslo.core.commonui.utils.RefText historyPlansDescription;
        private final com.paypal.oslo.core.commonui.utils.RefText historyPlansTitle;

        public EmptyContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
            this.activePlansTitle = refText;
            this.historyPlansTitle = refText2;
            this.historyPlansDescription = refText3;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getActivePlansTitle() {
            return this.activePlansTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getHistoryPlansTitle() {
            return this.historyPlansTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getHistoryPlansDescription() {
            return this.historyPlansDescription;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.activePlansTitle;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.historyPlansTitle;
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.historyPlansDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmptyContent(activePlansTitle=");
            sb.append(refText);
            sb.append(", historyPlansTitle=");
            sb.append(refText2);
            sb.append(", historyPlansDescription=");
            sb.append(refText3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.activePlansTitle.hashCode() * 31) + this.historyPlansTitle.hashCode()) * 31) + this.historyPlansDescription.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent emptyContent = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activePlansTitle, emptyContent.activePlansTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.historyPlansTitle, emptyContent.historyPlansTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.historyPlansDescription, emptyContent.historyPlansDescription);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent copy(com.paypal.oslo.core.commonui.utils.RefText activePlansTitle, com.paypal.oslo.core.commonui.utils.RefText historyPlansTitle, com.paypal.oslo.core.commonui.utils.RefText historyPlansDescription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activePlansTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyPlansTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyPlansDescription, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent(activePlansTitle, historyPlansTitle, historyPlansDescription);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getHistoryPlansDescription() {
            return this.historyPlansDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getHistoryPlansTitle() {
            return this.historyPlansTitle;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getActivePlansTitle() {
            return this.activePlansTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent copy$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent emptyContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = emptyContent.activePlansTitle;
            }
            if ((i & 2) != 0) {
                refText2 = emptyContent.historyPlansTitle;
            }
            if ((i & 4) != 0) {
                refText3 = emptyContent.historyPlansDescription;
            }
            return emptyContent.copy(refText, refText2, refText3);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> list = this.activePlans;
        java.util.List<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> list2 = this.historyPlans;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent planListContent = this.content;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanListUiModel(activePlans=");
        sb.append(list);
        sb.append(", historyPlans=");
        sb.append(list2);
        sb.append(", content=");
        sb.append(planListContent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.activePlans.hashCode() * 31) + this.historyPlans.hashCode()) * 31) + this.content.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel planListUiModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activePlans, planListUiModel.activePlans) && kotlin.jvm.internal.Intrinsics.areEqual(this.historyPlans, planListUiModel.historyPlans) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, planListUiModel.content);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel copy(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> activePlans, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> historyPlans, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activePlans, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyPlans, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel(activePlans, historyPlans, content);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent getContent() {
        return this.content;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> component2() {
        return this.historyPlans;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel> component1() {
        return this.activePlans;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel planListUiModel, java.util.List list, java.util.List list2, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent planListContent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = planListUiModel.activePlans;
        }
        if ((i & 2) != 0) {
            list2 = planListUiModel.historyPlans;
        }
        if ((i & 4) != 0) {
            planListContent = planListUiModel.content;
        }
        return planListUiModel.copy(list, list2, planListContent);
    }
}
