package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CARDS", "BANK_ACCOUNTS", "BALANCES", "BNPL", "SAVINGS", "DEBIT_INSTRUMENTS", "THIRD_PARTY_LOYALTY_CARDS", "CREDIT", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "REWARDS", "PAYMENT_PREFERENCES", "MONEY_POOL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WalletAccountType {
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType BALANCES;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType BANK_ACCOUNTS;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType BNPL;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType CARDS;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType CREDIT;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType CRYPTO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType DEBIT_INSTRUMENTS;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType MONEY_POOL;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType PAYMENT_PREFERENCES;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType REWARDS;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType SAVINGS;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType THIRD_PARTY_LOYALTY_CARDS;
    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.WalletAccountType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private WalletAccountType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("CARDS", 0, "CARDS");
        CARDS = walletAccountType;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType2 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("BANK_ACCOUNTS", 1, "BANK_ACCOUNTS");
        BANK_ACCOUNTS = walletAccountType2;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType3 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("BALANCES", 2, "BALANCES");
        BALANCES = walletAccountType3;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType4 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("BNPL", 3, "BNPL");
        BNPL = walletAccountType4;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType5 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("SAVINGS", 4, "SAVINGS");
        SAVINGS = walletAccountType5;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType6 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("DEBIT_INSTRUMENTS", 5, "DEBIT_INSTRUMENTS");
        DEBIT_INSTRUMENTS = walletAccountType6;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType7 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("THIRD_PARTY_LOYALTY_CARDS", 6, "THIRD_PARTY_LOYALTY_CARDS");
        THIRD_PARTY_LOYALTY_CARDS = walletAccountType7;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType8 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("CREDIT", 7, "CREDIT");
        CREDIT = walletAccountType8;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType9 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 8, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO);
        CRYPTO = walletAccountType9;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType10 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("REWARDS", 9, "REWARDS");
        REWARDS = walletAccountType10;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType11 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("PAYMENT_PREFERENCES", 10, "PAYMENT_PREFERENCES");
        PAYMENT_PREFERENCES = walletAccountType11;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType12 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("MONEY_POOL", 11, "MONEY_POOL");
        MONEY_POOL = walletAccountType12;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType13 = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = walletAccountType13;
        com.paypal.oslo.api.graphql.schema.type.WalletAccountType[] walletAccountTypeArr = {walletAccountType, walletAccountType2, walletAccountType3, walletAccountType4, walletAccountType5, walletAccountType6, walletAccountType7, walletAccountType8, walletAccountType9, walletAccountType10, walletAccountType11, walletAccountType12, walletAccountType13};
        getHighSpeedVideoFpsRangesFor = walletAccountTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(walletAccountTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.WalletAccountType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("WalletAccountType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CARDS", "BANK_ACCOUNTS", "BALANCES", "BNPL", "SAVINGS", "DEBIT_INSTRUMENTS", "THIRD_PARTY_LOYALTY_CARDS", "CREDIT", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "REWARDS", "PAYMENT_PREFERENCES", "MONEY_POOL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.WalletAccountType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.WalletAccountType[]{com.paypal.oslo.api.graphql.schema.type.WalletAccountType.CARDS, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.BANK_ACCOUNTS, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.BALANCES, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.BNPL, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.SAVINGS, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.DEBIT_INSTRUMENTS, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.THIRD_PARTY_LOYALTY_CARDS, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.CREDIT, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.CRYPTO, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.REWARDS, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.PAYMENT_PREFERENCES, com.paypal.oslo.api.graphql.schema.type.WalletAccountType.MONEY_POOL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.WalletAccountType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.WalletAccountType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.WalletAccountType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.WalletAccountType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.WalletAccountType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.WalletAccountType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.WalletAccountType walletAccountType = (com.paypal.oslo.api.graphql.schema.type.WalletAccountType) obj;
            return walletAccountType == null ? com.paypal.oslo.api.graphql.schema.type.WalletAccountType.UNKNOWN__ : walletAccountType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.WalletAccountType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.WalletAccountType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.WalletAccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.WalletAccountType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.WalletAccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.WalletAccountType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
