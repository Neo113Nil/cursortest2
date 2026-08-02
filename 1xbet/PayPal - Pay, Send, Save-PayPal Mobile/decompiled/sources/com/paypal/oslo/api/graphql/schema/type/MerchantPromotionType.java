package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantPromotionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BDMC_DISCOVERY", "BDMC_APPLE_WALLET", "BDMC_GOOGLE_WALLET", "PPWC_PRE_APPROVE", "PPWC_UPFRONT", "PPBL_DISCOVERY", "PPBL_RENEWAL", "PPBL_IN_FULL", "TTP_DISCOVERY", "INVOICING_DISCOVERY", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MerchantPromotionType {
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType BDMC_APPLE_WALLET;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType BDMC_DISCOVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType BDMC_GOOGLE_WALLET;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType INVOICING_DISCOVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType PPBL_DISCOVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType PPBL_IN_FULL;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType PPBL_RENEWAL;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType PPWC_PRE_APPROVE;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType PPWC_UPFRONT;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType TTP_DISCOVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private MerchantPromotionType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("BDMC_DISCOVERY", 0, "BDMC_DISCOVERY");
        BDMC_DISCOVERY = merchantPromotionType;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType2 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("BDMC_APPLE_WALLET", 1, "BDMC_APPLE_WALLET");
        BDMC_APPLE_WALLET = merchantPromotionType2;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType3 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("BDMC_GOOGLE_WALLET", 2, "BDMC_GOOGLE_WALLET");
        BDMC_GOOGLE_WALLET = merchantPromotionType3;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType4 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("PPWC_PRE_APPROVE", 3, "PPWC_PRE_APPROVE");
        PPWC_PRE_APPROVE = merchantPromotionType4;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType5 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("PPWC_UPFRONT", 4, "PPWC_UPFRONT");
        PPWC_UPFRONT = merchantPromotionType5;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType6 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("PPBL_DISCOVERY", 5, "PPBL_DISCOVERY");
        PPBL_DISCOVERY = merchantPromotionType6;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType7 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("PPBL_RENEWAL", 6, "PPBL_RENEWAL");
        PPBL_RENEWAL = merchantPromotionType7;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType8 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("PPBL_IN_FULL", 7, "PPBL_IN_FULL");
        PPBL_IN_FULL = merchantPromotionType8;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType9 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("TTP_DISCOVERY", 8, "TTP_DISCOVERY");
        TTP_DISCOVERY = merchantPromotionType9;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType10 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("INVOICING_DISCOVERY", 9, "INVOICING_DISCOVERY");
        INVOICING_DISCOVERY = merchantPromotionType10;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType11 = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType("UNKNOWN__", 10, "UNKNOWN__");
        UNKNOWN__ = merchantPromotionType11;
        com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType[] merchantPromotionTypeArr = {merchantPromotionType, merchantPromotionType2, merchantPromotionType3, merchantPromotionType4, merchantPromotionType5, merchantPromotionType6, merchantPromotionType7, merchantPromotionType8, merchantPromotionType9, merchantPromotionType10, merchantPromotionType11};
        Camera2StreamConfigurationMap = merchantPromotionTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(merchantPromotionTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("MerchantPromotionType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BDMC_DISCOVERY", "BDMC_APPLE_WALLET", "BDMC_GOOGLE_WALLET", "PPWC_PRE_APPROVE", "PPWC_UPFRONT", "PPBL_DISCOVERY", "PPBL_RENEWAL", "PPBL_IN_FULL", "TTP_DISCOVERY", "INVOICING_DISCOVERY"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantPromotionType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantPromotionType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/MerchantPromotionType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/MerchantPromotionType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType[]{com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.BDMC_DISCOVERY, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.BDMC_APPLE_WALLET, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.BDMC_GOOGLE_WALLET, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.PPWC_PRE_APPROVE, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.PPWC_UPFRONT, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.PPBL_DISCOVERY, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.PPBL_RENEWAL, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.PPBL_IN_FULL, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.TTP_DISCOVERY, com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.INVOICING_DISCOVERY});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType merchantPromotionType = (com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType) obj;
            return merchantPromotionType == null ? com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.UNKNOWN__ : merchantPromotionType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.MerchantPromotionType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
