package org.bouncycastle.pqc.crypto.gmss.util;

/* loaded from: classes17.dex */
public class WinternitzOTSVerify {
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public int getSignatureLength() {
        int digestSize = this.getHighSpeedVideoFpsRanges.getDigestSize();
        int i = this.Camera2StreamConfigurationMap;
        int i2 = ((digestSize << 3) + (i - 1)) / i;
        int log = getLog((i2 << i) + 1);
        return digestSize * (i2 + (((log + r3) - 1) / this.Camera2StreamConfigurationMap));
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.getHighSpeedVideoSizes;
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        this.getHighSpeedVideoFpsRanges.update(bArr, 0, bArr.length);
        this.getHighSpeedVideoFpsRanges.doFinal(bArr3, 0);
        int i7 = this.getHighSpeedVideoSizes;
        int i8 = this.Camera2StreamConfigurationMap;
        int i9 = ((i7 << 3) + (i8 - 1)) / i8;
        int log = getLog((i9 << i8) + 1);
        int i10 = this.Camera2StreamConfigurationMap;
        int i11 = this.getHighSpeedVideoSizes;
        int i12 = i11 * ((((log + i10) - 1) / i10) + i9);
        if (i12 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i12];
        int i13 = 8;
        if (8 % i10 == 0) {
            int i14 = 8 / i10;
            int i15 = (1 << i10) - 1;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i5) {
                int i19 = i16;
                int i20 = i17;
                int i21 = 0;
                while (i21 < i14) {
                    int i22 = bArr3[i18] & i15;
                    int i23 = i20 * this.getHighSpeedVideoSizes;
                    int i24 = i18;
                    getHighSpeedVideoFpsRangesFor(bArr2, i23, i15 - i22, bArr4, i23);
                    bArr3[i24] = (byte) (bArr3[i24] >>> this.Camera2StreamConfigurationMap);
                    i20++;
                    i21++;
                    i19 += i22;
                    i18 = i24;
                    i14 = i14;
                }
                i18++;
                i16 = i19;
                i17 = i20;
            }
            int i25 = i17;
            int i26 = (i9 << this.Camera2StreamConfigurationMap) - i16;
            int i27 = 0;
            while (i27 < log) {
                int i28 = i25 * this.getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor(bArr2, i28, i15 - (i26 & i15), bArr4, i28);
                int i29 = this.Camera2StreamConfigurationMap;
                i26 >>>= i29;
                i25++;
                i27 += i29;
            }
            i4 = 0;
            i = i12;
        } else {
            long j = 0;
            if (i10 < 8) {
                int i30 = i11 / i10;
                int i31 = (1 << i10) - 1;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                while (i35 < i30) {
                    int i36 = i32;
                    int i37 = i6;
                    long j2 = 0;
                    while (i37 < this.Camera2StreamConfigurationMap) {
                        j2 ^= (bArr3[i36] & 255) << (i37 << 3);
                        i36++;
                        i37++;
                        log = log;
                    }
                    int i38 = log;
                    int i39 = i33;
                    int i40 = i34;
                    int i41 = 0;
                    while (i41 < i13) {
                        int i42 = (int) (j2 & i31);
                        int i43 = i40 * this.getHighSpeedVideoSizes;
                        getHighSpeedVideoFpsRangesFor(bArr2, i43, i31 - i42, bArr4, i43);
                        j2 >>>= this.Camera2StreamConfigurationMap;
                        i40++;
                        i41++;
                        i39 += i42;
                        i31 = i31;
                        i30 = i30;
                        i35 = i35;
                        i13 = i13;
                    }
                    i35++;
                    i33 = i39;
                    i34 = i40;
                    i32 = i36;
                    log = i38;
                    i30 = i30;
                    i6 = 0;
                }
                int i44 = i31;
                int i45 = log;
                int i46 = this.getHighSpeedVideoSizes % this.Camera2StreamConfigurationMap;
                for (int i47 = 0; i47 < i46; i47++) {
                    j ^= (bArr3[i32] & 255) << (i47 << 3);
                    i32++;
                }
                int i48 = i33;
                int i49 = i34;
                int i50 = 0;
                while (i50 < (i46 << 3)) {
                    int i51 = (int) (j & i44);
                    int i52 = i49 * this.getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRangesFor(bArr2, i52, i44 - i51, bArr4, i52);
                    int i53 = this.Camera2StreamConfigurationMap;
                    j >>>= i53;
                    i49++;
                    i50 += i53;
                    i48 += i51;
                }
                int i54 = (i9 << this.Camera2StreamConfigurationMap) - i48;
                int i55 = 0;
                while (i55 < i45) {
                    int i56 = i49 * this.getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRangesFor(bArr2, i56, i44 - (i54 & i44), bArr4, i56);
                    int i57 = this.Camera2StreamConfigurationMap;
                    i54 >>>= i57;
                    i49++;
                    i55 += i57;
                }
            } else if (i10 < 57) {
                int i58 = (i11 << 3) - i10;
                int i59 = (1 << i10) - 1;
                byte[] bArr5 = new byte[i11];
                int i60 = 0;
                int i61 = 0;
                int i62 = 0;
                while (i60 <= i58) {
                    int i63 = this.Camera2StreamConfigurationMap + i60;
                    int i64 = i60 >>> 3;
                    long j3 = 0;
                    int i65 = 0;
                    while (true) {
                        i3 = i58;
                        if (i64 >= ((i63 + 7) >>> 3)) {
                            break;
                        }
                        j3 ^= (bArr3[i64] & 255) << (i65 << 3);
                        i65++;
                        i64++;
                        i12 = i12;
                        i58 = i3;
                        log = log;
                    }
                    int i66 = log;
                    int i67 = i12;
                    long j4 = i59;
                    long j5 = (j3 >>> (i60 % 8)) & j4;
                    int i68 = i9;
                    i62 = (int) (i62 + j5);
                    int i69 = this.getHighSpeedVideoSizes;
                    java.lang.System.arraycopy(bArr2, i61 * i69, bArr5, 0, i69);
                    for (long j6 = j5; j6 < j4; j6++) {
                        this.getHighSpeedVideoFpsRanges.update(bArr5, 0, i11);
                        this.getHighSpeedVideoFpsRanges.doFinal(bArr5, 0);
                    }
                    int i70 = this.getHighSpeedVideoSizes;
                    java.lang.System.arraycopy(bArr5, 0, bArr4, i61 * i70, i70);
                    i61++;
                    i9 = i68;
                    i60 = i63;
                    i12 = i67;
                    i58 = i3;
                    log = i66;
                }
                int i71 = log;
                i = i12;
                int i72 = i9;
                int i73 = i60 >>> 3;
                if (i73 < this.getHighSpeedVideoSizes) {
                    int i74 = 0;
                    while (true) {
                        i2 = this.getHighSpeedVideoSizes;
                        if (i73 >= i2) {
                            break;
                        }
                        j ^= (bArr3[i73] & 255) << (i74 << 3);
                        i74++;
                        i73++;
                    }
                    long j7 = i59;
                    long j8 = (j >>> (i60 % 8)) & j7;
                    i62 = (int) (i62 + j8);
                    java.lang.System.arraycopy(bArr2, i61 * i2, bArr5, 0, i2);
                    while (j8 < j7) {
                        this.getHighSpeedVideoFpsRanges.update(bArr5, 0, i11);
                        this.getHighSpeedVideoFpsRanges.doFinal(bArr5, 0);
                        j8++;
                    }
                    int i75 = this.getHighSpeedVideoSizes;
                    java.lang.System.arraycopy(bArr5, 0, bArr4, i61 * i75, i75);
                    i61++;
                }
                int i76 = (i72 << this.Camera2StreamConfigurationMap) - i62;
                int i77 = 0;
                while (i77 < i71) {
                    int i78 = this.getHighSpeedVideoSizes;
                    java.lang.System.arraycopy(bArr2, i61 * i78, bArr5, 0, i78);
                    for (long j9 = i76 & i59; j9 < i59; j9++) {
                        this.getHighSpeedVideoFpsRanges.update(bArr5, 0, i11);
                        this.getHighSpeedVideoFpsRanges.doFinal(bArr5, 0);
                    }
                    int i79 = this.getHighSpeedVideoSizes;
                    java.lang.System.arraycopy(bArr5, 0, bArr4, i61 * i79, i79);
                    int i80 = this.Camera2StreamConfigurationMap;
                    i76 >>>= i80;
                    i61++;
                    i77 += i80;
                }
                i4 = 0;
            }
            i = i12;
            i4 = 0;
        }
        this.getHighSpeedVideoFpsRanges.update(bArr4, i4, i);
        byte[] bArr6 = new byte[this.getHighSpeedVideoSizes];
        this.getHighSpeedVideoFpsRanges.doFinal(bArr6, i4);
        return bArr6;
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 <= 0) {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, this.getHighSpeedVideoSizes);
            return;
        }
        this.getHighSpeedVideoFpsRanges.update(bArr, i, this.getHighSpeedVideoSizes);
        while (true) {
            this.getHighSpeedVideoFpsRanges.doFinal(bArr2, i3);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                this.getHighSpeedVideoFpsRanges.update(bArr2, i3, this.getHighSpeedVideoSizes);
            }
        }
    }

    public WinternitzOTSVerify(org.bouncycastle.crypto.Digest digest, int i) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = digest;
        this.getHighSpeedVideoSizes = digest.getDigestSize();
    }
}
