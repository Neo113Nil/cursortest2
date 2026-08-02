package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityAmountType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PURCHASE", com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, "TAX", "SHIPPING", "DISCOUNT", "FEE", "INCENTIVE", "INSURANCE", "HANDLING", "GROSS_TOTAL", "NET_TOTAL", "TIP", "SUB_TOTAL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityAmountType {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType AMOUNT;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityAmountType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType DISCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType FEE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType GROSS_TOTAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType HANDLING;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType INCENTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType INSURANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType NET_TOTAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType PURCHASE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType SHIPPING;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType SUB_TOTAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType TAX;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType TIP;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityAmountType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("PURCHASE", 0, "PURCHASE");
        PURCHASE = activityAmountType;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType2 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, 1, com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT);
        AMOUNT = activityAmountType2;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType3 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("TAX", 2, "TAX");
        TAX = activityAmountType3;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType4 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("SHIPPING", 3, "SHIPPING");
        SHIPPING = activityAmountType4;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType5 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("DISCOUNT", 4, "DISCOUNT");
        DISCOUNT = activityAmountType5;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType6 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("FEE", 5, "FEE");
        FEE = activityAmountType6;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType7 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("INCENTIVE", 6, "INCENTIVE");
        INCENTIVE = activityAmountType7;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType8 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("INSURANCE", 7, "INSURANCE");
        INSURANCE = activityAmountType8;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType9 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("HANDLING", 8, "HANDLING");
        HANDLING = activityAmountType9;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType10 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("GROSS_TOTAL", 9, "GROSS_TOTAL");
        GROSS_TOTAL = activityAmountType10;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType11 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("NET_TOTAL", 10, "NET_TOTAL");
        NET_TOTAL = activityAmountType11;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType12 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("TIP", 11, "TIP");
        TIP = activityAmountType12;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType13 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("SUB_TOTAL", 12, "SUB_TOTAL");
        SUB_TOTAL = activityAmountType13;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType14 = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType("UNKNOWN__", 13, "UNKNOWN__");
        UNKNOWN__ = activityAmountType14;
        com.paypal.oslo.api.graphql.schema.type.ActivityAmountType[] activityAmountTypeArr = {activityAmountType, activityAmountType2, activityAmountType3, activityAmountType4, activityAmountType5, activityAmountType6, activityAmountType7, activityAmountType8, activityAmountType9, activityAmountType10, activityAmountType11, activityAmountType12, activityAmountType13, activityAmountType14};
        Camera2StreamConfigurationMap = activityAmountTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(activityAmountTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityAmountType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PURCHASE", com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, "TAX", "SHIPPING", "DISCOUNT", "FEE", "INCENTIVE", "INSURANCE", "HANDLING", "GROSS_TOTAL", "NET_TOTAL", "TIP", "SUB_TOTAL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityAmountType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityAmountType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityAmountType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityAmountType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityAmountType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType[]{com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.PURCHASE, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.AMOUNT, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.TAX, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.SHIPPING, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.DISCOUNT, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.FEE, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.INCENTIVE, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.INSURANCE, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.HANDLING, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.GROSS_TOTAL, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.NET_TOTAL, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.TIP, com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.SUB_TOTAL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityAmountType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityAmountType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityAmountType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityAmountType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityAmountType activityAmountType = (com.paypal.oslo.api.graphql.schema.type.ActivityAmountType) obj;
            return activityAmountType == null ? com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.UNKNOWN__ : activityAmountType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityAmountType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityAmountType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityAmountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityAmountType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityAmountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityAmountType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
