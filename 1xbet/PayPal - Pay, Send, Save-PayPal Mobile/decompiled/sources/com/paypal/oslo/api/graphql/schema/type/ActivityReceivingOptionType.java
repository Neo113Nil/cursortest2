package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityReceivingOptionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "WALLET_TOP_UP", "RECEIVER_BANK_DEPOSIT", "CASH_DELIVERY", "CASH_PICKUP", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityReceivingOptionType {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType CASH_DELIVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType CASH_PICKUP;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType RECEIVER_BANK_DEPOSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType WALLET_TOP_UP;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityReceivingOptionType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType activityReceivingOptionType = new com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType("WALLET_TOP_UP", 0, "WALLET_TOP_UP");
        WALLET_TOP_UP = activityReceivingOptionType;
        com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType activityReceivingOptionType2 = new com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType("RECEIVER_BANK_DEPOSIT", 1, "RECEIVER_BANK_DEPOSIT");
        RECEIVER_BANK_DEPOSIT = activityReceivingOptionType2;
        com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType activityReceivingOptionType3 = new com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType("CASH_DELIVERY", 2, "CASH_DELIVERY");
        CASH_DELIVERY = activityReceivingOptionType3;
        com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType activityReceivingOptionType4 = new com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType("CASH_PICKUP", 3, "CASH_PICKUP");
        CASH_PICKUP = activityReceivingOptionType4;
        com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType activityReceivingOptionType5 = new com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = activityReceivingOptionType5;
        com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType[] activityReceivingOptionTypeArr = {activityReceivingOptionType, activityReceivingOptionType2, activityReceivingOptionType3, activityReceivingOptionType4, activityReceivingOptionType5};
        Camera2StreamConfigurationMap = activityReceivingOptionTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(activityReceivingOptionTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityReceivingOptionType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"WALLET_TOP_UP", "RECEIVER_BANK_DEPOSIT", "CASH_DELIVERY", "CASH_PICKUP"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityReceivingOptionType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityReceivingOptionType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityReceivingOptionType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityReceivingOptionType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.WALLET_TOP_UP, com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.RECEIVER_BANK_DEPOSIT, com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.CASH_DELIVERY, com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.CASH_PICKUP});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType activityReceivingOptionType = (com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType) obj;
            return activityReceivingOptionType == null ? com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.UNKNOWN__ : activityReceivingOptionType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityReceivingOptionType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
