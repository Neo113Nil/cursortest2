package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BarcodeType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "AZTEC", "CODE_39", "CODE_93", "CODE_128", "DATA_MATRIX", "EAN_8", "EAN_13", "ITF", "PDF_417", "QR_CODE", "UPC_A", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BarcodeType {
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType AZTEC;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType CODE_128;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType CODE_39;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType CODE_93;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType DATA_MATRIX;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType EAN_13;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType EAN_8;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType ITF;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType PDF_417;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType QR_CODE;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.BarcodeType UPC_A;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BarcodeType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BarcodeType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("AZTEC", 0, "AZTEC");
        AZTEC = barcodeType;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType2 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("CODE_39", 1, "CODE_39");
        CODE_39 = barcodeType2;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType3 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("CODE_93", 2, "CODE_93");
        CODE_93 = barcodeType3;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType4 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("CODE_128", 3, "CODE_128");
        CODE_128 = barcodeType4;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType5 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("DATA_MATRIX", 4, "DATA_MATRIX");
        DATA_MATRIX = barcodeType5;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType6 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("EAN_8", 5, "EAN_8");
        EAN_8 = barcodeType6;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType7 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("EAN_13", 6, "EAN_13");
        EAN_13 = barcodeType7;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType8 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("ITF", 7, "ITF");
        ITF = barcodeType8;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType9 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("PDF_417", 8, "PDF_417");
        PDF_417 = barcodeType9;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType10 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("QR_CODE", 9, "QR_CODE");
        QR_CODE = barcodeType10;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType11 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("UPC_A", 10, "UPC_A");
        UPC_A = barcodeType11;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType12 = new com.paypal.oslo.api.graphql.schema.type.BarcodeType("UNKNOWN__", 11, "UNKNOWN__");
        UNKNOWN__ = barcodeType12;
        com.paypal.oslo.api.graphql.schema.type.BarcodeType[] barcodeTypeArr = {barcodeType, barcodeType2, barcodeType3, barcodeType4, barcodeType5, barcodeType6, barcodeType7, barcodeType8, barcodeType9, barcodeType10, barcodeType11, barcodeType12};
        getHighSpeedVideoFpsRangesFor = barcodeTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(barcodeTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BarcodeType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BarcodeType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"AZTEC", "CODE_39", "CODE_93", "CODE_128", "DATA_MATRIX", "EAN_8", "EAN_13", "ITF", "PDF_417", "QR_CODE", "UPC_A"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BarcodeType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BarcodeType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BarcodeType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BarcodeType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BarcodeType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BarcodeType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BarcodeType[]{com.paypal.oslo.api.graphql.schema.type.BarcodeType.AZTEC, com.paypal.oslo.api.graphql.schema.type.BarcodeType.CODE_39, com.paypal.oslo.api.graphql.schema.type.BarcodeType.CODE_93, com.paypal.oslo.api.graphql.schema.type.BarcodeType.CODE_128, com.paypal.oslo.api.graphql.schema.type.BarcodeType.DATA_MATRIX, com.paypal.oslo.api.graphql.schema.type.BarcodeType.EAN_8, com.paypal.oslo.api.graphql.schema.type.BarcodeType.EAN_13, com.paypal.oslo.api.graphql.schema.type.BarcodeType.ITF, com.paypal.oslo.api.graphql.schema.type.BarcodeType.PDF_417, com.paypal.oslo.api.graphql.schema.type.BarcodeType.QR_CODE, com.paypal.oslo.api.graphql.schema.type.BarcodeType.UPC_A});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BarcodeType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BarcodeType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BarcodeType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BarcodeType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BarcodeType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BarcodeType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BarcodeType barcodeType = (com.paypal.oslo.api.graphql.schema.type.BarcodeType) obj;
            return barcodeType == null ? com.paypal.oslo.api.graphql.schema.type.BarcodeType.UNKNOWN__ : barcodeType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BarcodeType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BarcodeType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BarcodeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BarcodeType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BarcodeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BarcodeType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
