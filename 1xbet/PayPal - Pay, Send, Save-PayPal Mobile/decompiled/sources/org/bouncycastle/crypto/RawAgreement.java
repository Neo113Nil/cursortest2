package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface RawAgreement {
    void calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr, int i);

    int getAgreementSize();

    void init(org.bouncycastle.crypto.CipherParameters cipherParameters);
}
