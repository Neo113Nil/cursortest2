package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes3.dex */
public interface PaymentServiceListener {
    public static final java.lang.String TRANSACTION_CONTEXT_KEY = "TransactionContext";

    void onAuthenticationRequired(com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService, com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod, long j);

    void onError(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> sDKError);
}
