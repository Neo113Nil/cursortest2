package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
public interface ECDecryptor {
    org.bouncycastle.math.ec.ECPoint decrypt(org.bouncycastle.crypto.ec.ECPair eCPair);

    void init(org.bouncycastle.crypto.CipherParameters cipherParameters);
}
