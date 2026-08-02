package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAvailableAction;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "INITIATE_PAYPAL_CODE_CONFIRMATION", "INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION", "COMPLETE_PAYPAL_CODE_CONFIRMATION", "COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION", "INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", "INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION", "COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", "SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION", "COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION", "COMPLETE_INSTANT_CONFIRMATION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAccountAvailableAction {
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction COMPLETE_INSTANT_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction COMPLETE_PAYPAL_CODE_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction INITIATE_PAYPAL_CODE_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BankAccountAvailableAction(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("INITIATE_PAYPAL_CODE_CONFIRMATION", 0, "INITIATE_PAYPAL_CODE_CONFIRMATION");
        INITIATE_PAYPAL_CODE_CONFIRMATION = bankAccountAvailableAction;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction2 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION", 1, "INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION");
        INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION = bankAccountAvailableAction2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction3 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("COMPLETE_PAYPAL_CODE_CONFIRMATION", 2, "COMPLETE_PAYPAL_CODE_CONFIRMATION");
        COMPLETE_PAYPAL_CODE_CONFIRMATION = bankAccountAvailableAction3;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction4 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION", 3, "COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION");
        COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION = bankAccountAvailableAction4;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction5 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", 4, "INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA");
        INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA = bankAccountAvailableAction5;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction6 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION", 5, "INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION");
        INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION = bankAccountAvailableAction6;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction7 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", 6, "COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA");
        COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA = bankAccountAvailableAction7;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction8 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION", 7, "SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION");
        SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION = bankAccountAvailableAction8;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction9 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION", 8, "COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION");
        COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION = bankAccountAvailableAction9;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction10 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("COMPLETE_INSTANT_CONFIRMATION", 9, "COMPLETE_INSTANT_CONFIRMATION");
        COMPLETE_INSTANT_CONFIRMATION = bankAccountAvailableAction10;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction11 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction("UNKNOWN__", 10, "UNKNOWN__");
        UNKNOWN__ = bankAccountAvailableAction11;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction[] bankAccountAvailableActionArr = {bankAccountAvailableAction, bankAccountAvailableAction2, bankAccountAvailableAction3, bankAccountAvailableAction4, bankAccountAvailableAction5, bankAccountAvailableAction6, bankAccountAvailableAction7, bankAccountAvailableAction8, bankAccountAvailableAction9, bankAccountAvailableAction10, bankAccountAvailableAction11};
        Camera2StreamConfigurationMap = bankAccountAvailableActionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountAvailableActionArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BankAccountAvailableAction", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"INITIATE_PAYPAL_CODE_CONFIRMATION", "INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION", "COMPLETE_PAYPAL_CODE_CONFIRMATION", "COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION", "INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", "INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION", "COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", "SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION", "COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION", "COMPLETE_INSTANT_CONFIRMATION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAvailableAction$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAvailableAction;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAvailableAction;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAvailableAction;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction[]{com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.INITIATE_PAYPAL_CODE_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_PAYPAL_CODE_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION, com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_INSTANT_CONFIRMATION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction = (com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction) obj;
            return bankAccountAvailableAction == null ? com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.UNKNOWN__ : bankAccountAvailableAction;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
