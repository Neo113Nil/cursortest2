package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentErrorCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "MONTHLY_LIMIT_EXCEEDED", "WEEKLY_LIMIT_EXCEEDED", "DAILY_LIMIT_EXCEEDED", "RISK_DECLINED", "INSTRUMENT_DECLINED", "LIMITATIONS_DECLINED", "DECLINED_BY_LIMITS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DepositFulfillmentErrorCode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode DAILY_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode DECLINED_BY_LIMITS;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode INSTRUMENT_DECLINED;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode LIMITATIONS_DECLINED;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode MONTHLY_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode RISK_DECLINED;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode WEEKLY_LIMIT_EXCEEDED;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String code;

    private DepositFulfillmentErrorCode(java.lang.String str, int i, java.lang.String str2) {
        this.code = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode depositFulfillmentErrorCode = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode("MONTHLY_LIMIT_EXCEEDED", 0, "MONTHLY_LIMIT_EXCEEDED");
        MONTHLY_LIMIT_EXCEEDED = depositFulfillmentErrorCode;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode depositFulfillmentErrorCode2 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode("WEEKLY_LIMIT_EXCEEDED", 1, "WEEKLY_LIMIT_EXCEEDED");
        WEEKLY_LIMIT_EXCEEDED = depositFulfillmentErrorCode2;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode depositFulfillmentErrorCode3 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode("DAILY_LIMIT_EXCEEDED", 2, "DAILY_LIMIT_EXCEEDED");
        DAILY_LIMIT_EXCEEDED = depositFulfillmentErrorCode3;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode depositFulfillmentErrorCode4 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode("RISK_DECLINED", 3, "RISK_DECLINED");
        RISK_DECLINED = depositFulfillmentErrorCode4;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode depositFulfillmentErrorCode5 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode("INSTRUMENT_DECLINED", 4, "INSTRUMENT_DECLINED");
        INSTRUMENT_DECLINED = depositFulfillmentErrorCode5;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode depositFulfillmentErrorCode6 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode("LIMITATIONS_DECLINED", 5, "LIMITATIONS_DECLINED");
        LIMITATIONS_DECLINED = depositFulfillmentErrorCode6;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode depositFulfillmentErrorCode7 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode("DECLINED_BY_LIMITS", 6, "DECLINED_BY_LIMITS");
        DECLINED_BY_LIMITS = depositFulfillmentErrorCode7;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode[] depositFulfillmentErrorCodeArr = {depositFulfillmentErrorCode, depositFulfillmentErrorCode2, depositFulfillmentErrorCode3, depositFulfillmentErrorCode4, depositFulfillmentErrorCode5, depositFulfillmentErrorCode6, depositFulfillmentErrorCode7};
        getHighSpeedVideoFpsRanges = depositFulfillmentErrorCodeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(depositFulfillmentErrorCodeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentErrorCode$Companion;", "", "<init>", "()V", "", "code", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentErrorCode;", "fromCode", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentErrorCode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode fromCode(java.lang.String code) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode) obj).getCode(), code)) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentErrorCode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
