package com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SecondaryFundingOptionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "DEBIT_CARD", "CREDIT_CARD", "PAYPAL_CREDIT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SecondaryFundingOptionType {
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType BALANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType BANK;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType CARD;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType CREDIT_CARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType DEBIT_CARD;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType PAYPAL_CREDIT;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String value;

    private SecondaryFundingOptionType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType secondaryFundingOptionType = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);
        BALANCE = secondaryFundingOptionType;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType secondaryFundingOptionType2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType("BANK", 1, "BANK");
        BANK = secondaryFundingOptionType2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType secondaryFundingOptionType3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType("CARD", 2, "CARD");
        CARD = secondaryFundingOptionType3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType secondaryFundingOptionType4 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType("DEBIT_CARD", 3, "DEBIT_CARD");
        DEBIT_CARD = secondaryFundingOptionType4;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType secondaryFundingOptionType5 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType("CREDIT_CARD", 4, "CREDIT_CARD");
        CREDIT_CARD = secondaryFundingOptionType5;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType secondaryFundingOptionType6 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType("PAYPAL_CREDIT", 5, "PAYPAL_CREDIT");
        PAYPAL_CREDIT = secondaryFundingOptionType6;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType secondaryFundingOptionType7 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType("UNKNOWN", 6, "UNKNOWN");
        UNKNOWN = secondaryFundingOptionType7;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType[] secondaryFundingOptionTypeArr = {secondaryFundingOptionType, secondaryFundingOptionType2, secondaryFundingOptionType3, secondaryFundingOptionType4, secondaryFundingOptionType5, secondaryFundingOptionType6, secondaryFundingOptionType7};
        getHighResolutionOutputSizeshNQ4ISI = secondaryFundingOptionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(secondaryFundingOptionTypeArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SecondaryFundingOptionType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SecondaryFundingOptionType;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SecondaryFundingOptionType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType fromValue(java.lang.String value) {
            java.lang.Object obj = null;
            if (value == null) {
                return null;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType) next).getValue(), value)) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType secondaryFundingOptionType = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType) obj;
            return secondaryFundingOptionType == null ? com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.UNKNOWN : secondaryFundingOptionType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
