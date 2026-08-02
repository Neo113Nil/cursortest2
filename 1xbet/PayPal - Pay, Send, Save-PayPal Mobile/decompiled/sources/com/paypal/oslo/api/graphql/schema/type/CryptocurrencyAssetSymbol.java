package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BTC", "ETH", "BCH", "LTC", "PYUSD", "SOL", "LINK", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyAssetSymbol {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol BCH;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol BTC;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol ETH;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol LINK;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol LTC;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol PYUSD;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol SOL;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyAssetSymbol(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol("BTC", 0, "BTC");
        BTC = cryptocurrencyAssetSymbol;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol("ETH", 1, "ETH");
        ETH = cryptocurrencyAssetSymbol2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol("BCH", 2, "BCH");
        BCH = cryptocurrencyAssetSymbol3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol("LTC", 3, "LTC");
        LTC = cryptocurrencyAssetSymbol4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol("PYUSD", 4, "PYUSD");
        PYUSD = cryptocurrencyAssetSymbol5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol("SOL", 5, "SOL");
        SOL = cryptocurrencyAssetSymbol6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol("LINK", 6, "LINK");
        LINK = cryptocurrencyAssetSymbol7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol8 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyAssetSymbol8;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol[] cryptocurrencyAssetSymbolArr = {cryptocurrencyAssetSymbol, cryptocurrencyAssetSymbol2, cryptocurrencyAssetSymbol3, cryptocurrencyAssetSymbol4, cryptocurrencyAssetSymbol5, cryptocurrencyAssetSymbol6, cryptocurrencyAssetSymbol7, cryptocurrencyAssetSymbol8};
        getHighResolutionOutputSizeshNQ4ISI = cryptocurrencyAssetSymbolArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyAssetSymbolArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyAssetSymbol", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BTC", "ETH", "BCH", "LTC", "PYUSD", "SOL", "LINK"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.BTC, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.ETH, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.BCH, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.LTC, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.PYUSD, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.SOL, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.LINK});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol) obj;
            return cryptocurrencyAssetSymbol == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.UNKNOWN__ : cryptocurrencyAssetSymbol;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
