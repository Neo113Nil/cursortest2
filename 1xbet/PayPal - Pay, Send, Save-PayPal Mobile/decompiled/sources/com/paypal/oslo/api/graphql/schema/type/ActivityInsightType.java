package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityInsightType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PAID_BILL", "EARLY_REFUND", "PAYMENT_LINK", "PAYMENT_HOLD", "CASH_BACK", "P2P_META", "SUPPRESS_ETA_TRACKER", "ETA_INFO", "DELAYED_ETA_INFO", "INSTANT_REFUND", "TAX_WITHHOLD", "REFUND_WITHHOLD", "DEFAULT", "LINKED_ACTIVITY", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityInsightType {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType CASH_BACK;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType DEFAULT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType DELAYED_ETA_INFO;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType EARLY_REFUND;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType ETA_INFO;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType INSTANT_REFUND;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType LINKED_ACTIVITY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType P2P_META;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType PAID_BILL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType PAYMENT_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType PAYMENT_LINK;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType REFUND_WITHHOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType SUPPRESS_ETA_TRACKER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType TAX_WITHHOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityInsightType[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityInsightType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("PAID_BILL", 0, "PAID_BILL");
        PAID_BILL = activityInsightType;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType2 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("EARLY_REFUND", 1, "EARLY_REFUND");
        EARLY_REFUND = activityInsightType2;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType3 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("PAYMENT_LINK", 2, "PAYMENT_LINK");
        PAYMENT_LINK = activityInsightType3;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType4 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("PAYMENT_HOLD", 3, "PAYMENT_HOLD");
        PAYMENT_HOLD = activityInsightType4;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType5 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("CASH_BACK", 4, "CASH_BACK");
        CASH_BACK = activityInsightType5;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType6 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("P2P_META", 5, "P2P_META");
        P2P_META = activityInsightType6;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType7 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("SUPPRESS_ETA_TRACKER", 6, "SUPPRESS_ETA_TRACKER");
        SUPPRESS_ETA_TRACKER = activityInsightType7;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType8 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("ETA_INFO", 7, "ETA_INFO");
        ETA_INFO = activityInsightType8;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType9 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("DELAYED_ETA_INFO", 8, "DELAYED_ETA_INFO");
        DELAYED_ETA_INFO = activityInsightType9;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType10 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("INSTANT_REFUND", 9, "INSTANT_REFUND");
        INSTANT_REFUND = activityInsightType10;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType11 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("TAX_WITHHOLD", 10, "TAX_WITHHOLD");
        TAX_WITHHOLD = activityInsightType11;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType12 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("REFUND_WITHHOLD", 11, "REFUND_WITHHOLD");
        REFUND_WITHHOLD = activityInsightType12;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType13 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("DEFAULT", 12, "DEFAULT");
        DEFAULT = activityInsightType13;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType14 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("LINKED_ACTIVITY", 13, "LINKED_ACTIVITY");
        LINKED_ACTIVITY = activityInsightType14;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType15 = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType("UNKNOWN__", 14, "UNKNOWN__");
        UNKNOWN__ = activityInsightType15;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType[] activityInsightTypeArr = {activityInsightType, activityInsightType2, activityInsightType3, activityInsightType4, activityInsightType5, activityInsightType6, activityInsightType7, activityInsightType8, activityInsightType9, activityInsightType10, activityInsightType11, activityInsightType12, activityInsightType13, activityInsightType14, activityInsightType15};
        getHighSpeedVideoSizes = activityInsightTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(activityInsightTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityInsightType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PAID_BILL", "EARLY_REFUND", "PAYMENT_LINK", "PAYMENT_HOLD", "CASH_BACK", "P2P_META", "SUPPRESS_ETA_TRACKER", "ETA_INFO", "DELAYED_ETA_INFO", "INSTANT_REFUND", "TAX_WITHHOLD", "REFUND_WITHHOLD", "DEFAULT", "LINKED_ACTIVITY"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityInsightType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityInsightType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityInsightType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityInsightType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityInsightType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType[]{com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.PAID_BILL, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.EARLY_REFUND, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.PAYMENT_LINK, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.PAYMENT_HOLD, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.CASH_BACK, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.P2P_META, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.SUPPRESS_ETA_TRACKER, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.ETA_INFO, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.DELAYED_ETA_INFO, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.INSTANT_REFUND, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.TAX_WITHHOLD, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.REFUND_WITHHOLD, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.DEFAULT, com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.LINKED_ACTIVITY});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityInsightType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityInsightType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityInsightType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityInsightType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityInsightType activityInsightType = (com.paypal.oslo.api.graphql.schema.type.ActivityInsightType) obj;
            return activityInsightType == null ? com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.UNKNOWN__ : activityInsightType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityInsightType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityInsightType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityInsightType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityInsightType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityInsightType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
