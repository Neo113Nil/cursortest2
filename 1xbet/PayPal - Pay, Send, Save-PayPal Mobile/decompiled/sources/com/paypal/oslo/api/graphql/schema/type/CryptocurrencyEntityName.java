package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "LEDGER", "MAGIC", "PHANTOM", "BITCOINCOM", "RAINBOW", "METAMASK", "TASTYCRYPTO", "TRANSFER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyEntityName {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName BITCOINCOM;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName LEDGER;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName MAGIC;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName METAMASK;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName PHANTOM;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName RAINBOW;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName TASTYCRYPTO;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyEntityName(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("LEDGER", 0, "LEDGER");
        LEDGER = cryptocurrencyEntityName;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("MAGIC", 1, "MAGIC");
        MAGIC = cryptocurrencyEntityName2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("PHANTOM", 2, "PHANTOM");
        PHANTOM = cryptocurrencyEntityName3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("BITCOINCOM", 3, "BITCOINCOM");
        BITCOINCOM = cryptocurrencyEntityName4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("RAINBOW", 4, "RAINBOW");
        RAINBOW = cryptocurrencyEntityName5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("METAMASK", 5, "METAMASK");
        METAMASK = cryptocurrencyEntityName6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("TASTYCRYPTO", 6, "TASTYCRYPTO");
        TASTYCRYPTO = cryptocurrencyEntityName7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName8 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("TRANSFER", 7, "TRANSFER");
        TRANSFER = cryptocurrencyEntityName8;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName9 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyEntityName9;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName[] cryptocurrencyEntityNameArr = {cryptocurrencyEntityName, cryptocurrencyEntityName2, cryptocurrencyEntityName3, cryptocurrencyEntityName4, cryptocurrencyEntityName5, cryptocurrencyEntityName6, cryptocurrencyEntityName7, cryptocurrencyEntityName8, cryptocurrencyEntityName9};
        Camera2StreamConfigurationMap = cryptocurrencyEntityNameArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyEntityNameArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyEntityName", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"LEDGER", "MAGIC", "PHANTOM", "BITCOINCOM", "RAINBOW", "METAMASK", "TASTYCRYPTO", "TRANSFER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.LEDGER, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.MAGIC, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.PHANTOM, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.BITCOINCOM, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.RAINBOW, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.METAMASK, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.TASTYCRYPTO, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.TRANSFER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName) obj;
            return cryptocurrencyEntityName == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.UNKNOWN__ : cryptocurrencyEntityName;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
