package com.payair.hce;

/* loaded from: classes4.dex */
public interface checkForSuccess {
    byte[] getCardCountryCode();

    com.payair.hce.JsonResponse getContactlessPaymentData();

    byte[] getDigitizedCardId();

    com.payair.hce.getStatusCode getDsrpData();

    byte[] getPan();

    com.payair.hce.getStatusCodeFromServer getVersion();

    com.payair.hce.setDetailedMessage getWalletData();

    boolean isTransactionIdRequired();
}
