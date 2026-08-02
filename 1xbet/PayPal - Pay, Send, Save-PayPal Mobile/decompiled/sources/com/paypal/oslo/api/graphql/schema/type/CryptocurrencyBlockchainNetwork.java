package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "INTERNAL_NETWORK", "BITCOIN_MAINNET", "BITCOIN_TESTNET", "BITCOIN_CASH_MAINNET", "BITCOIN_CASH_TESTNET", "LITECOIN_MAINNET", "LITECOIN_TESTNET", "ETHEREUM_MAINNET", "ETHEREUM_ROPSTEN", "ETHEREUM_KOVAN", "ETHEREUM_SEPOLIA", "SOLANA_MAINNET", "SOLANA_DEVNET", "ARBITRUM_ONE_MAINNET", "ARBITRUM_SEPOLIA", "STELLAR_MAINNET", "STELLAR_TESTNET", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyBlockchainNetwork {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork ARBITRUM_ONE_MAINNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork ARBITRUM_SEPOLIA;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork BITCOIN_CASH_MAINNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork BITCOIN_CASH_TESTNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork BITCOIN_MAINNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork BITCOIN_TESTNET;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork ETHEREUM_KOVAN;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork ETHEREUM_MAINNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork ETHEREUM_ROPSTEN;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork ETHEREUM_SEPOLIA;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork INTERNAL_NETWORK;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork LITECOIN_MAINNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork LITECOIN_TESTNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork SOLANA_DEVNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork SOLANA_MAINNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork STELLAR_MAINNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork STELLAR_TESTNET;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyBlockchainNetwork(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("INTERNAL_NETWORK", 0, "INTERNAL_NETWORK");
        INTERNAL_NETWORK = cryptocurrencyBlockchainNetwork;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("BITCOIN_MAINNET", 1, "BITCOIN_MAINNET");
        BITCOIN_MAINNET = cryptocurrencyBlockchainNetwork2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("BITCOIN_TESTNET", 2, "BITCOIN_TESTNET");
        BITCOIN_TESTNET = cryptocurrencyBlockchainNetwork3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("BITCOIN_CASH_MAINNET", 3, "BITCOIN_CASH_MAINNET");
        BITCOIN_CASH_MAINNET = cryptocurrencyBlockchainNetwork4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("BITCOIN_CASH_TESTNET", 4, "BITCOIN_CASH_TESTNET");
        BITCOIN_CASH_TESTNET = cryptocurrencyBlockchainNetwork5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("LITECOIN_MAINNET", 5, "LITECOIN_MAINNET");
        LITECOIN_MAINNET = cryptocurrencyBlockchainNetwork6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("LITECOIN_TESTNET", 6, "LITECOIN_TESTNET");
        LITECOIN_TESTNET = cryptocurrencyBlockchainNetwork7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork8 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("ETHEREUM_MAINNET", 7, "ETHEREUM_MAINNET");
        ETHEREUM_MAINNET = cryptocurrencyBlockchainNetwork8;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork9 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("ETHEREUM_ROPSTEN", 8, "ETHEREUM_ROPSTEN");
        ETHEREUM_ROPSTEN = cryptocurrencyBlockchainNetwork9;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork10 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("ETHEREUM_KOVAN", 9, "ETHEREUM_KOVAN");
        ETHEREUM_KOVAN = cryptocurrencyBlockchainNetwork10;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork11 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("ETHEREUM_SEPOLIA", 10, "ETHEREUM_SEPOLIA");
        ETHEREUM_SEPOLIA = cryptocurrencyBlockchainNetwork11;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork12 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("SOLANA_MAINNET", 11, "SOLANA_MAINNET");
        SOLANA_MAINNET = cryptocurrencyBlockchainNetwork12;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork13 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("SOLANA_DEVNET", 12, "SOLANA_DEVNET");
        SOLANA_DEVNET = cryptocurrencyBlockchainNetwork13;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork14 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("ARBITRUM_ONE_MAINNET", 13, "ARBITRUM_ONE_MAINNET");
        ARBITRUM_ONE_MAINNET = cryptocurrencyBlockchainNetwork14;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork15 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("ARBITRUM_SEPOLIA", 14, "ARBITRUM_SEPOLIA");
        ARBITRUM_SEPOLIA = cryptocurrencyBlockchainNetwork15;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork16 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("STELLAR_MAINNET", 15, "STELLAR_MAINNET");
        STELLAR_MAINNET = cryptocurrencyBlockchainNetwork16;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork17 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("STELLAR_TESTNET", 16, "STELLAR_TESTNET");
        STELLAR_TESTNET = cryptocurrencyBlockchainNetwork17;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork18 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork("UNKNOWN__", 17, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyBlockchainNetwork18;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork[] cryptocurrencyBlockchainNetworkArr = {cryptocurrencyBlockchainNetwork, cryptocurrencyBlockchainNetwork2, cryptocurrencyBlockchainNetwork3, cryptocurrencyBlockchainNetwork4, cryptocurrencyBlockchainNetwork5, cryptocurrencyBlockchainNetwork6, cryptocurrencyBlockchainNetwork7, cryptocurrencyBlockchainNetwork8, cryptocurrencyBlockchainNetwork9, cryptocurrencyBlockchainNetwork10, cryptocurrencyBlockchainNetwork11, cryptocurrencyBlockchainNetwork12, cryptocurrencyBlockchainNetwork13, cryptocurrencyBlockchainNetwork14, cryptocurrencyBlockchainNetwork15, cryptocurrencyBlockchainNetwork16, cryptocurrencyBlockchainNetwork17, cryptocurrencyBlockchainNetwork18};
        getHighSpeedVideoFpsRangesFor = cryptocurrencyBlockchainNetworkArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyBlockchainNetworkArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyBlockchainNetwork", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"INTERNAL_NETWORK", "BITCOIN_MAINNET", "BITCOIN_TESTNET", "BITCOIN_CASH_MAINNET", "BITCOIN_CASH_TESTNET", "LITECOIN_MAINNET", "LITECOIN_TESTNET", "ETHEREUM_MAINNET", "ETHEREUM_ROPSTEN", "ETHEREUM_KOVAN", "ETHEREUM_SEPOLIA", "SOLANA_MAINNET", "SOLANA_DEVNET", "ARBITRUM_ONE_MAINNET", "ARBITRUM_SEPOLIA", "STELLAR_MAINNET", "STELLAR_TESTNET"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.INTERNAL_NETWORK, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.BITCOIN_MAINNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.BITCOIN_TESTNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.BITCOIN_CASH_MAINNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.BITCOIN_CASH_TESTNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.LITECOIN_MAINNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.LITECOIN_TESTNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.ETHEREUM_MAINNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.ETHEREUM_ROPSTEN, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.ETHEREUM_KOVAN, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.ETHEREUM_SEPOLIA, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.SOLANA_MAINNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.SOLANA_DEVNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.ARBITRUM_ONE_MAINNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.ARBITRUM_SEPOLIA, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.STELLAR_MAINNET, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.STELLAR_TESTNET});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork) obj;
            return cryptocurrencyBlockchainNetwork == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.UNKNOWN__ : cryptocurrencyBlockchainNetwork;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
