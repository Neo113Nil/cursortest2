package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class Poly1305KeyGenerator extends org.bouncycastle.crypto.CipherKeyGenerator {
    public static void checkKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        if ((bArr[3] & com.visa.cbp.getEncExpo.onUnminimized) != 0) {
            throw new java.lang.IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
        if ((bArr[7] & com.visa.cbp.getEncExpo.onUnminimized) != 0) {
            throw new java.lang.IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
        if ((bArr[11] & com.visa.cbp.getEncExpo.onUnminimized) != 0) {
            throw new java.lang.IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
        if ((bArr[15] & com.visa.cbp.getEncExpo.onUnminimized) != 0) {
            throw new java.lang.IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
        if ((bArr[4] & 3) != 0) {
            throw new java.lang.IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
        if ((bArr[8] & 3) != 0) {
            throw new java.lang.IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
        if ((bArr[12] & 3) != 0) {
            throw new java.lang.IllegalArgumentException("Invalid format for r portion of Poly1305 key.");
        }
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        super.init(new org.bouncycastle.crypto.KeyGenerationParameters(keyGenerationParameters.getRandom(), 256));
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        byte[] generateKey = super.generateKey();
        clamp(generateKey);
        return generateKey;
    }

    public static void clamp(byte[] bArr) {
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        bArr[3] = (byte) (bArr[3] & com.google.common.base.Ascii.SI);
        bArr[7] = (byte) (bArr[7] & com.google.common.base.Ascii.SI);
        bArr[11] = (byte) (bArr[11] & com.google.common.base.Ascii.SI);
        bArr[15] = (byte) (bArr[15] & com.google.common.base.Ascii.SI);
        bArr[4] = (byte) (bArr[4] & (-4));
        bArr[8] = (byte) (bArr[8] & (-4));
        bArr[12] = (byte) (bArr[12] & (-4));
    }
}
