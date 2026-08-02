package com.payair.hce;

/* loaded from: classes4.dex */
public interface checkCallingUriPermission {
    byte[] getAid();

    com.payair.hce.enforceCallingOrSelfUriPermission getAlternateContactlessPaymentData();

    byte[] getCdol1RelatedDataLength();

    byte[] getCiacDecline();

    byte[] getCiacDeclineOnPpms();

    byte[] getCvrMaskAnd();

    byte[] getGpoResponse();

    com.payair.hce.createDisplayContext getIccPrivateKeyCrtComponents();

    byte[] getIssuerApplicationData();

    byte[] getPaymentFci();

    byte[] getPinIvCvc3Track2();

    byte[] getPpseFci();

    com.payair.hce.checkCallingOrSelfUriPermissions[] getRecords();
}
