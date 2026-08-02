package common.emv.kernel;

/* loaded from: classes17.dex */
public interface Kernel {
    int init(common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType);

    java.lang.String kernelVersion();

    void release();

    int resetTransaction();

    common.emv.kernel.TransactionOutcome startTransaction(common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener);
}
