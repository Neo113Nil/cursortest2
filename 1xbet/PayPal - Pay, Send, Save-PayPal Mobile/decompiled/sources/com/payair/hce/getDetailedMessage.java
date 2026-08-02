package com.payair.hce;

/* loaded from: classes4.dex */
public interface getDetailedMessage {
    com.payair.hce.Initializer AlternateContactlessPaymentDataJson(byte[] bArr) throws java.security.GeneralSecurityException;

    byte[] AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException;

    byte[] DigitizedCardProfile(com.payair.hce.Initializer initializer) throws java.security.GeneralSecurityException;

    boolean valueOf(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException;

    byte[] valueOf(byte[] bArr) throws java.security.GeneralSecurityException;
}
