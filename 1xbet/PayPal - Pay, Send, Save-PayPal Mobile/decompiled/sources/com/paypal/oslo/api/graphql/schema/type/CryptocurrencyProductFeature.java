package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductFeature;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CRYPTO_CURRENCY_SEND", "CRYPTO_CURRENCY_RECEIVE", "CRYPTO_CURRENCY_TRADE_BUY", "CRYPTO_CURRENCY_TRADE_SELL", "CRYPTO_CURRENCY_TRADE_PRE_SELL", "CRYPTO_CURRENCY_TRADE_SWAP", "CRYPTO_CURRENCY_CLAIM_ROLLOVER", "CRYPTO_CURRENCY_HOLDINGS_ANNUAL_PERCENTAGE_YIELD_REWARD", "CRYPTO_CURRENCY_SETTLEMENT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyProductFeature {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_CLAIM_ROLLOVER;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_HOLDINGS_ANNUAL_PERCENTAGE_YIELD_REWARD;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_RECEIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_SEND;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_SETTLEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_TRADE_BUY;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_TRADE_PRE_SELL;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_TRADE_SELL;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature CRYPTO_CURRENCY_TRADE_SWAP;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyProductFeature(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_SEND", 0, "CRYPTO_CURRENCY_SEND");
        CRYPTO_CURRENCY_SEND = cryptocurrencyProductFeature;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_RECEIVE", 1, "CRYPTO_CURRENCY_RECEIVE");
        CRYPTO_CURRENCY_RECEIVE = cryptocurrencyProductFeature2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_TRADE_BUY", 2, "CRYPTO_CURRENCY_TRADE_BUY");
        CRYPTO_CURRENCY_TRADE_BUY = cryptocurrencyProductFeature3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_TRADE_SELL", 3, "CRYPTO_CURRENCY_TRADE_SELL");
        CRYPTO_CURRENCY_TRADE_SELL = cryptocurrencyProductFeature4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_TRADE_PRE_SELL", 4, "CRYPTO_CURRENCY_TRADE_PRE_SELL");
        CRYPTO_CURRENCY_TRADE_PRE_SELL = cryptocurrencyProductFeature5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_TRADE_SWAP", 5, "CRYPTO_CURRENCY_TRADE_SWAP");
        CRYPTO_CURRENCY_TRADE_SWAP = cryptocurrencyProductFeature6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_CLAIM_ROLLOVER", 6, "CRYPTO_CURRENCY_CLAIM_ROLLOVER");
        CRYPTO_CURRENCY_CLAIM_ROLLOVER = cryptocurrencyProductFeature7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature8 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_HOLDINGS_ANNUAL_PERCENTAGE_YIELD_REWARD", 7, "CRYPTO_CURRENCY_HOLDINGS_ANNUAL_PERCENTAGE_YIELD_REWARD");
        CRYPTO_CURRENCY_HOLDINGS_ANNUAL_PERCENTAGE_YIELD_REWARD = cryptocurrencyProductFeature8;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature9 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("CRYPTO_CURRENCY_SETTLEMENT", 8, "CRYPTO_CURRENCY_SETTLEMENT");
        CRYPTO_CURRENCY_SETTLEMENT = cryptocurrencyProductFeature9;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature10 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyProductFeature10;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature[] cryptocurrencyProductFeatureArr = {cryptocurrencyProductFeature, cryptocurrencyProductFeature2, cryptocurrencyProductFeature3, cryptocurrencyProductFeature4, cryptocurrencyProductFeature5, cryptocurrencyProductFeature6, cryptocurrencyProductFeature7, cryptocurrencyProductFeature8, cryptocurrencyProductFeature9, cryptocurrencyProductFeature10};
        Camera2StreamConfigurationMap = cryptocurrencyProductFeatureArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyProductFeatureArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyProductFeature", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CRYPTO_CURRENCY_SEND", "CRYPTO_CURRENCY_RECEIVE", "CRYPTO_CURRENCY_TRADE_BUY", "CRYPTO_CURRENCY_TRADE_SELL", "CRYPTO_CURRENCY_TRADE_PRE_SELL", "CRYPTO_CURRENCY_TRADE_SWAP", "CRYPTO_CURRENCY_CLAIM_ROLLOVER", "CRYPTO_CURRENCY_HOLDINGS_ANNUAL_PERCENTAGE_YIELD_REWARD", "CRYPTO_CURRENCY_SETTLEMENT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductFeature$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductFeature;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductFeature;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyProductFeature;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_SEND, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_RECEIVE, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_TRADE_BUY, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_TRADE_SELL, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_TRADE_PRE_SELL, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_TRADE_SWAP, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_CLAIM_ROLLOVER, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_HOLDINGS_ANNUAL_PERCENTAGE_YIELD_REWARD, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.CRYPTO_CURRENCY_SETTLEMENT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature cryptocurrencyProductFeature = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature) obj;
            return cryptocurrencyProductFeature == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.UNKNOWN__ : cryptocurrencyProductFeature;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyProductFeature> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
