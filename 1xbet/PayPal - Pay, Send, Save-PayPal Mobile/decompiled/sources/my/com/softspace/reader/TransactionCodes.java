package my.com.softspace.reader;

/* loaded from: classes17.dex */
public final class TransactionCodes {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CardStatus {
        public static final int CardReadDuplicate = 3;
        public static final int CardReadError = 1;
        public static final int CardReadTimeout = 2;
        public static final int CardTagNotSupported = 4;
        public static final int CardTapped = 0;
        public static final int NfcUnexpectedError = -1;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SupportedScheme {
        public static final int ALL = 16383;
        public static final int AMEX = 64;
        public static final int CUP = 128;
        public static final int DISCOVER = 512;
        public static final int EFTPOS = 4096;
        public static final int JCB = 32;
        public static final int JCBDC = 2048;
        public static final int MADA = 1024;
        public static final int MASTER = 24;
        public static final int MCCS = 1;
        public static final int NETS = 8192;
        public static final int UNKNOWN = 0;
        public static final int VCCS = 256;
        public static final int VISA = 6;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TransactionResult {
        public static final int TRANSACTION_CANCEL = 7024;
        public static final int TRANSACTION_CARD_ERROR = 7030;
        public static final int TRANSACTION_CARD_EXPIRED = 7008;
        public static final int TRANSACTION_CARD_LOCKED = 7502;
        public static final int TRANSACTION_CARD_NOT_MATCHED = 7067;
        public static final int TRANSACTION_CARD_NOT_SUPPORTED = 7060;
        public static final int TRANSACTION_DECLINED = 7004;
        public static final int TRANSACTION_END_APPLICATION_ERROR = 7055;
        public static final int TRANSACTION_FAILED = 7005;
        public static final int TRANSACTION_FAILED_ALLOW_FALLBACK = 7007;
        public static final int TRANSACTION_GPO_DECLINED = 7057;
        public static final int TRANSACTION_GPO_FAILED = 7501;
        public static final int TRANSACTION_NOT_PERMITTED_ATTESTATION_NOT_DONE = 7065;
        public static final int TRANSACTION_NO_APP_ERROR = 7006;
        public static final int TRANSACTION_NO_KEY_ERROR = 7063;
        public static final int TRANSACTION_OFFLINE_APPROVED = 16;
        public static final int TRANSACTION_OFFLINE_NOT_PERMITTED = 7064;
        public static final int TRANSACTION_OFFLINE_TIME_ALLOWANCE_EXCEEDED = 7066;
        public static final int TRANSACTION_ONLINE_FAIL = 7020;
        public static final int TRANSACTION_PIN_NOT_SUPPORTED = 7059;
        public static final int TRANSACTION_READER_CONFIG_ERROR = 7052;
        public static final int TRANSACTION_REQUIRE_CDCVM = 7054;
        public static final int TRANSACTION_SELECT_NEXT_ERROR = 7053;
        public static final int TRANSACTION_SUCCESSFUL = 0;
        public static final int TRANSACTION_TIMEOUT = 7028;
        public static final int TRANSACTION_TRY_AGAIN = 7056;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TransactionUIEvent {
        public static final int EVENT_CANCEL_PIN = 66;
        public static final int EVENT_CARD_READ_OK_REMOVE_CARD = 23;
        public static final int EVENT_ENTER_PIN = 65;
        public static final int EVENT_PIN_BYPASS = 67;
        public static final int EVENT_PIN_ENTERED = 69;
        public static final int EVENT_PIN_TIMEOUT = 68;
        public static final int UNKNOWN_EVENT = 255;
    }
}
