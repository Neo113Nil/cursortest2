package com.paypal.oslo.feature.bnplservicing.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "normalizedName", "Ljava/lang/String;", "getNormalizedName", "()Ljava/lang/String;", "Companion", "UNKNOWN", "ON_TRACK", "CLOSED", "COMPLETED", "DELINQUENT", "MATURED", "PAST_DUE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "READY_TO_USE", "ALMOST_COMPLETE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanStatus {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus ALMOST_COMPLETE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus CLOSED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus DELINQUENT;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus MATURED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus ON_TRACK;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus PAST_DUE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus PENDING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus READY_TO_USE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String normalizedName;

    private PlanStatus(java.lang.String str, int i, java.lang.String str2) {
        this.normalizedName = str2;
    }

    public final java.lang.String getNormalizedName() {
        return this.normalizedName;
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("UNKNOWN", 0, "unknown");
        UNKNOWN = planStatus;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("ON_TRACK", 1, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE);
        ON_TRACK = planStatus2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("CLOSED", 2, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        CLOSED = planStatus3;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("COMPLETED", 3, com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.COMPLETED);
        COMPLETED = planStatus4;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus5 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("DELINQUENT", 4, "delinquent");
        DELINQUENT = planStatus5;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus6 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("MATURED", 5, "matured");
        MATURED = planStatus6;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus7 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("PAST_DUE", 6, "past_due");
        PAST_DUE = planStatus7;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus8 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 7, "pending");
        PENDING = planStatus8;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus9 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("READY_TO_USE", 8, "ready_to_use");
        READY_TO_USE = planStatus9;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus10 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus("ALMOST_COMPLETE", 9, "almost_complete");
        ALMOST_COMPLETE = planStatus10;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus[] planStatusArr = {planStatus, planStatus2, planStatus3, planStatus4, planStatus5, planStatus6, planStatus7, planStatus8, planStatus9, planStatus10};
        getHighResolutionOutputSizeshNQ4ISI = planStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(planStatusArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus = (com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus) obj;
            return planStatus == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.UNKNOWN : planStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
