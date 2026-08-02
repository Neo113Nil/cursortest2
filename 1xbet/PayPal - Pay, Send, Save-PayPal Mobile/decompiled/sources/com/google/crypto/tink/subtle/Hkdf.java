package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class Hkdf {
    public static byte[] computeHkdf(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws java.security.GeneralSecurityException {
        javax.crypto.Mac engineFactory = com.google.crypto.tink.subtle.EngineFactory.MAC.getInstance(str);
        if (i > engineFactory.getMacLength() * 255) {
            throw new java.security.GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            engineFactory.init(new javax.crypto.spec.SecretKeySpec(new byte[engineFactory.getMacLength()], str));
        } else {
            engineFactory.init(new javax.crypto.spec.SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        engineFactory.init(new javax.crypto.spec.SecretKeySpec(engineFactory.doFinal(bArr), str));
        byte[] bArr5 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            engineFactory.update(bArr5);
            engineFactory.update(bArr3);
            engineFactory.update((byte) i2);
            bArr5 = engineFactory.doFinal();
            if (bArr5.length + i3 < i) {
                java.lang.System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
            } else {
                java.lang.System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                return bArr4;
            }
        }
    }

    public static byte[] computeEciesHkdfSymmetricKey(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3, byte[] bArr4, int i) throws java.security.GeneralSecurityException {
        return computeHkdf(str, com.google.crypto.tink.subtle.Bytes.concat(bArr, bArr2), bArr3, bArr4, i);
    }

    private Hkdf() {
    }
}
