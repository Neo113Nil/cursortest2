package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentSecondaryFundingSourceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "DEBIT_CARD", "CREDIT_CARD", "PAYPAL_CREDIT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentSecondaryFundingSourceType {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType BANK;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType CREDIT_CARD;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType DEBIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType PAYPAL_CREDIT;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentSecondaryFundingSourceType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType debitInstrumentSecondaryFundingSourceType = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);
        BALANCE = debitInstrumentSecondaryFundingSourceType;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType debitInstrumentSecondaryFundingSourceType2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType("BANK", 1, "BANK");
        BANK = debitInstrumentSecondaryFundingSourceType2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType debitInstrumentSecondaryFundingSourceType3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType("CARD", 2, "CARD");
        CARD = debitInstrumentSecondaryFundingSourceType3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType debitInstrumentSecondaryFundingSourceType4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType("DEBIT_CARD", 3, "DEBIT_CARD");
        DEBIT_CARD = debitInstrumentSecondaryFundingSourceType4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType debitInstrumentSecondaryFundingSourceType5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType("CREDIT_CARD", 4, "CREDIT_CARD");
        CREDIT_CARD = debitInstrumentSecondaryFundingSourceType5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType debitInstrumentSecondaryFundingSourceType6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType("PAYPAL_CREDIT", 5, "PAYPAL_CREDIT");
        PAYPAL_CREDIT = debitInstrumentSecondaryFundingSourceType6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType debitInstrumentSecondaryFundingSourceType7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentSecondaryFundingSourceType7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType[] debitInstrumentSecondaryFundingSourceTypeArr = {debitInstrumentSecondaryFundingSourceType, debitInstrumentSecondaryFundingSourceType2, debitInstrumentSecondaryFundingSourceType3, debitInstrumentSecondaryFundingSourceType4, debitInstrumentSecondaryFundingSourceType5, debitInstrumentSecondaryFundingSourceType6, debitInstrumentSecondaryFundingSourceType7};
        Camera2StreamConfigurationMap = debitInstrumentSecondaryFundingSourceTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentSecondaryFundingSourceTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentSecondaryFundingSourceType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "DEBIT_CARD", "CREDIT_CARD", "PAYPAL_CREDIT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentSecondaryFundingSourceType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentSecondaryFundingSourceType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentSecondaryFundingSourceType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentSecondaryFundingSourceType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.BALANCE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.BANK, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.DEBIT_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.CREDIT_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.PAYPAL_CREDIT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType debitInstrumentSecondaryFundingSourceType = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType) obj;
            return debitInstrumentSecondaryFundingSourceType == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.UNKNOWN__ : debitInstrumentSecondaryFundingSourceType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
