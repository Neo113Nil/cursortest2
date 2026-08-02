package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ADDED", "ADD_BANK_FAILED", "CONFIRMED", "INSTANT_BANK_CONFIRMATION_FAILED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAccountAction {
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAction ADDED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAction ADD_BANK_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAction CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAction.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAction INSTANT_BANK_CONFIRMATION_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAction UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankAccountAction[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BankAccountAction(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction = new com.paypal.oslo.api.graphql.schema.type.BankAccountAction("ADDED", 0, "ADDED");
        ADDED = bankAccountAction;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction2 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAction("ADD_BANK_FAILED", 1, "ADD_BANK_FAILED");
        ADD_BANK_FAILED = bankAccountAction2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction3 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAction("CONFIRMED", 2, "CONFIRMED");
        CONFIRMED = bankAccountAction3;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction4 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAction("INSTANT_BANK_CONFIRMATION_FAILED", 3, "INSTANT_BANK_CONFIRMATION_FAILED");
        INSTANT_BANK_CONFIRMATION_FAILED = bankAccountAction4;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction5 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAction("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = bankAccountAction5;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAction[] bankAccountActionArr = {bankAccountAction, bankAccountAction2, bankAccountAction3, bankAccountAction4, bankAccountAction5};
        getHighSpeedVideoFpsRanges = bankAccountActionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountActionArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BankAccountAction.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BankAccountAction", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ADDED", "ADD_BANK_FAILED", "CONFIRMED", "INSTANT_BANK_CONFIRMATION_FAILED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BankAccountAction.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAction> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BankAccountAction[]{com.paypal.oslo.api.graphql.schema.type.BankAccountAction.ADDED, com.paypal.oslo.api.graphql.schema.type.BankAccountAction.ADD_BANK_FAILED, com.paypal.oslo.api.graphql.schema.type.BankAccountAction.CONFIRMED, com.paypal.oslo.api.graphql.schema.type.BankAccountAction.INSTANT_BANK_CONFIRMATION_FAILED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAction[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BankAccountAction[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BankAccountAction[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAction safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BankAccountAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BankAccountAction) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction = (com.paypal.oslo.api.graphql.schema.type.BankAccountAction) obj;
            return bankAccountAction == null ? com.paypal.oslo.api.graphql.schema.type.BankAccountAction.UNKNOWN__ : bankAccountAction;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountAction[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountAction[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountAction) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BankAccountAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BankAccountAction> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
