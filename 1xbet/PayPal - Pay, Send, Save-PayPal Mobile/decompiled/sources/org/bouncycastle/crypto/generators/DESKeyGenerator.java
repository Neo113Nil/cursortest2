package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class DESKeyGenerator extends org.bouncycastle.crypto.CipherKeyGenerator {
    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        super.init(keyGenerationParameters);
        if (this.strength == 0 || this.strength == 7) {
            this.strength = 8;
        } else if (this.strength != 8) {
            throw new java.lang.IllegalArgumentException("DES key must be 64 bits long.");
        }
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        byte[] bArr = new byte[8];
        do {
            this.random.nextBytes(bArr);
            org.bouncycastle.crypto.params.DESParameters.setOddParity(bArr);
        } while (org.bouncycastle.crypto.params.DESParameters.isWeakKey(bArr, 0));
        return bArr;
    }
}
