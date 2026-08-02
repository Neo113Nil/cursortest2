package com.payair.hce;

/* loaded from: classes4.dex */
public interface stopTransaction {
    byte[] AlternateContactlessPaymentDataJson();

    byte[] DigitizedCardProfile();

    byte[] IccPrivateKeyCrtComponentsJson();

    byte[] RecordsJson();

    byte[] SdkCoreAlternateContactlessPaymentDataImpl();

    byte[] SdkCoreBusinessLogicModuleImpl();

    byte[] getAid();

    boolean getApplicationLifeCycleData();

    com.payair.hce.setHCEEventListener getCardLayoutDescription();

    com.payair.hce.suspendCardForToken getCardholderValidators();

    boolean getCiacDecline();

    boolean getCvmResetTimeout();

    boolean getCvrMaskAnd();

    com.payair.hce.setHCEEventListener getDualTapResetTimeout();

    boolean getGpoResponse();

    java.util.List<com.payair.hce.updateUnlockKeys> getPaymentFci();

    com.payair.hce.handleMDESPushPayload getProfileVersion();

    com.payair.hce.getNumberOfTransactionLogEntries getSecurityWord();

    byte[] valueOf();

    byte[] values();

    byte[] writeReplace();
}
