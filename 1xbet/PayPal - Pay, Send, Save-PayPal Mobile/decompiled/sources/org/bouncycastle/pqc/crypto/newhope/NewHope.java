package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
class NewHope {
    public static void getHighSpeedVideoFpsRanges(java.security.SecureRandom secureRandom, byte[] bArr, short[] sArr) {
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr2);
        org.bouncycastle.crypto.digests.SHA3Digest sHA3Digest = new org.bouncycastle.crypto.digests.SHA3Digest(256);
        sHA3Digest.update(bArr2, 0, 32);
        sHA3Digest.doFinal(bArr2, 0);
        short[] sArr2 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.Camera2StreamConfigurationMap(sArr2, bArr2);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr, bArr3, (byte) 0);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr);
        short[] sArr3 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr3, bArr3, (byte) 1);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr3);
        short[] sArr4 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighResolutionOutputSizeshNQ4ISI(sArr2, sArr, sArr4);
        short[] sArr5 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRangesFor(sArr4, sArr3, sArr5);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(bArr, sArr5);
        java.lang.System.arraycopy(bArr2, 0, bArr, 1792, 32);
    }

    public static void getHighSpeedVideoFpsRangesFor(byte[] bArr, short[] sArr, byte[] bArr2) {
        short[] sArr2 = new short[1024];
        short[] sArr3 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoSizes(sArr2, bArr2);
        for (int i = 0; i < 256; i++) {
            int i2 = i * 4;
            byte b = bArr2[i + 1792];
            int i3 = b & 255;
            sArr3[i2] = (short) (b & 3);
            sArr3[i2 + 1] = (short) ((i3 >>> 2) & 3);
            sArr3[i2 + 2] = (short) ((i3 >>> 4) & 3);
            sArr3[i2 + 3] = (short) (i3 >>> 6);
        }
        short[] sArr4 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighResolutionOutputSizeshNQ4ISI(sArr, sArr2, sArr4);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighResolutionOutputSizeshNQ4ISI(sArr4);
        org.bouncycastle.pqc.crypto.newhope.ErrorCorrection.Camera2StreamConfigurationMap(bArr, sArr4, sArr3);
        org.bouncycastle.crypto.digests.SHA3Digest sHA3Digest = new org.bouncycastle.crypto.digests.SHA3Digest(256);
        sHA3Digest.update(bArr, 0, 32);
        sHA3Digest.doFinal(bArr, 0);
    }

    public static void getHighSpeedVideoFpsRangesFor(java.security.SecureRandom secureRandom, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[1024];
        byte[] bArr4 = new byte[32];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoSizes(sArr, bArr3);
        java.lang.System.arraycopy(bArr3, 1792, bArr4, 0, 32);
        short[] sArr2 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.Camera2StreamConfigurationMap(sArr2, bArr4);
        byte[] bArr5 = new byte[32];
        secureRandom.nextBytes(bArr5);
        short[] sArr3 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr3, bArr5, (byte) 0);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr3);
        short[] sArr4 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr4, bArr5, (byte) 1);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr4);
        short[] sArr5 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighResolutionOutputSizeshNQ4ISI(sArr2, sArr3, sArr5);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRangesFor(sArr5, sArr4, sArr5);
        short[] sArr6 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighResolutionOutputSizeshNQ4ISI(sArr, sArr3, sArr6);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighResolutionOutputSizeshNQ4ISI(sArr6);
        short[] sArr7 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(sArr7, bArr5, (byte) 2);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRangesFor(sArr6, sArr7, sArr6);
        short[] sArr8 = new short[1024];
        org.bouncycastle.pqc.crypto.newhope.ErrorCorrection.getHighSpeedVideoFpsRangesFor(sArr8, sArr6, bArr5);
        org.bouncycastle.pqc.crypto.newhope.Poly.getHighSpeedVideoFpsRanges(bArr2, sArr5);
        for (int i = 0; i < 256; i++) {
            int i2 = i * 4;
            bArr2[i + 1792] = (byte) ((sArr8[i2 + 3] << 6) | sArr8[i2] | (sArr8[i2 + 1] << 2) | (sArr8[i2 + 2] << 4));
        }
        org.bouncycastle.pqc.crypto.newhope.ErrorCorrection.Camera2StreamConfigurationMap(bArr, sArr6, sArr8);
        org.bouncycastle.crypto.digests.SHA3Digest sHA3Digest = new org.bouncycastle.crypto.digests.SHA3Digest(256);
        sHA3Digest.update(bArr, 0, 32);
        sHA3Digest.doFinal(bArr, 0);
    }

    NewHope() {
    }
}
