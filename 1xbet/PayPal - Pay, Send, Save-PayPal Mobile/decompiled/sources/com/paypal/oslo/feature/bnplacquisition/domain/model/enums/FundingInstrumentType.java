package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FundingInstrumentType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentType {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType BALANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType CARD;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private FundingInstrumentType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType fundingInstrumentType = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);
        BALANCE = fundingInstrumentType;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType fundingInstrumentType2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType("BANK", 1, "BANK");
        BANK = fundingInstrumentType2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType fundingInstrumentType3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType("CARD", 2, "CARD");
        CARD = fundingInstrumentType3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType fundingInstrumentType4 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = fundingInstrumentType4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType[] fundingInstrumentTypeArr = {fundingInstrumentType, fundingInstrumentType2, fundingInstrumentType3, fundingInstrumentType4};
        Camera2StreamConfigurationMap = fundingInstrumentTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FundingInstrumentType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FundingInstrumentType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FundingInstrumentType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType fundingInstrumentType = (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType) obj;
            return fundingInstrumentType == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.UNKNOWN__ : fundingInstrumentType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
