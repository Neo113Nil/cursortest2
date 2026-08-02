package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsFulfillmentErrorCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "DECLINED_INSTRUMENT", "DECLINED_BY_RISK", "ERROR_SENDER_AUTHENTICATION_REQUIRED", "DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED", "DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED", "DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT", "BUSINESS_ERROR", "INTERNAL_SERVICE_ERROR", "DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED", "CONFLICT", "DECLINED_TRANSFER_CANNOT_BE_INITIATED", "DECLINED_CONSUMER_RESTRICTED", "INVALID_TOKEN", "INVALID_TRANSACTION_AMOUNT", "DECLINED_BY_LIMITS", com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED, "DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WithdrawFundsFulfillmentErrorCode {
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode BUSINESS_ERROR;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode CONFLICT;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_BY_LIMITS;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_BY_RISK;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_CONSUMER_RESTRICTED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_INSTRUMENT;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_TRANSFER_CANNOT_BE_INITIATED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode ERROR_SENDER_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode INTERNAL_SERVICE_ERROR;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode INVALID_TOKEN;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode INVALID_TRANSACTION_AMOUNT;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode UNAUTHORIZED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String code;

    private WithdrawFundsFulfillmentErrorCode(java.lang.String str, int i, java.lang.String str2) {
        this.code = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_INSTRUMENT", 0, "DECLINED_INSTRUMENT");
        DECLINED_INSTRUMENT = withdrawFundsFulfillmentErrorCode;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode2 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_BY_RISK", 1, "DECLINED_BY_RISK");
        DECLINED_BY_RISK = withdrawFundsFulfillmentErrorCode2;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode3 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("ERROR_SENDER_AUTHENTICATION_REQUIRED", 2, "ERROR_SENDER_AUTHENTICATION_REQUIRED");
        ERROR_SENDER_AUTHENTICATION_REQUIRED = withdrawFundsFulfillmentErrorCode3;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode4 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED", 3, "DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_WEEKLY_AMOUNT_LIMIT_EXCEEDED = withdrawFundsFulfillmentErrorCode4;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode5 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED", 4, "DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_MONTHLY_AMOUNT_LIMIT_EXCEEDED = withdrawFundsFulfillmentErrorCode5;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode6 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT", 5, "DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT");
        DECLINED_AMOUNT_LESS_THAN_MINIMUM_LIMIT = withdrawFundsFulfillmentErrorCode6;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode7 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("BUSINESS_ERROR", 6, "BUSINESS_ERROR");
        BUSINESS_ERROR = withdrawFundsFulfillmentErrorCode7;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode8 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("INTERNAL_SERVICE_ERROR", 7, "INTERNAL_SERVICE_ERROR");
        INTERNAL_SERVICE_ERROR = withdrawFundsFulfillmentErrorCode8;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode9 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED", 8, "DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_DAILY_AMOUNT_LIMIT_EXCEEDED = withdrawFundsFulfillmentErrorCode9;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode10 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("CONFLICT", 9, "CONFLICT");
        CONFLICT = withdrawFundsFulfillmentErrorCode10;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode11 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_TRANSFER_CANNOT_BE_INITIATED", 10, "DECLINED_TRANSFER_CANNOT_BE_INITIATED");
        DECLINED_TRANSFER_CANNOT_BE_INITIATED = withdrawFundsFulfillmentErrorCode11;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode12 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_CONSUMER_RESTRICTED", 11, "DECLINED_CONSUMER_RESTRICTED");
        DECLINED_CONSUMER_RESTRICTED = withdrawFundsFulfillmentErrorCode12;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode13 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("INVALID_TOKEN", 12, "INVALID_TOKEN");
        INVALID_TOKEN = withdrawFundsFulfillmentErrorCode13;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode14 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("INVALID_TRANSACTION_AMOUNT", 13, "INVALID_TRANSACTION_AMOUNT");
        INVALID_TRANSACTION_AMOUNT = withdrawFundsFulfillmentErrorCode14;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode15 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_BY_LIMITS", 14, "DECLINED_BY_LIMITS");
        DECLINED_BY_LIMITS = withdrawFundsFulfillmentErrorCode15;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode16 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED, 15, com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED);
        UNAUTHORIZED = withdrawFundsFulfillmentErrorCode16;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode withdrawFundsFulfillmentErrorCode17 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode("DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED", 16, "DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED");
        DECLINED_PER_TRANSACTION_AMOUNT_LIMIT_EXCEEDED = withdrawFundsFulfillmentErrorCode17;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode[] withdrawFundsFulfillmentErrorCodeArr = {withdrawFundsFulfillmentErrorCode, withdrawFundsFulfillmentErrorCode2, withdrawFundsFulfillmentErrorCode3, withdrawFundsFulfillmentErrorCode4, withdrawFundsFulfillmentErrorCode5, withdrawFundsFulfillmentErrorCode6, withdrawFundsFulfillmentErrorCode7, withdrawFundsFulfillmentErrorCode8, withdrawFundsFulfillmentErrorCode9, withdrawFundsFulfillmentErrorCode10, withdrawFundsFulfillmentErrorCode11, withdrawFundsFulfillmentErrorCode12, withdrawFundsFulfillmentErrorCode13, withdrawFundsFulfillmentErrorCode14, withdrawFundsFulfillmentErrorCode15, withdrawFundsFulfillmentErrorCode16, withdrawFundsFulfillmentErrorCode17};
        Camera2StreamConfigurationMap = withdrawFundsFulfillmentErrorCodeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(withdrawFundsFulfillmentErrorCodeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsFulfillmentErrorCode$Companion;", "", "<init>", "()V", "", "code", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsFulfillmentErrorCode;", "fromCode", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsFulfillmentErrorCode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode fromCode(java.lang.String code) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode) obj).getCode(), code)) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsFulfillmentErrorCode> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
