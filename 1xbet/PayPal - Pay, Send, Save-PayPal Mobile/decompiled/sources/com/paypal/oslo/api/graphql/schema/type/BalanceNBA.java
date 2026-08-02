package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BalanceNBA;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BALANCE_ACTIVATE_DEBIT_NBA", "BALANCE_SET_UP_DIRECT_DEPOSIT_NBA", "BALANCE_SET_UP_DIRECT_DEPOSIT_EXTENDED_NBA", "BALANCE_SET_UP_AUTO_RELOAD_NBA", "BALANCE_SET_UP_AUTO_RELOAD_EXTENDED_NBA", "BALANCE_CONVERT_TO_PYUSD_NBA", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BalanceNBA {
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceNBA BALANCE_ACTIVATE_DEBIT_NBA;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceNBA BALANCE_CONVERT_TO_PYUSD_NBA;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceNBA BALANCE_SET_UP_AUTO_RELOAD_EXTENDED_NBA;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceNBA BALANCE_SET_UP_AUTO_RELOAD_NBA;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceNBA BALANCE_SET_UP_DIRECT_DEPOSIT_EXTENDED_NBA;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceNBA BALANCE_SET_UP_DIRECT_DEPOSIT_NBA;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceNBA.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceNBA UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BalanceNBA[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BalanceNBA(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BalanceNBA balanceNBA = new com.paypal.oslo.api.graphql.schema.type.BalanceNBA("BALANCE_ACTIVATE_DEBIT_NBA", 0, "BALANCE_ACTIVATE_DEBIT_NBA");
        BALANCE_ACTIVATE_DEBIT_NBA = balanceNBA;
        com.paypal.oslo.api.graphql.schema.type.BalanceNBA balanceNBA2 = new com.paypal.oslo.api.graphql.schema.type.BalanceNBA("BALANCE_SET_UP_DIRECT_DEPOSIT_NBA", 1, "BALANCE_SET_UP_DIRECT_DEPOSIT_NBA");
        BALANCE_SET_UP_DIRECT_DEPOSIT_NBA = balanceNBA2;
        com.paypal.oslo.api.graphql.schema.type.BalanceNBA balanceNBA3 = new com.paypal.oslo.api.graphql.schema.type.BalanceNBA("BALANCE_SET_UP_DIRECT_DEPOSIT_EXTENDED_NBA", 2, "BALANCE_SET_UP_DIRECT_DEPOSIT_EXTENDED_NBA");
        BALANCE_SET_UP_DIRECT_DEPOSIT_EXTENDED_NBA = balanceNBA3;
        com.paypal.oslo.api.graphql.schema.type.BalanceNBA balanceNBA4 = new com.paypal.oslo.api.graphql.schema.type.BalanceNBA("BALANCE_SET_UP_AUTO_RELOAD_NBA", 3, "BALANCE_SET_UP_AUTO_RELOAD_NBA");
        BALANCE_SET_UP_AUTO_RELOAD_NBA = balanceNBA4;
        com.paypal.oslo.api.graphql.schema.type.BalanceNBA balanceNBA5 = new com.paypal.oslo.api.graphql.schema.type.BalanceNBA("BALANCE_SET_UP_AUTO_RELOAD_EXTENDED_NBA", 4, "BALANCE_SET_UP_AUTO_RELOAD_EXTENDED_NBA");
        BALANCE_SET_UP_AUTO_RELOAD_EXTENDED_NBA = balanceNBA5;
        com.paypal.oslo.api.graphql.schema.type.BalanceNBA balanceNBA6 = new com.paypal.oslo.api.graphql.schema.type.BalanceNBA("BALANCE_CONVERT_TO_PYUSD_NBA", 5, "BALANCE_CONVERT_TO_PYUSD_NBA");
        BALANCE_CONVERT_TO_PYUSD_NBA = balanceNBA6;
        com.paypal.oslo.api.graphql.schema.type.BalanceNBA balanceNBA7 = new com.paypal.oslo.api.graphql.schema.type.BalanceNBA("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = balanceNBA7;
        com.paypal.oslo.api.graphql.schema.type.BalanceNBA[] balanceNBAArr = {balanceNBA, balanceNBA2, balanceNBA3, balanceNBA4, balanceNBA5, balanceNBA6, balanceNBA7};
        getHighSpeedVideoFpsRangesFor = balanceNBAArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(balanceNBAArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BalanceNBA.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BalanceNBA", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BALANCE_ACTIVATE_DEBIT_NBA", "BALANCE_SET_UP_DIRECT_DEPOSIT_NBA", "BALANCE_SET_UP_DIRECT_DEPOSIT_EXTENDED_NBA", "BALANCE_SET_UP_AUTO_RELOAD_NBA", "BALANCE_SET_UP_AUTO_RELOAD_EXTENDED_NBA", "BALANCE_CONVERT_TO_PYUSD_NBA"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BalanceNBA$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceNBA;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BalanceNBA;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BalanceNBA;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BalanceNBA.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BalanceNBA> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BalanceNBA[]{com.paypal.oslo.api.graphql.schema.type.BalanceNBA.BALANCE_ACTIVATE_DEBIT_NBA, com.paypal.oslo.api.graphql.schema.type.BalanceNBA.BALANCE_SET_UP_DIRECT_DEPOSIT_NBA, com.paypal.oslo.api.graphql.schema.type.BalanceNBA.BALANCE_SET_UP_DIRECT_DEPOSIT_EXTENDED_NBA, com.paypal.oslo.api.graphql.schema.type.BalanceNBA.BALANCE_SET_UP_AUTO_RELOAD_NBA, com.paypal.oslo.api.graphql.schema.type.BalanceNBA.BALANCE_SET_UP_AUTO_RELOAD_EXTENDED_NBA, com.paypal.oslo.api.graphql.schema.type.BalanceNBA.BALANCE_CONVERT_TO_PYUSD_NBA});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BalanceNBA[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BalanceNBA[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BalanceNBA[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BalanceNBA safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BalanceNBA.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BalanceNBA) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BalanceNBA balanceNBA = (com.paypal.oslo.api.graphql.schema.type.BalanceNBA) obj;
            return balanceNBA == null ? com.paypal.oslo.api.graphql.schema.type.BalanceNBA.UNKNOWN__ : balanceNBA;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BalanceNBA[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BalanceNBA[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BalanceNBA valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BalanceNBA) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BalanceNBA.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BalanceNBA> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
