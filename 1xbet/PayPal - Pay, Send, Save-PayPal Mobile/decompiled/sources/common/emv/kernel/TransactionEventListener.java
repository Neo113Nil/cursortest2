package common.emv.kernel;

/* loaded from: classes17.dex */
public interface TransactionEventListener {
    default int requestPINEntry(byte[] bArr, byte[] bArr2) {
        return 0;
    }

    default void selectNextOutcome(common.emv.kernel.TransactionOutcome transactionOutcome) {
    }

    default void updateMSG(byte[] bArr, common.emv.kernel.TransactionOutcome.StandardMessage standardMessage, common.emv.kernel.TransactionOutcome.Status status, byte[] bArr2, byte[] bArr3) {
    }

    default void updateOUT(byte[] bArr) {
    }

    void updateUI(common.emv.kernel.TransactionOutcome.StandardMessage standardMessage);

    default byte[] requestGoOnline(byte[] bArr) {
        return new byte[0];
    }
}
