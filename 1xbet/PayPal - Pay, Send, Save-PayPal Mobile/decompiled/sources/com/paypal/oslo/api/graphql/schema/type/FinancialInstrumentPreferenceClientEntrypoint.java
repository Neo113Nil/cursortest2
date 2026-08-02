package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceClientEntrypoint;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CARD_MANAGEMENT", "WALLET_SETTINGS", "CHECKOUT", "POST_DIRECT_DEPOSIT_PRE_ELIGIBILITY_CHECK", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinancialInstrumentPreferenceClientEntrypoint {

    @kotlin.Deprecated(message = "Use DebitInstrumentClientEntrypoint instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint CARD_MANAGEMENT;

    @kotlin.Deprecated(message = "Use DebitInstrumentClientEntrypoint instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint CHECKOUT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.Companion INSTANCE;

    @kotlin.Deprecated(message = "Use DebitInstrumentClientEntrypoint instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint POST_DIRECT_DEPOSIT_PRE_ELIGIBILITY_CHECK;
    public static final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint UNKNOWN__;

    @kotlin.Deprecated(message = "Use DebitInstrumentClientEntrypoint instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint WALLET_SETTINGS;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private FinancialInstrumentPreferenceClientEntrypoint(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint financialInstrumentPreferenceClientEntrypoint = new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint("CARD_MANAGEMENT", 0, "CARD_MANAGEMENT");
        CARD_MANAGEMENT = financialInstrumentPreferenceClientEntrypoint;
        com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint financialInstrumentPreferenceClientEntrypoint2 = new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint("WALLET_SETTINGS", 1, "WALLET_SETTINGS");
        WALLET_SETTINGS = financialInstrumentPreferenceClientEntrypoint2;
        com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint financialInstrumentPreferenceClientEntrypoint3 = new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint("CHECKOUT", 2, "CHECKOUT");
        CHECKOUT = financialInstrumentPreferenceClientEntrypoint3;
        com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint financialInstrumentPreferenceClientEntrypoint4 = new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint("POST_DIRECT_DEPOSIT_PRE_ELIGIBILITY_CHECK", 3, "POST_DIRECT_DEPOSIT_PRE_ELIGIBILITY_CHECK");
        POST_DIRECT_DEPOSIT_PRE_ELIGIBILITY_CHECK = financialInstrumentPreferenceClientEntrypoint4;
        com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint financialInstrumentPreferenceClientEntrypoint5 = new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = financialInstrumentPreferenceClientEntrypoint5;
        com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint[] financialInstrumentPreferenceClientEntrypointArr = {financialInstrumentPreferenceClientEntrypoint, financialInstrumentPreferenceClientEntrypoint2, financialInstrumentPreferenceClientEntrypoint3, financialInstrumentPreferenceClientEntrypoint4, financialInstrumentPreferenceClientEntrypoint5};
        getHighSpeedVideoSizes = financialInstrumentPreferenceClientEntrypointArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(financialInstrumentPreferenceClientEntrypointArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("FinancialInstrumentPreferenceClientEntrypoint", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CARD_MANAGEMENT", "WALLET_SETTINGS", "CHECKOUT", "POST_DIRECT_DEPOSIT_PRE_ELIGIBILITY_CHECK"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceClientEntrypoint$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceClientEntrypoint;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceClientEntrypoint;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceClientEntrypoint;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "getKnownEntries$annotations", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getKnownEntries$annotations() {
        }

        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint[]{com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.CARD_MANAGEMENT, com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.WALLET_SETTINGS, com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.CHECKOUT, com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.POST_DIRECT_DEPOSIT_PRE_ELIGIBILITY_CHECK});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint financialInstrumentPreferenceClientEntrypoint = (com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint) obj;
            return financialInstrumentPreferenceClientEntrypoint == null ? com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.UNKNOWN__ : financialInstrumentPreferenceClientEntrypoint;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceClientEntrypoint> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
