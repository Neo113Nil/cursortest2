package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface Wrapper {
    java.lang.String getAlgorithmName();

    void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters);

    byte[] unwrap(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException;

    byte[] wrap(byte[] bArr, int i, int i2);
}
