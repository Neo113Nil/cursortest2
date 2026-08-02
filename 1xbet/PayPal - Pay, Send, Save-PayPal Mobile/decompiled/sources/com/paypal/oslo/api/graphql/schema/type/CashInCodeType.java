package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CODE_128", "PDF_417", "QR_CODE", "EAN_13", "EAN_8", "CODE_39", "DATA_MATRIX", "ITF", "CODABAR", "CODE_93", "UPCE", "RSS_14", "NONE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CashInCodeType {
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType CODABAR;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType CODE_128;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType CODE_39;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType CODE_93;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType DATA_MATRIX;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType EAN_13;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType EAN_8;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType ITF;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType NONE;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType PDF_417;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType QR_CODE;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType RSS_14;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.CashInCodeType UPCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CashInCodeType[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CashInCodeType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("CODE_128", 0, "CODE_128");
        CODE_128 = cashInCodeType;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType2 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("PDF_417", 1, "PDF_417");
        PDF_417 = cashInCodeType2;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType3 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("QR_CODE", 2, "QR_CODE");
        QR_CODE = cashInCodeType3;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType4 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("EAN_13", 3, "EAN_13");
        EAN_13 = cashInCodeType4;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType5 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("EAN_8", 4, "EAN_8");
        EAN_8 = cashInCodeType5;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType6 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("CODE_39", 5, "CODE_39");
        CODE_39 = cashInCodeType6;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType7 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("DATA_MATRIX", 6, "DATA_MATRIX");
        DATA_MATRIX = cashInCodeType7;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType8 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("ITF", 7, "ITF");
        ITF = cashInCodeType8;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType9 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("CODABAR", 8, "CODABAR");
        CODABAR = cashInCodeType9;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType10 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("CODE_93", 9, "CODE_93");
        CODE_93 = cashInCodeType10;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType11 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("UPCE", 10, "UPCE");
        UPCE = cashInCodeType11;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType12 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("RSS_14", 11, "RSS_14");
        RSS_14 = cashInCodeType12;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType13 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("NONE", 12, "NONE");
        NONE = cashInCodeType13;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType14 = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType("UNKNOWN__", 13, "UNKNOWN__");
        UNKNOWN__ = cashInCodeType14;
        com.paypal.oslo.api.graphql.schema.type.CashInCodeType[] cashInCodeTypeArr = {cashInCodeType, cashInCodeType2, cashInCodeType3, cashInCodeType4, cashInCodeType5, cashInCodeType6, cashInCodeType7, cashInCodeType8, cashInCodeType9, cashInCodeType10, cashInCodeType11, cashInCodeType12, cashInCodeType13, cashInCodeType14};
        getHighSpeedVideoSizes = cashInCodeTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cashInCodeTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CashInCodeType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CashInCodeType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CODE_128", "PDF_417", "QR_CODE", "EAN_13", "EAN_8", "CODE_39", "DATA_MATRIX", "ITF", "CODABAR", "CODE_93", "UPCE", "RSS_14", "NONE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CashInCodeType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInCodeType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CashInCodeType[]{com.paypal.oslo.api.graphql.schema.type.CashInCodeType.CODE_128, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.PDF_417, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.QR_CODE, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.EAN_13, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.EAN_8, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.CODE_39, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.DATA_MATRIX, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.ITF, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.CODABAR, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.CODE_93, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.UPCE, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.RSS_14, com.paypal.oslo.api.graphql.schema.type.CashInCodeType.NONE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CashInCodeType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CashInCodeType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CashInCodeType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CashInCodeType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CashInCodeType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CashInCodeType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType = (com.paypal.oslo.api.graphql.schema.type.CashInCodeType) obj;
            return cashInCodeType == null ? com.paypal.oslo.api.graphql.schema.type.CashInCodeType.UNKNOWN__ : cashInCodeType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CashInCodeType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CashInCodeType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CashInCodeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CashInCodeType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CashInCodeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CashInCodeType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
