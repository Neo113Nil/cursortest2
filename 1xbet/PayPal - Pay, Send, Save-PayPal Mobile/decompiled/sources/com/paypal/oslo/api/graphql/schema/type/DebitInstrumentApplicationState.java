package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentApplicationState;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "MANUAL_REVIEW", "APPROVED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentApplicationState {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState APPROVED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState CREATED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState MANUAL_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentApplicationState(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState debitInstrumentApplicationState = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 0, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = debitInstrumentApplicationState;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState debitInstrumentApplicationState2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState("MANUAL_REVIEW", 1, "MANUAL_REVIEW");
        MANUAL_REVIEW = debitInstrumentApplicationState2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState debitInstrumentApplicationState3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState("APPROVED", 2, "APPROVED");
        APPROVED = debitInstrumentApplicationState3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState debitInstrumentApplicationState4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 3, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED);
        DENIED = debitInstrumentApplicationState4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState debitInstrumentApplicationState5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, 4, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED);
        CREATED = debitInstrumentApplicationState5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState debitInstrumentApplicationState6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState("UNKNOWN", 5, "UNKNOWN");
        UNKNOWN = debitInstrumentApplicationState6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState debitInstrumentApplicationState7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentApplicationState7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState[] debitInstrumentApplicationStateArr = {debitInstrumentApplicationState, debitInstrumentApplicationState2, debitInstrumentApplicationState3, debitInstrumentApplicationState4, debitInstrumentApplicationState5, debitInstrumentApplicationState6, debitInstrumentApplicationState7};
        getHighSpeedVideoSizes = debitInstrumentApplicationStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentApplicationStateArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentApplicationState", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "MANUAL_REVIEW", "APPROVED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentApplicationState$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentApplicationState;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentApplicationState;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentApplicationState;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.PENDING, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.MANUAL_REVIEW, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.APPROVED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.DENIED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.CREATED, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState debitInstrumentApplicationState = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState) obj;
            return debitInstrumentApplicationState == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.UNKNOWN__ : debitInstrumentApplicationState;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
