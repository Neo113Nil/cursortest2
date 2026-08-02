package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes3.dex */
public interface PaymentService {
    java.util.Map<java.lang.String, java.lang.String> getAdditionalData();

    java.lang.Object getCHVerifier(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod);

    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener getPaymentServiceListener();

    com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData getQRCodeData();

    com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData getRemotePaymentData();

    com.gemalto.mfs.mwsdk.payment.engine.TransactionContext getTransactionContext();

    com.gemalto.mfs.mwsdk.dcm.PaymentType getType();

    boolean isActivated();

    void setCVMResetTimeoutListener(com.gemalto.mfs.mwsdk.payment.CVMResetTimeoutListener cVMResetTimeoutListener);

    void setData(java.lang.String str, byte[] bArr);

    boolean setPPSEFci(byte[] bArr);
}
