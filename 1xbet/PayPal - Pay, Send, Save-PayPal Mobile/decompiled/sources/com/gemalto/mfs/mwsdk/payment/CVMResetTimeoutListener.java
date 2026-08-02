package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes8.dex */
public interface CVMResetTimeoutListener {
    void onCredentialsTimeout(com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService, com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod, long j);

    void onCredentialsTimeoutCountDown(int i);
}
