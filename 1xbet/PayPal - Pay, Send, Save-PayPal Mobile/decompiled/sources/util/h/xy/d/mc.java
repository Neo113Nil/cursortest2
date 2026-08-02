package util.h.xy.d;

/* loaded from: classes5.dex */
public final class mc {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.d.rc[] Camera2StreamConfigurationMap = null;
    private util.h.xy.d.rc[] getHighSpeedVideoFpsRangesFor = null;
    private util.h.xy.d.rc[] getHighSpeedVideoFpsRanges = null;
    private util.h.xy.d.rc[] getInputSizeshNQ4ISI = null;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.d.rc[] m26202() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i & 13) + (i | 13)) % 128;
        util.h.xy.d.rc[] rcVarArr = this.Camera2StreamConfigurationMap;
        if (rcVarArr == null) {
            int i2 = i + 119;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.d.rc[] rcVarArr2 = (util.h.xy.d.rc[]) rcVarArr.clone();
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i3 & 91) + (i3 | 91)) % 128;
        return rcVarArr2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26195(util.h.xy.d.rc[] rcVarArr) {
        int i = getHighSpeedVideoSizes + 61;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            this.Camera2StreamConfigurationMap = (util.h.xy.d.rc[]) rcVarArr.clone();
        } else {
            this.Camera2StreamConfigurationMap = (util.h.xy.d.rc[]) rcVarArr.clone();
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.d.rc[] m26196() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i & 35) + (i | 35)) % 128;
        util.h.xy.d.rc[] rcVarArr = this.getHighSpeedVideoFpsRangesFor;
        if (rcVarArr == null) {
            int i2 = i + 29;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.d.rc[] rcVarArr2 = (util.h.xy.d.rc[]) rcVarArr.clone();
        int i3 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 61) + ((i3 & 61) << 1)) % 128;
        return rcVarArr2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26197(util.h.xy.d.rc[] rcVarArr) {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 37) << 1) - (i ^ 37)) % 128;
        this.getHighSpeedVideoFpsRangesFor = (util.h.xy.d.rc[]) rcVarArr.clone();
        int i2 = getHighSpeedVideoSizes;
        int i3 = (i2 & 75) + (i2 | 75);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.d.rc[] m26198() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 3) + ((i & 3) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.d.rc[] rcVarArr = this.getHighSpeedVideoFpsRanges;
        if (rcVarArr == null) {
            return null;
        }
        util.h.xy.d.rc[] rcVarArr2 = (util.h.xy.d.rc[]) rcVarArr.clone();
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 13;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return rcVarArr2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26199(util.h.xy.d.rc[] rcVarArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 79) << 1) - (i ^ 79);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = (util.h.xy.d.rc[]) rcVarArr.clone();
        } else {
            this.getHighSpeedVideoFpsRanges = (util.h.xy.d.rc[]) rcVarArr.clone();
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26194() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 87) + (i | 87)) % 128;
        util.h.xy.d.rc[] rcVarArr = this.Camera2StreamConfigurationMap;
        int i2 = 0;
        if (rcVarArr != null) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 29) % 128;
            int length = rcVarArr.length;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 45) + (i | 45)) % 128;
            int i3 = 0;
            while (i3 < length) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI;
                int i5 = (i4 ^ 1) + ((i4 & 1) << 1);
                getHighSpeedVideoSizes = i5 % 128;
                if (i5 % 2 == 0) {
                    rcVarArr[i3].m26245();
                    i3 = ((i3 | 85) << 1) - (i3 ^ 85);
                } else {
                    rcVarArr[i3].m26245();
                    int i6 = (i3 & 21) + (i3 | 21);
                    i3 = ((i6 | (-20)) << 1) - (i6 ^ (-20));
                }
            }
        }
        util.h.xy.d.rc[] rcVarArr2 = this.getHighSpeedVideoFpsRangesFor;
        if (rcVarArr2 != null) {
            int length2 = rcVarArr2.length;
            int i7 = 0;
            while (i7 < length2) {
                int i8 = getHighSpeedVideoSizes;
                int i9 = (i8 ^ 63) + ((i8 & 63) << 1);
                getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                if (i9 % 2 != 0) {
                    rcVarArr2[i7].m26245();
                    i7 += 83;
                } else {
                    rcVarArr2[i7].m26245();
                    i7 = ((i7 | 1) << 1) - (i7 ^ 1);
                }
            }
        }
        util.h.xy.d.rc[] rcVarArr3 = this.getHighSpeedVideoFpsRanges;
        if (rcVarArr3 != null) {
            int i10 = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = (((i10 | 41) << 1) - (i10 ^ 41)) % 128;
            int length3 = rcVarArr3.length;
            for (int i11 = 0; i11 < length3; i11 = (((i11 | 29) << 1) - (i11 ^ 29)) - 28) {
                int i12 = getHighSpeedVideoSizes;
                getHighResolutionOutputSizeshNQ4ISI = (((i12 | 89) << 1) - (i12 ^ 89)) % 128;
                rcVarArr3[i11].m26245();
            }
        }
        util.h.xy.d.rc[] rcVarArr4 = this.getInputSizeshNQ4ISI;
        if (rcVarArr4 != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
            int length4 = rcVarArr4.length;
            while (i2 < length4) {
                int i13 = getHighResolutionOutputSizeshNQ4ISI + 11;
                getHighSpeedVideoSizes = i13 % 128;
                if (i13 % 2 == 0) {
                    rcVarArr4[i2].m26245();
                    int i14 = (i2 & 71) + (i2 | 71);
                    i2 = (i14 & (-31)) + (i14 | (-31));
                } else {
                    rcVarArr4[i2].m26245();
                    i2++;
                }
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.d.rc[] m26200() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 99;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.d.rc[] rcVarArr = this.getInputSizeshNQ4ISI;
        if (rcVarArr == null) {
            int i3 = (i & 95) + (i | 95);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        util.h.xy.d.rc[] rcVarArr2 = (util.h.xy.d.rc[]) rcVarArr.clone();
        int i4 = getHighSpeedVideoSizes + 17;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return rcVarArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26201(util.h.xy.d.rc[] rcVarArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i & 83) + (i | 83)) % 128;
        this.getInputSizeshNQ4ISI = (util.h.xy.d.rc[]) rcVarArr.clone();
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
    }
}
