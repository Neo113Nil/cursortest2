package util.h.xy.cv;

/* loaded from: classes5.dex */
public final class ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26067(char[] cArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 67;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (cArr == null) {
            return;
        }
        int i2 = 0;
        while (i2 < cArr.length) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i3 & 95) + (i3 | 95)) % 128;
            cArr[i2] = 0;
            int i4 = ((i2 | (-111)) << 1) - (i2 ^ (-111));
            i2 = ((i4 | 112) << 1) - (i4 ^ 112);
        }
        int i5 = getHighSpeedVideoFpsRangesFor;
        int i6 = ((i5 | 35) << 1) - (i5 ^ 35);
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26068(byte[]... bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 83) + ((i & 83) << 1)) % 128;
        int i2 = 0;
        while (i2 < bArr.length) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i3 ^ 93) + ((i3 & 93) << 1)) % 128;
                m26066(bArr2);
                int i4 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = ((i4 & 69) + (i4 | 69)) % 128;
            }
            i2 = (((i2 | 54) << 1) - (i2 ^ 54)) - 53;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 29) % 128;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26066(byte[] bArr) {
        int i;
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 & 89) + (i3 | 89)) % 128;
        if (bArr == null) {
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 55) % 128;
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI = ((i3 & 67) + (i3 | 67)) % 128;
        int i4 = 0;
        while (i4 < bArr.length) {
            int i5 = getHighSpeedVideoFpsRangesFor;
            int i6 = i5 + 39;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                bArr[i4] = 0;
                int i7 = (i4 & 94) + (i4 | 94);
                i = i7 ^ 3;
                i2 = (i7 & 3) << 1;
            } else {
                bArr[i4] = 0;
                int i8 = ((i4 | 55) << 1) - (i4 ^ 55);
                i = i8 & (-54);
                i2 = i8 | (-54);
            }
            i4 = i + i2;
            getHighResolutionOutputSizeshNQ4ISI = (((i5 | 1) << 1) - (i5 ^ 1)) % 128;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26072(byte[]... bArr) {
        int i = (getHighSpeedVideoFpsRangesFor + 107) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        if (bArr != null) {
            int i2 = i + 45;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length != 0) {
                if (bArr.length == 1) {
                    byte[] bArr2 = bArr[0];
                    getHighSpeedVideoFpsRangesFor = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    return bArr2;
                }
                int length2 = bArr.length;
                getHighSpeedVideoFpsRangesFor = ((i ^ 31) + ((i & 31) << 1)) % 128;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 11) % 128;
                    int length3 = bArr[i3].length;
                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                    int i5 = length3 * 55;
                    int i6 = i4 * (-107);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = ~length3;
                    int i9 = ~((i8 & i4) | (i8 ^ i4));
                    int i10 = ~currentTimeMillis;
                    int i11 = ~((i10 ^ i4) | (i10 & i4));
                    int i12 = ((i9 ^ i11) | (i9 & i11)) * (-108);
                    int i13 = ~((i8 ^ currentTimeMillis) | (i8 & currentTimeMillis));
                    int i14 = ~i4;
                    int i15 = ~((i14 ^ length3) | (i14 & length3));
                    int i16 = (i13 ^ i15) | (i13 & i15);
                    int i17 = ~((length3 ^ i10) | (length3 & i10));
                    int i18 = ((((i7 | i12) << 1) - (i12 ^ i7)) - (~(((i17 ^ i16) | (i17 & i16)) * 54))) - 1;
                    int i19 = ((i15 ^ currentTimeMillis) | (i15 & currentTimeMillis)) * 54;
                    i4 = (i19 ^ i18) + ((i19 & i18) << 1);
                    int i20 = (i3 ^ (-18)) + ((i3 & (-18)) << 1);
                    i3 = ((i20 | 19) << 1) - (i20 ^ 19);
                }
                byte[] bArr3 = new byte[i4];
                int length4 = bArr.length;
                int i21 = 0;
                int i22 = 0;
                while (i21 < length4) {
                    int i23 = getHighResolutionOutputSizeshNQ4ISI;
                    int i24 = (i23 ^ 109) + ((i23 & 109) << 1);
                    getHighSpeedVideoFpsRangesFor = i24 % 128;
                    if (i24 % 2 == 0) {
                        byte[] bArr4 = bArr[i21];
                        throw null;
                    }
                    byte[] bArr5 = bArr[i21];
                    if (bArr5 != null) {
                        java.lang.System.arraycopy(bArr5, 0, bArr3, i22, bArr5.length);
                        int i25 = -(-bArr5.length);
                        i22 = ((i22 | i25) << 1) - (i22 ^ i25);
                    }
                    int i26 = i21 - 59;
                    i21 = (i26 & 60) + (i26 | 60);
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 63) % 128;
                }
                int i27 = getHighSpeedVideoFpsRangesFor + 9;
                getHighResolutionOutputSizeshNQ4ISI = i27 % 128;
                if (i27 % 2 == 0) {
                    return bArr3;
                }
                throw null;
            }
        }
        byte[] bArr6 = new byte[0];
        int i28 = getHighSpeedVideoFpsRangesFor;
        int i29 = (i28 & 29) + (i28 | 29);
        getHighResolutionOutputSizeshNQ4ISI = i29 % 128;
        if (i29 % 2 == 0) {
            return bArr6;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m26070(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 83) + (i | 83)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        boolean z = true;
        if (bArr != null) {
            int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length != 0) {
                getHighResolutionOutputSizeshNQ4ISI = (i2 + 81) % 128;
                if (!getHighSpeedVideoSizes(bArr)) {
                    z = false;
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 71) % 128;
                    return z;
                }
            }
        }
        int i4 = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (((i4 | 81) << 1) - (i4 ^ 81)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 71) % 128;
        return z;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static char[] m26069(char[] cArr, char[] cArr2) throws java.lang.IllegalArgumentException {
        int i = getHighSpeedVideoFpsRangesFor + 29;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (cArr != null && cArr.length != 0) {
            int i3 = ((i2 | 33) << 1) - (i2 ^ 33);
            int i4 = i3 % 128;
            getHighSpeedVideoFpsRangesFor = i4;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (cArr2 != null && cArr2.length != 0) {
                if (cArr.length != cArr2.length) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f469);
                }
                int length = cArr.length;
                char[] cArr3 = new char[length];
                getHighResolutionOutputSizeshNQ4ISI = (i4 + 107) % 128;
                for (int i5 = 0; i5 < length; i5 = (i5 & 1) + (i5 | 1)) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
                    char c = cArr[i5];
                    char c2 = cArr2[i5];
                    cArr3[i5] = (char) ((~(c & c2)) & (c | c2));
                }
                return cArr3;
            }
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f388);
    }

    private static boolean getHighSpeedVideoSizes(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 1) + ((i & 1) << 1)) % 128;
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            int i4 = (i3 & 7) + (i3 | 7);
            int i5 = i4 % 128;
            getHighSpeedVideoFpsRangesFor = i5;
            if (i4 % 2 == 0) {
                byte b = bArr[i2];
                throw new java.lang.ArithmeticException();
            }
            if (bArr[i2] != 0) {
                return false;
            }
            i2++;
            getHighResolutionOutputSizeshNQ4ISI = (((i5 | 91) << 1) - (i5 ^ 91)) % 128;
        }
        int i6 = getHighResolutionOutputSizeshNQ4ISI;
        int i7 = (i6 ^ 41) + ((i6 & 41) << 1);
        getHighSpeedVideoFpsRangesFor = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26071(int i, boolean z) {
        byte[] bArr;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 ^ 85) + ((i2 & 85) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (z) {
            int i4 = (i2 + 107) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i4;
            if (i <= 255) {
                getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 111) + ((i2 & 111) << 1)) % 128;
                bArr = new byte[1];
            } else {
                if (i > 255) {
                    int i5 = ((i4 & 121) + (i4 | 121)) % 128;
                    getHighSpeedVideoFpsRangesFor = i5;
                    if (i <= 65535) {
                        int i6 = (i5 ^ 93) + ((i5 & 93) << 1);
                        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                        bArr = i6 % 2 != 0 ? new byte[3] : new byte[2];
                    }
                }
                if (i <= 65535 || i > 16777215) {
                    bArr = new byte[4];
                } else {
                    bArr = new byte[3];
                    int i7 = getHighSpeedVideoFpsRangesFor;
                    getHighResolutionOutputSizeshNQ4ISI = ((i7 ^ 13) + ((i7 & 13) << 1)) % 128;
                }
            }
        } else {
            bArr = new byte[4];
            getHighSpeedVideoFpsRangesFor = (i3 + 61) % 128;
        }
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (i9 + 65) % 128;
            int i10 = length * 713;
            int i11 = ((i10 | 711) << 1) - (i10 ^ 711);
            int i12 = ~length;
            int i13 = ~i;
            int i14 = (~((~i12) | i12)) * (-712);
            int i15 = (length ^ (-1)) | length;
            int i16 = (((i11 | i14) << 1) - (i11 ^ i14)) + ((~((i15 & i) | (i15 ^ i))) * (-712)) + (i12 * 712);
            int i17 = -i8;
            int i18 = ~i16;
            int i19 = ~((i13 & i18) | (i18 ^ i13));
            int i20 = ((((i17 * 46) - (~(i16 * 46))) - 1) - (~(-(-(((i19 ^ i17) | (i19 & i17)) * (-90)))))) - 1;
            int i21 = ~(i18 | i);
            int i22 = ~((i16 ^ i17) | (i16 & i17));
            int i23 = ((i21 ^ i22) | (i21 & i22)) * (-45);
            int i24 = (i20 ^ i23) + ((i23 & i20) << 1);
            int i25 = ~i17;
            int i26 = ~((i25 ^ i) | (i25 & i));
            int i27 = ((~((i17 ^ i13) | (i17 & i13))) | (i18 ^ i26) | (i26 & i18)) * 45;
            bArr[i8] = (byte) (i >> (((i24 ^ i27) + ((i27 & i24) << 1)) * 8));
            i8++;
            getHighResolutionOutputSizeshNQ4ISI = (i9 + 105) % 128;
        }
        int i28 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i28 & 121) + (i28 | 121)) % 128;
        return bArr;
    }
}
