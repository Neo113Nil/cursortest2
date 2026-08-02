package org.bouncycastle.pqc.crypto;

/* loaded from: classes17.dex */
public interface MessageEncryptor {
    void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters);

    byte[] messageDecrypt(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException;

    byte[] messageEncrypt(byte[] bArr);
}
