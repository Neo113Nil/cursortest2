package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BANK_SAVINGS", "BANK_CHECKING", "DEBIT_CARD", "CREDIT_CARD", "PREPAID_CARD", "PAYPAL_CREDIT", "PAYPAL_BALANCE", "PAYPAL_DEBIT_CARD", "PAY_LATER_TO_GO", "BUSINESS_DEBIT_CARD", "CONSUMER_DEBIT_CARD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FundingInstrumentType {
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType BANK_CHECKING;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType BANK_SAVINGS;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType BUSINESS_DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType CONSUMER_DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType CREDIT_CARD;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType PAYPAL_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType PAYPAL_CREDIT;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType PAYPAL_DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType PAY_LATER_TO_GO;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType PREPAID_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private FundingInstrumentType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("BANK_SAVINGS", 0, "BANK_SAVINGS");
        BANK_SAVINGS = fundingInstrumentType;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType2 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("BANK_CHECKING", 1, "BANK_CHECKING");
        BANK_CHECKING = fundingInstrumentType2;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType3 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("DEBIT_CARD", 2, "DEBIT_CARD");
        DEBIT_CARD = fundingInstrumentType3;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType4 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("CREDIT_CARD", 3, "CREDIT_CARD");
        CREDIT_CARD = fundingInstrumentType4;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType5 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("PREPAID_CARD", 4, "PREPAID_CARD");
        PREPAID_CARD = fundingInstrumentType5;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType6 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("PAYPAL_CREDIT", 5, "PAYPAL_CREDIT");
        PAYPAL_CREDIT = fundingInstrumentType6;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType7 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("PAYPAL_BALANCE", 6, "PAYPAL_BALANCE");
        PAYPAL_BALANCE = fundingInstrumentType7;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType8 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("PAYPAL_DEBIT_CARD", 7, "PAYPAL_DEBIT_CARD");
        PAYPAL_DEBIT_CARD = fundingInstrumentType8;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType9 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("PAY_LATER_TO_GO", 8, "PAY_LATER_TO_GO");
        PAY_LATER_TO_GO = fundingInstrumentType9;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType10 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("BUSINESS_DEBIT_CARD", 9, "BUSINESS_DEBIT_CARD");
        BUSINESS_DEBIT_CARD = fundingInstrumentType10;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType11 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("CONSUMER_DEBIT_CARD", 10, "CONSUMER_DEBIT_CARD");
        CONSUMER_DEBIT_CARD = fundingInstrumentType11;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType12 = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType("UNKNOWN__", 11, "UNKNOWN__");
        UNKNOWN__ = fundingInstrumentType12;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType[] fundingInstrumentTypeArr = {fundingInstrumentType, fundingInstrumentType2, fundingInstrumentType3, fundingInstrumentType4, fundingInstrumentType5, fundingInstrumentType6, fundingInstrumentType7, fundingInstrumentType8, fundingInstrumentType9, fundingInstrumentType10, fundingInstrumentType11, fundingInstrumentType12};
        Camera2StreamConfigurationMap = fundingInstrumentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("FundingInstrumentType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BANK_SAVINGS", "BANK_CHECKING", "DEBIT_CARD", "CREDIT_CARD", "PREPAID_CARD", "PAYPAL_CREDIT", "PAYPAL_BALANCE", "PAYPAL_DEBIT_CARD", "PAY_LATER_TO_GO", "BUSINESS_DEBIT_CARD", "CONSUMER_DEBIT_CARD"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType[]{com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_SAVINGS, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_CHECKING, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CREDIT_CARD, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PREPAID_CARD, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_CREDIT, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_BALANCE, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAY_LATER_TO_GO, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BUSINESS_DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CONSUMER_DEBIT_CARD});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = (com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType) obj;
            return fundingInstrumentType == null ? com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.UNKNOWN__ : fundingInstrumentType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
