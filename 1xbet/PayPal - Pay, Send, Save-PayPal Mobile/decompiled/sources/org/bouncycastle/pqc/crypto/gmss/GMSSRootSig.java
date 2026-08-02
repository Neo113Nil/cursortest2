package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSRootSig {
    private int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private long getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private long isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private int toString;
    private int unwrapAs;

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public boolean updateSign() {
        long j;
        for (int i = 0; i < this.getValidOutputFormatsForInputhNQ4ISI; i++) {
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 < this.getHighSpeedVideoSizesFor) {
                int i3 = this.toString;
                if (8 % i3 == 0) {
                    int i4 = this.unwrapAs;
                    if (i4 == 0) {
                        this.getOutputStallDurationlomOqCM = this.getHighSpeedVideoSizes.nextSeed(this.getOutputSizeshNQ4ISI);
                        int i5 = this.getOutputMinFrameDuration;
                        if (i5 < this.getInputFormats) {
                            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                            byte b = bArr[i5];
                            this.unwrapAs = this.getInputSizeshNQ4ISI & b;
                            bArr[i5] = (byte) (b >>> this.toString);
                        } else {
                            int i6 = this.getHighSpeedVideoFpsRanges;
                            this.unwrapAs = this.getInputSizeshNQ4ISI & i6;
                            this.getHighSpeedVideoFpsRanges = i6 >>> this.toString;
                        }
                    } else if (i4 > 0) {
                        org.bouncycastle.crypto.Digest digest = this.getOutputStallDuration;
                        byte[] bArr2 = this.getOutputStallDurationlomOqCM;
                        digest.update(bArr2, 0, bArr2.length);
                        byte[] bArr3 = new byte[this.getOutputStallDuration.getDigestSize()];
                        this.getOutputStallDurationlomOqCM = bArr3;
                        this.getOutputStallDuration.doFinal(bArr3, 0);
                        this.unwrapAs--;
                    }
                    if (this.unwrapAs == 0) {
                        byte[] bArr4 = this.getOutputStallDurationlomOqCM;
                        byte[] bArr5 = this.isOutputSupportedForhNQ4ISI;
                        int i7 = this.Camera2StreamConfigurationMap;
                        int i8 = this.getInputFormats;
                        java.lang.System.arraycopy(bArr4, 0, bArr5, i7 * i8, i8);
                        int i9 = this.Camera2StreamConfigurationMap + 1;
                        this.Camera2StreamConfigurationMap = i9;
                        if (i9 % (8 / this.toString) == 0) {
                            this.getOutputMinFrameDuration++;
                        }
                    }
                } else if (i3 < 8) {
                    int i10 = this.unwrapAs;
                    if (i10 == 0) {
                        if (i2 % 8 == 0) {
                            int i11 = this.getOutputMinFrameDuration;
                            int i12 = this.getInputFormats;
                            if (i11 < i12) {
                                this.getHighSpeedVideoFpsRangesFor = 0L;
                                if (i2 < ((i12 / i3) << 3)) {
                                    for (int i13 = 0; i13 < this.toString; i13++) {
                                        long j2 = this.getHighSpeedVideoFpsRangesFor;
                                        byte[] bArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        int i14 = this.getOutputMinFrameDuration;
                                        this.getHighSpeedVideoFpsRangesFor = j2 ^ ((bArr6[i14] & 255) << (i13 << 3));
                                        this.getOutputMinFrameDuration = i14 + 1;
                                    }
                                } else {
                                    for (int i15 = 0; i15 < this.getInputFormats % this.toString; i15++) {
                                        long j3 = this.getHighSpeedVideoFpsRangesFor;
                                        byte[] bArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        int i16 = this.getOutputMinFrameDuration;
                                        this.getHighSpeedVideoFpsRangesFor = j3 ^ ((bArr7[i16] & 255) << (i15 << 3));
                                        this.getOutputMinFrameDuration = i16 + 1;
                                    }
                                }
                            }
                        }
                        if (this.Camera2StreamConfigurationMap == this.getOutputMinFrameDurationlomOqCM) {
                            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges;
                        }
                        this.unwrapAs = (int) (this.getHighSpeedVideoFpsRangesFor & this.getInputSizeshNQ4ISI);
                        this.getOutputStallDurationlomOqCM = this.getHighSpeedVideoSizes.nextSeed(this.getOutputSizeshNQ4ISI);
                    } else if (i10 > 0) {
                        org.bouncycastle.crypto.Digest digest2 = this.getOutputStallDuration;
                        byte[] bArr8 = this.getOutputStallDurationlomOqCM;
                        digest2.update(bArr8, 0, bArr8.length);
                        byte[] bArr9 = new byte[this.getOutputStallDuration.getDigestSize()];
                        this.getOutputStallDurationlomOqCM = bArr9;
                        this.getOutputStallDuration.doFinal(bArr9, 0);
                        this.unwrapAs--;
                    }
                    if (this.unwrapAs == 0) {
                        byte[] bArr10 = this.getOutputStallDurationlomOqCM;
                        byte[] bArr11 = this.isOutputSupportedForhNQ4ISI;
                        int i17 = this.Camera2StreamConfigurationMap;
                        int i18 = this.getInputFormats;
                        java.lang.System.arraycopy(bArr10, 0, bArr11, i17 * i18, i18);
                        this.getHighSpeedVideoFpsRangesFor >>>= this.toString;
                        this.Camera2StreamConfigurationMap++;
                    }
                } else if (i3 < 57) {
                    long j4 = this.isOutputSupportedFor;
                    if (j4 == 0) {
                        this.getHighSpeedVideoFpsRangesFor = 0L;
                        this.getOutputMinFrameDuration = 0;
                        int i19 = this.getOutputSizes;
                        int i20 = i19 >>> 3;
                        int i21 = this.getInputFormats;
                        if (i20 < i21) {
                            int i22 = (i21 << 3) - i3;
                            int i23 = i3 + i19;
                            this.getOutputSizes = i23;
                            if (i19 <= i22) {
                                i21 = (i23 + 7) >>> 3;
                            }
                            while (true) {
                                j = this.getHighSpeedVideoFpsRangesFor;
                                if (i20 >= i21) {
                                    break;
                                }
                                byte b2 = this.getHighResolutionOutputSizeshNQ4ISI[i20];
                                int i24 = this.getOutputMinFrameDuration;
                                this.getHighSpeedVideoFpsRangesFor = j ^ ((b2 & 255) << (i24 << 3));
                                this.getOutputMinFrameDuration = i24 + 1;
                                i20++;
                            }
                            long j5 = j >>> (i19 % 8);
                            this.getHighSpeedVideoFpsRangesFor = j5;
                            this.isOutputSupportedFor = j5 & this.getInputSizeshNQ4ISI;
                        } else {
                            int i25 = this.getHighSpeedVideoFpsRanges;
                            this.isOutputSupportedFor = this.getInputSizeshNQ4ISI & i25;
                            this.getHighSpeedVideoFpsRanges = i25 >>> i3;
                        }
                        this.getOutputStallDurationlomOqCM = this.getHighSpeedVideoSizes.nextSeed(this.getOutputSizeshNQ4ISI);
                    } else if (j4 > 0) {
                        org.bouncycastle.crypto.Digest digest3 = this.getOutputStallDuration;
                        byte[] bArr12 = this.getOutputStallDurationlomOqCM;
                        digest3.update(bArr12, 0, bArr12.length);
                        byte[] bArr13 = new byte[this.getOutputStallDuration.getDigestSize()];
                        this.getOutputStallDurationlomOqCM = bArr13;
                        this.getOutputStallDuration.doFinal(bArr13, 0);
                        this.isOutputSupportedFor--;
                    }
                    if (this.isOutputSupportedFor == 0) {
                        byte[] bArr14 = this.getOutputStallDurationlomOqCM;
                        byte[] bArr15 = this.isOutputSupportedForhNQ4ISI;
                        int i26 = this.Camera2StreamConfigurationMap;
                        int i27 = this.getInputFormats;
                        java.lang.System.arraycopy(bArr14, 0, bArr15, i26 * i27, i27);
                        this.Camera2StreamConfigurationMap++;
                    }
                }
            }
            if (this.Camera2StreamConfigurationMap == this.getHighSpeedVideoSizesFor) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("  ");
        java.lang.String obj = sb.toString();
        int[] statInt = getStatInt();
        byte[][] statByte = getStatByte();
        for (int i = 0; i < 9; i++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(statInt[i]);
            sb2.append(" ");
            obj = sb2.toString();
        }
        for (int i2 = 0; i2 < 5; i2++) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append(new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(statByte[i2])));
            sb3.append(" ");
            obj = sb3.toString();
        }
        return obj;
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[this.getInputFormats];
        this.getOutputStallDuration.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.getOutputStallDuration.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr3;
        this.getOutputStallDuration.doFinal(bArr3, 0);
        int i3 = this.getInputFormats;
        byte[] bArr4 = new byte[i3];
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr4, 0, i3);
        int log = getLog((this.getOutputMinFrameDurationlomOqCM << this.toString) + 1);
        int i4 = this.toString;
        int i5 = 8;
        if (8 % i4 == 0) {
            int i6 = 8 / i4;
            i = 0;
            for (int i7 = 0; i7 < this.getInputFormats; i7++) {
                for (int i8 = 0; i8 < i6; i8++) {
                    byte b = bArr4[i7];
                    i += this.getInputSizeshNQ4ISI & b;
                    bArr4[i7] = (byte) (b >>> this.toString);
                }
            }
            int i9 = (this.getOutputMinFrameDurationlomOqCM << this.toString) - i;
            this.getHighSpeedVideoFpsRanges = i9;
            int i10 = 0;
            while (i10 < log) {
                i += this.getInputSizeshNQ4ISI & i9;
                int i11 = this.toString;
                i9 >>>= i11;
                i10 += i11;
            }
        } else if (i4 < 8) {
            int i12 = this.getInputFormats / i4;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < i12) {
                long j = 0;
                for (int i16 = 0; i16 < this.toString; i16++) {
                    j ^= (bArr4[i14] & 255) << (i16 << 3);
                    i14++;
                }
                int i17 = 0;
                while (i17 < i5) {
                    i15 += (int) (this.getInputSizeshNQ4ISI & j);
                    j >>>= this.toString;
                    i17++;
                    i12 = i12;
                    i5 = 8;
                }
                i13++;
                i5 = 8;
            }
            int i18 = this.getInputFormats % this.toString;
            long j2 = 0;
            for (int i19 = 0; i19 < i18; i19++) {
                j2 ^= (bArr4[i14] & 255) << (i19 << 3);
                i14++;
            }
            int i20 = 0;
            while (i20 < (i18 << 3)) {
                i15 += (int) (this.getInputSizeshNQ4ISI & j2);
                int i21 = this.toString;
                j2 >>>= i21;
                i20 += i21;
            }
            int i22 = (this.getOutputMinFrameDurationlomOqCM << this.toString) - i15;
            this.getHighSpeedVideoFpsRanges = i22;
            int i23 = 0;
            i = i15;
            while (i23 < log) {
                i += this.getInputSizeshNQ4ISI & i22;
                int i24 = this.toString;
                i22 >>>= i24;
                i23 += i24;
            }
        } else if (i4 < 57) {
            int i25 = 0;
            int i26 = 0;
            while (true) {
                i2 = this.getInputFormats;
                int i27 = this.toString;
                if (i25 > (i2 << 3) - i27) {
                    break;
                }
                int i28 = i27 + i25;
                int i29 = 0;
                long j3 = 0;
                for (int i30 = i25 >>> 3; i30 < ((i28 + 7) >>> 3); i30++) {
                    j3 ^= (bArr4[i30] & 255) << (i29 << 3);
                    i29++;
                }
                i26 = (int) (i26 + ((j3 >>> (i25 % 8)) & this.getInputSizeshNQ4ISI));
                i25 = i28;
            }
            int i31 = i25 >>> 3;
            if (i31 < i2) {
                int i32 = 0;
                long j4 = 0;
                while (i31 < this.getInputFormats) {
                    j4 ^= (bArr4[i31] & 255) << (i32 << 3);
                    i32++;
                    i31++;
                }
                i26 = (int) (i26 + ((j4 >>> (i25 % 8)) & this.getInputSizeshNQ4ISI));
            }
            int i33 = (this.getOutputMinFrameDurationlomOqCM << this.toString) - i26;
            this.getHighSpeedVideoFpsRanges = i33;
            int i34 = 0;
            i = i26;
            while (i34 < log) {
                i += this.getInputSizeshNQ4ISI & i33;
                int i35 = this.toString;
                i33 >>>= i35;
                i34 += i35;
            }
        } else {
            i = 0;
        }
        this.getHighSpeedVideoSizesFor = this.getOutputMinFrameDurationlomOqCM + ((int) java.lang.Math.ceil(log / this.toString));
        this.getValidOutputFormatsForInputhNQ4ISI = (int) java.lang.Math.ceil((r2 + i) / (1 << this.getOutputFormats));
        int i36 = this.getHighSpeedVideoSizesFor;
        int i37 = this.getInputFormats;
        this.isOutputSupportedForhNQ4ISI = new byte[i36 * i37];
        this.Camera2StreamConfigurationMap = 0;
        this.unwrapAs = 0;
        this.getOutputMinFrameDuration = 0;
        this.isOutputSupportedFor = 0L;
        this.getOutputSizes = 0;
        this.getOutputStallDurationlomOqCM = new byte[i37];
        byte[] bArr5 = new byte[i37];
        this.getOutputSizeshNQ4ISI = bArr5;
        java.lang.System.arraycopy(bArr, 0, bArr5, 0, i37);
    }

    public byte[] getStatLong() {
        long j = this.isOutputSupportedFor;
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        return new byte[]{(byte) (j & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 56) & 255), (byte) (j2 & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 24) & 255), (byte) ((j2 >> 32) & 255), (byte) ((j2 >> 40) & 255), (byte) ((j2 >> 48) & 255), (byte) (255 & (j2 >> 56))};
    }

    public int[] getStatInt() {
        return new int[]{this.Camera2StreamConfigurationMap, this.unwrapAs, this.getOutputMinFrameDuration, this.getOutputSizes, this.getValidOutputFormatsForInputhNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.toString, this.getHighSpeedVideoFpsRanges};
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 5, this.getInputFormats);
        bArr[0] = this.getOutputStallDurationlomOqCM;
        bArr[1] = this.getOutputSizeshNQ4ISI;
        bArr[2] = this.getHighResolutionOutputSizeshNQ4ISI;
        bArr[3] = this.isOutputSupportedForhNQ4ISI;
        bArr[4] = getStatLong();
        return bArr;
    }

    public byte[] getSig() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public GMSSRootSig(org.bouncycastle.crypto.Digest digest, byte[][] bArr, int[] iArr) {
        this.getOutputStallDuration = digest;
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom(digest);
        this.Camera2StreamConfigurationMap = iArr[0];
        this.unwrapAs = iArr[1];
        this.getOutputMinFrameDuration = iArr[2];
        this.getOutputSizes = iArr[3];
        this.getValidOutputFormatsForInputhNQ4ISI = iArr[4];
        this.getHighSpeedVideoSizesFor = iArr[5];
        this.getOutputFormats = iArr[6];
        this.toString = iArr[7];
        this.getHighSpeedVideoFpsRanges = iArr[8];
        this.getInputFormats = this.getOutputStallDuration.getDigestSize();
        int i = this.toString;
        this.getInputSizeshNQ4ISI = (1 << i) - 1;
        this.getOutputMinFrameDurationlomOqCM = (int) java.lang.Math.ceil((r10 << 3) / i);
        this.getOutputStallDurationlomOqCM = bArr[0];
        this.getOutputSizeshNQ4ISI = bArr[1];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr[2];
        this.isOutputSupportedForhNQ4ISI = bArr[3];
        byte[] bArr2 = bArr[4];
        this.isOutputSupportedFor = ((bArr2[1] & 255) << 8) | (bArr2[0] & 255) | ((bArr2[2] & 255) << 16) | ((bArr2[3] & 255) << 24) | ((bArr2[4] & 255) << 32) | ((bArr2[5] & 255) << 40) | ((bArr2[6] & 255) << 48) | ((bArr2[7] & 255) << 56);
        this.getHighSpeedVideoFpsRangesFor = (bArr2[8] & 255) | ((bArr2[9] & 255) << 8) | ((bArr2[10] & 255) << 16) | ((bArr2[11] & 255) << 24) | ((bArr2[12] & 255) << 32) | ((bArr2[13] & 255) << 40) | ((bArr2[14] & 255) << 48) | ((bArr2[15] & 255) << 56);
    }

    public GMSSRootSig(org.bouncycastle.crypto.Digest digest, int i, int i2) {
        this.getOutputStallDuration = digest;
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom(digest);
        this.getInputFormats = this.getOutputStallDuration.getDigestSize();
        this.toString = i;
        this.getOutputFormats = i2;
        this.getInputSizeshNQ4ISI = (1 << i) - 1;
        this.getOutputMinFrameDurationlomOqCM = (int) java.lang.Math.ceil((r3 << 3) / i);
    }
}
