package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "ORDERED", "SHIPPED", "ACTIVATE", "LOCKED", "EXPIRED", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentDisplayState {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState ACTIVATE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState ACTIVE;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState DEACTIVATED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState EXPIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState LOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState ORDERED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState SHIPPED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentDisplayState(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = debitInstrumentDisplayState;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState(com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, 1, com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED);
        DEACTIVATED = debitInstrumentDisplayState2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState("ORDERED", 2, "ORDERED");
        ORDERED = debitInstrumentDisplayState3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState("SHIPPED", 3, "SHIPPED");
        SHIPPED = debitInstrumentDisplayState4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState("ACTIVATE", 4, "ACTIVATE");
        ACTIVATE = debitInstrumentDisplayState5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState("LOCKED", 5, "LOCKED");
        LOCKED = debitInstrumentDisplayState6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState("EXPIRED", 6, "EXPIRED");
        EXPIRED = debitInstrumentDisplayState7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState8 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState("UNKNOWN", 7, "UNKNOWN");
        UNKNOWN = debitInstrumentDisplayState8;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState9 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentDisplayState9;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState[] debitInstrumentDisplayStateArr = {debitInstrumentDisplayState, debitInstrumentDisplayState2, debitInstrumentDisplayState3, debitInstrumentDisplayState4, debitInstrumentDisplayState5, debitInstrumentDisplayState6, debitInstrumentDisplayState7, debitInstrumentDisplayState8, debitInstrumentDisplayState9};
        Camera2StreamConfigurationMap = debitInstrumentDisplayStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentDisplayStateArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentDisplayState", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "ORDERED", "SHIPPED", "ACTIVATE", "LOCKED", "EXPIRED", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.ACTIVE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.DEACTIVATED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.ORDERED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.SHIPPED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.ACTIVATE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.LOCKED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.EXPIRED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState) obj;
            return debitInstrumentDisplayState == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.UNKNOWN__ : debitInstrumentDisplayState;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
