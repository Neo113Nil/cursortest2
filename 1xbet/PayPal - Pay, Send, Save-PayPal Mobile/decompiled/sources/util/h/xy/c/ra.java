package util.h.xy.c;

/* loaded from: classes5.dex */
public final class ra {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getOutputFormats;
    private util.h.xy.e.a getInputFormats;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 125) + (i | 125);
        getOutputFormats = i2 % 128;
        Camera2StreamConfigurationMap = -877251073474672002L;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getOutputFormats = ((i & 43) + (i | 43)) % 128;
        getHighSpeedVideoFpsRangesFor = null;
        getOutputFormats = (((i | 65) << 1) - (i ^ 65)) % 128;
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = i3 ^ 117;
        int i5 = (i3 & 117) << 1;
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i6 = i5 * (-949);
        int i7 = -(-(i4 * (-949)));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        int i9 = ~i4;
        int i10 = ~currentTimeMillis;
        int i11 = ~i5;
        int i12 = ((~((i9 ^ i10) | (i9 & i10))) | (~((i11 ^ currentTimeMillis) | (i11 & currentTimeMillis)))) * 1900;
        int i13 = ((i8 | i12) << 1) - (i12 ^ i8);
        int i14 = ((~(i10 | i5)) | (~((i4 ^ currentTimeMillis) | (i4 & currentTimeMillis)))) * (-950);
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        int i16 = ~(i4 | i10);
        int i17 = ~(i5 | currentTimeMillis);
        int i18 = -(-(((i17 ^ i16) | (i17 & i16)) * 950));
        int i19 = (i15 & i18) + (i18 | i15);
        getHighSpeedVideoSizes = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = getOutputFormats;
            getHighResolutionOutputSizeshNQ4ISI = ((i20 ^ 69) + ((i20 & 69) << 1)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = ((i20 & 85) + (i20 | 85)) % 128;
            throw null;
        }
        int i21 = getHighResolutionOutputSizeshNQ4ISI;
        int i22 = (((i21 | 115) << 1) - (i21 ^ 115)) % 128;
        getOutputFormats = i22;
        getHighResolutionOutputSizeshNQ4ISI = ((i22 ^ 73) + ((i22 & 73) << 1)) % 128;
        int i23 = ((i22 & 19) + (i22 | 19)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i23;
        getOutputFormats = ((i23 & 79) + (i23 | 79)) % 128;
    }

    public ra() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (((i | 83) << 1) - (i ^ 83)) % 128;
        getOutputFormats = i2;
        int i3 = (((i2 | 35) << 1) - (i2 ^ 35)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        getOutputFormats = ((i3 & 27) + (i3 | 27)) % 128;
        this.getInputFormats = new util.h.xy.e.a();
        int i4 = getOutputFormats + 93;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        int i5 = i4 % 2;
        int i6 = getHighSpeedVideoFpsRanges;
        int i7 = i6 & 125;
        int i8 = (i6 & (-126)) | ((~i6) & 125);
        int i9 = -(~((i8 ^ i7) | (i8 & i7)));
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i10 = ~i9;
        int i11 = (i7 ^ identityHashCode) | (i7 & identityHashCode);
        int i12 = (i9 * (-464)) + (i7 * (-929)) + (((~i11) | i10) * (-465));
        int i13 = ~((identityHashCode ^ i10) | (identityHashCode & i10));
        int i14 = ((i7 ^ i13) | (i7 & i13)) * 930;
        int i15 = (i12 ^ i14) + ((i12 & i14) << 1);
        int i16 = -(-(((i10 & i11) | (i11 ^ i10)) * 465));
        int i17 = ((i15 ^ i16) + ((i16 & i15) << 1)) - 1;
        getHighSpeedVideoSizes = i17 % 128;
        int i18 = i17 % 2;
        int i19 = getHighResolutionOutputSizeshNQ4ISI;
        if (i18 == 0) {
            int i20 = ((i19 & 117) + (i19 | 117)) % 128;
            getOutputFormats = i20;
            getHighResolutionOutputSizeshNQ4ISI = (i20 + 27) % 128;
        } else {
            int i21 = i19 + 117;
            getOutputFormats = i21 % 128;
            int i22 = i21 % 2;
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.Object m25833(android.content.Context context, int i) throws util.h.xy.c.ma {
        int i2 = getOutputFormats;
        int i3 = (i2 & 81) + (i2 | 81);
        int i4 = i3 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = (i4 + 61) % 128;
        getOutputFormats = i5;
        getHighResolutionOutputSizeshNQ4ISI = (i5 + 83) % 128;
        int i6 = (i5 + 35) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i6;
        int i7 = getHighSpeedVideoSizes;
        int i8 = i7 & 93;
        int i9 = (i7 | 93) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i10 * (-112)) + (i9 * (-112));
        int i12 = ~i9;
        int i13 = ~i;
        int i14 = (i13 ^ i12) | (i12 & i13);
        int i15 = ~i14;
        int i16 = ((i15 ^ i10) | (i15 & i10)) * 226;
        int i17 = ~i10;
        int i18 = ~(i9 | i17);
        int i19 = ~((i17 ^ i) | (i17 & i));
        int i20 = (i18 ^ i19) | (i18 & i19);
        int i21 = ~((i10 ^ i14) | (i10 & i14));
        int i22 = (((i11 | i16) << 1) - (i11 ^ i16)) + (((i20 ^ i21) | (i21 & i20)) * (-113));
        int i23 = -(-((~(i12 | i)) * 113));
        int i24 = (i22 & i23) + (i23 | i22);
        getHighSpeedVideoFpsRanges = i24 % 128;
        if (i24 % 2 != 0) {
            getOutputFormats = (i6 + 77) % 128;
            int i25 = (i6 & 11) + (i6 | 11);
            getOutputFormats = i25 % 128;
            if (i25 % 2 == 0) {
                return m25834(context, i, null);
            }
        } else {
            getOutputFormats = (i6 + 91) % 128;
        }
        m25834(context, i, null);
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.Object m25834(android.content.Context context, int i, java.io.InputStream inputStream) throws util.h.xy.c.ma {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 & 23) + (i2 | 23);
        int i4 = i3 % 128;
        getOutputFormats = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = ((i4 | 39) << 1) - (i4 ^ 39);
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        int i6 = i5 % 2;
        getHighResolutionOutputSizeshNQ4ISI = (((i4 | 95) << 1) - (i4 ^ 95)) % 128;
        int i7 = getHighSpeedVideoSizes;
        int i8 = i7 & 95;
        int i9 = (i7 & (-96)) | ((~i7) & 95);
        int i10 = (i9 ^ i8) | (i9 & i8);
        int i11 = i10 * (-661);
        int i12 = i8 * (-661);
        int i13 = (i11 & i12) + (i11 | i12);
        int i14 = ~i;
        int i15 = ~i8;
        int i16 = ~i10;
        int i17 = ~(i16 | i15);
        int i18 = ((i17 ^ i14) | (i17 & i14)) * 1324;
        int i19 = ~(i10 | i);
        int i20 = ~((i8 ^ i) | (i8 & i));
        int i21 = (((i13 | i18) << 1) - (i13 ^ i18)) + (((i19 & i20) | (i19 ^ i20)) * (-1324));
        int i22 = ((~((i10 ^ i15) | (i10 & i15))) | (~((i8 ^ i16) | (i8 & i16)))) * 662;
        int i23 = (i21 & i22) + (i22 | i21);
        getHighSpeedVideoFpsRanges = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = ((i4 & 103) + (i4 | 103)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i24;
            getOutputFormats = (i24 + 11) % 128;
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (((i4 | 109) << 1) - (i4 ^ 109)) % 128;
        if (context == null) {
            throw new util.h.xy.c.ma(103, null);
        }
        util.h.xy.e.mc.m26470(i);
        java.lang.Object m26461 = this.getInputFormats.m26461(context, i, inputStream);
        int i25 = getHighResolutionOutputSizeshNQ4ISI;
        int i26 = ((i25 ^ 59) + ((i25 & 59) << 1)) % 128;
        getOutputFormats = i26;
        int i27 = getHighSpeedVideoSizes;
        int i28 = ((~i27) & 33) | (i27 & (-34));
        int i29 = i27 & 33;
        int i30 = ((i29 ^ i28) | (i28 & i29)) << 1;
        int i31 = -i28;
        int i32 = i31 * (-1965);
        int i33 = -(-(i30 * 984));
        int i34 = (i32 & i33) + (i32 | i33);
        int i35 = ~i30;
        int i36 = ((i31 ^ i35) | (i31 & i35)) * 983;
        int i37 = ~i31;
        int i38 = (((i34 ^ i36) + ((i36 & i34) << 1)) - (~(-(-(((~((i35 ^ i14) | (i35 & i14))) | i37) * (-983)))))) - 1;
        int i39 = ~(i37 | i14);
        int i40 = ~((i30 ^ i37) | (i30 & i37));
        int i41 = ((i40 ^ i39) | (i39 & i40)) * 983;
        int i42 = (i38 & i41) + (i41 | i38);
        getHighSpeedVideoFpsRanges = i42 % 128;
        if (i42 % 2 != 0) {
            getOutputFormats = (i25 + 33) % 128;
            return m26461;
        }
        getHighResolutionOutputSizeshNQ4ISI = (i26 + 87) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (((i26 | 25) << 1) - (i26 ^ 25)) % 128;
        throw new java.lang.ArithmeticException();
    }
}
