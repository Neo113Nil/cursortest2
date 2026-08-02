package my.com.softspace.ssfasstapsdk.transaction;

/* loaded from: classes17.dex */
public interface Transaction {
    boolean cancelTransaction();

    byte[] cryptoOperation(android.content.Context context, boolean z, byte[] bArr);

    byte[] enterPin(android.app.Activity activity, my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams transactionalPinpadParams);

    byte[] generateRandom(android.content.Context context, int i);

    byte[] getKSN(android.content.Context context, boolean z);

    boolean isTransactionRunning();

    boolean startTransaction(android.app.Activity activity, my.com.softspace.ssfasstapsdk.transaction.TransactionalParams transactionalParams, my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents transactionEvents);

    public interface TransactionEvents {

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface CardEvent {
            public static final int CardReadDuplicate = 3;
            public static final int CardReadError = 1;
            public static final int CardReadTimeout = 2;
            public static final int CardTagNotSupported = 4;
            public static final int CardTapped = 0;
            public static final int NfcUnexpectedError = -1;
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface TransactionResult {
            public static final int TransactionCancel = 7024;
            public static final int TransactionCardError = 7030;
            public static final int TransactionCardExpired = 7008;
            public static final int TransactionCardLocked = 7502;
            public static final int TransactionCardNotMatched = 7067;
            public static final int TransactionCardNotSupported = 7060;
            public static final int TransactionConfigError = 7052;
            public static final int TransactionDeclined = 7004;
            public static final int TransactionEndApplicationError = 7055;
            public static final int TransactionFailed = 7005;
            public static final int TransactionFailedAllowFallback = 7007;
            public static final int TransactionGPODeclined = 7057;
            public static final int TransactionGPOFailed = 7501;
            public static final int TransactionNoAppError = 7006;
            public static final int TransactionNoKeyError = 7063;
            public static final int TransactionOfflineApproved = 16;
            public static final int TransactionOnlineFail = 7020;
            public static final int TransactionPinNotSupported = 7059;
            public static final int TransactionRequireCDCVM = 7054;
            public static final int TransactionSelectNextInterface = 7053;
            public static final int TransactionSuccessful = 0;
            public static final int TransactionTimeout = 7028;
            public static final int TransactionTryAgain = 7056;
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface TransactionUIEvent {
            public static final int CancelPin = 66;
            public static final int EnterPin = 65;
            public static final int EventCardReadOk = 23;
            public static final int PinBypass = 67;
            public static final int PinEnterTimeout = 68;
            public static final int PinEntered = 69;
            public static final int UnknownEvent = 255;
        }

        void onCardEvent(int i);

        byte[] onTransactionRequestOnlineAuthentication(byte[] bArr, java.util.Map<java.lang.String, byte[]> map);

        void onTransactionResult(int i, byte[] bArr);

        void onTransactionUIEvent(int i);

        default java.util.Map<java.lang.String, byte[]> mapRawOnlineRequest(byte[] bArr) {
            return my.com.softspace.ssfasstapsdk.common.Utils.parsePlainTLVToMap(bArr);
        }
    }
}
