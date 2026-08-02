package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "STANDARD_FUNDS", "FAST_FUNDS", "WIRE", "CHECK", "BANK_MANAGED_WITHDRAWAL", "INTERNAL_TRANSFER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WithdrawalTransferMethod {
    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod BANK_MANAGED_WITHDRAWAL;
    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod CHECK;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod FAST_FUNDS;
    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod INTERNAL_TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod STANDARD_FUNDS;
    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod WIRE;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private WithdrawalTransferMethod(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod = new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod("STANDARD_FUNDS", 0, "STANDARD_FUNDS");
        STANDARD_FUNDS = withdrawalTransferMethod;
        com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod2 = new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod("FAST_FUNDS", 1, "FAST_FUNDS");
        FAST_FUNDS = withdrawalTransferMethod2;
        com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod3 = new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod("WIRE", 2, "WIRE");
        WIRE = withdrawalTransferMethod3;
        com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod4 = new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod("CHECK", 3, "CHECK");
        CHECK = withdrawalTransferMethod4;
        com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod5 = new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod("BANK_MANAGED_WITHDRAWAL", 4, "BANK_MANAGED_WITHDRAWAL");
        BANK_MANAGED_WITHDRAWAL = withdrawalTransferMethod5;
        com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod6 = new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod("INTERNAL_TRANSFER", 5, "INTERNAL_TRANSFER");
        INTERNAL_TRANSFER = withdrawalTransferMethod6;
        com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod7 = new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = withdrawalTransferMethod7;
        com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod[] withdrawalTransferMethodArr = {withdrawalTransferMethod, withdrawalTransferMethod2, withdrawalTransferMethod3, withdrawalTransferMethod4, withdrawalTransferMethod5, withdrawalTransferMethod6, withdrawalTransferMethod7};
        getHighResolutionOutputSizeshNQ4ISI = withdrawalTransferMethodArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(withdrawalTransferMethodArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("WithdrawalTransferMethod", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"STANDARD_FUNDS", "FAST_FUNDS", "WIRE", "CHECK", "BANK_MANAGED_WITHDRAWAL", "INTERNAL_TRANSFER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod[]{com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.STANDARD_FUNDS, com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.FAST_FUNDS, com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.WIRE, com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.CHECK, com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.BANK_MANAGED_WITHDRAWAL, com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.INTERNAL_TRANSFER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod = (com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod) obj;
            return withdrawalTransferMethod == null ? com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.UNKNOWN__ : withdrawalTransferMethod;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
