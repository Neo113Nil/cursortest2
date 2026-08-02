package com.paypal.oslo.feature.bnplservicing.ui.planlist.content;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/content/PlanListContentProvider;", "", "<init>", "()V", "", "formattedDuration", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "validityText", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "formattedDate", "nextPayment", "completedOn", "activePlanTab", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getActivePlanTab", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "planHistoryTab", "getPlanHistoryTab", "inStoreOnly", "getInStoreOnly", "onlineOnly", "getOnlineOnly", "statusInReview", "getStatusInReview", "dueToday", "getDueToday", "pending", "getPending", "pastDue", "getPastDue", "refundPending", "getRefundPending", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/content/PlanListContentProvider$EmptyStateContent;", "emptyContent", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/content/PlanListContentProvider$EmptyStateContent;", "getEmptyContent", "()Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/content/PlanListContentProvider$EmptyStateContent;", "EmptyStateContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanListContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText activePlanTab = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_active_plan_tab, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText planHistoryTab = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_plan_history_tab, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText inStoreOnly = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_in_store, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText onlineOnly = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_online_only, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText statusInReview = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_status_in_review, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText dueToday = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_due_today, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText pending = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_pending, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText pastDue = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_past_due, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText refundPending = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_refund_pending, new java.lang.Object[0]);
    private final com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider.EmptyStateContent emptyContent = new com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider.EmptyStateContent();

    @javax.inject.Inject
    public PlanListContentProvider() {
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getActivePlanTab() {
        return this.activePlanTab;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPlanHistoryTab() {
        return this.planHistoryTab;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getInStoreOnly() {
        return this.inStoreOnly;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getOnlineOnly() {
        return this.onlineOnly;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText validityText(java.lang.String formattedDuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedDuration, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_valid_for, formattedDuration);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getStatusInReview() {
        return this.statusInReview;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDueToday() {
        return this.dueToday;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText nextPayment(java.lang.String formattedDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedDate, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_next_payment, formattedDate);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPending() {
        return this.pending;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPastDue() {
        return this.pastDue;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getRefundPending() {
        return this.refundPending;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText completedOn(java.lang.String formattedDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedDate, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_completed_format, formattedDate);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider.EmptyStateContent getEmptyContent() {
        return this.emptyContent;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/content/PlanListContentProvider$EmptyStateContent;", "", "<init>", "()V", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "activePlansTitle", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getActivePlansTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "historyPlansTitle", "getHistoryPlansTitle", "historyPlansDescription", "getHistoryPlansDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmptyStateContent {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText activePlansTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_empty_active_plans_title, new java.lang.Object[0]);
        private final com.paypal.oslo.core.commonui.utils.RefText historyPlansTitle = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_empty_history_plans_title, new java.lang.Object[0]);
        private final com.paypal.oslo.core.commonui.utils.RefText historyPlansDescription = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_list_empty_history_plans_description, new java.lang.Object[0]);

        public final com.paypal.oslo.core.commonui.utils.RefText getActivePlansTitle() {
            return this.activePlansTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getHistoryPlansTitle() {
            return this.historyPlansTitle;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getHistoryPlansDescription() {
            return this.historyPlansDescription;
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
