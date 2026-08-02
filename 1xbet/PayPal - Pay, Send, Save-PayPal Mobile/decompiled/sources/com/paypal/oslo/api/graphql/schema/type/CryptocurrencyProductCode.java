package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CRYPTO_CURRENCY_TRADING", "CRYPTO_CURRENCY_TRANSFER", "CRYPTO_CURRENCY_SWAP", "REWARDS", "NEGATIVE_BALANCE_RECOVERY", "ESCHEATMENT", "PERIODIC_STANDIN_TRADE", "CRYPTO_LIQUIDATION_ACH_RECOVERY", "REMITTANCE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyProductCode {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode CRYPTO_CURRENCY_SWAP;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode CRYPTO_CURRENCY_TRADING;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode CRYPTO_CURRENCY_TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode CRYPTO_LIQUIDATION_ACH_RECOVERY;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode ESCHEATMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode NEGATIVE_BALANCE_RECOVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode PERIODIC_STANDIN_TRADE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode REMITTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode REWARDS;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyProductCode(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("CRYPTO_CURRENCY_TRADING", 0, "CRYPTO_CURRENCY_TRADING");
        CRYPTO_CURRENCY_TRADING = cryptocurrencyProductCode;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("CRYPTO_CURRENCY_TRANSFER", 1, "CRYPTO_CURRENCY_TRANSFER");
        CRYPTO_CURRENCY_TRANSFER = cryptocurrencyProductCode2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("CRYPTO_CURRENCY_SWAP", 2, "CRYPTO_CURRENCY_SWAP");
        CRYPTO_CURRENCY_SWAP = cryptocurrencyProductCode3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("REWARDS", 3, "REWARDS");
        REWARDS = cryptocurrencyProductCode4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("NEGATIVE_BALANCE_RECOVERY", 4, "NEGATIVE_BALANCE_RECOVERY");
        NEGATIVE_BALANCE_RECOVERY = cryptocurrencyProductCode5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("ESCHEATMENT", 5, "ESCHEATMENT");
        ESCHEATMENT = cryptocurrencyProductCode6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("PERIODIC_STANDIN_TRADE", 6, "PERIODIC_STANDIN_TRADE");
        PERIODIC_STANDIN_TRADE = cryptocurrencyProductCode7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode8 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("CRYPTO_LIQUIDATION_ACH_RECOVERY", 7, "CRYPTO_LIQUIDATION_ACH_RECOVERY");
        CRYPTO_LIQUIDATION_ACH_RECOVERY = cryptocurrencyProductCode8;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode9 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("REMITTANCE", 8, "REMITTANCE");
        REMITTANCE = cryptocurrencyProductCode9;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode10 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyProductCode10;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode[] cryptocurrencyProductCodeArr = {cryptocurrencyProductCode, cryptocurrencyProductCode2, cryptocurrencyProductCode3, cryptocurrencyProductCode4, cryptocurrencyProductCode5, cryptocurrencyProductCode6, cryptocurrencyProductCode7, cryptocurrencyProductCode8, cryptocurrencyProductCode9, cryptocurrencyProductCode10};
        getHighResolutionOutputSizeshNQ4ISI = cryptocurrencyProductCodeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyProductCodeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyProductCode", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CRYPTO_CURRENCY_TRADING", "CRYPTO_CURRENCY_TRANSFER", "CRYPTO_CURRENCY_SWAP", "REWARDS", "NEGATIVE_BALANCE_RECOVERY", "ESCHEATMENT", "PERIODIC_STANDIN_TRADE", "CRYPTO_LIQUIDATION_ACH_RECOVERY", "REMITTANCE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductCode$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductCode;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductCode;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductCode;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.CRYPTO_CURRENCY_TRADING, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.CRYPTO_CURRENCY_TRANSFER, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.CRYPTO_CURRENCY_SWAP, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.REWARDS, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.NEGATIVE_BALANCE_RECOVERY, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.ESCHEATMENT, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.PERIODIC_STANDIN_TRADE, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.CRYPTO_LIQUIDATION_ACH_RECOVERY, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.REMITTANCE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode cryptocurrencyProductCode = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode) obj;
            return cryptocurrencyProductCode == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.UNKNOWN__ : cryptocurrencyProductCode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductCode> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
