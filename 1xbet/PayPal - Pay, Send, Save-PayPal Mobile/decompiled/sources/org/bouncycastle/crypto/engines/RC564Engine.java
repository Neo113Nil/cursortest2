package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RC564Engine implements org.bouncycastle.crypto.BlockCipher {
    private boolean getHighSpeedVideoFpsRanges;
    private int Camera2StreamConfigurationMap = 12;
    private long[] getHighSpeedVideoSizes = null;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        long[] jArr;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.RC5Parameters)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to RC564 init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.crypto.params.RC5Parameters rC5Parameters = (org.bouncycastle.crypto.params.RC5Parameters) cipherParameters;
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = rC5Parameters.getRounds();
        byte[] key = rC5Parameters.getKey();
        int length = (key.length + 7) / 8;
        long[] jArr2 = new long[length];
        int i = 0;
        for (int i2 = 0; i2 != key.length; i2++) {
            int i3 = i2 / 8;
            jArr2[i3] = jArr2[i3] + ((key[i2] & 255) << ((i2 % 8) * 8));
        }
        long[] jArr3 = new long[(this.Camera2StreamConfigurationMap + 1) * 2];
        this.getHighSpeedVideoSizes = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i4 = 1;
        while (true) {
            jArr = this.getHighSpeedVideoSizes;
            if (i4 >= jArr.length) {
                break;
            }
            jArr[i4] = jArr[i4 - 1] - 7046029254386353131L;
            i4++;
        }
        char c = 3;
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        int i5 = 0;
        long j = 0;
        long j2 = 0;
        int i6 = 0;
        while (i < length2) {
            long[] jArr4 = this.getHighSpeedVideoSizes;
            long j3 = jArr4[i5] + j2 + j;
            j2 = (j3 >>> 61) | (j3 << c);
            jArr4[i5] = j2;
            long j4 = jArr2[i6] + j2 + j;
            long j5 = (j + j2) & 63;
            j = (j4 >>> ((int) (64 - j5))) | (j4 << ((int) j5));
            jArr2[i6] = j;
            i5 = (i5 + 1) % jArr4.length;
            i6 = (i6 + 1) % length;
            i++;
            c = 3;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 8;
        if (!this.getHighSpeedVideoFpsRanges) {
            long highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, i);
            long highSpeedVideoSizes2 = getHighSpeedVideoSizes(bArr, i + 8);
            for (int i4 = this.Camera2StreamConfigurationMap; i4 > 0; i4--) {
                long[] jArr = this.getHighSpeedVideoSizes;
                int i5 = i4 * 2;
                long j = highSpeedVideoSizes2 - jArr[i5 + 1];
                long j2 = highSpeedVideoSizes & 63;
                highSpeedVideoSizes2 = ((j >>> ((int) j2)) | (j << ((int) (64 - j2)))) ^ highSpeedVideoSizes;
                long j3 = highSpeedVideoSizes - jArr[i5];
                long j4 = highSpeedVideoSizes2 & 63;
                highSpeedVideoSizes = ((j3 >>> ((int) j4)) | (j3 << ((int) (64 - j4)))) ^ highSpeedVideoSizes2;
            }
            long j5 = highSpeedVideoSizes - this.getHighSpeedVideoSizes[0];
            for (int i6 = 0; i6 < 8; i6++) {
                bArr2[i6 + i2] = (byte) j5;
                j5 >>>= 8;
            }
            long j6 = highSpeedVideoSizes2 - this.getHighSpeedVideoSizes[1];
            int i7 = i2 + 8;
            for (int i8 = 0; i8 < 8; i8++) {
                bArr2[i8 + i7] = (byte) j6;
                j6 >>>= 8;
            }
            return 16;
        }
        long highSpeedVideoSizes3 = getHighSpeedVideoSizes(bArr, i) + this.getHighSpeedVideoSizes[0];
        long highSpeedVideoSizes4 = getHighSpeedVideoSizes(bArr, i + 8) + this.getHighSpeedVideoSizes[1];
        int i9 = 1;
        while (i9 <= this.Camera2StreamConfigurationMap) {
            long j7 = highSpeedVideoSizes3 ^ highSpeedVideoSizes4;
            long j8 = highSpeedVideoSizes4 & 63;
            long j9 = (j7 << ((int) j8)) | (j7 >>> ((int) (64 - j8)));
            long[] jArr2 = this.getHighSpeedVideoSizes;
            int i10 = i9 * 2;
            highSpeedVideoSizes3 = j9 + jArr2[i10];
            long j10 = highSpeedVideoSizes4 ^ highSpeedVideoSizes3;
            long j11 = highSpeedVideoSizes3 & 63;
            highSpeedVideoSizes4 = ((j10 << ((int) j11)) | (j10 >>> ((int) (64 - j11)))) + jArr2[i10 + 1];
            i9++;
            i3 = 8;
        }
        int i11 = i3;
        for (int i12 = 0; i12 < i11; i12++) {
            bArr2[i12 + i2] = (byte) highSpeedVideoSizes3;
            highSpeedVideoSizes3 >>>= i11;
        }
        int i13 = i2 + 8;
        for (int i14 = 0; i14 < i11; i14++) {
            bArr2[i14 + i13] = (byte) highSpeedVideoSizes4;
            highSpeedVideoSizes4 >>>= i11;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "RC5-64";
    }

    private static long getHighSpeedVideoSizes(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + (bArr[i2 + i] & 255);
        }
        return j;
    }
}
