package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityInitiatorType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ANONYMOUS", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, "ADMIN", "API_CALLER", "BATCH", "GUEST", "PAYOUTS_ADMIN", "GOLD", "DROPBOX", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityInitiatorType {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType ADMIN;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType ANONYMOUS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType API_CALLER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType BATCH;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType CONSUMER;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType DROPBOX;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType GOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType GUEST;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType PAYOUTS_ADMIN;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityInitiatorType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("ANONYMOUS", 0, "ANONYMOUS");
        ANONYMOUS = activityInitiatorType;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType2 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType(com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, 1, com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER);
        CONSUMER = activityInitiatorType2;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType3 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("ADMIN", 2, "ADMIN");
        ADMIN = activityInitiatorType3;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType4 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("API_CALLER", 3, "API_CALLER");
        API_CALLER = activityInitiatorType4;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType5 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("BATCH", 4, "BATCH");
        BATCH = activityInitiatorType5;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType6 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("GUEST", 5, "GUEST");
        GUEST = activityInitiatorType6;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType7 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("PAYOUTS_ADMIN", 6, "PAYOUTS_ADMIN");
        PAYOUTS_ADMIN = activityInitiatorType7;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType8 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("GOLD", 7, "GOLD");
        GOLD = activityInitiatorType8;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType9 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("DROPBOX", 8, "DROPBOX");
        DROPBOX = activityInitiatorType9;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType10 = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = activityInitiatorType10;
        com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType[] activityInitiatorTypeArr = {activityInitiatorType, activityInitiatorType2, activityInitiatorType3, activityInitiatorType4, activityInitiatorType5, activityInitiatorType6, activityInitiatorType7, activityInitiatorType8, activityInitiatorType9, activityInitiatorType10};
        getHighSpeedVideoFpsRangesFor = activityInitiatorTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(activityInitiatorTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityInitiatorType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ANONYMOUS", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, "ADMIN", "API_CALLER", "BATCH", "GUEST", "PAYOUTS_ADMIN", "GOLD", "DROPBOX"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityInitiatorType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityInitiatorType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityInitiatorType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityInitiatorType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType[]{com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.ANONYMOUS, com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.CONSUMER, com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.ADMIN, com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.API_CALLER, com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.BATCH, com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.GUEST, com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.PAYOUTS_ADMIN, com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.GOLD, com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.DROPBOX});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType activityInitiatorType = (com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType) obj;
            return activityInitiatorType == null ? com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.UNKNOWN__ : activityInitiatorType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
