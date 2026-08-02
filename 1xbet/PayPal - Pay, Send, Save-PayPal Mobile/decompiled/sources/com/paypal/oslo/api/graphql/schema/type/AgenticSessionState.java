package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticSessionState;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "EXPIRED", "TERMINATED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AgenticSessionState {
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState CREATED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState EXPIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState INACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState TERMINATED;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AgenticSessionState[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AgenticSessionState(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AgenticSessionState agenticSessionState = new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, 0, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED);
        CREATED = agenticSessionState;
        com.paypal.oslo.api.graphql.schema.type.AgenticSessionState agenticSessionState2 = new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 1, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = agenticSessionState2;
        com.paypal.oslo.api.graphql.schema.type.AgenticSessionState agenticSessionState3 = new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 2, com.payair.model.TokenStatusKt.TOKEN_INACTIVE);
        INACTIVE = agenticSessionState3;
        com.paypal.oslo.api.graphql.schema.type.AgenticSessionState agenticSessionState4 = new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState("EXPIRED", 3, "EXPIRED");
        EXPIRED = agenticSessionState4;
        com.paypal.oslo.api.graphql.schema.type.AgenticSessionState agenticSessionState5 = new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState("TERMINATED", 4, "TERMINATED");
        TERMINATED = agenticSessionState5;
        com.paypal.oslo.api.graphql.schema.type.AgenticSessionState agenticSessionState6 = new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = agenticSessionState6;
        com.paypal.oslo.api.graphql.schema.type.AgenticSessionState[] agenticSessionStateArr = {agenticSessionState, agenticSessionState2, agenticSessionState3, agenticSessionState4, agenticSessionState5, agenticSessionState6};
        getHighResolutionOutputSizeshNQ4ISI = agenticSessionStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(agenticSessionStateArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AgenticSessionState", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "EXPIRED", "TERMINATED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticSessionState$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticSessionState;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AgenticSessionState;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AgenticSessionState;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AgenticSessionState> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState[]{com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.CREATED, com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.ACTIVE, com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.INACTIVE, com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.EXPIRED, com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.TERMINATED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AgenticSessionState[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AgenticSessionState[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AgenticSessionState safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AgenticSessionState) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AgenticSessionState agenticSessionState = (com.paypal.oslo.api.graphql.schema.type.AgenticSessionState) obj;
            return agenticSessionState == null ? com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.UNKNOWN__ : agenticSessionState;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AgenticSessionState[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AgenticSessionState[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AgenticSessionState valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AgenticSessionState) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AgenticSessionState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AgenticSessionState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
