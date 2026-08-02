package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CURRENT_BALANCE", "CUSTOM_AMOUNT", "MINIMUM_PAYMENT_DUE", "REMAINING_STATEMENT_BALANCE", "STATEMENT_BALANCE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RevolvingCreditOneTimePaymentAmountOptionType {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType CURRENT_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType CUSTOM_AMOUNT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType MINIMUM_PAYMENT_DUE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType REMAINING_STATEMENT_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType STATEMENT_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private RevolvingCreditOneTimePaymentAmountOptionType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType("CURRENT_BALANCE", 0, "CURRENT_BALANCE");
        CURRENT_BALANCE = revolvingCreditOneTimePaymentAmountOptionType;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType2 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType("CUSTOM_AMOUNT", 1, "CUSTOM_AMOUNT");
        CUSTOM_AMOUNT = revolvingCreditOneTimePaymentAmountOptionType2;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType3 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType("MINIMUM_PAYMENT_DUE", 2, "MINIMUM_PAYMENT_DUE");
        MINIMUM_PAYMENT_DUE = revolvingCreditOneTimePaymentAmountOptionType3;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType4 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType("REMAINING_STATEMENT_BALANCE", 3, "REMAINING_STATEMENT_BALANCE");
        REMAINING_STATEMENT_BALANCE = revolvingCreditOneTimePaymentAmountOptionType4;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType5 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType("STATEMENT_BALANCE", 4, "STATEMENT_BALANCE");
        STATEMENT_BALANCE = revolvingCreditOneTimePaymentAmountOptionType5;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType6 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = revolvingCreditOneTimePaymentAmountOptionType6;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType[] revolvingCreditOneTimePaymentAmountOptionTypeArr = {revolvingCreditOneTimePaymentAmountOptionType, revolvingCreditOneTimePaymentAmountOptionType2, revolvingCreditOneTimePaymentAmountOptionType3, revolvingCreditOneTimePaymentAmountOptionType4, revolvingCreditOneTimePaymentAmountOptionType5, revolvingCreditOneTimePaymentAmountOptionType6};
        getHighSpeedVideoFpsRangesFor = revolvingCreditOneTimePaymentAmountOptionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(revolvingCreditOneTimePaymentAmountOptionTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("RevolvingCreditOneTimePaymentAmountOptionType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CURRENT_BALANCE", "CUSTOM_AMOUNT", "MINIMUM_PAYMENT_DUE", "REMAINING_STATEMENT_BALANCE", "STATEMENT_BALANCE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType[]{com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.CURRENT_BALANCE, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.CUSTOM_AMOUNT, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.MINIMUM_PAYMENT_DUE, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.REMAINING_STATEMENT_BALANCE, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.STATEMENT_BALANCE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType) obj;
            return revolvingCreditOneTimePaymentAmountOptionType == null ? com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.UNKNOWN__ : revolvingCreditOneTimePaymentAmountOptionType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
