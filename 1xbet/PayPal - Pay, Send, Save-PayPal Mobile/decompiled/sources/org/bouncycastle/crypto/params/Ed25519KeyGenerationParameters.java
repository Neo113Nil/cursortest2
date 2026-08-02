package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class Ed25519KeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    public Ed25519KeyGenerationParameters(java.security.SecureRandom secureRandom) {
        super(secureRandom, 256);
    }
}
