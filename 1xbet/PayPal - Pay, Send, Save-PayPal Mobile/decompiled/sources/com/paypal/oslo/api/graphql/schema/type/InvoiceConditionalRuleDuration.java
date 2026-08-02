package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleDuration;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "THREE_DAYS_AFTER_ISSUE_DATE", "SEVEN_DAYS_AFTER_ISSUE_DATE", "FIFTEEN_DAYS_AFTER_ISSUE_DATE", "THIRTY_DAYS_AFTER_ISSUE_DATE", "ONE_DAY_AFTER_DUE_DATE", "SEVEN_DAYS_AFTER_DUE_DATE", "FIFTEEN_DAYS_AFTER_DUE_DATE", "THIRTY_DAYS_AFTER_DUE_DATE", "SPECIFIC_DATE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvoiceConditionalRuleDuration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration FIFTEEN_DAYS_AFTER_DUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration FIFTEEN_DAYS_AFTER_ISSUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration ONE_DAY_AFTER_DUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration SEVEN_DAYS_AFTER_DUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration SEVEN_DAYS_AFTER_ISSUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration SPECIFIC_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration THIRTY_DAYS_AFTER_DUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration THIRTY_DAYS_AFTER_ISSUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration THREE_DAYS_AFTER_ISSUE_DATE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InvoiceConditionalRuleDuration(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("THREE_DAYS_AFTER_ISSUE_DATE", 0, "THREE_DAYS_AFTER_ISSUE_DATE");
        THREE_DAYS_AFTER_ISSUE_DATE = invoiceConditionalRuleDuration;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration2 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("SEVEN_DAYS_AFTER_ISSUE_DATE", 1, "SEVEN_DAYS_AFTER_ISSUE_DATE");
        SEVEN_DAYS_AFTER_ISSUE_DATE = invoiceConditionalRuleDuration2;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration3 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("FIFTEEN_DAYS_AFTER_ISSUE_DATE", 2, "FIFTEEN_DAYS_AFTER_ISSUE_DATE");
        FIFTEEN_DAYS_AFTER_ISSUE_DATE = invoiceConditionalRuleDuration3;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration4 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("THIRTY_DAYS_AFTER_ISSUE_DATE", 3, "THIRTY_DAYS_AFTER_ISSUE_DATE");
        THIRTY_DAYS_AFTER_ISSUE_DATE = invoiceConditionalRuleDuration4;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration5 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("ONE_DAY_AFTER_DUE_DATE", 4, "ONE_DAY_AFTER_DUE_DATE");
        ONE_DAY_AFTER_DUE_DATE = invoiceConditionalRuleDuration5;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration6 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("SEVEN_DAYS_AFTER_DUE_DATE", 5, "SEVEN_DAYS_AFTER_DUE_DATE");
        SEVEN_DAYS_AFTER_DUE_DATE = invoiceConditionalRuleDuration6;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration7 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("FIFTEEN_DAYS_AFTER_DUE_DATE", 6, "FIFTEEN_DAYS_AFTER_DUE_DATE");
        FIFTEEN_DAYS_AFTER_DUE_DATE = invoiceConditionalRuleDuration7;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration8 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("THIRTY_DAYS_AFTER_DUE_DATE", 7, "THIRTY_DAYS_AFTER_DUE_DATE");
        THIRTY_DAYS_AFTER_DUE_DATE = invoiceConditionalRuleDuration8;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration9 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("SPECIFIC_DATE", 8, "SPECIFIC_DATE");
        SPECIFIC_DATE = invoiceConditionalRuleDuration9;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration10 = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = invoiceConditionalRuleDuration10;
        com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration[] invoiceConditionalRuleDurationArr = {invoiceConditionalRuleDuration, invoiceConditionalRuleDuration2, invoiceConditionalRuleDuration3, invoiceConditionalRuleDuration4, invoiceConditionalRuleDuration5, invoiceConditionalRuleDuration6, invoiceConditionalRuleDuration7, invoiceConditionalRuleDuration8, invoiceConditionalRuleDuration9, invoiceConditionalRuleDuration10};
        getHighSpeedVideoFpsRangesFor = invoiceConditionalRuleDurationArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(invoiceConditionalRuleDurationArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InvoiceConditionalRuleDuration", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"THREE_DAYS_AFTER_ISSUE_DATE", "SEVEN_DAYS_AFTER_ISSUE_DATE", "FIFTEEN_DAYS_AFTER_ISSUE_DATE", "THIRTY_DAYS_AFTER_ISSUE_DATE", "ONE_DAY_AFTER_DUE_DATE", "SEVEN_DAYS_AFTER_DUE_DATE", "FIFTEEN_DAYS_AFTER_DUE_DATE", "THIRTY_DAYS_AFTER_DUE_DATE", "SPECIFIC_DATE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleDuration$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleDuration;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleDuration;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleDuration;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration[]{com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.THREE_DAYS_AFTER_ISSUE_DATE, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.SEVEN_DAYS_AFTER_ISSUE_DATE, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.FIFTEEN_DAYS_AFTER_ISSUE_DATE, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.THIRTY_DAYS_AFTER_ISSUE_DATE, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.ONE_DAY_AFTER_DUE_DATE, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.SEVEN_DAYS_AFTER_DUE_DATE, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.FIFTEEN_DAYS_AFTER_DUE_DATE, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.THIRTY_DAYS_AFTER_DUE_DATE, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.SPECIFIC_DATE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration invoiceConditionalRuleDuration = (com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration) obj;
            return invoiceConditionalRuleDuration == null ? com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.UNKNOWN__ : invoiceConditionalRuleDuration;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleDuration> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
