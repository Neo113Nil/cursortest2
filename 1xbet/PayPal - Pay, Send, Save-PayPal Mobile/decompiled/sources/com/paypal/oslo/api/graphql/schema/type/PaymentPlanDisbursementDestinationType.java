package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanDisbursementDestinationType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "CRYPTOCURRENCY", "CHECK", "PAYMENT_TOKEN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentPlanDisbursementDestinationType {
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType BANK;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType CHECK;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType CRYPTOCURRENCY;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType PAYMENT_TOKEN;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PaymentPlanDisbursementDestinationType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType paymentPlanDisbursementDestinationType = new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);
        BALANCE = paymentPlanDisbursementDestinationType;
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType paymentPlanDisbursementDestinationType2 = new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType("BANK", 1, "BANK");
        BANK = paymentPlanDisbursementDestinationType2;
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType paymentPlanDisbursementDestinationType3 = new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType("CARD", 2, "CARD");
        CARD = paymentPlanDisbursementDestinationType3;
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType paymentPlanDisbursementDestinationType4 = new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType("CRYPTOCURRENCY", 3, "CRYPTOCURRENCY");
        CRYPTOCURRENCY = paymentPlanDisbursementDestinationType4;
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType paymentPlanDisbursementDestinationType5 = new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType("CHECK", 4, "CHECK");
        CHECK = paymentPlanDisbursementDestinationType5;
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType paymentPlanDisbursementDestinationType6 = new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType("PAYMENT_TOKEN", 5, "PAYMENT_TOKEN");
        PAYMENT_TOKEN = paymentPlanDisbursementDestinationType6;
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType paymentPlanDisbursementDestinationType7 = new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = paymentPlanDisbursementDestinationType7;
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType[] paymentPlanDisbursementDestinationTypeArr = {paymentPlanDisbursementDestinationType, paymentPlanDisbursementDestinationType2, paymentPlanDisbursementDestinationType3, paymentPlanDisbursementDestinationType4, paymentPlanDisbursementDestinationType5, paymentPlanDisbursementDestinationType6, paymentPlanDisbursementDestinationType7};
        Camera2StreamConfigurationMap = paymentPlanDisbursementDestinationTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(paymentPlanDisbursementDestinationTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PaymentPlanDisbursementDestinationType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "CRYPTOCURRENCY", "CHECK", "PAYMENT_TOKEN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanDisbursementDestinationType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanDisbursementDestinationType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanDisbursementDestinationType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanDisbursementDestinationType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType[]{com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.BALANCE, com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.BANK, com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.CARD, com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.CRYPTOCURRENCY, com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.CHECK, com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.PAYMENT_TOKEN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType paymentPlanDisbursementDestinationType = (com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType) obj;
            return paymentPlanDisbursementDestinationType == null ? com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.UNKNOWN__ : paymentPlanDisbursementDestinationType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PaymentPlanDisbursementDestinationType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
