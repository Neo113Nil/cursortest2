package util.h.xy.cq;

/* loaded from: classes5.dex */
public final class me {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoSizes;
    private byte[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;
    private int getOutputMinFrameDuration = -1;

    public me(java.lang.String str) {
        this.getOutputFormats = str;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m26014() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 85) + (i | 85);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (bArr == null) {
            int i4 = (i3 ^ 11) + ((i3 & 11) << 1);
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        int i5 = getHighSpeedVideoFpsRanges + 95;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            return copyOf;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final long m26009() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 9;
        getHighSpeedVideoFpsRanges = i2 % 128;
        long j = this.getHighSpeedVideoSizes;
        long j2 = i2 % 2 == 0 ? j - 1 : j + 1;
        this.getHighSpeedVideoSizes = j2;
        getHighSpeedVideoFpsRanges = (((i | 87) << 1) - (i ^ 87)) % 128;
        return j2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final long m26016() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i + 21) % 128;
        long j = this.getHighSpeedVideoSizes;
        int i2 = (i & 45) + (i | 45);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return j;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26006() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArr = this.getInputFormats;
            if (bArr != null) {
                return java.util.Arrays.copyOf(bArr, bArr.length);
            }
            getHighSpeedVideoFpsRangesFor = (i + 35) % 128;
            int i3 = i + 73;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26012(int i) {
        int i2 = getHighSpeedVideoFpsRanges + 109;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputMinFrameDuration = i;
        } else {
            this.getOutputMinFrameDuration = i;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26010(long j) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 9) << 1) - (i ^ 9);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoSizes = j;
        } else {
            this.getHighSpeedVideoSizes = j;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26007(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i & 67) + (i | 67)) % 128;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Arrays.copyOf(bArr, bArr.length);
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26013(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 117;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            this.getInputFormats = java.util.Arrays.copyOf(bArr, bArr.length);
        } else {
            this.getInputFormats = java.util.Arrays.copyOf(bArr, bArr.length);
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26017(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 39) << 1) - (i ^ 39);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInputSizeshNQ4ISI = java.util.Arrays.copyOf(bArr, bArr.length);
        } else {
            this.getInputSizeshNQ4ISI = java.util.Arrays.copyOf(bArr, bArr.length);
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26008() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i | 63) << 1) - (i ^ 63)) % 128;
        byte[] bArr = this.getInputSizeshNQ4ISI;
        if (bArr == null) {
            getHighSpeedVideoFpsRanges = (i + 111) % 128;
            getHighSpeedVideoFpsRanges = (i + 117) % 128;
            return null;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return copyOf;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26011(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 119) << 1) - (i ^ 119);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            this.Camera2StreamConfigurationMap = java.util.Arrays.copyOf(bArr, bArr.length);
        } else {
            this.Camera2StreamConfigurationMap = java.util.Arrays.copyOf(bArr, bArr.length);
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final byte[] m26004() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 29;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            if (bArr == null) {
                int i3 = i + 37;
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
            int i4 = getHighSpeedVideoFpsRangesFor;
            int i5 = (i4 ^ 109) + ((i4 & 109) << 1);
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                return copyOf;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m26015() throws util.h.xy.ck.rc {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 55) + (i | 55);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            byte[][] bArr = new byte[5][];
            bArr[1] = this.getInputFormats;
            bArr[1] = this.getInputSizeshNQ4ISI;
            bArr[5] = this.Camera2StreamConfigurationMap;
            bArr[3] = this.getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.cv.ra.m26068(bArr);
        } else {
            util.h.xy.cv.ra.m26068(this.getInputFormats, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getHighSpeedVideoSizes = 0L;
        this.getOutputMinFrameDuration = -1;
        m26005();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m26005() throws util.h.xy.ck.rc {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 35) << 1) - (i ^ 35);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.getOutputFormats != null) {
            try {
                util.h.xy.cn.mb.m25979(new java.net.URI(this.getOutputFormats));
                int i3 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = (((i3 | 101) << 1) - (i3 ^ 101)) % 128;
            } catch (java.net.URISyntaxException e) {
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, e.getMessage(), e);
            }
        }
        int i4 = getHighSpeedVideoFpsRangesFor + 117;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
