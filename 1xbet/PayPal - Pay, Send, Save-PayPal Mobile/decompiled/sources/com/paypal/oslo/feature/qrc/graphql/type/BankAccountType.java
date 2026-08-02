package com.paypal.oslo.feature.qrc.graphql.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/BankAccountType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BUSINESS_CHECKING", "BUSINESS_SAVINGS", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "CUSTOM", "NORMAL", "SAVINGS", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAccountType {
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType BUSINESS_CHECKING;
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType BUSINESS_SAVINGS;
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType CHECKING;
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType CUSTOM;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType NORMAL;
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType SAVINGS;
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType UNKNOWN;
    public static final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.graphql.type.BankAccountType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BankAccountType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType("BUSINESS_CHECKING", 0, "BUSINESS_CHECKING");
        BUSINESS_CHECKING = bankAccountType;
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType2 = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType("BUSINESS_SAVINGS", 1, "BUSINESS_SAVINGS");
        BUSINESS_SAVINGS = bankAccountType2;
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType3 = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, 2, com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING);
        CHECKING = bankAccountType3;
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType4 = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType("CUSTOM", 3, "CUSTOM");
        CUSTOM = bankAccountType4;
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType5 = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType("NORMAL", 4, "NORMAL");
        NORMAL = bankAccountType5;
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType6 = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType("SAVINGS", 5, "SAVINGS");
        SAVINGS = bankAccountType6;
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType7 = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType("UNKNOWN", 6, "UNKNOWN");
        UNKNOWN = bankAccountType7;
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType8 = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = bankAccountType8;
        com.paypal.oslo.feature.qrc.graphql.type.BankAccountType[] bankAccountTypeArr = {bankAccountType, bankAccountType2, bankAccountType3, bankAccountType4, bankAccountType5, bankAccountType6, bankAccountType7, bankAccountType8};
        getHighSpeedVideoFpsRangesFor = bankAccountTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountTypeArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BankAccountType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BUSINESS_CHECKING", "BUSINESS_SAVINGS", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "CUSTOM", "NORMAL", "SAVINGS", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/BankAccountType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/BankAccountType;", "knownValues", "()[Lcom/paypal/oslo/feature/qrc/graphql/type/BankAccountType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/type/BankAccountType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.graphql.type.BankAccountType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType[]{com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.BUSINESS_CHECKING, com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.BUSINESS_SAVINGS, com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.CHECKING, com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.CUSTOM, com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.NORMAL, com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.SAVINGS, com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType[] knownValues() {
            return (com.paypal.oslo.feature.qrc.graphql.type.BankAccountType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.qrc.graphql.type.BankAccountType[0]);
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.BankAccountType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.qrc.graphql.type.BankAccountType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.qrc.graphql.type.BankAccountType bankAccountType = (com.paypal.oslo.feature.qrc.graphql.type.BankAccountType) obj;
            return bankAccountType == null ? com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.UNKNOWN__ : bankAccountType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.qrc.graphql.type.BankAccountType[] values() {
        return (com.paypal.oslo.feature.qrc.graphql.type.BankAccountType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.qrc.graphql.type.BankAccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.graphql.type.BankAccountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.graphql.type.BankAccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.graphql.type.BankAccountType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
