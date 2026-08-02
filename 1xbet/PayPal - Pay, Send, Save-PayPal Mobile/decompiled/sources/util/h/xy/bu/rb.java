package util.h.xy.bu;

/* loaded from: classes5.dex */
public class rb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static long getHighSpeedVideoFpsRanges = 2000;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static long getInputSizeshNQ4ISI = 5000;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 23) + (i | 23);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m25670() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 25) + ((i & 25) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i2 + 105) % 128;
        return i3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25673(int i) {
        int i2 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | 39) << 1) - (i2 ^ 39)) % 128;
        long j = i;
        if (j <= 10) {
            int i3 = i2 + 109;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0 ? j >= 0 : j >= 1) {
                Camera2StreamConfigurationMap = i;
                getHighSpeedVideoFpsRangesFor = i;
                int i4 = (i2 & 15) + (i2 | 15);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f312);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int m25669() {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = (~((-239892335) | currentTimeMillis)) | 100926244;
        int i2 = ~currentTimeMillis;
        int i3 = (i2 ^ 1451721524) | (i2 & 1451721524);
        int i4 = ~((i3 ^ 239892334) | (i3 & 239892334));
        int i5 = -(-(((i ^ i4) | (i & i4)) * 886));
        int i6 = ~((i2 ^ 239892334) | (239892334 & i2));
        int i7 = (i5 ^ (-634466338)) + ((i5 & (-634466338)) << 1) + (((i6 & 1451721524) | (i6 ^ 1451721524)) * (-1772));
        int i8 = -(-((~(i2 | 1451721524)) * 886));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i9 = -(-(((currentTimeMillis2 ^ 2115073) | (currentTimeMillis2 & 2115073)) * 988));
        int i10 = (i9 ^ 1605146651) + ((i9 & 1605146651) << 1);
        int i11 = ~currentTimeMillis2;
        int i12 = ~(((-2069692467) ^ i11) | (i11 & (-2069692467)));
        int i13 = -(-(((i12 ^ 172490770) | (i12 & 172490770)) * (-1976)));
        int i14 = ~((currentTimeMillis2 ^ 1899316769) | (currentTimeMillis2 & 1899316769));
        int i15 = (i14 ^ 2115073) | (i14 & 2115073);
        int i16 = ~(((-1899316770) ^ i11) | (i11 & (-1899316770)));
        int i17 = getHighSpeedVideoFpsRangesFor;
        if (((i7 | i8) << 1) - (i8 ^ i7) <= (i10 & i13) + (i13 | i10) + (((i15 ^ i16) | (i16 & i15)) * 988)) {
            throw new java.lang.ArithmeticException();
        }
        int i18 = getHighSpeedVideoSizes;
        int i19 = (i18 ^ 87) + ((i18 & 87) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i19 % 128;
        if (i19 % 2 != 0) {
            return i17;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m25671(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i2 & 37) + (i2 | 37)) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        getHighSpeedVideoSizes = ((i2 & 29) + (i2 | 29)) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25674(long j) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 77) << 1) - (i ^ 77);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (j <= 10000) {
            int i4 = (i3 & 89) + (i3 | 89);
            int i5 = i4 % 128;
            getHighSpeedVideoSizes = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (j >= 500) {
                getHighSpeedVideoFpsRanges = j;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 41) % 128;
                return;
            }
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f293);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static long m25672() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 121) << 1) - (i ^ 121);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = getHighSpeedVideoFpsRanges;
        int i4 = i3 + 57;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25675() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 109) + ((i & 109) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (((i2 | 15) << 1) - (i2 ^ 15)) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25677(long j) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 67) % 128;
        getInputSizeshNQ4ISI = j;
        int i2 = i + 91;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static long m25676() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
        getHighSpeedVideoSizes = i;
        long j = getInputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 121) << 1) - (i ^ 121)) % 128;
        return j;
    }
}
