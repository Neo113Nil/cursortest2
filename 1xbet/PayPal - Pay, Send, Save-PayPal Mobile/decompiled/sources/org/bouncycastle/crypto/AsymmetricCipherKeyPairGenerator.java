package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public interface AsymmetricCipherKeyPairGenerator {
    org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair();

    void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters);
}
