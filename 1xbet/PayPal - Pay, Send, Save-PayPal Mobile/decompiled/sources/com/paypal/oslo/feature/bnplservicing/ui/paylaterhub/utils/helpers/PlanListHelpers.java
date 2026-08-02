package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0014J-\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/PlanListHelpers;", "", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "formatter", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/content/PayLaterHubContentProvider;", "contentProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/content/PayLaterHubContentProvider;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;", "plan", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/CompletedPlanInfo;", "extractCompletionSpecificInfo", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/CompletedPlanInfo;", "Lkotlin/Triple;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "extractInProgressSpecificInfo", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;)Lkotlin/Triple;", "", "extractMerchantName", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;)Ljava/lang/String;", "extractProductName", "extractFormattedAmount", "extractMerchantLogoUrl", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/Quadruple;", "extractProblemSpecificInfo", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/Quadruple;", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(III)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/Quadruple;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/content/PayLaterHubContentProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanListHelpers {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PlanListHelpers(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider payLaterHubContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubContentProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bnplServFormatter;
        this.getHighSpeedVideoSizes = payLaterHubContentProvider;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/utils/helpers/PlanListHelpers$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;", "plan", "", "isRefundPending", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;)Z", "", "rawValue", "normalizeRefundAmount", "(Ljava/lang/String;Z)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isRefundPending(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot plan) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
            if (plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) {
                return ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) plan).isRefundPending();
            }
            if (plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) {
                return ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) plan).isRefundPending();
            }
            return false;
        }

        public final java.lang.String normalizeRefundAmount(java.lang.String rawValue, boolean isRefundPending) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            return (isRefundPending && kotlin.text.StringsKt.startsWith$default(rawValue, "-", false, 2, (java.lang.Object) null)) ? kotlin.text.StringsKt.removePrefix(rawValue, (java.lang.CharSequence) "-") : rawValue;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo extractCompletionSpecificInfo(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot plan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
        if (!(plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan)) {
            if (!(plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan)) {
                throw new java.lang.IllegalArgumentException("Plan must be either MaturedPlan or CompletedPlan");
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan completedPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) plan;
            boolean isRefundPending = completedPlan.isRefundPending();
            java.lang.String planCompletedDateTime = completedPlan.getPlanCompletedDateTime();
            return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo(isRefundPending, planCompletedDateTime != null ? com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatDate$default(this.getHighResolutionOutputSizeshNQ4ISI, planCompletedDateTime, null, 2, null) : null, new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.InstallmentInfo(completedPlan.getTotalInstallmentsPaid(), completedPlan.getTotalInstallmentsCount()));
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan maturedPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) plan;
        boolean isRefundPending2 = maturedPlan.isRefundPending();
        java.lang.String planCompletedDateTime2 = maturedPlan.getPlanCompletedDateTime();
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.CompletedPlanInfo(isRefundPending2, planCompletedDateTime2 != null ? com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatDate$default(this.getHighResolutionOutputSizeshNQ4ISI, planCompletedDateTime2, null, 2, null) : null, null);
    }

    public final kotlin.Triple<java.lang.Integer, java.lang.Integer, com.paypal.oslo.core.commonui.utils.RefText> extractInProgressSpecificInfo(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot plan) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
        if (plan.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
            if (plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) {
                com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan onTrackPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) plan;
                pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(onTrackPlan.getTotalInstallmentsPaid()), java.lang.Integer.valueOf(onTrackPlan.getTotalInstallmentsCount()));
            } else if (plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan) {
                com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan pendingPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan) plan;
                pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(pendingPlan.getTotalInstallmentsPaid()), java.lang.Integer.valueOf(pendingPlan.getTotalInstallmentsCount()));
            } else {
                if (!(plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan)) {
                    throw new java.lang.IllegalArgumentException("Plan must be either OnTrackPlan, PendingPlan, or AlmostCompletePlan");
                }
                pair = kotlin.TuplesKt.to(0, 0);
            }
            int intValue = ((java.lang.Number) pair.component1()).intValue();
            int intValue2 = ((java.lang.Number) pair.component2()).intValue();
            return new kotlin.Triple<>(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), this.getHighSpeedVideoSizes.getPlanContentProvider().getStatusInReview());
        }
        com.paypal.oslo.core.commonui.utils.RefText refText = null;
        if (plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan onTrackPlan2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) plan;
            if (onTrackPlan2.isDueToday()) {
                refText = this.getHighSpeedVideoSizes.getPlanContentProvider().getDueToday();
            } else {
                java.lang.String nextPaymentDueDate = onTrackPlan2.getNextPaymentDueDate();
                if (nextPaymentDueDate != null) {
                    refText = this.getHighSpeedVideoSizes.getPlanContentProvider().nextPayment(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatDate$default(this.getHighResolutionOutputSizeshNQ4ISI, nextPaymentDueDate, null, 2, null));
                }
            }
            return new kotlin.Triple<>(java.lang.Integer.valueOf(onTrackPlan2.getTotalInstallmentsPaid()), java.lang.Integer.valueOf(onTrackPlan2.getTotalInstallmentsCount()), refText);
        }
        if (plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan pendingPlan2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan) plan;
            int totalInstallmentsPaid = pendingPlan2.getTotalInstallmentsPaid();
            int totalInstallmentsCount = pendingPlan2.getTotalInstallmentsCount();
            return new kotlin.Triple<>(java.lang.Integer.valueOf(totalInstallmentsPaid), java.lang.Integer.valueOf(totalInstallmentsCount), this.getHighSpeedVideoSizes.getPlanContentProvider().getPending());
        }
        if (plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan) {
            return new kotlin.Triple<>(0, 0, null);
        }
        throw new java.lang.IllegalArgumentException("Plan must be either OnTrackPlan, PendingPlan, or AlmostCompletePlan");
    }

    public final java.lang.String extractMerchantName(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot plan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
        return plan.getMerchantName();
    }

    public final java.lang.String extractProductName(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot plan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
        return plan.getProductName();
    }

    public final java.lang.String extractFormattedAmount(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot plan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
        java.lang.String rawValue = plan.getRawValue();
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers.Companion companion = INSTANCE;
        return companion.normalizeRefundAmount(rawValue, companion.isRefundPending(plan));
    }

    public final java.lang.String extractMerchantLogoUrl(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot plan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
        return plan.getMerchantLogoUrl();
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.Quadruple<java.lang.Integer, java.lang.Integer, java.lang.Integer, com.paypal.oslo.core.commonui.utils.RefText> extractProblemSpecificInfo(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot plan) {
        kotlin.Triple triple;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
        if (plan.getContextualLabel() != com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
            if (!(plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan)) {
                if (!(plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan)) {
                    throw new java.lang.IllegalArgumentException("Plan must be either DelinquentPlan or PastDuePlan");
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan pastDuePlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan) plan;
                return getHighSpeedVideoSizes(pastDuePlan.getTotalInstallmentsPaid(), pastDuePlan.getTotalInstallmentsCount(), pastDuePlan.getTotalInstallmentsOverdue());
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan delinquentPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan) plan;
            return getHighSpeedVideoSizes(delinquentPlan.getTotalInstallmentsPaid(), delinquentPlan.getTotalInstallmentsCount(), delinquentPlan.getTotalInstallmentsOverdue());
        }
        if (!(plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan)) {
            if (!(plan instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan)) {
                throw new java.lang.IllegalArgumentException("Plan must be either DelinquentPlan or PastDuePlan");
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan pastDuePlan2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan) plan;
            triple = new kotlin.Triple(java.lang.Integer.valueOf(pastDuePlan2.getTotalInstallmentsPaid()), java.lang.Integer.valueOf(pastDuePlan2.getTotalInstallmentsCount()), java.lang.Integer.valueOf(pastDuePlan2.getTotalInstallmentsOverdue()));
        } else {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan delinquentPlan2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan) plan;
            triple = new kotlin.Triple(java.lang.Integer.valueOf(delinquentPlan2.getTotalInstallmentsPaid()), java.lang.Integer.valueOf(delinquentPlan2.getTotalInstallmentsCount()), java.lang.Integer.valueOf(delinquentPlan2.getTotalInstallmentsOverdue()));
        }
        int intValue = ((java.lang.Number) triple.component1()).intValue();
        int intValue2 = ((java.lang.Number) triple.component2()).intValue();
        int intValue3 = ((java.lang.Number) triple.component3()).intValue();
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.Quadruple<>(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(intValue3), this.getHighSpeedVideoSizes.getPlanContentProvider().getStatusInReview());
    }

    private final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.Quadruple<java.lang.Integer, java.lang.Integer, java.lang.Integer, com.paypal.oslo.core.commonui.utils.RefText> getHighSpeedVideoSizes(int p0, int p1, int p2) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.Quadruple<>(java.lang.Integer.valueOf(p0), java.lang.Integer.valueOf(p1), java.lang.Integer.valueOf(p2), this.getHighSpeedVideoSizes.getPlanContentProvider().getPastDue());
    }
}
