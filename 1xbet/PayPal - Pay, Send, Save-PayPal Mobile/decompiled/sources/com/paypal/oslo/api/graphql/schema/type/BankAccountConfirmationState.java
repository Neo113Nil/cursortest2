package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BYPASS_CONFIRMED", "INITIATED", "INITIATION_PENDING", "NEEDS_REINITIATION", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAccountConfirmationState {
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState BYPASS_CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState INITIATED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState INITIATION_PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState NEEDS_REINITIATION;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BankAccountConfirmationState(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState("BYPASS_CONFIRMED", 0, "BYPASS_CONFIRMED");
        BYPASS_CONFIRMED = bankAccountConfirmationState;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState2 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState("INITIATED", 1, "INITIATED");
        INITIATED = bankAccountConfirmationState2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState3 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState("INITIATION_PENDING", 2, "INITIATION_PENDING");
        INITIATION_PENDING = bankAccountConfirmationState3;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState4 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState("NEEDS_REINITIATION", 3, "NEEDS_REINITIATION");
        NEEDS_REINITIATION = bankAccountConfirmationState4;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState5 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState("UNKNOWN", 4, "UNKNOWN");
        UNKNOWN = bankAccountConfirmationState5;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState6 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = bankAccountConfirmationState6;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState[] bankAccountConfirmationStateArr = {bankAccountConfirmationState, bankAccountConfirmationState2, bankAccountConfirmationState3, bankAccountConfirmationState4, bankAccountConfirmationState5, bankAccountConfirmationState6};
        getHighSpeedVideoFpsRangesFor = bankAccountConfirmationStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountConfirmationStateArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BankAccountConfirmationState", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BYPASS_CONFIRMED", "INITIATED", "INITIATION_PENDING", "NEEDS_REINITIATION", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState[]{com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.BYPASS_CONFIRMED, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.INITIATED, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.INITIATION_PENDING, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.NEEDS_REINITIATION, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState = (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState) obj;
            return bankAccountConfirmationState == null ? com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.UNKNOWN__ : bankAccountConfirmationState;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
