package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
public interface ECEncryptor {
    org.bouncycastle.crypto.ec.ECPair encrypt(org.bouncycastle.math.ec.ECPoint eCPoint);

    void init(org.bouncycastle.crypto.CipherParameters cipherParameters);
}
