package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface AsymmetricBlockCipher {
    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters);

    byte[] processBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException;
}
