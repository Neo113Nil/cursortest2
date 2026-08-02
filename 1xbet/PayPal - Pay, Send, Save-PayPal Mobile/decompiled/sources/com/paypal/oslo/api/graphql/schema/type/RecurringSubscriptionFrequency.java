package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionFrequency;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "DAILY", "WEEKLY", "BI_WEEKLY", "MONTHLY", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecurringSubscriptionFrequency {
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency BI_WEEKLY;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency DAILY;
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency MONTHLY;
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency WEEKLY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private RecurringSubscriptionFrequency(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency recurringSubscriptionFrequency = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency("DAILY", 0, "DAILY");
        DAILY = recurringSubscriptionFrequency;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency recurringSubscriptionFrequency2 = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency("WEEKLY", 1, "WEEKLY");
        WEEKLY = recurringSubscriptionFrequency2;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency recurringSubscriptionFrequency3 = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency("BI_WEEKLY", 2, "BI_WEEKLY");
        BI_WEEKLY = recurringSubscriptionFrequency3;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency recurringSubscriptionFrequency4 = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency("MONTHLY", 3, "MONTHLY");
        MONTHLY = recurringSubscriptionFrequency4;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency recurringSubscriptionFrequency5 = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = recurringSubscriptionFrequency5;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency[] recurringSubscriptionFrequencyArr = {recurringSubscriptionFrequency, recurringSubscriptionFrequency2, recurringSubscriptionFrequency3, recurringSubscriptionFrequency4, recurringSubscriptionFrequency5};
        Camera2StreamConfigurationMap = recurringSubscriptionFrequencyArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(recurringSubscriptionFrequencyArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("RecurringSubscriptionFrequency", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"DAILY", "WEEKLY", "BI_WEEKLY", "MONTHLY"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionFrequency$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionFrequency;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionFrequency;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionFrequency;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency[]{com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.DAILY, com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.WEEKLY, com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.BI_WEEKLY, com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.MONTHLY});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency recurringSubscriptionFrequency = (com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency) obj;
            return recurringSubscriptionFrequency == null ? com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.UNKNOWN__ : recurringSubscriptionFrequency;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionFrequency> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
