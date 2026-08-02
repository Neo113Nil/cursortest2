package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes3.dex */
public interface DigitalizedCardDetails {
    java.lang.String getAuxiliaryLastFourDigitsOfDPAN();

    java.lang.String getAuxiliaryScheme();

    int getCVMResetTimeout();

    int getDualTapResetTimeout();

    java.lang.String getLastFourDigits();

    java.lang.String getLastFourDigitsOfDPAN();

    java.lang.String getPanExpiry();

    java.lang.String getProductID();

    java.util.List<java.lang.String> getQrAIDs();

    java.lang.String getScheme();

    java.lang.String getTokenizedCardID();

    java.lang.String getValue(java.lang.String str);

    boolean isPaymentTypeSupported(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType);

    boolean isVisaODACertificateExpired();

    boolean isVisaODASupported();

    com.gemalto.mfs.mwsdk.dcm.PaymentType[] paymentTypeSupported();
}
