package com.payair.hce;

/* loaded from: classes4.dex */
public interface getStatusCode {
    byte[] getAip();

    @java.lang.Deprecated
    byte[] getCiacDecline();

    com.payair.hce.gotDeleteData getCvmModel();

    @java.lang.Deprecated
    byte[] getCvrMaskAnd();

    byte[] getExpiryDate();

    byte[] getIssuerApplicationData();

    byte[] getPanSequenceNumber();

    byte[] getPar();

    byte[] getTrack2EquivalentData();

    com.payair.hce.gotPutData getUcafVersion();

    com.payair.hce.setSendAuthenticationHeader getUmdGeneration();
}
