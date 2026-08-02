package my.com.softspace.reader;

/* loaded from: classes17.dex */
public interface TransactionHandler {

    public interface TransactionCallback {
        void onCardEvent(int i);

        byte[] onKernelRequestOnlineHost(byte[] bArr, byte[] bArr2);

        void onKernelResult(int i, byte[] bArr);

        void onTransactionUIEvent(int i);
    }

    boolean cancelTransaction();

    int enterPin(java.lang.String str, int i, byte[] bArr);

    boolean isTransactionRunning();

    boolean startTransaction(android.app.Activity activity, java.lang.String str, my.com.softspace.reader.TransactionConfigurations transactionConfigurations, int i, boolean z, int i2, boolean z2, my.com.softspace.reader.TransactionHandler.TransactionCallback transactionCallback);
}
