package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentStatusChangeReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CLOSED", "COMPROMISED", "EXPIRED", "LOST_STOLEN", "NONE", "PENDING_FULFILLMENT", "UNDELIVERABLE", "VERIFICATION_REQUIRED", "BLOCKED", "USER", "PARTNER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentStatusChangeReason {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason BLOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason CLOSED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason COMPROMISED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason EXPIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason LOST_STOLEN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason NONE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason PARTNER;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason PENDING_FULFILLMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason UNDELIVERABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason USER;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason VERIFICATION_REQUIRED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentStatusChangeReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("CLOSED", 0, "CLOSED");
        CLOSED = debitInstrumentStatusChangeReason;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("COMPROMISED", 1, "COMPROMISED");
        COMPROMISED = debitInstrumentStatusChangeReason2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("EXPIRED", 2, "EXPIRED");
        EXPIRED = debitInstrumentStatusChangeReason3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("LOST_STOLEN", 3, "LOST_STOLEN");
        LOST_STOLEN = debitInstrumentStatusChangeReason4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("NONE", 4, "NONE");
        NONE = debitInstrumentStatusChangeReason5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("PENDING_FULFILLMENT", 5, "PENDING_FULFILLMENT");
        PENDING_FULFILLMENT = debitInstrumentStatusChangeReason6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("UNDELIVERABLE", 6, "UNDELIVERABLE");
        UNDELIVERABLE = debitInstrumentStatusChangeReason7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason8 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("VERIFICATION_REQUIRED", 7, "VERIFICATION_REQUIRED");
        VERIFICATION_REQUIRED = debitInstrumentStatusChangeReason8;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason9 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("BLOCKED", 8, "BLOCKED");
        BLOCKED = debitInstrumentStatusChangeReason9;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason10 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("USER", 9, "USER");
        USER = debitInstrumentStatusChangeReason10;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason11 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("PARTNER", 10, "PARTNER");
        PARTNER = debitInstrumentStatusChangeReason11;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason12 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason("UNKNOWN__", 11, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentStatusChangeReason12;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason[] debitInstrumentStatusChangeReasonArr = {debitInstrumentStatusChangeReason, debitInstrumentStatusChangeReason2, debitInstrumentStatusChangeReason3, debitInstrumentStatusChangeReason4, debitInstrumentStatusChangeReason5, debitInstrumentStatusChangeReason6, debitInstrumentStatusChangeReason7, debitInstrumentStatusChangeReason8, debitInstrumentStatusChangeReason9, debitInstrumentStatusChangeReason10, debitInstrumentStatusChangeReason11, debitInstrumentStatusChangeReason12};
        getHighSpeedVideoSizes = debitInstrumentStatusChangeReasonArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentStatusChangeReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentStatusChangeReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CLOSED", "COMPROMISED", "EXPIRED", "LOST_STOLEN", "NONE", "PENDING_FULFILLMENT", "UNDELIVERABLE", "VERIFICATION_REQUIRED", "BLOCKED", "USER", "PARTNER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentStatusChangeReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentStatusChangeReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentStatusChangeReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentStatusChangeReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.CLOSED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.COMPROMISED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.EXPIRED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.LOST_STOLEN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.NONE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.PENDING_FULFILLMENT, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.UNDELIVERABLE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.VERIFICATION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.BLOCKED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.USER, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.PARTNER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason debitInstrumentStatusChangeReason = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason) obj;
            return debitInstrumentStatusChangeReason == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.UNKNOWN__ : debitInstrumentStatusChangeReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
