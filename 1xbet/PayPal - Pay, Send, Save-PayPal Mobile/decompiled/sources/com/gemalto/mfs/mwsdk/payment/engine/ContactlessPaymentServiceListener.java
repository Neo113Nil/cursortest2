package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes3.dex */
public interface ContactlessPaymentServiceListener extends com.gemalto.mfs.mwsdk.payment.PaymentServiceListener {
    void onFirstTapCompleted();

    default void onNextTransactionReady(com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus deactivationStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard) {
    }

    void onReadyToTap(com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService);

    void onTransactionCompleted(com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext);

    default void onTransactionInterrupted(int i, java.lang.String str, int i2) {
    }

    void onTransactionStarted();
}
