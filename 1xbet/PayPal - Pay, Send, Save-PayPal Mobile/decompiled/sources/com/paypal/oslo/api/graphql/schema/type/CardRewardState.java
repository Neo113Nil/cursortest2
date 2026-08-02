package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "BLOCKED", com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "ON_HOLD", "REMOVED", "NOT_CREATED", "CLOSED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardRewardState {
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState BLOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState CLOSED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CardRewardState[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState INACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState NOT_CREATED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState ON_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState REMOVED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardState UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CardRewardState(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState = new com.paypal.oslo.api.graphql.schema.type.CardRewardState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = cardRewardState;
        com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState2 = new com.paypal.oslo.api.graphql.schema.type.CardRewardState("BLOCKED", 1, "BLOCKED");
        BLOCKED = cardRewardState2;
        com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState3 = new com.paypal.oslo.api.graphql.schema.type.CardRewardState(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 2, com.payair.model.TokenStatusKt.TOKEN_INACTIVE);
        INACTIVE = cardRewardState3;
        com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState4 = new com.paypal.oslo.api.graphql.schema.type.CardRewardState("ON_HOLD", 3, "ON_HOLD");
        ON_HOLD = cardRewardState4;
        com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState5 = new com.paypal.oslo.api.graphql.schema.type.CardRewardState("REMOVED", 4, "REMOVED");
        REMOVED = cardRewardState5;
        com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState6 = new com.paypal.oslo.api.graphql.schema.type.CardRewardState("NOT_CREATED", 5, "NOT_CREATED");
        NOT_CREATED = cardRewardState6;
        com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState7 = new com.paypal.oslo.api.graphql.schema.type.CardRewardState("CLOSED", 6, "CLOSED");
        CLOSED = cardRewardState7;
        com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState8 = new com.paypal.oslo.api.graphql.schema.type.CardRewardState("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = cardRewardState8;
        com.paypal.oslo.api.graphql.schema.type.CardRewardState[] cardRewardStateArr = {cardRewardState, cardRewardState2, cardRewardState3, cardRewardState4, cardRewardState5, cardRewardState6, cardRewardState7, cardRewardState8};
        Camera2StreamConfigurationMap = cardRewardStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cardRewardStateArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CardRewardState.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CardRewardState", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "BLOCKED", com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "ON_HOLD", "REMOVED", "NOT_CREATED", "CLOSED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CardRewardState;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CardRewardState.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CardRewardState> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CardRewardState[]{com.paypal.oslo.api.graphql.schema.type.CardRewardState.ACTIVE, com.paypal.oslo.api.graphql.schema.type.CardRewardState.BLOCKED, com.paypal.oslo.api.graphql.schema.type.CardRewardState.INACTIVE, com.paypal.oslo.api.graphql.schema.type.CardRewardState.ON_HOLD, com.paypal.oslo.api.graphql.schema.type.CardRewardState.REMOVED, com.paypal.oslo.api.graphql.schema.type.CardRewardState.NOT_CREATED, com.paypal.oslo.api.graphql.schema.type.CardRewardState.CLOSED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CardRewardState[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CardRewardState[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CardRewardState[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardRewardState safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CardRewardState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CardRewardState) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CardRewardState cardRewardState = (com.paypal.oslo.api.graphql.schema.type.CardRewardState) obj;
            return cardRewardState == null ? com.paypal.oslo.api.graphql.schema.type.CardRewardState.UNKNOWN__ : cardRewardState;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardRewardState[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CardRewardState[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardRewardState valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CardRewardState) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CardRewardState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CardRewardState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
