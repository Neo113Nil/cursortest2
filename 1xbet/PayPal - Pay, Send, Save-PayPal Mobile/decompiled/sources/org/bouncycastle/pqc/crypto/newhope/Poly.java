package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
class Poly {
    static void getHighSpeedVideoFpsRanges(byte[] bArr, short[] sArr) {
        for (int i = 0; i < 256; i++) {
            int i2 = i * 4;
            short Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.newhope.Reduce.Camera2StreamConfigurationMap(sArr[i2]);
            int i3 = Camera2StreamConfigurationMap - 12289;
            short s = (short) (((Camera2StreamConfigurationMap ^ i3) & (i3 >> 31)) ^ i3);
            short Camera2StreamConfigurationMap2 = org.bouncycastle.pqc.crypto.newhope.Reduce.Camera2StreamConfigurationMap(sArr[i2 + 1]);
            int i4 = Camera2StreamConfigurationMap2 - 12289;
            short s2 = (short) (((Camera2StreamConfigurationMap2 ^ i4) & (i4 >> 31)) ^ i4);
            short Camera2StreamConfigurationMap3 = org.bouncycastle.pqc.crypto.newhope.Reduce.Camera2StreamConfigurationMap(sArr[i2 + 2]);
            int i5 = Camera2StreamConfigurationMap3 - 12289;
            short s3 = (short) (((Camera2StreamConfigurationMap3 ^ i5) & (i5 >> 31)) ^ i5);
            short Camera2StreamConfigurationMap4 = org.bouncycastle.pqc.crypto.newhope.Reduce.Camera2StreamConfigurationMap(sArr[i2 + 3]);
            int i6 = Camera2StreamConfigurationMap4 - 12289;
            short s4 = (short) (((Camera2StreamConfigurationMap4 ^ i6) & (i6 >> 31)) ^ i6);
            int i7 = i * 7;
            bArr[i7] = (byte) s;
            bArr[i7 + 1] = (byte) ((s >> 8) | (s2 << 6));
            bArr[i7 + 2] = (byte) (s2 >> 2);
            bArr[i7 + 3] = (byte) ((s2 >> 10) | (s3 << 4));
            bArr[i7 + 4] = (byte) (s3 >> 4);
            bArr[i7 + 5] = (byte) ((s3 >> 12) | (s4 << 2));
            bArr[i7 + 6] = (byte) (s4 >> 6);
        }
    }

    static void Camera2StreamConfigurationMap(short[] sArr, byte[] bArr) {
        org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i2 = 0; i2 < 256; i2 += 2) {
                int i3 = (bArr2[i2] & 255) | ((bArr2[i2 + 1] & 255) << 8);
                if (i3 < 61445) {
                    int i4 = i + 1;
                    sArr[i] = (short) i3;
                    if (i4 == 1024) {
                        return;
                    } else {
                        i = i4;
                    }
                }
            }
        }
    }

    static void getHighSpeedVideoFpsRanges(short[] sArr) {
        org.bouncycastle.pqc.crypto.newhope.NTT.getHighSpeedVideoFpsRangesFor(sArr, org.bouncycastle.pqc.crypto.newhope.Precomp.Camera2StreamConfigurationMap);
        org.bouncycastle.pqc.crypto.newhope.NTT.getHighResolutionOutputSizeshNQ4ISI(sArr, org.bouncycastle.pqc.crypto.newhope.Precomp.getHighSpeedVideoSizes);
    }

    static void getHighResolutionOutputSizeshNQ4ISI(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 1024; i++) {
            sArr3[i] = org.bouncycastle.pqc.crypto.newhope.Reduce.getHighResolutionOutputSizeshNQ4ISI((sArr[i] & kotlin.UShort.MAX_VALUE) * (65535 & org.bouncycastle.pqc.crypto.newhope.Reduce.getHighResolutionOutputSizeshNQ4ISI((sArr2[i] & kotlin.UShort.MAX_VALUE) * 3186)));
        }
    }

    static void getHighSpeedVideoFpsRanges(short[] sArr, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b;
        byte[] bArr3 = new byte[4096];
        org.bouncycastle.pqc.crypto.newhope.ChaCha20.getHighResolutionOutputSizeshNQ4ISI(bArr, bArr2, bArr3, 4096);
        for (int i = 0; i < 1024; i++) {
            int bigEndianToInt = org.bouncycastle.util.Pack.bigEndianToInt(bArr3, i * 4);
            int i2 = 0;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 += (bigEndianToInt >> i3) & android.R.attr.cacheColorHint;
            }
            sArr[i] = (short) (((((i2 >>> 24) + i2) & 255) + 12289) - (((i2 >>> 16) + (i2 >>> 8)) & 255));
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(short[] sArr) {
        org.bouncycastle.pqc.crypto.newhope.NTT.getHighSpeedVideoFpsRangesFor(sArr);
        org.bouncycastle.pqc.crypto.newhope.NTT.getHighResolutionOutputSizeshNQ4ISI(sArr, org.bouncycastle.pqc.crypto.newhope.Precomp.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.pqc.crypto.newhope.NTT.getHighSpeedVideoFpsRangesFor(sArr, org.bouncycastle.pqc.crypto.newhope.Precomp.getHighSpeedVideoFpsRanges);
    }

    static void getHighSpeedVideoSizes(short[] sArr, byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            int i2 = i * 7;
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 1];
            byte b3 = bArr[i2 + 2];
            byte b4 = bArr[i2 + 3];
            byte b5 = bArr[i2 + 4];
            byte b6 = bArr[i2 + 5];
            byte b7 = bArr[i2 + 6];
            int i3 = i * 4;
            sArr[i3] = (short) ((b & 255) | ((b2 & 63) << 8));
            sArr[i3 + 1] = (short) (((b2 & 255) >>> 6) | ((b3 & 255) << 2) | ((b4 & com.google.common.base.Ascii.SI) << 10));
            sArr[i3 + 2] = (short) (((b4 & 255) >>> 4) | ((b5 & 255) << 4) | ((b6 & 3) << 12));
            sArr[i3 + 3] = (short) (((b7 & 255) << 6) | ((b6 & 255) >>> 2));
        }
    }

    static void getHighSpeedVideoFpsRangesFor(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 1024; i++) {
            sArr3[i] = org.bouncycastle.pqc.crypto.newhope.Reduce.Camera2StreamConfigurationMap((short) (sArr[i] + sArr2[i]));
        }
    }

    Poly() {
    }
}
