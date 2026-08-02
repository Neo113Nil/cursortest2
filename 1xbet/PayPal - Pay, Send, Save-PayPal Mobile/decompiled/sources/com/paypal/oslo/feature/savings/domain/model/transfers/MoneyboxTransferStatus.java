package com.paypal.oslo.feature.savings.domain.model.transfers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SUCCESS", "PARTIAL_SUCCESS", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "INSUFFICIENT_FUNDS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoneyboxTransferStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus FAILED;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus INSUFFICIENT_FUNDS;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus PARTIAL_SUCCESS;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus PENDING;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus SUCCESS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus[] getHighSpeedVideoFpsRangesFor;

    private MoneyboxTransferStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus moneyboxTransferStatus = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus("SUCCESS", 0);
        SUCCESS = moneyboxTransferStatus;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus moneyboxTransferStatus2 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus("PARTIAL_SUCCESS", 1);
        PARTIAL_SUCCESS = moneyboxTransferStatus2;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus moneyboxTransferStatus3 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 2);
        PENDING = moneyboxTransferStatus3;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus moneyboxTransferStatus4 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 3);
        FAILED = moneyboxTransferStatus4;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus moneyboxTransferStatus5 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus("INSUFFICIENT_FUNDS", 4);
        INSUFFICIENT_FUNDS = moneyboxTransferStatus5;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus[] moneyboxTransferStatusArr = {moneyboxTransferStatus, moneyboxTransferStatus2, moneyboxTransferStatus3, moneyboxTransferStatus4, moneyboxTransferStatus5};
        getHighSpeedVideoFpsRangesFor = moneyboxTransferStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(moneyboxTransferStatusArr);
        INSTANCE = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferStatus$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferStatus;", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus safeValueOf(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus moneyboxTransferStatus = (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus) obj;
            return moneyboxTransferStatus == null ? com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus.FAILED : moneyboxTransferStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
