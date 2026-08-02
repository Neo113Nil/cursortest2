package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class DESedeKeyGenerator extends org.bouncycastle.crypto.generators.DESKeyGenerator {
    @Override // org.bouncycastle.crypto.generators.DESKeyGenerator, org.bouncycastle.crypto.CipherKeyGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.strength = (keyGenerationParameters.getStrength() + 7) / 8;
        if (this.strength == 0 || this.strength == 21) {
            this.strength = 24;
        } else if (this.strength == 14) {
            this.strength = 16;
        } else if (this.strength != 24 && this.strength != 16) {
            throw new java.lang.IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }

    @Override // org.bouncycastle.crypto.generators.DESKeyGenerator, org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        int i = this.strength;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            this.random.nextBytes(bArr);
            org.bouncycastle.crypto.params.DESedeParameters.setOddParity(bArr);
            i2++;
            if (i2 >= 20 || (!org.bouncycastle.crypto.params.DESedeParameters.isWeakKey(bArr, 0, i) && org.bouncycastle.crypto.params.DESedeParameters.isRealEDEKey(bArr, 0))) {
                break;
            }
        }
        if (org.bouncycastle.crypto.params.DESedeParameters.isWeakKey(bArr, 0, i) || !org.bouncycastle.crypto.params.DESedeParameters.isRealEDEKey(bArr, 0)) {
            throw new java.lang.IllegalStateException("Unable to generate DES-EDE key");
        }
        return bArr;
    }
}
