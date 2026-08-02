package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
public interface ECPairTransform {
    void init(org.bouncycastle.crypto.CipherParameters cipherParameters);

    org.bouncycastle.crypto.ec.ECPair transform(org.bouncycastle.crypto.ec.ECPair eCPair);
}
