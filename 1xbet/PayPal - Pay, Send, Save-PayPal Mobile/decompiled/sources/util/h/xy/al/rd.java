package util.h.xy.al;

/* loaded from: classes5.dex */
public final class rd {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25026(byte[] bArr) {
        byte b;
        int i;
        byte[] bArr2;
        int length = bArr.length;
        if (length <= 127) {
            bArr2 = new byte[]{(byte) length};
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i2 & 49) + (i2 | 49)) % 128;
            b = 0;
            i = 0;
        } else {
            int i3 = 3;
            if (length <= 255) {
                int i4 = getHighSpeedVideoSizes + 77;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    b = 91;
                } else {
                    b = -127;
                    i3 = 2;
                }
            } else if (length <= 65535) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 57) % 128;
                b = -126;
            } else if (length <= 16777215) {
                int i5 = getHighSpeedVideoFpsRangesFor;
                int i6 = ((i5 ^ 73) + ((i5 & 73) << 1)) % 128;
                getHighSpeedVideoSizes = i6;
                getHighSpeedVideoFpsRangesFor = ((i6 & 87) + (i6 | 87)) % 128;
                i3 = 4;
                b = -125;
            } else {
                int i7 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i7 | 101) << 1) - (i7 ^ 101)) % 128;
                i3 = 5;
                b = -124;
            }
            i = i3;
            bArr2 = null;
        }
        if (bArr2 != null) {
            return bArr2;
        }
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i8 = (-867) - (~(-(-(i * (-864)))));
        int i9 = ~i;
        int i10 = ~currentTimeMillis;
        int i11 = ((~i10) | i9) * (-865);
        int i12 = ((i8 | i11) << 1) - (i8 ^ i11);
        int i13 = (~(currentTimeMillis | (currentTimeMillis ^ (-1)))) * 865;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        int i15 = -(-((~((i10 & i9) | (i9 ^ i10))) * 865));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        byte[] bArr3 = new byte[i16];
        byte[] m25101 = util.h.xy.ar.b.m25101(length, i16);
        byte[] bArr4 = new byte[i];
        bArr4[0] = b;
        java.lang.System.arraycopy(m25101, 0, bArr4, 1, i16);
        return bArr4;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25023(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i | 43) << 1) - (i ^ 43)) % 128;
        byte[] bArr3 = new byte[0];
        if (bArr2 != null) {
            int i2 = (((i | 61) << 1) - (i ^ 61)) % 128;
            getHighSpeedVideoSizes = i2;
            if (bArr2.length > 0) {
                getHighSpeedVideoFpsRangesFor = (i2 + 27) % 128;
                byte[] m25090 = util.h.xy.ar.b.m25090(bArr, m25026(bArr2), bArr2);
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = (((i3 | 107) << 1) - (i3 ^ 107)) % 128;
                return m25090;
            }
        }
        return bArr3;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25024(byte[][] bArr, byte[][] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 95;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bArr != null) {
            getHighSpeedVideoSizes = (i + 107) % 128;
            if (bArr2 != null) {
                if (bArr.length != bArr2.length) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f809);
                }
                int length = bArr.length;
                int i3 = 0;
                byte[] bArr3 = null;
                while (i3 < length) {
                    int i4 = getHighSpeedVideoFpsRangesFor;
                    int i5 = i4 + 125;
                    getHighSpeedVideoSizes = i5 % 128;
                    if (i5 % 2 == 0) {
                        byte[] bArr4 = bArr2[i3];
                        if (bArr4 != null && bArr4.length > 0) {
                            getHighSpeedVideoSizes = (i4 + 55) % 128;
                            bArr3 = util.h.xy.ar.b.m25090(bArr3, m25023(bArr[i3], bArr4));
                        }
                        int i6 = (i3 ^ (-86)) + ((i3 & (-86)) << 1);
                        i3 = (i6 & 87) + (i6 | 87);
                        int i7 = getHighSpeedVideoSizes;
                        getHighSpeedVideoFpsRangesFor = (((i7 | 51) << 1) - (i7 ^ 51)) % 128;
                    } else {
                        byte[] bArr5 = bArr2[i3];
                        throw null;
                    }
                }
                int i8 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i8 | 91) << 1) - (i8 ^ 91)) % 128;
                return bArr3;
            }
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f795);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25025(util.h.xy.ar.mb[] mbVarArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (mbVarArr != null && mbVarArr.length > 0) {
            getHighSpeedVideoFpsRangesFor = (i3 + 77) % 128;
            int length = mbVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i5 | 95) << 1) - (i5 ^ 95)) % 128;
                mbVarArr[i4].m25113();
                i4 = (i4 ^ 1) + ((i4 & 1) << 1);
                int i6 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i6 ^ 111) + ((i6 & 111) << 1)) % 128;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 19) % 128;
    }
}
