package com.paypal.oslo.feature.taptopay.domain.model.payment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b#\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "CARD_SUSPENDED", "CARD_OUT_OF_PAYMENT_KEYS", "POS_COMM_DISCONNECTED", "NO_DEFAULT_CARD", "CARD_NOT_EXISTING", "OPERATION_NOT_ALLOWED", "BIOFP_CONDITION_NOT_SATISFIED", "CARD_ACTIVATION_FAILED", "CARD_SET_DEFAULT_FAILED", "REMOTE_PAYMENT_INPUT_INVALID", "REMOTE_PAYMENT_OUTPUT_INVALID", "REMOTE_PAYMENT_NOT_SUPPORTED", "REMOTE_PAYMENT_WRONG_STATE", "PAYMENT_WRONG_STATE", "PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED", "PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING", "PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED", "NO_DEFAULT_CHV_METHOD", "CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED", "CARD_ALREADY_ACTIVATED", "PAYMENT_NOT_ALLOWED_SECURE_WALLET_ENROLLMENT_REQUIRED", "STORAGE_COMPONENT_ERROR", "KEY_STORE_INACCESSIBLE", "NO_APDU_PROCESSOR_FOUND", "ERROR_READING_PAYMENT_CHANNEL", "UNSUPPORTED_CARD_TYPE", "LOAD_NEXT_CRED_ERROR", "ERROR_FUNCTION_NOT_SUPPORTED", "DEVICE_SUSPICIOUS", "USER_NOT_AUTHENTICATED", "INTERNAL_ERROR", "NULL_CONTEXT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentErrorCode {
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode BIOFP_CONDITION_NOT_SATISFIED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode CARD_ACTIVATION_FAILED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode CARD_ALREADY_ACTIVATED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode CARD_NOT_EXISTING;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode CARD_OUT_OF_PAYMENT_KEYS;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode CARD_SET_DEFAULT_FAILED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode CARD_SUSPENDED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode DEVICE_SUSPICIOUS;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode ERROR_FUNCTION_NOT_SUPPORTED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode ERROR_READING_PAYMENT_CHANNEL;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode INTERNAL_ERROR;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode KEY_STORE_INACCESSIBLE;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode LOAD_NEXT_CRED_ERROR;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode NO_APDU_PROCESSOR_FOUND;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode NO_DEFAULT_CARD;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode NO_DEFAULT_CHV_METHOD;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode NULL_CONTEXT;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode OPERATION_NOT_ALLOWED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode PAYMENT_NOT_ALLOWED_SECURE_WALLET_ENROLLMENT_REQUIRED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode PAYMENT_WRONG_STATE;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode POS_COMM_DISCONNECTED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode REMOTE_PAYMENT_INPUT_INVALID;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode REMOTE_PAYMENT_NOT_SUPPORTED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode REMOTE_PAYMENT_OUTPUT_INVALID;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode REMOTE_PAYMENT_WRONG_STATE;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode STORAGE_COMPONENT_ERROR;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode UNKNOWN;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode UNSUPPORTED_CARD_TYPE;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode USER_NOT_AUTHENTICATED;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode[] getHighSpeedVideoFpsRanges;

    private PaymentErrorCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("CARD_SUSPENDED", 0);
        CARD_SUSPENDED = paymentErrorCode;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode2 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("CARD_OUT_OF_PAYMENT_KEYS", 1);
        CARD_OUT_OF_PAYMENT_KEYS = paymentErrorCode2;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode3 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("POS_COMM_DISCONNECTED", 2);
        POS_COMM_DISCONNECTED = paymentErrorCode3;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode4 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("NO_DEFAULT_CARD", 3);
        NO_DEFAULT_CARD = paymentErrorCode4;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode5 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("CARD_NOT_EXISTING", 4);
        CARD_NOT_EXISTING = paymentErrorCode5;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode6 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("OPERATION_NOT_ALLOWED", 5);
        OPERATION_NOT_ALLOWED = paymentErrorCode6;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode7 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("BIOFP_CONDITION_NOT_SATISFIED", 6);
        BIOFP_CONDITION_NOT_SATISFIED = paymentErrorCode7;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode8 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("CARD_ACTIVATION_FAILED", 7);
        CARD_ACTIVATION_FAILED = paymentErrorCode8;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode9 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("CARD_SET_DEFAULT_FAILED", 8);
        CARD_SET_DEFAULT_FAILED = paymentErrorCode9;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode10 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("REMOTE_PAYMENT_INPUT_INVALID", 9);
        REMOTE_PAYMENT_INPUT_INVALID = paymentErrorCode10;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode11 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("REMOTE_PAYMENT_OUTPUT_INVALID", 10);
        REMOTE_PAYMENT_OUTPUT_INVALID = paymentErrorCode11;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode12 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("REMOTE_PAYMENT_NOT_SUPPORTED", 11);
        REMOTE_PAYMENT_NOT_SUPPORTED = paymentErrorCode12;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode13 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("REMOTE_PAYMENT_WRONG_STATE", 12);
        REMOTE_PAYMENT_WRONG_STATE = paymentErrorCode13;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode14 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("PAYMENT_WRONG_STATE", 13);
        PAYMENT_WRONG_STATE = paymentErrorCode14;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode15 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED", 14);
        PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED = paymentErrorCode15;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode16 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING", 15);
        PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING = paymentErrorCode16;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode17 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED", 16);
        PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED = paymentErrorCode17;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode18 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("NO_DEFAULT_CHV_METHOD", 17);
        NO_DEFAULT_CHV_METHOD = paymentErrorCode18;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode19 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED", 18);
        CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED = paymentErrorCode19;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode20 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("CARD_ALREADY_ACTIVATED", 19);
        CARD_ALREADY_ACTIVATED = paymentErrorCode20;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode21 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("PAYMENT_NOT_ALLOWED_SECURE_WALLET_ENROLLMENT_REQUIRED", 20);
        PAYMENT_NOT_ALLOWED_SECURE_WALLET_ENROLLMENT_REQUIRED = paymentErrorCode21;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode22 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("STORAGE_COMPONENT_ERROR", 21);
        STORAGE_COMPONENT_ERROR = paymentErrorCode22;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode23 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("KEY_STORE_INACCESSIBLE", 22);
        KEY_STORE_INACCESSIBLE = paymentErrorCode23;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode24 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("NO_APDU_PROCESSOR_FOUND", 23);
        NO_APDU_PROCESSOR_FOUND = paymentErrorCode24;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode25 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("ERROR_READING_PAYMENT_CHANNEL", 24);
        ERROR_READING_PAYMENT_CHANNEL = paymentErrorCode25;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode26 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("UNSUPPORTED_CARD_TYPE", 25);
        UNSUPPORTED_CARD_TYPE = paymentErrorCode26;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode27 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("LOAD_NEXT_CRED_ERROR", 26);
        LOAD_NEXT_CRED_ERROR = paymentErrorCode27;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode28 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("ERROR_FUNCTION_NOT_SUPPORTED", 27);
        ERROR_FUNCTION_NOT_SUPPORTED = paymentErrorCode28;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode29 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("DEVICE_SUSPICIOUS", 28);
        DEVICE_SUSPICIOUS = paymentErrorCode29;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode30 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("USER_NOT_AUTHENTICATED", 29);
        USER_NOT_AUTHENTICATED = paymentErrorCode30;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode31 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("INTERNAL_ERROR", 30);
        INTERNAL_ERROR = paymentErrorCode31;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode32 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("NULL_CONTEXT", 31);
        NULL_CONTEXT = paymentErrorCode32;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode33 = new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode("UNKNOWN", 32);
        UNKNOWN = paymentErrorCode33;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode[] paymentErrorCodeArr = {paymentErrorCode, paymentErrorCode2, paymentErrorCode3, paymentErrorCode4, paymentErrorCode5, paymentErrorCode6, paymentErrorCode7, paymentErrorCode8, paymentErrorCode9, paymentErrorCode10, paymentErrorCode11, paymentErrorCode12, paymentErrorCode13, paymentErrorCode14, paymentErrorCode15, paymentErrorCode16, paymentErrorCode17, paymentErrorCode18, paymentErrorCode19, paymentErrorCode20, paymentErrorCode21, paymentErrorCode22, paymentErrorCode23, paymentErrorCode24, paymentErrorCode25, paymentErrorCode26, paymentErrorCode27, paymentErrorCode28, paymentErrorCode29, paymentErrorCode30, paymentErrorCode31, paymentErrorCode32, paymentErrorCode33};
        getHighSpeedVideoFpsRanges = paymentErrorCodeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(paymentErrorCodeArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
