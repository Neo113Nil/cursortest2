package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface HpkeAead {
    byte[] getAeadId() throws java.security.GeneralSecurityException;

    int getKeyLength();

    int getNonceLength();

    byte[] open(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException;

    byte[] seal(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException;

    default byte[] seal(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
        return seal(bArr, bArr2, bArr3, 0, bArr4);
    }

    default byte[] open(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
        return open(bArr, bArr2, bArr3, 0, bArr4);
    }
}
