package org.bouncycastle.pqc.crypto;

/* loaded from: classes17.dex */
public interface MessageSigner {
    byte[] generateSignature(byte[] bArr);

    void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, byte[] bArr2);
}
