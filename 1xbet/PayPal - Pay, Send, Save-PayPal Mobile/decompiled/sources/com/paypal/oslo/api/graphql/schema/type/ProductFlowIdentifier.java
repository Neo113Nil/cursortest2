package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "USER_INITATED_CONVERSION", "BATCH_CONVERSION", "CONSUMER_TRANSFERS", "MERCHANT_TRANSFERS", "AGENT_INITIATED_COLLECTIONS", "CLOSE_ACCOUNT_CONVERSION", "MERCHANT_SETTLEMENT_CONVERSION", "PARTNER_SETTLEMENT_CONVERSION", "ESCHEATMENT_CONVERSION", "MONEYPOOL_TRANSFERS", "RECURRING_ADD_FUNDS", "AUTO_RELOAD_FUNDS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductFlowIdentifier {
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier AGENT_INITIATED_COLLECTIONS;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier AUTO_RELOAD_FUNDS;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier BATCH_CONVERSION;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier CLOSE_ACCOUNT_CONVERSION;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier CONSUMER_TRANSFERS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier ESCHEATMENT_CONVERSION;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier MERCHANT_SETTLEMENT_CONVERSION;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier MERCHANT_TRANSFERS;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier MONEYPOOL_TRANSFERS;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier PARTNER_SETTLEMENT_CONVERSION;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier RECURRING_ADD_FUNDS;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier USER_INITATED_CONVERSION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ProductFlowIdentifier(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("USER_INITATED_CONVERSION", 0, "USER_INITATED_CONVERSION");
        USER_INITATED_CONVERSION = productFlowIdentifier;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier2 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("BATCH_CONVERSION", 1, "BATCH_CONVERSION");
        BATCH_CONVERSION = productFlowIdentifier2;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier3 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("CONSUMER_TRANSFERS", 2, "CONSUMER_TRANSFERS");
        CONSUMER_TRANSFERS = productFlowIdentifier3;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier4 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("MERCHANT_TRANSFERS", 3, "MERCHANT_TRANSFERS");
        MERCHANT_TRANSFERS = productFlowIdentifier4;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier5 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("AGENT_INITIATED_COLLECTIONS", 4, "AGENT_INITIATED_COLLECTIONS");
        AGENT_INITIATED_COLLECTIONS = productFlowIdentifier5;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier6 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("CLOSE_ACCOUNT_CONVERSION", 5, "CLOSE_ACCOUNT_CONVERSION");
        CLOSE_ACCOUNT_CONVERSION = productFlowIdentifier6;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier7 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("MERCHANT_SETTLEMENT_CONVERSION", 6, "MERCHANT_SETTLEMENT_CONVERSION");
        MERCHANT_SETTLEMENT_CONVERSION = productFlowIdentifier7;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier8 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("PARTNER_SETTLEMENT_CONVERSION", 7, "PARTNER_SETTLEMENT_CONVERSION");
        PARTNER_SETTLEMENT_CONVERSION = productFlowIdentifier8;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier9 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("ESCHEATMENT_CONVERSION", 8, "ESCHEATMENT_CONVERSION");
        ESCHEATMENT_CONVERSION = productFlowIdentifier9;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier10 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("MONEYPOOL_TRANSFERS", 9, "MONEYPOOL_TRANSFERS");
        MONEYPOOL_TRANSFERS = productFlowIdentifier10;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier11 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("RECURRING_ADD_FUNDS", 10, "RECURRING_ADD_FUNDS");
        RECURRING_ADD_FUNDS = productFlowIdentifier11;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier12 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("AUTO_RELOAD_FUNDS", 11, "AUTO_RELOAD_FUNDS");
        AUTO_RELOAD_FUNDS = productFlowIdentifier12;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier13 = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = productFlowIdentifier13;
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier[] productFlowIdentifierArr = {productFlowIdentifier, productFlowIdentifier2, productFlowIdentifier3, productFlowIdentifier4, productFlowIdentifier5, productFlowIdentifier6, productFlowIdentifier7, productFlowIdentifier8, productFlowIdentifier9, productFlowIdentifier10, productFlowIdentifier11, productFlowIdentifier12, productFlowIdentifier13};
        getHighSpeedVideoFpsRangesFor = productFlowIdentifierArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(productFlowIdentifierArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ProductFlowIdentifier", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"USER_INITATED_CONVERSION", "BATCH_CONVERSION", "CONSUMER_TRANSFERS", "MERCHANT_TRANSFERS", "AGENT_INITIATED_COLLECTIONS", "CLOSE_ACCOUNT_CONVERSION", "MERCHANT_SETTLEMENT_CONVERSION", "PARTNER_SETTLEMENT_CONVERSION", "ESCHEATMENT_CONVERSION", "MONEYPOOL_TRANSFERS", "RECURRING_ADD_FUNDS", "AUTO_RELOAD_FUNDS"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier[]{com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.USER_INITATED_CONVERSION, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.BATCH_CONVERSION, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.CONSUMER_TRANSFERS, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.MERCHANT_TRANSFERS, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.AGENT_INITIATED_COLLECTIONS, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.CLOSE_ACCOUNT_CONVERSION, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.MERCHANT_SETTLEMENT_CONVERSION, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.PARTNER_SETTLEMENT_CONVERSION, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.ESCHEATMENT_CONVERSION, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.MONEYPOOL_TRANSFERS, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.RECURRING_ADD_FUNDS, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.AUTO_RELOAD_FUNDS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier = (com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier) obj;
            return productFlowIdentifier == null ? com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.UNKNOWN__ : productFlowIdentifier;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
