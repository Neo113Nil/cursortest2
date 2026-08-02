package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentTermType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "DUE_ON_RECEIPT", "DUE_ON_DATE_SPECIFIED", "NET_10", "NET_15", "NET_30", "NET_45", "NET_60", "NET_90", "NO_DUE_DATE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvoicePaymentTermType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType DUE_ON_DATE_SPECIFIED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType DUE_ON_RECEIPT;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType NET_10;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType NET_15;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType NET_30;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType NET_45;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType NET_60;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType NET_90;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType NO_DUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InvoicePaymentTermType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("DUE_ON_RECEIPT", 0, "DUE_ON_RECEIPT");
        DUE_ON_RECEIPT = invoicePaymentTermType;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType2 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("DUE_ON_DATE_SPECIFIED", 1, "DUE_ON_DATE_SPECIFIED");
        DUE_ON_DATE_SPECIFIED = invoicePaymentTermType2;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType3 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("NET_10", 2, "NET_10");
        NET_10 = invoicePaymentTermType3;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType4 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("NET_15", 3, "NET_15");
        NET_15 = invoicePaymentTermType4;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType5 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("NET_30", 4, "NET_30");
        NET_30 = invoicePaymentTermType5;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType6 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("NET_45", 5, "NET_45");
        NET_45 = invoicePaymentTermType6;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType7 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("NET_60", 6, "NET_60");
        NET_60 = invoicePaymentTermType7;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType8 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("NET_90", 7, "NET_90");
        NET_90 = invoicePaymentTermType8;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType9 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("NO_DUE_DATE", 8, "NO_DUE_DATE");
        NO_DUE_DATE = invoicePaymentTermType9;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType10 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = invoicePaymentTermType10;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType[] invoicePaymentTermTypeArr = {invoicePaymentTermType, invoicePaymentTermType2, invoicePaymentTermType3, invoicePaymentTermType4, invoicePaymentTermType5, invoicePaymentTermType6, invoicePaymentTermType7, invoicePaymentTermType8, invoicePaymentTermType9, invoicePaymentTermType10};
        getHighSpeedVideoSizes = invoicePaymentTermTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(invoicePaymentTermTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InvoicePaymentTermType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"DUE_ON_RECEIPT", "DUE_ON_DATE_SPECIFIED", "NET_10", "NET_15", "NET_30", "NET_45", "NET_60", "NET_90", "NO_DUE_DATE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentTermType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentTermType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentTermType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentTermType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType[]{com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.DUE_ON_RECEIPT, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.DUE_ON_DATE_SPECIFIED, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.NET_10, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.NET_15, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.NET_30, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.NET_45, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.NET_60, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.NET_90, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.NO_DUE_DATE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType invoicePaymentTermType = (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType) obj;
            return invoicePaymentTermType == null ? com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.UNKNOWN__ : invoicePaymentTermType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InvoicePaymentTermType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
