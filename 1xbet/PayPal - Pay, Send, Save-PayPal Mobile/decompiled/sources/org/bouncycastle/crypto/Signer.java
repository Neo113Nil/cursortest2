package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface Signer {
    byte[] generateSignature() throws org.bouncycastle.crypto.CryptoException, org.bouncycastle.crypto.DataLengthException;

    void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters);

    void reset();

    void update(byte b);

    void update(byte[] bArr, int i, int i2);

    boolean verifySignature(byte[] bArr);
}
