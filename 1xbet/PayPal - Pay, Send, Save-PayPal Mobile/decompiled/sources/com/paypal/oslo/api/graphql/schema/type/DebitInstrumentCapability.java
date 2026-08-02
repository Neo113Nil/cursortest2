package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCapability;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "INSTANT_ACCESS", "DIRECT_FUNDING", "AUTO_RELOAD", "WALLET_SHARED_PIN", "AUTO_RELOAD_PER_CARD", "DIRECT_FUNDING_PER_CARD", "ONLINE_PIN", "OFFLINE_PIN", "ACTIVATE_TAP_TO_PAY", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentCapability {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability ACTIVATE_TAP_TO_PAY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability AUTO_RELOAD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability AUTO_RELOAD_PER_CARD;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability DIRECT_FUNDING;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability DIRECT_FUNDING_PER_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability INSTANT_ACCESS;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability OFFLINE_PIN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability ONLINE_PIN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability WALLET_SHARED_PIN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentCapability(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("INSTANT_ACCESS", 0, "INSTANT_ACCESS");
        INSTANT_ACCESS = debitInstrumentCapability;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("DIRECT_FUNDING", 1, "DIRECT_FUNDING");
        DIRECT_FUNDING = debitInstrumentCapability2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("AUTO_RELOAD", 2, "AUTO_RELOAD");
        AUTO_RELOAD = debitInstrumentCapability3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("WALLET_SHARED_PIN", 3, "WALLET_SHARED_PIN");
        WALLET_SHARED_PIN = debitInstrumentCapability4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("AUTO_RELOAD_PER_CARD", 4, "AUTO_RELOAD_PER_CARD");
        AUTO_RELOAD_PER_CARD = debitInstrumentCapability5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("DIRECT_FUNDING_PER_CARD", 5, "DIRECT_FUNDING_PER_CARD");
        DIRECT_FUNDING_PER_CARD = debitInstrumentCapability6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("ONLINE_PIN", 6, "ONLINE_PIN");
        ONLINE_PIN = debitInstrumentCapability7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability8 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("OFFLINE_PIN", 7, "OFFLINE_PIN");
        OFFLINE_PIN = debitInstrumentCapability8;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability9 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("ACTIVATE_TAP_TO_PAY", 8, "ACTIVATE_TAP_TO_PAY");
        ACTIVATE_TAP_TO_PAY = debitInstrumentCapability9;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability10 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("UNKNOWN", 9, "UNKNOWN");
        UNKNOWN = debitInstrumentCapability10;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability11 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability("UNKNOWN__", 10, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentCapability11;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability[] debitInstrumentCapabilityArr = {debitInstrumentCapability, debitInstrumentCapability2, debitInstrumentCapability3, debitInstrumentCapability4, debitInstrumentCapability5, debitInstrumentCapability6, debitInstrumentCapability7, debitInstrumentCapability8, debitInstrumentCapability9, debitInstrumentCapability10, debitInstrumentCapability11};
        Camera2StreamConfigurationMap = debitInstrumentCapabilityArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentCapabilityArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentCapability", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"INSTANT_ACCESS", "DIRECT_FUNDING", "AUTO_RELOAD", "WALLET_SHARED_PIN", "AUTO_RELOAD_PER_CARD", "DIRECT_FUNDING_PER_CARD", "ONLINE_PIN", "OFFLINE_PIN", "ACTIVATE_TAP_TO_PAY", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCapability$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCapability;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCapability;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCapability;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.INSTANT_ACCESS, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.DIRECT_FUNDING, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.AUTO_RELOAD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.WALLET_SHARED_PIN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.AUTO_RELOAD_PER_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.DIRECT_FUNDING_PER_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.ONLINE_PIN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.OFFLINE_PIN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.ACTIVATE_TAP_TO_PAY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability debitInstrumentCapability = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability) obj;
            return debitInstrumentCapability == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.UNKNOWN__ : debitInstrumentCapability;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCapability> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
