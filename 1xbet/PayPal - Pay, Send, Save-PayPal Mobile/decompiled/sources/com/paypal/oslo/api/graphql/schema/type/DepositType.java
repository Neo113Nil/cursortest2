package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "MANUAL_TOPUP", "COLLECTIONS", "CASH_DEPOSIT", "CHECK_DEPOSIT", "INVESTMENT_DEPOSIT", "ADD_FUNDS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DepositType {
    public static final com.paypal.oslo.api.graphql.schema.type.DepositType ADD_FUNDS;
    public static final com.paypal.oslo.api.graphql.schema.type.DepositType CASH_DEPOSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.DepositType CHECK_DEPOSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.DepositType COLLECTIONS;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DepositType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DepositType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DepositType INVESTMENT_DEPOSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.DepositType MANUAL_TOPUP;
    public static final com.paypal.oslo.api.graphql.schema.type.DepositType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DepositType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType = new com.paypal.oslo.api.graphql.schema.type.DepositType("MANUAL_TOPUP", 0, "MANUAL_TOPUP");
        MANUAL_TOPUP = depositType;
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType2 = new com.paypal.oslo.api.graphql.schema.type.DepositType("COLLECTIONS", 1, "COLLECTIONS");
        COLLECTIONS = depositType2;
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType3 = new com.paypal.oslo.api.graphql.schema.type.DepositType("CASH_DEPOSIT", 2, "CASH_DEPOSIT");
        CASH_DEPOSIT = depositType3;
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType4 = new com.paypal.oslo.api.graphql.schema.type.DepositType("CHECK_DEPOSIT", 3, "CHECK_DEPOSIT");
        CHECK_DEPOSIT = depositType4;
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType5 = new com.paypal.oslo.api.graphql.schema.type.DepositType("INVESTMENT_DEPOSIT", 4, "INVESTMENT_DEPOSIT");
        INVESTMENT_DEPOSIT = depositType5;
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType6 = new com.paypal.oslo.api.graphql.schema.type.DepositType("ADD_FUNDS", 5, "ADD_FUNDS");
        ADD_FUNDS = depositType6;
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType7 = new com.paypal.oslo.api.graphql.schema.type.DepositType("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = depositType7;
        com.paypal.oslo.api.graphql.schema.type.DepositType[] depositTypeArr = {depositType, depositType2, depositType3, depositType4, depositType5, depositType6, depositType7};
        Camera2StreamConfigurationMap = depositTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(depositTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DepositType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DepositType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"MANUAL_TOPUP", "COLLECTIONS", "CASH_DEPOSIT", "CHECK_DEPOSIT", "INVESTMENT_DEPOSIT", "ADD_FUNDS"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DepositType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DepositType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DepositType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DepositType[]{com.paypal.oslo.api.graphql.schema.type.DepositType.MANUAL_TOPUP, com.paypal.oslo.api.graphql.schema.type.DepositType.COLLECTIONS, com.paypal.oslo.api.graphql.schema.type.DepositType.CASH_DEPOSIT, com.paypal.oslo.api.graphql.schema.type.DepositType.CHECK_DEPOSIT, com.paypal.oslo.api.graphql.schema.type.DepositType.INVESTMENT_DEPOSIT, com.paypal.oslo.api.graphql.schema.type.DepositType.ADD_FUNDS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DepositType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DepositType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DepositType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DepositType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DepositType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DepositType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DepositType depositType = (com.paypal.oslo.api.graphql.schema.type.DepositType) obj;
            return depositType == null ? com.paypal.oslo.api.graphql.schema.type.DepositType.UNKNOWN__ : depositType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DepositType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DepositType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DepositType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DepositType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DepositType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DepositType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
