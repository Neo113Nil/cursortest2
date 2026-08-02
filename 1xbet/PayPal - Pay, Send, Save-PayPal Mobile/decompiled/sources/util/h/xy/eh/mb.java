package util.h.xy.eh;

/* loaded from: classes5.dex */
public class mb implements util.h.xy.ef.e {
    private static int Camera2StreamConfigurationMap = 1;
    private static long[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char[] getHighSpeedVideoSizes;
    private static int getInputFormats;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected long[] f2163;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected byte[] f2164;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected int f2165;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected int f2166;

    /* renamed from: ͺ, reason: contains not printable characters */
    protected boolean f2167;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected int f2168;

    private static void getHighSpeedVideoSizes(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 53) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                int i6 = getHighSpeedVideoFpsRanges + 103;
                Camera2StreamConfigurationMap = i6 % 128;
                if (i6 % 2 != 0 ? bArr2[maVar.f2631] != 1 : bArr2[maVar.f2631] != 0) {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                } else {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 29) % 128;
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i7 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i7);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = new long[]{1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
        int i = getInputFormats + 113;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void getHighSpeedVideoSizes() {
        int i = getInputFormats;
        getHighSpeedVideoFpsRangesFor = (i + 109) % 128;
        long[] jArr = this.f2163;
        boolean z = false;
        long j = jArr[0];
        char c = 1;
        long j2 = jArr[1];
        long j3 = jArr[2];
        char c2 = 3;
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        long j15 = jArr[14];
        long j16 = jArr[15];
        long j17 = jArr[16];
        long j18 = jArr[17];
        long j19 = jArr[18];
        long j20 = jArr[19];
        long j21 = jArr[20];
        long j22 = jArr[21];
        long j23 = jArr[22];
        long j24 = jArr[23];
        long j25 = jArr[24];
        getHighSpeedVideoFpsRangesFor = (i + 59) % 128;
        int i2 = 0;
        for (int i3 = 24; i2 < i3; i3 = 24) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 << c) | (j27 >>> (-1))) ^ j30;
            long j32 = ((j28 << c) | (j28 >>> (-1))) ^ j26;
            long j33 = ((j29 << c) | (j29 >>> (-1))) ^ j27;
            long j34 = ((j30 << c) | (j30 >>> (-1))) ^ j28;
            long j35 = ((j26 << c) | (j26 >>> (-1))) ^ j29;
            long j36 = j ^ j31;
            long j37 = j6 ^ j31;
            long j38 = j11 ^ j31;
            long j39 = j16 ^ j31;
            long j40 = j21 ^ j31;
            long j41 = j2 ^ j32;
            long j42 = j7 ^ j32;
            long j43 = j12 ^ j32;
            long j44 = j17 ^ j32;
            long j45 = j22 ^ j32;
            long j46 = j3 ^ j33;
            long j47 = j8 ^ j33;
            long j48 = j13 ^ j33;
            long j49 = j18 ^ j33;
            long j50 = j23 ^ j33;
            long j51 = j4 ^ j34;
            long j52 = j9 ^ j34;
            long j53 = j14 ^ j34;
            long j54 = j19 ^ j34;
            long j55 = j24 ^ j34;
            long j56 = j5 ^ j35;
            long j57 = j10 ^ j35;
            long j58 = j15 ^ j35;
            long j59 = j20 ^ j35;
            long j60 = j25 ^ j35;
            long j61 = (j41 << c) | (j41 >>> 63);
            long j62 = (j42 << 44) | (j42 >>> 20);
            long j63 = (j57 << 20) | (j57 >>> 44);
            long j64 = (j50 << 61) | (j50 >>> c2);
            long j65 = (j58 << 39) | (j58 >>> 25);
            long j66 = (j40 << 18) | (j40 >>> 46);
            long[] jArr2 = jArr;
            long j67 = (j46 << 62) | (j46 >>> 2);
            long j68 = (j48 << 43) | (j48 >>> 21);
            long j69 = (j53 << 25) | (j53 >>> 39);
            long j70 = (j59 << 8) | (j59 >>> 56);
            long j71 = (j55 << 56) | (j55 >>> 8);
            long j72 = (j39 << 41) | (j39 >>> 23);
            long j73 = (j56 << 27) | (j56 >>> 37);
            long j74 = (j60 << 14) | (j60 >>> 50);
            long j75 = (j45 << 2) | (j45 >>> 62);
            long j76 = (j52 << 55) | (j52 >>> 9);
            long j77 = (j44 << 45) | (j44 >>> 19);
            long j78 = (j37 << 36) | (j37 >>> 28);
            long j79 = (j51 << 28) | (j51 >>> 36);
            int i4 = i2;
            long j80 = (j54 << 21) | (j54 >>> 43);
            long j81 = (j49 << 15) | (j49 >>> 49);
            long j82 = (j43 << 10) | (j43 >>> 54);
            long j83 = (j47 << 6) | (j47 >>> 58);
            long j84 = (j38 << 3) | (j38 >>> 61);
            j6 = j79 ^ ((~j63) & j84);
            long j85 = j61 ^ ((~j83) & j69);
            long j86 = j67 ^ ((~j76) & j65);
            long j87 = j65 ^ ((~j72) & j75);
            long j88 = ((~j75) & j67) ^ j72;
            long j89 = getHighResolutionOutputSizeshNQ4ISI[i4];
            long j90 = ((~j70) & j66) ^ j69;
            long j91 = j71 ^ ((~j73) & j78);
            long j92 = ((~j64) & j79) ^ j77;
            long j93 = ((~j77) & j64) ^ j84;
            long j94 = ((~j82) & j81) ^ j78;
            long j95 = ((~j81) & j71) ^ j82;
            long j96 = ((~j69) & j70) ^ j83;
            long j97 = ((~j84) & j77) ^ j63;
            long j98 = j73 ^ ((~j78) & j82);
            long j99 = ((~j80) & j74) ^ j68;
            long j100 = ((~j71) & j73) ^ j81;
            long j101 = j70 ^ ((~j66) & j61);
            long j102 = ((~j61) & j83) ^ j66;
            long j103 = ((~j36) & j62) ^ j74;
            long j104 = ((~j74) & j36) ^ j80;
            j22 = ((~j65) & j72) ^ j76;
            j = (((~j62) & j68) ^ j36) ^ j89;
            long j105 = j64 ^ (j63 & (~j79));
            long j106 = j62 ^ ((~j68) & j80);
            j12 = j96;
            j10 = j105;
            j14 = j101;
            j19 = j100;
            j5 = j103;
            j21 = j86;
            j23 = j87;
            j13 = j90;
            j9 = j92;
            j8 = j93;
            j17 = j94;
            c2 = 3;
            j25 = ((~j67) & j76) ^ j75;
            j7 = j97;
            j16 = j98;
            j15 = j102;
            j3 = j99;
            j11 = j85;
            jArr = jArr2;
            j24 = j88;
            z = false;
            j2 = j106;
            i2 = i4 + 1;
            j18 = j95;
            j4 = j104;
            j20 = j91;
            c = 1;
        }
        long[] jArr3 = jArr;
        jArr3[z ? 1 : 0] = j;
        jArr3[1] = j2;
        jArr3[2] = j3;
        jArr3[3] = j4;
        jArr3[4] = j5;
        jArr3[5] = j6;
        jArr3[6] = j7;
        jArr3[7] = j8;
        jArr3[8] = j9;
        jArr3[9] = j10;
        jArr3[10] = j11;
        jArr3[11] = j12;
        jArr3[12] = j13;
        jArr3[13] = j14;
        jArr3[14] = j15;
        jArr3[15] = j16;
        jArr3[16] = j17;
        jArr3[17] = j18;
        jArr3[18] = j19;
        jArr3[19] = j20;
        jArr3[20] = j21;
        jArr3[21] = j22;
        jArr3[22] = j23;
        jArr3[23] = j24;
        jArr3[24] = j25;
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) {
        int i2 = this.f2166;
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 41) % 128;
        int i3 = 0;
        while (i3 < (i2 >>> 6)) {
            int i4 = getInputFormats + 125;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                long[] jArr = this.f2163;
                jArr[i3] = jArr[i3] | util.h.xy.fb.rb.m26846(bArr, i);
                i += 30;
                i3 += 127;
            } else {
                long[] jArr2 = this.f2163;
                jArr2[i3] = jArr2[i3] ^ util.h.xy.fb.rb.m26846(bArr, i);
                i += 8;
                i3++;
            }
        }
        getHighSpeedVideoSizes();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected void m26588(byte[] bArr, int i, long j) {
        int i2 = getInputFormats + 19;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.f2167) {
            getInputFormats = (i3 + 93) % 128;
            byte[] bArr2 = this.f2164;
            int i4 = this.f2168;
            int i5 = i4 >>> 3;
            bArr2[i5] = (byte) (bArr2[i5] | ((byte) (1 << (i4 & 7))));
            int i6 = i4 + 1;
            this.f2168 = i6;
            if (i6 == this.f2166) {
                getHighSpeedVideoFpsRangesFor(bArr2, 0);
            } else {
                int i7 = i6 >>> 6;
                int i8 = i6 & 63;
                int i9 = 0;
                int i10 = 0;
                while (i9 < i7) {
                    int i11 = getInputFormats + 89;
                    getHighSpeedVideoFpsRangesFor = i11 % 128;
                    if (i11 % 2 == 0) {
                        long[] jArr = this.f2163;
                        jArr[i9] = jArr[i9] - util.h.xy.fb.rb.m26846(this.f2164, i10);
                        i10 += 104;
                        i9 += 118;
                    } else {
                        long[] jArr2 = this.f2163;
                        jArr2[i9] = jArr2[i9] ^ util.h.xy.fb.rb.m26846(this.f2164, i10);
                        i10 += 8;
                        i9++;
                    }
                }
                if (i8 > 0) {
                    long[] jArr3 = this.f2163;
                    jArr3[i7] = (util.h.xy.fb.rb.m26846(this.f2164, i10) & ((1 << i8) - 1)) ^ jArr3[i7];
                    getHighSpeedVideoFpsRangesFor = (getInputFormats + 119) % 128;
                }
            }
            long[] jArr4 = this.f2163;
            int i12 = (this.f2166 - 1) >>> 6;
            jArr4[i12] = jArr4[i12] ^ Long.MIN_VALUE;
            this.f2168 = 0;
            this.f2167 = true;
        }
        long j2 = 0;
        if (j % 8 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{188, 32, 0, 32}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        while (j2 < j) {
            if (this.f2168 == 0) {
                getInputFormats = (getHighSpeedVideoFpsRangesFor + 43) % 128;
                getHighSpeedVideoSizes();
                util.h.xy.fb.rb.m26845(this.f2163, 0, this.f2166 >>> 6, this.f2164, 0);
                this.f2168 = this.f2166;
                int i13 = getInputFormats + 53;
                getHighSpeedVideoFpsRangesFor = i13 % 128;
                if (i13 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            }
            int min = (int) java.lang.Math.min(this.f2168, j - j2);
            java.lang.System.arraycopy(this.f2164, (this.f2166 - this.f2168) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
            this.f2168 -= min;
            j2 += min;
            getInputFormats = (getHighSpeedVideoFpsRangesFor + 41) % 128;
        }
        int i14 = getInputFormats + 109;
        getHighSpeedVideoFpsRangesFor = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected void m26586(int i, int i2) {
        int i3 = getHighSpeedVideoFpsRangesFor;
        getInputFormats = (i3 + 13) % 128;
        if (i2 > 0) {
            int i4 = (i3 + 105) % 128;
            getInputFormats = i4;
            if (i2 <= 7) {
                int i5 = this.f2168;
                if (i5 % 8 != 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{82, 39, 0, 0}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
                }
                if (this.f2167) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{121, 33, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr2);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
                }
                this.f2164[i5 >>> 3] = (byte) (i & ((1 << i2) - 1));
                this.f2168 = i5 + i2;
                int i6 = i4 + 23;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{154, 34, 0, 26}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", objArr3);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[LOOP:0: B:20:0x004f->B:22:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[EDGE_INSN: B:23:0x005a->B:24:0x005a BREAK  A[LOOP:0: B:20:0x004f->B:22:0x0053], SYNTHETIC] */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void m26587(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = this.f2168;
        if (i5 % 8 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{82, 39, 0, 0}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (this.f2167) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{121, 33, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        int i6 = i5 >>> 3;
        int i7 = this.f2166 >>> 3;
        int i8 = i7 - i6;
        if (i2 < i8) {
            int i9 = getHighSpeedVideoFpsRangesFor + 63;
            getInputFormats = i9 % 128;
            int i10 = i9 % 2;
            java.lang.System.arraycopy(bArr, i, this.f2164, i6, i2);
            int i11 = this.f2168;
            i4 = i10 != 0 ? i11 / (i2 << 5) : i11 + (i2 << 3);
        } else {
            if (i6 > 0) {
                int i12 = getInputFormats + 79;
                getHighSpeedVideoFpsRangesFor = i12 % 128;
                int i13 = i12 % 2;
                java.lang.System.arraycopy(bArr, i, this.f2164, i6, i8);
                byte[] bArr2 = this.f2164;
                if (i13 == 0) {
                    getHighSpeedVideoFpsRangesFor(bArr2, 1);
                } else {
                    getHighSpeedVideoFpsRangesFor(bArr2, 0);
                    while (true) {
                        i3 = i2 - i8;
                        if (i3 >= i7) {
                            break;
                        }
                        getHighSpeedVideoFpsRangesFor(bArr, i + i8);
                        i8 += i7;
                    }
                    java.lang.System.arraycopy(bArr, i + i8, this.f2164, 0, i3);
                    i4 = i3 << 3;
                }
            }
            i8 = 0;
            while (true) {
                i3 = i2 - i8;
                if (i3 >= i7) {
                }
                getHighSpeedVideoFpsRangesFor(bArr, i + i8);
                i8 += i7;
            }
            java.lang.System.arraycopy(bArr, i + i8, this.f2164, 0, i3);
            i4 = i3 << 3;
        }
        this.f2168 = i4;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected void m26589(byte b) {
        int i = (getInputFormats + 3) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        int i2 = this.f2168;
        if (i2 % 8 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{82, 39, 0, 0}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (this.f2167) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{121, 33, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        byte[] bArr = this.f2164;
        bArr[i2 >>> 3] = b;
        int i3 = i2 + 8;
        this.f2168 = i3;
        if (i3 == this.f2166) {
            getInputFormats = (i + 77) % 128;
            getHighSpeedVideoFpsRangesFor(bArr, 0);
            this.f2168 = 0;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i > 0) {
            int i2 = (getInputFormats + 23) % 128;
            getHighSpeedVideoFpsRangesFor = i2;
            if (i < 1600) {
                getInputFormats = (i2 + 7) % 128;
                if (i % 64 == 0) {
                    this.f2166 = i;
                    int i3 = 0;
                    while (true) {
                        long[] jArr = this.f2163;
                        if (i3 >= jArr.length) {
                            util.h.xy.fb.a.m26826(this.f2164, (byte) 0);
                            this.f2168 = 0;
                            this.f2167 = false;
                            this.f2165 = (1600 - i) / 2;
                            return;
                        }
                        getHighSpeedVideoFpsRangesFor = (getInputFormats + 121) % 128;
                        jArr[i3] = 0;
                        i3++;
                    }
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{64, 18, 142, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", objArr);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
    }

    private void getHighSpeedVideoFpsRangesFor(int i) {
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 111) % 128;
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{7, 57, 128, 4}, null, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        getHighResolutionOutputSizeshNQ4ISI(1600 - (i << 1));
        int i2 = getHighSpeedVideoFpsRangesFor + 45;
        getInputFormats = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // util.h.xy.ef.e
    /* renamed from: ˋ */
    public int mo26541() {
        int i = (getInputFormats + 101) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        int i2 = this.f2166 / 8;
        int i3 = i + 121;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public void mo26564() {
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 11) % 128;
        getHighSpeedVideoFpsRangesFor(this.f2165);
        int i = getHighSpeedVideoFpsRangesFor + 77;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public int mo26563(byte[] bArr, int i) {
        int i2 = getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = this.f2165;
        if (i2 % 2 != 0) {
            m26588(bArr, i, i3);
            mo26564();
            return mo26565();
        }
        m26588(bArr, i, i3);
        mo26564();
        mo26565();
        throw null;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public void mo26562(byte[] bArr, int i, int i2) {
        int i3 = getInputFormats + 81;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        m26587(bArr, i, i2);
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = getInputFormats + 111;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˋ */
    public void mo26560(byte b) {
        int i = getHighSpeedVideoFpsRangesFor + 87;
        getInputFormats = i % 128;
        m26589(b);
        if (i % 2 != 0) {
            throw null;
        }
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 77) % 128;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ᐝ */
    public int mo26565() {
        int i = (getHighSpeedVideoFpsRangesFor + 3) % 128;
        getInputFormats = i;
        int i2 = this.f2165 / 8;
        int i3 = i + 81;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public java.lang.String mo26561() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{0, 7, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.f2165);
        java.lang.String obj = sb.toString();
        int i = getInputFormats + 33;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    public mb(int i) {
        this.f2163 = new long[25];
        this.f2164 = new byte[192];
        getHighSpeedVideoFpsRangesFor(i);
    }

    public mb() {
        this(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = new char[]{42282, 42401, 42069, 42074, 42075, 42071, 42413, 42385, 42409, 42420, 42431, 42483, 42479, 42476, 42472, 42493, 42415, 42418, 42493, 42481, 42473, 42469, 42478, 42493, 42481, 42469, 42469, 42479, 42493, 42481, 42475, 42472, 42479, 42493, 42481, 42473, 42479, 42479, 42493, 42481, 42469, 42479, 42476, 42493, 42427, 42418, 42493, 42424, 42419, 42418, 42493, 42424, 42431, 42493, 42409, 42414, 42408, 42416, 42493, 42421, 42409, 42426, 42419, 42424, 42278, 42404, 42077, 42404, 42409, 42405, 42409, 42381, 42378, 42410, 42405, 42407, 42381, 42372, 42404, 42409, 42403, 42406, 42351, 42288, 42288, 42288, 42286, 42261, 42265, 42291, 42288, 42295, 42292, 42293, 42267, 42271, 42297, 42292, 42266, 42265, 42291, 42291, 42285, 42262, 42268, 42295, 42285, 42284, 42295, 42300, 42269, 42266, 42284, 42263, 42263, 42287, 42291, 42292, 42289, 42281, 42295, 42350, 42295, 42294, 42284, 42290, 42296, 42288, 42286, 42287, 42260, 42271, 42293, 42295, 42293, 42290, 42262, 42268, 42295, 42285, 42284, 42295, 42300, 42269, 42266, 42284, 42263, 42263, 42287, 42291, 42292, 42289, 42281, 42295, 42343, 42281, 42286, 42263, 42268, 42302, 42271, 42265, 42294, 42266, 42263, 42291, 42299, 42271, 42260, 42292, 42298, 42295, 42299, 42271, 42357, 42357, 42263, 42284, 42266, 42358, 42354, 42265, 42296, 42291, 42286, 42256, 42366, 42267, 42305, 42353, 42270, 42295, 42266, 42271, 42293, 42291, 42289, 42291, 42285, 42285, 42284, 42267, 42269, 42269, 42263, 42284, 42291, 42266, 42265, 42291, 42288, 42295, 42292, 42245, 42301, 42281, 42287, 42287, 42281, 42287};
    }
}
