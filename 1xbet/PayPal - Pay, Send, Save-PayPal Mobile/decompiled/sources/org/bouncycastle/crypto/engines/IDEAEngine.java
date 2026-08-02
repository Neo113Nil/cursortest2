package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class IDEAEngine implements org.bouncycastle.crypto.BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private int[] getHighResolutionOutputSizeshNQ4ISI = null;

    private static int getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 65537 - i2;
        } else if (i2 == 0) {
            i3 = 65537 - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 < i6 ? 1 : 0) + (i5 - i6);
        }
        return i3 & 65535;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    private static int[] getHighSpeedVideoSizes(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            java.lang.System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            int i3 = i2 * 2;
            iArr[i2] = ((bArr[i3] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i3 + 1] & 255);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i4 = i & 7;
            if (i4 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i4 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        int[] iArr;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to IDEA init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (z) {
            iArr = getHighSpeedVideoSizes(key);
        } else {
            int[] highSpeedVideoSizes = getHighSpeedVideoSizes(key);
            int[] iArr2 = new int[52];
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(highSpeedVideoSizes[0]);
            int i = 1;
            int i2 = (0 - highSpeedVideoSizes[1]) & 65535;
            int i3 = (0 - highSpeedVideoSizes[2]) & 65535;
            iArr2[51] = Camera2StreamConfigurationMap(highSpeedVideoSizes[3]);
            iArr2[50] = i3;
            iArr2[49] = i2;
            int i4 = 48;
            iArr2[48] = Camera2StreamConfigurationMap;
            int i5 = 4;
            while (i < 8) {
                int i6 = highSpeedVideoSizes[i5];
                iArr2[i4 - 1] = highSpeedVideoSizes[i5 + 1];
                iArr2[i4 - 2] = i6;
                int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highSpeedVideoSizes[i5 + 2]);
                int i7 = (0 - highSpeedVideoSizes[i5 + 3]) & 65535;
                int i8 = (0 - highSpeedVideoSizes[i5 + 4]) & 65535;
                iArr2[i4 - 3] = Camera2StreamConfigurationMap(highSpeedVideoSizes[i5 + 5]);
                iArr2[i4 - 4] = i7;
                iArr2[i4 - 5] = i8;
                i4 -= 6;
                iArr2[i4] = Camera2StreamConfigurationMap2;
                i++;
                i5 += 6;
            }
            int i9 = highSpeedVideoSizes[i5];
            iArr2[i4 - 1] = highSpeedVideoSizes[i5 + 1];
            iArr2[i4 - 2] = i9;
            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(highSpeedVideoSizes[i5 + 2]);
            int i10 = (0 - highSpeedVideoSizes[i5 + 3]) & 65535;
            int i11 = (0 - highSpeedVideoSizes[i5 + 4]) & 65535;
            iArr2[i4 - 3] = Camera2StreamConfigurationMap(highSpeedVideoSizes[i5 + 5]);
            iArr2[i4 - 4] = i11;
            iArr2[i4 - 5] = i10;
            iArr2[i4 - 6] = Camera2StreamConfigurationMap3;
            iArr = iArr2;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = iArr;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (iArr == null) {
            throw new java.lang.IllegalStateException("IDEA engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int i3 = ((bArr[i] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i + 1] & 255);
        int i4 = ((bArr[i + 2] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i + 3] & 255);
        int i5 = ((bArr[i + 4] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i + 5] & 255);
        int i6 = (65280 & (bArr[i + 6] << 8)) + (bArr[i + 7] & 255);
        int i7 = 0;
        int i8 = 0;
        while (i8 < 8) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i3, iArr[i7]);
            int i9 = (i4 + iArr[i7 + 1]) & 65535;
            int i10 = (i5 + iArr[i7 + 2]) & 65535;
            int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(i6, iArr[i7 + 3]);
            int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(i10 ^ highResolutionOutputSizeshNQ4ISI, iArr[i7 + 4]);
            int i11 = i7 + 6;
            int highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(((i9 ^ highResolutionOutputSizeshNQ4ISI2) + highResolutionOutputSizeshNQ4ISI3) & 65535, iArr[i7 + 5]);
            int i12 = 65535 & (highResolutionOutputSizeshNQ4ISI3 + highResolutionOutputSizeshNQ4ISI4);
            i3 = highResolutionOutputSizeshNQ4ISI ^ highResolutionOutputSizeshNQ4ISI4;
            i6 = highResolutionOutputSizeshNQ4ISI2 ^ i12;
            i8++;
            int i13 = highResolutionOutputSizeshNQ4ISI4 ^ i10;
            i5 = i9 ^ i12;
            i4 = i13;
            i7 = i11;
        }
        int highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(i3, iArr[i7]);
        bArr2[i2] = (byte) (highResolutionOutputSizeshNQ4ISI5 >>> 8);
        bArr2[i2 + 1] = (byte) highResolutionOutputSizeshNQ4ISI5;
        int i14 = i5 + iArr[i7 + 1];
        bArr2[i2 + 2] = (byte) (i14 >>> 8);
        bArr2[i2 + 3] = (byte) i14;
        int i15 = i4 + iArr[i7 + 2];
        bArr2[i2 + 4] = (byte) (i15 >>> 8);
        bArr2[i2 + 5] = (byte) i15;
        int highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(i6, iArr[i7 + 3]);
        bArr2[i2 + 6] = (byte) (highResolutionOutputSizeshNQ4ISI6 >>> 8);
        bArr2[i2 + 7] = (byte) highResolutionOutputSizeshNQ4ISI6;
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "IDEA";
    }

    private static int Camera2StreamConfigurationMap(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = 65537 / i;
        int i3 = 65537 % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = (i4 + (i5 * i2)) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = (i2 + (i6 * i4)) & 65535;
        }
        return (1 - i2) & 65535;
    }
}
