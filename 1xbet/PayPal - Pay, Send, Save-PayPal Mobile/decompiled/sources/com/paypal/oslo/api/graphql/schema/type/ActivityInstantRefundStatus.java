package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityInstantRefundStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "REVERSAL_IACH_PPBALANCE_COMPLETED", "REVERSAL_IACH_PPBALANCE_IN_PROGRESS", "REVERSAL_IACH_PPBALANCE_ELIGIBLE", "REVERSAL_IACH_PPBALANCE_NOT_ELIGIBLE", "BANK_PAYPAL_CASH_PLUS_ELIGIBLE", "BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION", "BANK_PAYPAL_CASH_PLUS_INELIGIBLE", "BANK_PAYPAL_CASH_PLUS_REFUNDED", "BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION_REFUNDED", "CARD_PAYPAL_CASH_PLUS_ELIGIBLE", "CARD_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityInstantRefundStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus BANK_PAYPAL_CASH_PLUS_ELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION_REFUNDED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus BANK_PAYPAL_CASH_PLUS_INELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus BANK_PAYPAL_CASH_PLUS_REFUNDED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus CARD_PAYPAL_CASH_PLUS_ELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus CARD_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus INELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus REVERSAL_IACH_PPBALANCE_COMPLETED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus REVERSAL_IACH_PPBALANCE_ELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus REVERSAL_IACH_PPBALANCE_IN_PROGRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus REVERSAL_IACH_PPBALANCE_NOT_ELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityInstantRefundStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("REVERSAL_IACH_PPBALANCE_COMPLETED", 0, "REVERSAL_IACH_PPBALANCE_COMPLETED");
        REVERSAL_IACH_PPBALANCE_COMPLETED = activityInstantRefundStatus;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus2 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("REVERSAL_IACH_PPBALANCE_IN_PROGRESS", 1, "REVERSAL_IACH_PPBALANCE_IN_PROGRESS");
        REVERSAL_IACH_PPBALANCE_IN_PROGRESS = activityInstantRefundStatus2;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus3 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("REVERSAL_IACH_PPBALANCE_ELIGIBLE", 2, "REVERSAL_IACH_PPBALANCE_ELIGIBLE");
        REVERSAL_IACH_PPBALANCE_ELIGIBLE = activityInstantRefundStatus3;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus4 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("REVERSAL_IACH_PPBALANCE_NOT_ELIGIBLE", 3, "REVERSAL_IACH_PPBALANCE_NOT_ELIGIBLE");
        REVERSAL_IACH_PPBALANCE_NOT_ELIGIBLE = activityInstantRefundStatus4;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus5 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("BANK_PAYPAL_CASH_PLUS_ELIGIBLE", 4, "BANK_PAYPAL_CASH_PLUS_ELIGIBLE");
        BANK_PAYPAL_CASH_PLUS_ELIGIBLE = activityInstantRefundStatus5;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus6 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION", 5, "BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION");
        BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION = activityInstantRefundStatus6;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus7 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("BANK_PAYPAL_CASH_PLUS_INELIGIBLE", 6, "BANK_PAYPAL_CASH_PLUS_INELIGIBLE");
        BANK_PAYPAL_CASH_PLUS_INELIGIBLE = activityInstantRefundStatus7;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus8 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("BANK_PAYPAL_CASH_PLUS_REFUNDED", 7, "BANK_PAYPAL_CASH_PLUS_REFUNDED");
        BANK_PAYPAL_CASH_PLUS_REFUNDED = activityInstantRefundStatus8;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus9 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION_REFUNDED", 8, "BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION_REFUNDED");
        BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION_REFUNDED = activityInstantRefundStatus9;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus10 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("CARD_PAYPAL_CASH_PLUS_ELIGIBLE", 9, "CARD_PAYPAL_CASH_PLUS_ELIGIBLE");
        CARD_PAYPAL_CASH_PLUS_ELIGIBLE = activityInstantRefundStatus10;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus11 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("CARD_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION", 10, "CARD_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION");
        CARD_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION = activityInstantRefundStatus11;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus12 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 11, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE);
        INELIGIBLE = activityInstantRefundStatus12;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus13 = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = activityInstantRefundStatus13;
        com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus[] activityInstantRefundStatusArr = {activityInstantRefundStatus, activityInstantRefundStatus2, activityInstantRefundStatus3, activityInstantRefundStatus4, activityInstantRefundStatus5, activityInstantRefundStatus6, activityInstantRefundStatus7, activityInstantRefundStatus8, activityInstantRefundStatus9, activityInstantRefundStatus10, activityInstantRefundStatus11, activityInstantRefundStatus12, activityInstantRefundStatus13};
        getHighSpeedVideoFpsRangesFor = activityInstantRefundStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(activityInstantRefundStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityInstantRefundStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"REVERSAL_IACH_PPBALANCE_COMPLETED", "REVERSAL_IACH_PPBALANCE_IN_PROGRESS", "REVERSAL_IACH_PPBALANCE_ELIGIBLE", "REVERSAL_IACH_PPBALANCE_NOT_ELIGIBLE", "BANK_PAYPAL_CASH_PLUS_ELIGIBLE", "BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION", "BANK_PAYPAL_CASH_PLUS_INELIGIBLE", "BANK_PAYPAL_CASH_PLUS_REFUNDED", "BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION_REFUNDED", "CARD_PAYPAL_CASH_PLUS_ELIGIBLE", "CARD_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityInstantRefundStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityInstantRefundStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityInstantRefundStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityInstantRefundStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus[]{com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.REVERSAL_IACH_PPBALANCE_COMPLETED, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.REVERSAL_IACH_PPBALANCE_IN_PROGRESS, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.REVERSAL_IACH_PPBALANCE_ELIGIBLE, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.REVERSAL_IACH_PPBALANCE_NOT_ELIGIBLE, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.BANK_PAYPAL_CASH_PLUS_ELIGIBLE, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.BANK_PAYPAL_CASH_PLUS_INELIGIBLE, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.BANK_PAYPAL_CASH_PLUS_REFUNDED, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.BANK_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION_REFUNDED, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.CARD_PAYPAL_CASH_PLUS_ELIGIBLE, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.CARD_PAYPAL_CASH_PLUS_ELIGIBLE_WITH_CONDITION, com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.INELIGIBLE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus activityInstantRefundStatus = (com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus) obj;
            return activityInstantRefundStatus == null ? com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.UNKNOWN__ : activityInstantRefundStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityInstantRefundStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
