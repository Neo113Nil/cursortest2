package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface StreamCipher {
    java.lang.String getAlgorithmName();

    void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException;

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException;

    void reset();

    byte returnByte(byte b);
}
