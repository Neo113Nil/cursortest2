package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BLOCKCHAIN_ADDRESS", "ENCRYPTED_ACCOUNT_NUMBER", "DECRYPTED_ACCOUNT_NUMBER", "EMAIL", "PHONE", "PAYPAL_ME_ID", "EXTERNAL_USER_ID", "BLOCKCHAIN_ADDRESS_WITH_MEMO", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyReceiverType {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType BLOCKCHAIN_ADDRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType BLOCKCHAIN_ADDRESS_WITH_MEMO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType DECRYPTED_ACCOUNT_NUMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType EMAIL;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType ENCRYPTED_ACCOUNT_NUMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType EXTERNAL_USER_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType PAYPAL_ME_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType PHONE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyReceiverType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("BLOCKCHAIN_ADDRESS", 0, "BLOCKCHAIN_ADDRESS");
        BLOCKCHAIN_ADDRESS = cryptocurrencyReceiverType;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("ENCRYPTED_ACCOUNT_NUMBER", 1, "ENCRYPTED_ACCOUNT_NUMBER");
        ENCRYPTED_ACCOUNT_NUMBER = cryptocurrencyReceiverType2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("DECRYPTED_ACCOUNT_NUMBER", 2, "DECRYPTED_ACCOUNT_NUMBER");
        DECRYPTED_ACCOUNT_NUMBER = cryptocurrencyReceiverType3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("EMAIL", 3, "EMAIL");
        EMAIL = cryptocurrencyReceiverType4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("PHONE", 4, "PHONE");
        PHONE = cryptocurrencyReceiverType5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("PAYPAL_ME_ID", 5, "PAYPAL_ME_ID");
        PAYPAL_ME_ID = cryptocurrencyReceiverType6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("EXTERNAL_USER_ID", 6, "EXTERNAL_USER_ID");
        EXTERNAL_USER_ID = cryptocurrencyReceiverType7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType8 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("BLOCKCHAIN_ADDRESS_WITH_MEMO", 7, "BLOCKCHAIN_ADDRESS_WITH_MEMO");
        BLOCKCHAIN_ADDRESS_WITH_MEMO = cryptocurrencyReceiverType8;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType9 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyReceiverType9;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType[] cryptocurrencyReceiverTypeArr = {cryptocurrencyReceiverType, cryptocurrencyReceiverType2, cryptocurrencyReceiverType3, cryptocurrencyReceiverType4, cryptocurrencyReceiverType5, cryptocurrencyReceiverType6, cryptocurrencyReceiverType7, cryptocurrencyReceiverType8, cryptocurrencyReceiverType9};
        getHighSpeedVideoFpsRangesFor = cryptocurrencyReceiverTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyReceiverTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyReceiverType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BLOCKCHAIN_ADDRESS", "ENCRYPTED_ACCOUNT_NUMBER", "DECRYPTED_ACCOUNT_NUMBER", "EMAIL", "PHONE", "PAYPAL_ME_ID", "EXTERNAL_USER_ID", "BLOCKCHAIN_ADDRESS_WITH_MEMO"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.BLOCKCHAIN_ADDRESS, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.ENCRYPTED_ACCOUNT_NUMBER, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.DECRYPTED_ACCOUNT_NUMBER, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.EMAIL, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.PHONE, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.PAYPAL_ME_ID, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.EXTERNAL_USER_ID, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.BLOCKCHAIN_ADDRESS_WITH_MEMO});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType) obj;
            return cryptocurrencyReceiverType == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.UNKNOWN__ : cryptocurrencyReceiverType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
