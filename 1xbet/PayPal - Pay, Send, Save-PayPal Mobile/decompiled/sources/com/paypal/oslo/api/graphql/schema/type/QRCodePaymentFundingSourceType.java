package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodePaymentFundingSourceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BANK", "CARD", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "CREDIT", "INCENTIVE", "EXTERNAL_IDENTIFIER", "STORED_VALUE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QRCodePaymentFundingSourceType {
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType BANK;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType CREDIT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType EXTERNAL_IDENTIFIER;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType INCENTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType STORED_VALUE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private QRCodePaymentFundingSourceType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType("BANK", 0, "BANK");
        BANK = qRCodePaymentFundingSourceType;
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType2 = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType("CARD", 1, "CARD");
        CARD = qRCodePaymentFundingSourceType2;
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType3 = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 2, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);
        BALANCE = qRCodePaymentFundingSourceType3;
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType4 = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType("CREDIT", 3, "CREDIT");
        CREDIT = qRCodePaymentFundingSourceType4;
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType5 = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType("INCENTIVE", 4, "INCENTIVE");
        INCENTIVE = qRCodePaymentFundingSourceType5;
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType6 = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType("EXTERNAL_IDENTIFIER", 5, "EXTERNAL_IDENTIFIER");
        EXTERNAL_IDENTIFIER = qRCodePaymentFundingSourceType6;
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType7 = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType("STORED_VALUE", 6, "STORED_VALUE");
        STORED_VALUE = qRCodePaymentFundingSourceType7;
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType8 = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = qRCodePaymentFundingSourceType8;
        com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType[] qRCodePaymentFundingSourceTypeArr = {qRCodePaymentFundingSourceType, qRCodePaymentFundingSourceType2, qRCodePaymentFundingSourceType3, qRCodePaymentFundingSourceType4, qRCodePaymentFundingSourceType5, qRCodePaymentFundingSourceType6, qRCodePaymentFundingSourceType7, qRCodePaymentFundingSourceType8};
        getHighResolutionOutputSizeshNQ4ISI = qRCodePaymentFundingSourceTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(qRCodePaymentFundingSourceTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("QRCodePaymentFundingSourceType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BANK", "CARD", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "CREDIT", "INCENTIVE", "EXTERNAL_IDENTIFIER", "STORED_VALUE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodePaymentFundingSourceType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodePaymentFundingSourceType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/QRCodePaymentFundingSourceType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/QRCodePaymentFundingSourceType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType[]{com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.BANK, com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.CARD, com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.BALANCE, com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.CREDIT, com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.INCENTIVE, com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.EXTERNAL_IDENTIFIER, com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.STORED_VALUE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType = (com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType) obj;
            return qRCodePaymentFundingSourceType == null ? com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.UNKNOWN__ : qRCodePaymentFundingSourceType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.QRCodePaymentFundingSourceType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
