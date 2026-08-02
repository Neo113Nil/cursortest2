package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public class CipherKeyGenerator {
    protected java.security.SecureRandom random;
    protected int strength;

    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.strength = (keyGenerationParameters.getStrength() + 7) / 8;
    }

    public byte[] generateKey() {
        byte[] bArr = new byte[this.strength];
        this.random.nextBytes(bArr);
        return bArr;
    }
}
