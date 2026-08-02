package com.payair.hce;

/* loaded from: classes4.dex */
public interface JsonResponse {
    byte[] getAid();

    com.payair.hce.JsonRequest getAlternateContactlessPaymentData();

    int getCdol1RelatedDataLength();

    @java.lang.Deprecated
    byte[] getCiacDecline();

    @java.lang.Deprecated
    byte[] getCiacDeclineOnPpms();

    com.payair.hce.gotDeleteData getCvmModel();

    @java.lang.Deprecated
    byte[] getCvrMaskAnd();

    byte[] getGpoResponse();

    com.payair.hce.initializeVisaPaymentSdk getIccPrivateKeyCrtComponents();

    byte[] getIssuerApplicationData();

    byte[] getPaymentFci();

    byte[] getPinIvCvc3Track2();

    byte[] getPpseFci();

    java.util.List<com.payair.hce.setNetworkError> getRecords();

    com.payair.hce.setErrorName getTrack1ConstructionData();

    com.payair.hce.setErrorName getTrack2ConstructionData();

    com.payair.hce.setSendAuthenticationHeader getUmdGeneration();

    boolean isTransitSupported();

    boolean isUsAipMaskingSupported();
}
