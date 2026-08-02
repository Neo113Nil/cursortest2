package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface BlockCipher {
    java.lang.String getAlgorithmName();

    int getBlockSize();

    void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException;

    int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException;

    void reset();
}
