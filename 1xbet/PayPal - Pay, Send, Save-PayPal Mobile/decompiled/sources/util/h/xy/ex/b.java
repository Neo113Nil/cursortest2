package util.h.xy.ex;

/* loaded from: classes18.dex */
public abstract class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.math.BigInteger m26734(int i, int[] iArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 15;
        Camera2StreamConfigurationMap = i2 % 128;
        byte[] bArr = new byte[i2 % 2 == 0 ? i * 4 : i << 2];
        for (int i3 = 0; i3 < i; i3 = ((i3 | 1) << 1) - (i3 ^ 1)) {
            int i4 = Camera2StreamConfigurationMap;
            int i5 = ((i4 & 101) + (i4 | 101)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i5;
            int i6 = iArr[i3];
            if (i6 != 0) {
                Camera2StreamConfigurationMap = (i5 + 117) % 128;
                int i7 = i - 1;
                int i8 = -i3;
                int i9 = ~i8;
                int i10 = ~((i9 ^ i7) | (i9 & i7));
                int i11 = ~((i9 ^ i) | (i9 & i));
                int i12 = ~i7;
                int i13 = ~((i12 ^ i) | (i12 & i));
                int i14 = (i9 ^ i12) | (i9 & i12);
                int i15 = ~((i14 ^ i) | (i14 & i));
                int i16 = ~i;
                int i17 = i9 | i16;
                int i18 = ~((i17 ^ i7) | (i7 & i17));
                int i19 = (i18 ^ i15) | (i18 & i15);
                int i20 = (i12 ^ i16) | (i16 & i12);
                int i21 = ~((i20 ^ i8) | (i8 & i20));
                util.h.xy.fb.rb.m26847(i6, bArr, (((((((i8 * 141) - (~(i7 * (-139)))) - 1) + (((i10 & i11) | (i10 ^ i11)) * (-280))) - (~(((i11 & i13) | (i11 ^ i13)) * 140))) - 1) + (((i19 & i21) | (i19 ^ i21)) * 140)) << 2);
            }
        }
        return new java.math.BigInteger(1, bArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int[] m26733(int i, java.math.BigInteger bigInteger) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i2 & 9) + (i2 | 9)) % 128;
        if (bigInteger.signum() >= 0) {
            int i3 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 69) + ((i3 & 69) << 1)) % 128;
            if (bigInteger.bitLength() <= i) {
                int i4 = (i + 31) >> 5;
                int[] m26732 = m26732(i4);
                int i5 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = ((i5 ^ 105) + ((i5 & 105) << 1)) % 128;
                int i6 = 0;
                while (i6 < i4) {
                    int i7 = Camera2StreamConfigurationMap;
                    int i8 = ((i7 | 97) << 1) - (i7 ^ 97);
                    getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                    int intValue = bigInteger.intValue();
                    if (i8 % 2 != 0) {
                        m26732[i6] = intValue;
                        bigInteger = bigInteger.shiftRight(30);
                        int i9 = (i6 ^ 98) + ((i6 & 98) << 1);
                        i6 = (i9 ^ (-48)) + ((i9 & (-48)) << 1);
                    } else {
                        m26732[i6] = intValue;
                        bigInteger = bigInteger.shiftRight(32);
                        i6 = ((i6 | 1) << 1) - (i6 ^ 1);
                    }
                }
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
                return m26732;
            }
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m26735(int i, int[] iArr) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i4;
        while (i4 < i) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI + 43;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = iArr[i4];
                i5 = (i5 ^ i7) | (i5 & i7);
                int i8 = (i4 & (-4)) + (i4 | (-4));
                i4 = (i8 ^ 4) + ((i8 & 4) << 1);
            } else {
                int i9 = iArr[i4];
                i5 = (i5 ^ i9) | (i5 & i9);
                int i10 = (i4 ^ (-15)) + ((i4 & (-15)) << 1);
                i4 = ((i10 | 16) << 1) - (i10 ^ 16);
            }
        }
        int i11 = i5 >>> 1;
        int i12 = i5 & 1;
        int i13 = (i11 ^ i12) | (i11 & i12);
        int i14 = i13 * (-712);
        int i15 = ((i14 | (-714)) << 1) - (i14 ^ (-714));
        int i16 = ~i;
        int i17 = ~i16;
        int i18 = ~i13;
        int i19 = i17 | i18;
        int i20 = ~((i ^ (-1)) | i);
        int i21 = -(-(((i19 ^ i20) | (i19 & i20)) * (-713)));
        int i22 = ((((i15 | i21) << 1) - (i15 ^ i21)) - (~((~(i | ((~i18) | i18))) * 1426))) - 1;
        int i23 = (~(i16 | i18)) * 713;
        int i24 = getHighResolutionOutputSizeshNQ4ISI;
        int i25 = ((i24 | 9) << 1) - (i24 ^ 9);
        Camera2StreamConfigurationMap = i25 % 128;
        if (i25 % 2 != 0) {
            return ((i22 & i23) + (i23 | i22)) >> 31;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int m26731(int i, int[] iArr, int i2) {
        int i3;
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        int i5 = (i4 & 5) + (i4 | 5);
        Camera2StreamConfigurationMap = i5 % 128;
        int i6 = 0;
        if (i5 % 2 == 0) {
            int i7 = iArr[1];
            i3 = (~(i2 & i7)) & (i2 | i7);
        } else {
            i3 = i2 ^ iArr[0];
            i6 = 1;
        }
        while (i6 < i) {
            int i8 = Camera2StreamConfigurationMap;
            int i9 = (i8 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i8 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            int i10 = i9 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i10;
            if (i9 % 2 != 0) {
                int i11 = iArr[i6];
                i3 = (i3 ^ i11) | (i3 & i11);
                i6 += 45;
            } else {
                int i12 = iArr[i6];
                i3 = (i3 ^ i12) | (i3 & i12);
                i6 = (i6 & (-96)) + (i6 | (-96)) + 97;
            }
            int i13 = (i10 & 121) + (i10 | 121);
            Camera2StreamConfigurationMap = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 4 / 2;
            }
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int[] m26732(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 117;
        Camera2StreamConfigurationMap = i3 % 128;
        int[] iArr = new int[i];
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        Camera2StreamConfigurationMap = (((i2 | 103) << 1) - (i2 ^ 103)) % 128;
        return iArr;
    }
}
