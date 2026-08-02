package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface BasicAgreement {
    java.math.BigInteger calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters);

    int getFieldSize();

    void init(org.bouncycastle.crypto.CipherParameters cipherParameters);
}
