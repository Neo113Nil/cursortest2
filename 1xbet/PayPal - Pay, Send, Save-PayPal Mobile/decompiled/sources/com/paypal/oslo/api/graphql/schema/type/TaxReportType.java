package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SALES_1099K", "SALES_TRANSACTIONS_STATEMENT", "CRYPTO_1099K", "CRYPTO_1099_DA", "CRYPTO_GAINS_LOSSES_STATEMENT", "CRYPTO_TRANSACTIONS_STATEMENT", "SAVINGS_1099_INT", "CRYPTO_1099_MISC", "FIAT_1099_MISC", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TaxReportType {
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType CRYPTO_1099K;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType CRYPTO_1099_DA;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType CRYPTO_1099_MISC;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType CRYPTO_GAINS_LOSSES_STATEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType CRYPTO_TRANSACTIONS_STATEMENT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType FIAT_1099_MISC;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType SALES_1099K;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType SALES_TRANSACTIONS_STATEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType SAVINGS_1099_INT;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.TaxReportType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private TaxReportType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("SALES_1099K", 0, "SALES_1099K");
        SALES_1099K = taxReportType;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType2 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("SALES_TRANSACTIONS_STATEMENT", 1, "SALES_TRANSACTIONS_STATEMENT");
        SALES_TRANSACTIONS_STATEMENT = taxReportType2;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType3 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("CRYPTO_1099K", 2, "CRYPTO_1099K");
        CRYPTO_1099K = taxReportType3;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType4 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("CRYPTO_1099_DA", 3, "CRYPTO_1099_DA");
        CRYPTO_1099_DA = taxReportType4;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType5 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("CRYPTO_GAINS_LOSSES_STATEMENT", 4, "CRYPTO_GAINS_LOSSES_STATEMENT");
        CRYPTO_GAINS_LOSSES_STATEMENT = taxReportType5;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType6 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("CRYPTO_TRANSACTIONS_STATEMENT", 5, "CRYPTO_TRANSACTIONS_STATEMENT");
        CRYPTO_TRANSACTIONS_STATEMENT = taxReportType6;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType7 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("SAVINGS_1099_INT", 6, "SAVINGS_1099_INT");
        SAVINGS_1099_INT = taxReportType7;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType8 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("CRYPTO_1099_MISC", 7, "CRYPTO_1099_MISC");
        CRYPTO_1099_MISC = taxReportType8;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType9 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("FIAT_1099_MISC", 8, "FIAT_1099_MISC");
        FIAT_1099_MISC = taxReportType9;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType10 = new com.paypal.oslo.api.graphql.schema.type.TaxReportType("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = taxReportType10;
        com.paypal.oslo.api.graphql.schema.type.TaxReportType[] taxReportTypeArr = {taxReportType, taxReportType2, taxReportType3, taxReportType4, taxReportType5, taxReportType6, taxReportType7, taxReportType8, taxReportType9, taxReportType10};
        getHighResolutionOutputSizeshNQ4ISI = taxReportTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(taxReportTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.TaxReportType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("TaxReportType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SALES_1099K", "SALES_TRANSACTIONS_STATEMENT", "CRYPTO_1099K", "CRYPTO_1099_DA", "CRYPTO_GAINS_LOSSES_STATEMENT", "CRYPTO_TRANSACTIONS_STATEMENT", "SAVINGS_1099_INT", "CRYPTO_1099_MISC", "FIAT_1099_MISC"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.TaxReportType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TaxReportType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.TaxReportType[]{com.paypal.oslo.api.graphql.schema.type.TaxReportType.SALES_1099K, com.paypal.oslo.api.graphql.schema.type.TaxReportType.SALES_TRANSACTIONS_STATEMENT, com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_1099K, com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_1099_DA, com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_GAINS_LOSSES_STATEMENT, com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_TRANSACTIONS_STATEMENT, com.paypal.oslo.api.graphql.schema.type.TaxReportType.SAVINGS_1099_INT, com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_1099_MISC, com.paypal.oslo.api.graphql.schema.type.TaxReportType.FIAT_1099_MISC});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.TaxReportType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.TaxReportType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.TaxReportType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.TaxReportType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType = (com.paypal.oslo.api.graphql.schema.type.TaxReportType) obj;
            return taxReportType == null ? com.paypal.oslo.api.graphql.schema.type.TaxReportType.UNKNOWN__ : taxReportType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.TaxReportType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.TaxReportType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.TaxReportType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.TaxReportType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.TaxReportType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.TaxReportType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
