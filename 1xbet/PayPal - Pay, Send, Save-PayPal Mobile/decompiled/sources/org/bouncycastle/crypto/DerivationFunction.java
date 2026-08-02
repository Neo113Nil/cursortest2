package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException;

    void init(org.bouncycastle.crypto.DerivationParameters derivationParameters);
}
