package util.h.xy.cf;

/* loaded from: classes5.dex */
public class a extends util.h.xy.cf.b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 43) % 128;

    public a(java.lang.String str) {
        super(str);
    }

    @Override // util.h.xy.cf.b
    /* renamed from: ᐝ, reason: contains not printable characters */
    public int mo25889() throws org.json.JSONException {
        java.lang.String optString = this.f1095.getJSONObject(util.h.xy.al.ra.f588).optString(util.h.xy.s.g.f2320);
        if (optString.isEmpty()) {
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i = ~(((-514023574) ^ identityHashCode) | (identityHashCode & (-514023574)));
            int i2 = ((i ^ 511770768) | (i & 511770768)) * (-283);
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i3 = ~((-1044628702) | identityHashCode2);
            int i4 = ((i3 ^ 268664841) | (i3 & 268664841)) * 104;
            int i5 = ~identityHashCode2;
            int i6 = (i5 ^ 278368777) | (i5 & 278368777);
            int i7 = (((i4 & 1170213238) + (i4 | 1170213238)) - (~(-(-((~((1044628701 ^ i6) | (i6 & 1044628701))) * (-104)))))) - 1;
            int i8 = ((identityHashCode2 ^ 278368777) | (identityHashCode2 & 278368777)) * 104;
            if (((((i2 ^ 945471434) + ((i2 & 945471434) << 1)) + 1611345920) - (~((~((identityHashCode ^ (-2252806)) | (identityHashCode & (-2252806)))) * 283))) - 1 <= (i7 ^ i8) + ((i8 & i7) << 1)) {
                return getHighSpeedVideoFpsRangesFor();
            }
            getHighSpeedVideoFpsRangesFor();
            throw null;
        }
        if (optString.equals(util.h.xy.al.b.f103)) {
            int i9 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i9 & 31) + (i9 | 31)) % 128;
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 65) % 128;
            return highSpeedVideoFpsRangesFor;
        }
        if (optString.equals(util.h.xy.al.b.f114)) {
            return getHighResolutionOutputSizeshNQ4ISI();
        }
        int i10 = -2;
        if (!optString.equals(util.h.xy.al.b.f129)) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 37) % 128;
            return -2;
        }
        int i11 = Camera2StreamConfigurationMap + 33;
        getHighSpeedVideoFpsRangesFor = i11 % 128;
        if (i11 % 2 == 0) {
            getHighSpeedVideoFpsRangesFor();
            getHighResolutionOutputSizeshNQ4ISI();
            throw null;
        }
        int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor2 == getHighResolutionOutputSizeshNQ4ISI()) {
            int i12 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i12 | 109) << 1) - (i12 ^ 109)) % 128;
            int i13 = (i12 ^ 31) + ((i12 & 31) << 1);
            getHighSpeedVideoFpsRangesFor = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            i10 = highSpeedVideoFpsRangesFor2;
        } else {
            int i14 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i14 | 103) << 1) - (i14 ^ 103)) % 128;
        }
        int i15 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i15 | 73) << 1) - (i15 ^ 73)) % 128;
        return i10;
    }

    private int getHighSpeedVideoFpsRangesFor() throws org.json.JSONException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 53) % 128;
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ar.b.m25076(this.f1095.getJSONObject(util.h.xy.al.ra.f631).getJSONObject(util.h.xy.s.g.f2350).getString(util.h.xy.s.g.f2316)));
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 11) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    private int getHighResolutionOutputSizeshNQ4ISI() throws org.json.JSONException {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 93) << 1) - (i ^ 93);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0 ? getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ar.b.m25076(this.f1095.getJSONObject(util.h.xy.al.ra.f607).getString(util.h.xy.s.g.f2316))) != -2 : getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ar.b.m25076(this.f1095.getJSONObject(util.h.xy.al.ra.f607).getString(util.h.xy.s.g.f2316))) != 71) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = (i3 ^ 11) + ((i3 & 11) << 1);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                return 1;
            }
            throw new java.lang.ArithmeticException();
        }
        int i5 = (Camera2StreamConfigurationMap + 107) % 128;
        getHighSpeedVideoFpsRangesFor = i5;
        int i6 = (i5 & 73) + (i5 | 73);
        Camera2StreamConfigurationMap = i6 % 128;
        if (i6 % 2 == 0) {
            return -2;
        }
        throw null;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        int highSpeedVideoFpsRanges;
        int i = Camera2StreamConfigurationMap + 111;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0 ? (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr[0])) != getHighSpeedVideoFpsRanges(bArr[2]) : (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr[1])) != getHighSpeedVideoFpsRanges(bArr[5])) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 53) % 128;
            return -2;
        }
        if (highSpeedVideoFpsRanges == 0) {
            int i2 = getHighSpeedVideoFpsRangesFor;
            int i3 = (((i2 | 35) << 1) - (i2 ^ 35)) % 128;
            Camera2StreamConfigurationMap = i3;
            getHighSpeedVideoFpsRangesFor = ((i3 & 101) + (i3 | 101)) % 128;
            return -2;
        }
        if ((highSpeedVideoFpsRanges & 3) != 3) {
            if ((highSpeedVideoFpsRanges & 1) != 1) {
                int i4 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i4 & 65) + (i4 | 65)) % 128;
                if ((highSpeedVideoFpsRanges & 4) != 4) {
                    Camera2StreamConfigurationMap = (i4 + 117) % 128;
                    return 0;
                }
            }
            return 1;
        }
        int i5 = getHighSpeedVideoFpsRangesFor;
        int i6 = ((i5 ^ 33) + ((i5 & 33) << 1)) % 128;
        Camera2StreamConfigurationMap = i6;
        int i7 = (i6 ^ 125) + ((i6 & 125) << 1);
        getHighSpeedVideoFpsRangesFor = i7 % 128;
        if (i7 % 2 != 0) {
            return 1;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (util.h.xy.ar.b.m25083(r6, 3) == 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getHighSpeedVideoFpsRanges(byte b) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 97) << 1) - (i ^ 97)) % 128;
        if (util.h.xy.ar.b.m25083(b, 5) == 1) {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            r3 = i3 % 2 != 0 ? 1 : 0;
            getHighSpeedVideoFpsRangesFor = ((i2 & 29) + (i2 | 29)) % 128;
        }
        if (util.h.xy.ar.b.m25083(b, 4) == 1) {
            r3 ^= 4;
        }
        if (util.h.xy.ar.b.m25083(b, 2) != 1) {
            int i4 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = (((i4 | 79) << 1) - (i4 ^ 79)) % 128;
        }
        r3 |= 2;
        int i5 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i5 & 1) + (i5 | 1)) % 128;
        return r3;
    }
}
