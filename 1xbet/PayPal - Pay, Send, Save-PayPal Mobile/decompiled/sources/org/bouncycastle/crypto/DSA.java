package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface DSA {
    java.math.BigInteger[] generateSignature(byte[] bArr);

    void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2);
}
