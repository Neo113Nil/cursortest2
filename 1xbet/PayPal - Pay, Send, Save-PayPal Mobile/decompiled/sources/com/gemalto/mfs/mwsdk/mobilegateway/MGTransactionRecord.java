package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes3.dex */
public interface MGTransactionRecord {
    double getAmount();

    java.lang.String getCurrencyCode();

    java.lang.String getDigitalCardId();

    java.lang.String getDisplayAmount();

    java.lang.String getMerchantId();

    java.lang.String getMerchantName();

    java.lang.String getMerchantPostalCode();

    java.lang.String getMerchantType();

    java.lang.String getTerminalId();

    java.lang.String getTransactionDate();

    java.lang.String getTransactionId();

    com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus getTransactionStatus();

    com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType getTransactionType();

    boolean isAuxiliaryTransaction();
}
