package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes3.dex */
public interface RemotePaymentServiceListener extends com.gemalto.mfs.mwsdk.payment.PaymentServiceListener {
    void onDataReadyForPayment(com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService, com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext);

    default void onNextTransactionReady(com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus deactivationStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard) {
    }
}
