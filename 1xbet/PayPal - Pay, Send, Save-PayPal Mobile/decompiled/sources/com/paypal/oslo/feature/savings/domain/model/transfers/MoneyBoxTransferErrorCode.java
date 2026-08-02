package com.paypal.oslo.feature.savings.domain.model.transfers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyBoxTransferErrorCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "DECLINED_WEEKLY_RETRY_LIMIT_REACHED", "DECLINED_MONTHLY_RETRY_LIMIT_REACHED", "DECLINED_WEEKLY_RECEIVING_LIMIT_REACHED", "DECLINED_MONTHLY_RECEIVING_LIMIT_REACHED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoneyBoxTransferErrorCode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode.Companion INSTANCE;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode DECLINED_MONTHLY_RECEIVING_LIMIT_REACHED;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode DECLINED_MONTHLY_RETRY_LIMIT_REACHED;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode DECLINED_WEEKLY_RECEIVING_LIMIT_REACHED;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode DECLINED_WEEKLY_RETRY_LIMIT_REACHED;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String code;

    private MoneyBoxTransferErrorCode(java.lang.String str, int i, java.lang.String str2) {
        this.code = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode moneyBoxTransferErrorCode = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode("DECLINED_WEEKLY_RETRY_LIMIT_REACHED", 0, "DECLINED_WEEKLY_RETRY_LIMIT_REACHED");
        DECLINED_WEEKLY_RETRY_LIMIT_REACHED = moneyBoxTransferErrorCode;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode moneyBoxTransferErrorCode2 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode("DECLINED_MONTHLY_RETRY_LIMIT_REACHED", 1, "DECLINED_MONTHLY_RETRY_LIMIT_REACHED");
        DECLINED_MONTHLY_RETRY_LIMIT_REACHED = moneyBoxTransferErrorCode2;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode moneyBoxTransferErrorCode3 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode("DECLINED_WEEKLY_RECEIVING_LIMIT_REACHED", 2, "DECLINED_WEEKLY_RECEIVING_LIMIT_REACHED");
        DECLINED_WEEKLY_RECEIVING_LIMIT_REACHED = moneyBoxTransferErrorCode3;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode moneyBoxTransferErrorCode4 = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode("DECLINED_MONTHLY_RECEIVING_LIMIT_REACHED", 3, "DECLINED_MONTHLY_RECEIVING_LIMIT_REACHED");
        DECLINED_MONTHLY_RECEIVING_LIMIT_REACHED = moneyBoxTransferErrorCode4;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode[] moneyBoxTransferErrorCodeArr = {moneyBoxTransferErrorCode, moneyBoxTransferErrorCode2, moneyBoxTransferErrorCode3, moneyBoxTransferErrorCode4};
        getHighSpeedVideoFpsRangesFor = moneyBoxTransferErrorCodeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(moneyBoxTransferErrorCodeArr);
        INSTANCE = new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyBoxTransferErrorCode$Companion;", "", "<init>", "()V", "", "code", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyBoxTransferErrorCode;", "fromCode", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyBoxTransferErrorCode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode fromCode(java.lang.String code) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode) obj).getCode(), code)) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.transfers.MoneyBoxTransferErrorCode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
