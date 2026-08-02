package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSpamReporterType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "GUEST", "NON_RECIPIENT", "RECIPIENT", "PRODUCT", "RISK", "NA", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvoiceSpamReporterType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType GUEST;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType NA;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType NON_RECIPIENT;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType PRODUCT;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType RECIPIENT;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType RISK;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InvoiceSpamReporterType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType invoiceSpamReporterType = new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType("GUEST", 0, "GUEST");
        GUEST = invoiceSpamReporterType;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType invoiceSpamReporterType2 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType("NON_RECIPIENT", 1, "NON_RECIPIENT");
        NON_RECIPIENT = invoiceSpamReporterType2;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType invoiceSpamReporterType3 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType("RECIPIENT", 2, "RECIPIENT");
        RECIPIENT = invoiceSpamReporterType3;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType invoiceSpamReporterType4 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType("PRODUCT", 3, "PRODUCT");
        PRODUCT = invoiceSpamReporterType4;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType invoiceSpamReporterType5 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType("RISK", 4, "RISK");
        RISK = invoiceSpamReporterType5;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType invoiceSpamReporterType6 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType("NA", 5, "NA");
        NA = invoiceSpamReporterType6;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType invoiceSpamReporterType7 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = invoiceSpamReporterType7;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType[] invoiceSpamReporterTypeArr = {invoiceSpamReporterType, invoiceSpamReporterType2, invoiceSpamReporterType3, invoiceSpamReporterType4, invoiceSpamReporterType5, invoiceSpamReporterType6, invoiceSpamReporterType7};
        getHighResolutionOutputSizeshNQ4ISI = invoiceSpamReporterTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(invoiceSpamReporterTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InvoiceSpamReporterType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"GUEST", "NON_RECIPIENT", "RECIPIENT", "PRODUCT", "RISK", "NA"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSpamReporterType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSpamReporterType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSpamReporterType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSpamReporterType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType[]{com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.GUEST, com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.NON_RECIPIENT, com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.RECIPIENT, com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.PRODUCT, com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.RISK, com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.NA});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType invoiceSpamReporterType = (com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType) obj;
            return invoiceSpamReporterType == null ? com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.UNKNOWN__ : invoiceSpamReporterType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InvoiceSpamReporterType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
