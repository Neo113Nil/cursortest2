package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public interface PEMEncryptor {
    byte[] encrypt(byte[] bArr) throws org.bouncycastle.openssl.PEMException;

    java.lang.String getAlgorithm();

    byte[] getIV();
}
