package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "PARTIAL_SUCCESS", "SUCCESS", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, "REVERSED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DepositStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus DENIED;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus PARTIAL_SUCCESS;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus PENDING;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus REVERSED;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus SUCCESS;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus[] getHighResolutionOutputSizeshNQ4ISI;

    private DepositStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus depositStatus = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 0);
        PENDING = depositStatus;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus depositStatus2 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus("PARTIAL_SUCCESS", 1);
        PARTIAL_SUCCESS = depositStatus2;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus depositStatus3 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus("SUCCESS", 2);
        SUCCESS = depositStatus3;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus depositStatus4 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 3);
        DENIED = depositStatus4;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus depositStatus5 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus("REVERSED", 4);
        REVERSED = depositStatus5;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus depositStatus6 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus("UNKNOWN", 5);
        UNKNOWN = depositStatus6;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus[] depositStatusArr = {depositStatus, depositStatus2, depositStatus3, depositStatus4, depositStatus5, depositStatus6};
        getHighResolutionOutputSizeshNQ4ISI = depositStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(depositStatusArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
