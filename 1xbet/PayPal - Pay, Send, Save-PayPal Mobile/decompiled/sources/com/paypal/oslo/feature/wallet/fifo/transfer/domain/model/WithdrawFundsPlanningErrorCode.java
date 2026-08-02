package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsPlanningErrorCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "DECLINED_CONSUMER_CONFIRMED_EMAIL_REQUIRED", "INELIGIBLE_DUE_TO_RISK_LIMITATIONS", "VALIDATION_ERROR", "DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT", "DECLINED_BY_RISK", "ERROR_SENDER_AUTHENTICATION_REQUIRED", "DECLINED_WITHDRAWAL_AMOUNT_CANNOT_BE_LESS_THAN_FEE", "DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED", "DECLINED_TRANSFER_CANNOT_BE_INITIATED", "DECLINED_ANNUAL_AMOUNT_LIMIT_EXCEEDED", "DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED", "SEPA_DAILY_TRANSACTION_LIMIT_EXCEEDED", "SEPA_PER_TRANSACTION_LIMIT_EXCEEDED", "DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED", "INTERNAL_SERVICE_ERROR", "DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED", "SOURCE_INSTRUMENT_INVALID", "DECLINED_WEEKLY_LIMIT_COUNTER_EXCEEDED", "DESTINATION_INSTRUMENT_INVALID"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WithdrawFundsPlanningErrorCode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_ANNUAL_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_BY_RISK;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_CONSUMER_CONFIRMED_EMAIL_REQUIRED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_TRANSFER_CANNOT_BE_INITIATED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_WEEKLY_LIMIT_COUNTER_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DECLINED_WITHDRAWAL_AMOUNT_CANNOT_BE_LESS_THAN_FEE;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode DESTINATION_INSTRUMENT_INVALID;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode ERROR_SENDER_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode INELIGIBLE_DUE_TO_RISK_LIMITATIONS;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode INTERNAL_SERVICE_ERROR;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode SEPA_DAILY_TRANSACTION_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode SEPA_PER_TRANSACTION_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode SOURCE_INSTRUMENT_INVALID;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode VALIDATION_ERROR;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String code;

    private WithdrawFundsPlanningErrorCode(java.lang.String str, int i, java.lang.String str2) {
        this.code = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_CONSUMER_CONFIRMED_EMAIL_REQUIRED", 0, "DECLINED_CONSUMER_CONFIRMED_EMAIL_REQUIRED");
        DECLINED_CONSUMER_CONFIRMED_EMAIL_REQUIRED = withdrawFundsPlanningErrorCode;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode2 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("INELIGIBLE_DUE_TO_RISK_LIMITATIONS", 1, "INELIGIBLE_DUE_TO_RISK_LIMITATIONS");
        INELIGIBLE_DUE_TO_RISK_LIMITATIONS = withdrawFundsPlanningErrorCode2;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode3 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("VALIDATION_ERROR", 2, "VALIDATION_ERROR");
        VALIDATION_ERROR = withdrawFundsPlanningErrorCode3;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode4 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT", 3, "DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT");
        DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT = withdrawFundsPlanningErrorCode4;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode5 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_BY_RISK", 4, "DECLINED_BY_RISK");
        DECLINED_BY_RISK = withdrawFundsPlanningErrorCode5;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode6 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("ERROR_SENDER_AUTHENTICATION_REQUIRED", 5, "ERROR_SENDER_AUTHENTICATION_REQUIRED");
        ERROR_SENDER_AUTHENTICATION_REQUIRED = withdrawFundsPlanningErrorCode6;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode7 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_WITHDRAWAL_AMOUNT_CANNOT_BE_LESS_THAN_FEE", 6, "DECLINED_WITHDRAWAL_AMOUNT_CANNOT_BE_LESS_THAN_FEE");
        DECLINED_WITHDRAWAL_AMOUNT_CANNOT_BE_LESS_THAN_FEE = withdrawFundsPlanningErrorCode7;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode8 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED", 7, "DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED = withdrawFundsPlanningErrorCode8;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode9 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_TRANSFER_CANNOT_BE_INITIATED", 8, "DECLINED_TRANSFER_CANNOT_BE_INITIATED");
        DECLINED_TRANSFER_CANNOT_BE_INITIATED = withdrawFundsPlanningErrorCode9;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode10 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_ANNUAL_AMOUNT_LIMIT_EXCEEDED", 9, "DECLINED_ANNUAL_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_ANNUAL_AMOUNT_LIMIT_EXCEEDED = withdrawFundsPlanningErrorCode10;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode11 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED", 10, "DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED = withdrawFundsPlanningErrorCode11;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode12 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("SEPA_DAILY_TRANSACTION_LIMIT_EXCEEDED", 11, "SEPA_DAILY_TRANSACTION_LIMIT_EXCEEDED");
        SEPA_DAILY_TRANSACTION_LIMIT_EXCEEDED = withdrawFundsPlanningErrorCode12;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode13 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("SEPA_PER_TRANSACTION_LIMIT_EXCEEDED", 12, "SEPA_PER_TRANSACTION_LIMIT_EXCEEDED");
        SEPA_PER_TRANSACTION_LIMIT_EXCEEDED = withdrawFundsPlanningErrorCode13;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode14 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED", 13, "DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED = withdrawFundsPlanningErrorCode14;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode15 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("INTERNAL_SERVICE_ERROR", 14, "INTERNAL_SERVICE_ERROR");
        INTERNAL_SERVICE_ERROR = withdrawFundsPlanningErrorCode15;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode16 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED", 15, "DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED = withdrawFundsPlanningErrorCode16;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode17 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("SOURCE_INSTRUMENT_INVALID", 16, "SOURCE_INSTRUMENT_INVALID");
        SOURCE_INSTRUMENT_INVALID = withdrawFundsPlanningErrorCode17;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode18 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DECLINED_WEEKLY_LIMIT_COUNTER_EXCEEDED", 17, "DECLINED_WEEKLY_LIMIT_COUNTER_EXCEEDED");
        DECLINED_WEEKLY_LIMIT_COUNTER_EXCEEDED = withdrawFundsPlanningErrorCode18;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode withdrawFundsPlanningErrorCode19 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode("DESTINATION_INSTRUMENT_INVALID", 18, "DESTINATION_INSTRUMENT_INVALID");
        DESTINATION_INSTRUMENT_INVALID = withdrawFundsPlanningErrorCode19;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode[] withdrawFundsPlanningErrorCodeArr = {withdrawFundsPlanningErrorCode, withdrawFundsPlanningErrorCode2, withdrawFundsPlanningErrorCode3, withdrawFundsPlanningErrorCode4, withdrawFundsPlanningErrorCode5, withdrawFundsPlanningErrorCode6, withdrawFundsPlanningErrorCode7, withdrawFundsPlanningErrorCode8, withdrawFundsPlanningErrorCode9, withdrawFundsPlanningErrorCode10, withdrawFundsPlanningErrorCode11, withdrawFundsPlanningErrorCode12, withdrawFundsPlanningErrorCode13, withdrawFundsPlanningErrorCode14, withdrawFundsPlanningErrorCode15, withdrawFundsPlanningErrorCode16, withdrawFundsPlanningErrorCode17, withdrawFundsPlanningErrorCode18, withdrawFundsPlanningErrorCode19};
        getHighSpeedVideoFpsRangesFor = withdrawFundsPlanningErrorCodeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(withdrawFundsPlanningErrorCodeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsPlanningErrorCode$Companion;", "", "<init>", "()V", "", "code", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsPlanningErrorCode;", "fromCode", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsPlanningErrorCode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode fromCode(java.lang.String code) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode) obj).getCode(), code)) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsPlanningErrorCode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
