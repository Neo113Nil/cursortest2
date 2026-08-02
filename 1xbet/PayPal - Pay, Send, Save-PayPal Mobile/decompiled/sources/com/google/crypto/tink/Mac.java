package com.google.crypto.tink;

/* loaded from: classes4.dex */
public interface Mac {
    byte[] computeMac(byte[] bArr) throws java.security.GeneralSecurityException;

    void verifyMac(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException;
}
