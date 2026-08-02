package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "AVAILABLE", "MAYBE_AVAILABLE", "INSUFFICIENT", "REFRESH_FAILED", "NOT_STARTED", "EXPIRED", "PAUSE", "STOP", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShoppingCollectionState {
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState AVAILABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState CREATED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState EXPIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState INSUFFICIENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState MAYBE_AVAILABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState NOT_STARTED;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState PAUSE;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState REFRESH_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState STOP;
    public static final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ShoppingCollectionState(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, 0, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED);
        CREATED = shoppingCollectionState;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState2 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("AVAILABLE", 1, "AVAILABLE");
        AVAILABLE = shoppingCollectionState2;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState3 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("MAYBE_AVAILABLE", 2, "MAYBE_AVAILABLE");
        MAYBE_AVAILABLE = shoppingCollectionState3;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState4 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("INSUFFICIENT", 3, "INSUFFICIENT");
        INSUFFICIENT = shoppingCollectionState4;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState5 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("REFRESH_FAILED", 4, "REFRESH_FAILED");
        REFRESH_FAILED = shoppingCollectionState5;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState6 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("NOT_STARTED", 5, "NOT_STARTED");
        NOT_STARTED = shoppingCollectionState6;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState7 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("EXPIRED", 6, "EXPIRED");
        EXPIRED = shoppingCollectionState7;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState8 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("PAUSE", 7, "PAUSE");
        PAUSE = shoppingCollectionState8;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState9 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("STOP", 8, "STOP");
        STOP = shoppingCollectionState9;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState10 = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = shoppingCollectionState10;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState[] shoppingCollectionStateArr = {shoppingCollectionState, shoppingCollectionState2, shoppingCollectionState3, shoppingCollectionState4, shoppingCollectionState5, shoppingCollectionState6, shoppingCollectionState7, shoppingCollectionState8, shoppingCollectionState9, shoppingCollectionState10};
        getHighSpeedVideoFpsRangesFor = shoppingCollectionStateArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(shoppingCollectionStateArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ShoppingCollectionState", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "AVAILABLE", "MAYBE_AVAILABLE", "INSUFFICIENT", "REFRESH_FAILED", "NOT_STARTED", "EXPIRED", "PAUSE", "STOP"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ShoppingCollectionState;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState[]{com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.CREATED, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.AVAILABLE, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.MAYBE_AVAILABLE, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.INSUFFICIENT, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.REFRESH_FAILED, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.NOT_STARTED, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.EXPIRED, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.PAUSE, com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.STOP});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState shoppingCollectionState = (com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState) obj;
            return shoppingCollectionState == null ? com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.UNKNOWN__ : shoppingCollectionState;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionState> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
