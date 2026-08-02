package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BANK_TRANSFER", "CASH", "CHECK", "CREDIT_CARD", "DEBIT_CARD", "PAYPAL", "WIRE_TRANSFER", "OTHER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvoicePaymentMethod {
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod BANK_TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod CASH;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod CHECK;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod CREDIT_CARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod OTHER;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod PAYPAL;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod WIRE_TRANSFER;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InvoicePaymentMethod(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("BANK_TRANSFER", 0, "BANK_TRANSFER");
        BANK_TRANSFER = invoicePaymentMethod;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod2 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("CASH", 1, "CASH");
        CASH = invoicePaymentMethod2;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod3 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("CHECK", 2, "CHECK");
        CHECK = invoicePaymentMethod3;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod4 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("CREDIT_CARD", 3, "CREDIT_CARD");
        CREDIT_CARD = invoicePaymentMethod4;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod5 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("DEBIT_CARD", 4, "DEBIT_CARD");
        DEBIT_CARD = invoicePaymentMethod5;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod6 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("PAYPAL", 5, "PAYPAL");
        PAYPAL = invoicePaymentMethod6;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod7 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("WIRE_TRANSFER", 6, "WIRE_TRANSFER");
        WIRE_TRANSFER = invoicePaymentMethod7;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod8 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("OTHER", 7, "OTHER");
        OTHER = invoicePaymentMethod8;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod9 = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = invoicePaymentMethod9;
        com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod[] invoicePaymentMethodArr = {invoicePaymentMethod, invoicePaymentMethod2, invoicePaymentMethod3, invoicePaymentMethod4, invoicePaymentMethod5, invoicePaymentMethod6, invoicePaymentMethod7, invoicePaymentMethod8, invoicePaymentMethod9};
        getHighResolutionOutputSizeshNQ4ISI = invoicePaymentMethodArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(invoicePaymentMethodArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InvoicePaymentMethod", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BANK_TRANSFER", "CASH", "CHECK", "CREDIT_CARD", "DEBIT_CARD", "PAYPAL", "WIRE_TRANSFER", "OTHER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InvoicePaymentMethod;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod[]{com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.BANK_TRANSFER, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.CASH, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.CHECK, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.CREDIT_CARD, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.PAYPAL, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.WIRE_TRANSFER, com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.OTHER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod invoicePaymentMethod = (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod) obj;
            return invoicePaymentMethod == null ? com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.UNKNOWN__ : invoicePaymentMethod;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InvoicePaymentMethod> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
