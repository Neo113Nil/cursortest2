package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SCHEDULE", "DIRECT_DEPOSIT_EVENT", "CASH_IN_EVENT", "POS_TRANSACTION_EVENT", "FUNDS_OUT_EVENT", "TAX_SET_ASIDE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoneyboxTransferSettingsType {
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType CASH_IN_EVENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType DIRECT_DEPOSIT_EVENT;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType FUNDS_OUT_EVENT;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType POS_TRANSACTION_EVENT;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType SCHEDULE;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType TAX_SET_ASIDE;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private MoneyboxTransferSettingsType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType = new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType("SCHEDULE", 0, "SCHEDULE");
        SCHEDULE = moneyboxTransferSettingsType;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType2 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType("DIRECT_DEPOSIT_EVENT", 1, "DIRECT_DEPOSIT_EVENT");
        DIRECT_DEPOSIT_EVENT = moneyboxTransferSettingsType2;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType3 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType("CASH_IN_EVENT", 2, "CASH_IN_EVENT");
        CASH_IN_EVENT = moneyboxTransferSettingsType3;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType4 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType("POS_TRANSACTION_EVENT", 3, "POS_TRANSACTION_EVENT");
        POS_TRANSACTION_EVENT = moneyboxTransferSettingsType4;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType5 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType("FUNDS_OUT_EVENT", 4, "FUNDS_OUT_EVENT");
        FUNDS_OUT_EVENT = moneyboxTransferSettingsType5;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType6 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType("TAX_SET_ASIDE", 5, "TAX_SET_ASIDE");
        TAX_SET_ASIDE = moneyboxTransferSettingsType6;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType7 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = moneyboxTransferSettingsType7;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType[] moneyboxTransferSettingsTypeArr = {moneyboxTransferSettingsType, moneyboxTransferSettingsType2, moneyboxTransferSettingsType3, moneyboxTransferSettingsType4, moneyboxTransferSettingsType5, moneyboxTransferSettingsType6, moneyboxTransferSettingsType7};
        getHighSpeedVideoFpsRanges = moneyboxTransferSettingsTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(moneyboxTransferSettingsTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("MoneyboxTransferSettingsType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SCHEDULE", "DIRECT_DEPOSIT_EVENT", "CASH_IN_EVENT", "POS_TRANSACTION_EVENT", "FUNDS_OUT_EVENT", "TAX_SET_ASIDE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType[]{com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.SCHEDULE, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.DIRECT_DEPOSIT_EVENT, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.CASH_IN_EVENT, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.POS_TRANSACTION_EVENT, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.FUNDS_OUT_EVENT, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.TAX_SET_ASIDE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType moneyboxTransferSettingsType = (com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType) obj;
            return moneyboxTransferSettingsType == null ? com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.UNKNOWN__ : moneyboxTransferSettingsType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
