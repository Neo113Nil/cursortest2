package com.payair.hce;

/* loaded from: classes4.dex */
public interface sendUpdateRNSInformation {

    public interface AlternateContactlessPaymentDataJson {
        byte[] DigitizedCardProfile();

        byte[] writeReplace();
    }

    com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson AlternateContactlessPaymentDataJson(byte[] bArr, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2) throws java.security.GeneralSecurityException;

    byte[] SdkCoreAlternateContactlessPaymentDataImpl(byte[] bArr);

    byte[] getProfileVersion(byte[] bArr);

    int valueOf(com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException;

    com.payair.hce.initializeVisaPaymentSdk valueOf(com.payair.hce.getErrors geterrors, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException;

    com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson valueOf(byte[] bArr, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2) throws java.security.GeneralSecurityException;

    byte[] valueOf(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException;

    com.payair.hce.initializeVisaPaymentSdk values(byte[] bArr);
}
