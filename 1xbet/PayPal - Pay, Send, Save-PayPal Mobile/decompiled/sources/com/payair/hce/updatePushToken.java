package com.payair.hce;

/* loaded from: classes4.dex */
public interface updatePushToken {
    byte[] AlternateContactlessPaymentDataJson();

    byte[] DigitizedCardProfile();

    byte[] IccPrivateKeyCrtComponentsJson();

    byte[] RecordsJson();

    com.payair.hce.getNumberOfTransactionLogEntries SdkCoreAlternateContactlessPaymentDataImpl();

    byte[] SdkCoreBusinessLogicModuleImpl();

    com.payair.hce.suspendCardForToken getAid();

    byte[] getCiacDecline();

    byte[] getCvrMaskAnd();

    byte[] getGpoResponse();

    byte[] getPaymentFci();

    byte[] getProfileVersion();

    byte[] valueOf();

    byte[] values();

    byte[] writeReplace();
}
