package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankAccountType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CURRENT", "SAVINGS", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "BUSINESS_SAVINGS", "BUSINESS_CHECKING", "UNKNOWN", "NORMAL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalBankAccountType {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType BUSINESS_CHECKING;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType BUSINESS_SAVINGS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType CHECKING;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType CURRENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType NORMAL;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType SAVINGS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType UNKNOWN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalBankAccountType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType("CURRENT", 0, "CURRENT");
        CURRENT = externalBankAccountType;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType("SAVINGS", 1, "SAVINGS");
        SAVINGS = externalBankAccountType2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, 2, com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING);
        CHECKING = externalBankAccountType3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType("BUSINESS_SAVINGS", 3, "BUSINESS_SAVINGS");
        BUSINESS_SAVINGS = externalBankAccountType4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType("BUSINESS_CHECKING", 4, "BUSINESS_CHECKING");
        BUSINESS_CHECKING = externalBankAccountType5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType6 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType("UNKNOWN", 5, "UNKNOWN");
        UNKNOWN = externalBankAccountType6;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType7 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType("NORMAL", 6, "NORMAL");
        NORMAL = externalBankAccountType7;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType8 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = externalBankAccountType8;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType[] externalBankAccountTypeArr = {externalBankAccountType, externalBankAccountType2, externalBankAccountType3, externalBankAccountType4, externalBankAccountType5, externalBankAccountType6, externalBankAccountType7, externalBankAccountType8};
        getHighResolutionOutputSizeshNQ4ISI = externalBankAccountTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(externalBankAccountTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalBankAccountType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CURRENT", "SAVINGS", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "BUSINESS_SAVINGS", "BUSINESS_CHECKING", "UNKNOWN", "NORMAL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankAccountType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankAccountType;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankAccountType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankAccountType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.CURRENT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.SAVINGS, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.CHECKING, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.BUSINESS_SAVINGS, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.BUSINESS_CHECKING, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.UNKNOWN, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.NORMAL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType) obj;
            return externalBankAccountType == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.UNKNOWN__ : externalBankAccountType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
