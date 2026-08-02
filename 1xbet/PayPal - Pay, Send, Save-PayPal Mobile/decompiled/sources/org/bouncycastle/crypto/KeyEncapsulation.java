package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface KeyEncapsulation {
    org.bouncycastle.crypto.CipherParameters decrypt(byte[] bArr, int i, int i2, int i3);

    org.bouncycastle.crypto.CipherParameters encrypt(byte[] bArr, int i, int i2);

    void init(org.bouncycastle.crypto.CipherParameters cipherParameters);
}
