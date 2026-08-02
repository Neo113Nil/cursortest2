package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CONSUMER_DEBIT_CARD", "CONSUMER_VIRTUAL_DEBIT_CARD", "BUSINESS_DEBIT_CARD", "FULL_WALLET_CARD", "SAMSUNG_PAY", "GOOGLE_PAY", "CONSUMER_QRC_UPI_TOKEN", "DIGITIZATION_TOKEN", "PAY_IN_4_TOKEN", "CONSUMER_TEEN_DEBIT_CARD", "BUSINESS_DEBIT_CARD_ADDITIONAL", "CONSUMER_DEBIT_CARD_LEGACY", "DIGITIZATION_TOKEN_PAYPAL", "DIGITIZATION_TOKEN_APPLEPAY", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentProductName {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName BUSINESS_DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName BUSINESS_DEBIT_CARD_ADDITIONAL;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName CONSUMER_DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName CONSUMER_DEBIT_CARD_LEGACY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName CONSUMER_QRC_UPI_TOKEN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName CONSUMER_TEEN_DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName CONSUMER_VIRTUAL_DEBIT_CARD;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName DIGITIZATION_TOKEN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName DIGITIZATION_TOKEN_APPLEPAY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName DIGITIZATION_TOKEN_PAYPAL;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName FULL_WALLET_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName GOOGLE_PAY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName PAY_IN_4_TOKEN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName SAMSUNG_PAY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentProductName(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("CONSUMER_DEBIT_CARD", 0, "CONSUMER_DEBIT_CARD");
        CONSUMER_DEBIT_CARD = debitInstrumentProductName;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("CONSUMER_VIRTUAL_DEBIT_CARD", 1, "CONSUMER_VIRTUAL_DEBIT_CARD");
        CONSUMER_VIRTUAL_DEBIT_CARD = debitInstrumentProductName2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("BUSINESS_DEBIT_CARD", 2, "BUSINESS_DEBIT_CARD");
        BUSINESS_DEBIT_CARD = debitInstrumentProductName3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("FULL_WALLET_CARD", 3, "FULL_WALLET_CARD");
        FULL_WALLET_CARD = debitInstrumentProductName4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("SAMSUNG_PAY", 4, "SAMSUNG_PAY");
        SAMSUNG_PAY = debitInstrumentProductName5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("GOOGLE_PAY", 5, "GOOGLE_PAY");
        GOOGLE_PAY = debitInstrumentProductName6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("CONSUMER_QRC_UPI_TOKEN", 6, "CONSUMER_QRC_UPI_TOKEN");
        CONSUMER_QRC_UPI_TOKEN = debitInstrumentProductName7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName8 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("DIGITIZATION_TOKEN", 7, "DIGITIZATION_TOKEN");
        DIGITIZATION_TOKEN = debitInstrumentProductName8;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName9 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("PAY_IN_4_TOKEN", 8, "PAY_IN_4_TOKEN");
        PAY_IN_4_TOKEN = debitInstrumentProductName9;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName10 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("CONSUMER_TEEN_DEBIT_CARD", 9, "CONSUMER_TEEN_DEBIT_CARD");
        CONSUMER_TEEN_DEBIT_CARD = debitInstrumentProductName10;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName11 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("BUSINESS_DEBIT_CARD_ADDITIONAL", 10, "BUSINESS_DEBIT_CARD_ADDITIONAL");
        BUSINESS_DEBIT_CARD_ADDITIONAL = debitInstrumentProductName11;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName12 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("CONSUMER_DEBIT_CARD_LEGACY", 11, "CONSUMER_DEBIT_CARD_LEGACY");
        CONSUMER_DEBIT_CARD_LEGACY = debitInstrumentProductName12;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName13 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("DIGITIZATION_TOKEN_PAYPAL", 12, "DIGITIZATION_TOKEN_PAYPAL");
        DIGITIZATION_TOKEN_PAYPAL = debitInstrumentProductName13;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName14 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("DIGITIZATION_TOKEN_APPLEPAY", 13, "DIGITIZATION_TOKEN_APPLEPAY");
        DIGITIZATION_TOKEN_APPLEPAY = debitInstrumentProductName14;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName15 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("UNKNOWN", 14, "UNKNOWN");
        UNKNOWN = debitInstrumentProductName15;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName16 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName("UNKNOWN__", 15, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentProductName16;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[] debitInstrumentProductNameArr = {debitInstrumentProductName, debitInstrumentProductName2, debitInstrumentProductName3, debitInstrumentProductName4, debitInstrumentProductName5, debitInstrumentProductName6, debitInstrumentProductName7, debitInstrumentProductName8, debitInstrumentProductName9, debitInstrumentProductName10, debitInstrumentProductName11, debitInstrumentProductName12, debitInstrumentProductName13, debitInstrumentProductName14, debitInstrumentProductName15, debitInstrumentProductName16};
        Camera2StreamConfigurationMap = debitInstrumentProductNameArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentProductNameArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentProductName", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CONSUMER_DEBIT_CARD", "CONSUMER_VIRTUAL_DEBIT_CARD", "BUSINESS_DEBIT_CARD", "FULL_WALLET_CARD", "SAMSUNG_PAY", "GOOGLE_PAY", "CONSUMER_QRC_UPI_TOKEN", "DIGITIZATION_TOKEN", "PAY_IN_4_TOKEN", "CONSUMER_TEEN_DEBIT_CARD", "BUSINESS_DEBIT_CARD_ADDITIONAL", "CONSUMER_DEBIT_CARD_LEGACY", "DIGITIZATION_TOKEN_PAYPAL", "DIGITIZATION_TOKEN_APPLEPAY", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.CONSUMER_DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.CONSUMER_VIRTUAL_DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.BUSINESS_DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.FULL_WALLET_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.SAMSUNG_PAY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.GOOGLE_PAY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.CONSUMER_QRC_UPI_TOKEN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.DIGITIZATION_TOKEN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.PAY_IN_4_TOKEN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.CONSUMER_TEEN_DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.BUSINESS_DEBIT_CARD_ADDITIONAL, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.CONSUMER_DEBIT_CARD_LEGACY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.DIGITIZATION_TOKEN_PAYPAL, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.DIGITIZATION_TOKEN_APPLEPAY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName) obj;
            return debitInstrumentProductName == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.UNKNOWN__ : debitInstrumentProductName;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
