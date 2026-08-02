package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class Shacal2Engine implements org.bouncycastle.crypto.BlockCipher {
    private static final int[] Camera2StreamConfigurationMap = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private boolean getHighSpeedVideoFpsRangesFor = false;
    private int[] getHighResolutionOutputSizeshNQ4ISI = null;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException("Shacal2 not initialised");
        }
        if (i + 32 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 32 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        char c = 5;
        char c2 = 0;
        if (this.getHighSpeedVideoFpsRangesFor) {
            int[] iArr = new int[8];
            Camera2StreamConfigurationMap(bArr, iArr, i, 0);
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = iArr[4];
                int i5 = iArr[5];
                int i6 = iArr[6];
                int i7 = ((((i4 >>> 6) | (i4 << (-6))) ^ ((i4 >>> 11) | (i4 << (-11)))) ^ ((i4 >>> 25) | (i4 << (-25)))) + ((i4 & i5) ^ ((~i4) & i6)) + iArr[7] + Camera2StreamConfigurationMap[i3] + this.getHighResolutionOutputSizeshNQ4ISI[i3];
                iArr[7] = i6;
                iArr[6] = i5;
                iArr[5] = i4;
                iArr[4] = iArr[3] + i7;
                int i8 = iArr[2];
                iArr[3] = i8;
                int i9 = iArr[1];
                iArr[2] = i9;
                int i10 = iArr[0];
                iArr[1] = i10;
                iArr[0] = i7 + ((((i10 >>> 2) | (i10 << (-2))) ^ ((i10 >>> 13) | (i10 << (-13)))) ^ ((i10 >>> 22) | (i10 << (-22)))) + ((i8 & i9) ^ ((i10 & i8) ^ (i10 & i9)));
            }
            getHighSpeedVideoFpsRangesFor(iArr, bArr2, i2);
            return 32;
        }
        int[] iArr2 = new int[8];
        Camera2StreamConfigurationMap(bArr, iArr2, i, 0);
        int i11 = 63;
        while (i11 >= 0) {
            int i12 = iArr2[c2];
            int i13 = iArr2[1];
            int i14 = iArr2[2];
            int i15 = iArr2[3];
            int i16 = (i12 - ((((i13 >>> 2) | (i13 << (-2))) ^ ((i13 >>> 13) | (i13 << (-13)))) ^ ((i13 >>> 22) | (i13 << (-22))))) - (((i13 & i14) ^ (i13 & i15)) ^ (i14 & i15));
            iArr2[0] = i13;
            iArr2[1] = i14;
            iArr2[2] = i15;
            iArr2[3] = iArr2[4] - i16;
            int i17 = iArr2[c];
            iArr2[4] = i17;
            int i18 = iArr2[6];
            iArr2[c] = i18;
            int i19 = iArr2[7];
            iArr2[6] = i19;
            iArr2[7] = (((i16 - Camera2StreamConfigurationMap[i11]) - this.getHighResolutionOutputSizeshNQ4ISI[i11]) - ((((i17 >>> 6) | (i17 << (-6))) ^ ((i17 >>> 11) | (i17 << (-11)))) ^ ((i17 >>> 25) | (i17 << (-25))))) - (((~i17) & i19) ^ (i17 & i18));
            i11--;
            c2 = 0;
            c = 5;
        }
        getHighSpeedVideoFpsRangesFor(iArr2, bArr2, i2);
        return 32;
    }

    public void setKey(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i = 0;
                int i2 = 0;
                while (i2 < bArr.length / 4) {
                    iArr[i2] = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
                    i2++;
                    i += 4;
                }
                for (int i3 = 16; i3 < 64; i3++) {
                    int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = iArr2[i3 - 2];
                    int i5 = iArr2[i3 - 7];
                    int i6 = iArr2[i3 - 15];
                    iArr2[i3] = ((((i4 << (-19)) | (i4 >>> 19)) ^ ((i4 >>> 17) | (i4 << (-17)))) ^ (i4 >>> 10)) + i5 + ((i6 >>> 3) ^ (((i6 << (-18)) | (i6 >>> 18)) ^ ((i6 >>> 7) | (i6 << (-7))))) + iArr2[i3 - 16];
                }
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = new int[64];
        setKey(((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "Shacal2";
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            bArr[i] = (byte) (i3 >>> 24);
            bArr[i + 1] = (byte) (i3 >>> 16);
            bArr[i + 2] = (byte) (i3 >>> 8);
            bArr[i + 3] = (byte) i3;
            i2++;
            i += 4;
        }
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, int[] iArr, int i, int i2) {
        while (i2 < 8) {
            int i3 = bArr[i];
            int i4 = (i3 & 255) << 24;
            iArr[i2] = (bArr[i + 3] & 255) | ((bArr[i + 2] & 255) << 8) | i4 | ((bArr[i + 1] & 255) << 16);
            i2++;
            i += 4;
        }
    }
}
