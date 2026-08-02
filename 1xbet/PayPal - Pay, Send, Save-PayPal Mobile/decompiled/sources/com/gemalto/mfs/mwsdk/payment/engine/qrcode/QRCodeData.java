package com.gemalto.mfs.mwsdk.payment.engine.qrcode;

/* loaded from: classes8.dex */
public interface QRCodeData {
    byte[] getCID();

    byte[] getCardAliasAid();

    byte[] getCardAliasAppTemplate();

    byte[] getCardMainAid();

    byte[] getCardMainAppTemplate();

    byte[] getChipDataField();

    byte[] getCommonDataTemplate();

    byte[] getCondensedPaymentData();

    byte[] getQrcBuffer();

    byte[] getStatusWord();

    byte[] getTransactionId();

    void wipe();
}
