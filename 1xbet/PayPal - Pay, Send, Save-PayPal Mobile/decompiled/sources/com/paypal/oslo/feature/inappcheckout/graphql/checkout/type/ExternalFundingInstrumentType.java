package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFundingInstrumentType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BANK", "CARD", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "PAYPAL_CREDIT", "COBRAND", "PAYPAL_REWARDS", "PPDC", "CRYPTOCURRENCY_HOLDING", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalFundingInstrumentType {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType BALANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType CARD;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType COBRAND;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType CRYPTOCURRENCY_HOLDING;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType PAYPAL_CREDIT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType PAYPAL_REWARDS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType PPDC;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalFundingInstrumentType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType("BANK", 0, "BANK");
        BANK = externalFundingInstrumentType;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType("CARD", 1, "CARD");
        CARD = externalFundingInstrumentType2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 2, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);
        BALANCE = externalFundingInstrumentType3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType("PAYPAL_CREDIT", 3, "PAYPAL_CREDIT");
        PAYPAL_CREDIT = externalFundingInstrumentType4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType("COBRAND", 4, "COBRAND");
        COBRAND = externalFundingInstrumentType5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType6 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType("PAYPAL_REWARDS", 5, "PAYPAL_REWARDS");
        PAYPAL_REWARDS = externalFundingInstrumentType6;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType7 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType("PPDC", 6, "PPDC");
        PPDC = externalFundingInstrumentType7;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType8 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType("CRYPTOCURRENCY_HOLDING", 7, "CRYPTOCURRENCY_HOLDING");
        CRYPTOCURRENCY_HOLDING = externalFundingInstrumentType8;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType9 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = externalFundingInstrumentType9;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType[] externalFundingInstrumentTypeArr = {externalFundingInstrumentType, externalFundingInstrumentType2, externalFundingInstrumentType3, externalFundingInstrumentType4, externalFundingInstrumentType5, externalFundingInstrumentType6, externalFundingInstrumentType7, externalFundingInstrumentType8, externalFundingInstrumentType9};
        Camera2StreamConfigurationMap = externalFundingInstrumentTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(externalFundingInstrumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalFundingInstrumentType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BANK", "CARD", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "PAYPAL_CREDIT", "COBRAND", "PAYPAL_REWARDS", "PPDC", "CRYPTOCURRENCY_HOLDING"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFundingInstrumentType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFundingInstrumentType;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFundingInstrumentType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFundingInstrumentType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.BANK, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.CARD, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.BALANCE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.PAYPAL_CREDIT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.COBRAND, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.PAYPAL_REWARDS, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.PPDC, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.CRYPTOCURRENCY_HOLDING});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType) obj;
            return externalFundingInstrumentType == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.UNKNOWN__ : externalFundingInstrumentType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
