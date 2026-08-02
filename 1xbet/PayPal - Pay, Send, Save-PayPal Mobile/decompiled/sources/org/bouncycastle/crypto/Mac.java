package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface Mac {
    int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException;

    java.lang.String getAlgorithmName();

    int getMacSize();

    void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException;

    void reset();

    void update(byte b) throws java.lang.IllegalStateException;

    void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException;
}
