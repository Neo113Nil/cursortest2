package com.payair.hce;

/* loaded from: classes4.dex */
public interface isNetworkError {
    byte[] AlternateContactlessPaymentDataJson();

    byte[] DigitizedCardProfile();

    byte[] IccPrivateKeyCrtComponentsJson();

    byte[] RecordsJson();

    byte[] SdkCoreAlternateContactlessPaymentDataImpl();

    byte[] SdkCoreBusinessLogicModuleImpl();

    byte[] getAid();

    void getGpoResponse();

    int getProfileVersion();

    byte[] valueOf();

    byte[] values();

    java.lang.String writeReplace();
}
