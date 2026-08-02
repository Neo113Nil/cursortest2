package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "CLOSED", "PENDING_ACTIVE", com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "REISSUED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentLifecycleState {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState CLOSED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState DEACTIVATED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState PENDING_ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState REISSUED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentLifecycleState(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = debitInstrumentLifecycleState;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState("CLOSED", 1, "CLOSED");
        CLOSED = debitInstrumentLifecycleState2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState("PENDING_ACTIVE", 2, "PENDING_ACTIVE");
        PENDING_ACTIVE = debitInstrumentLifecycleState3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState(com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, 3, com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED);
        DEACTIVATED = debitInstrumentLifecycleState4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState("REISSUED", 4, "REISSUED");
        REISSUED = debitInstrumentLifecycleState5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentLifecycleState6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState[] debitInstrumentLifecycleStateArr = {debitInstrumentLifecycleState, debitInstrumentLifecycleState2, debitInstrumentLifecycleState3, debitInstrumentLifecycleState4, debitInstrumentLifecycleState5, debitInstrumentLifecycleState6};
        getHighSpeedVideoFpsRanges = debitInstrumentLifecycleStateArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentLifecycleStateArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentLifecycleState", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "CLOSED", "PENDING_ACTIVE", com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "REISSUED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.ACTIVE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.CLOSED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.PENDING_ACTIVE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.DEACTIVATED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.REISSUED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState) obj;
            return debitInstrumentLifecycleState == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.UNKNOWN__ : debitInstrumentLifecycleState;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
