package util.h.xy.ce;

/* loaded from: classes5.dex */
public class ra {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.d.b getOutputMinFrameDuration = null;
    private util.h.xy.d.rc[] getHighResolutionOutputSizeshNQ4ISI = null;
    private util.h.xy.d.rc[] getHighSpeedVideoFpsRangesFor = null;
    private util.h.xy.d.rc[] Camera2StreamConfigurationMap = null;
    private util.h.xy.d.rc[] getInputFormats = null;

    /* renamed from: ˎ, reason: contains not printable characters */
    public util.h.xy.d.b m25883() {
        int i = (getHighSpeedVideoFpsRanges + 51) % 128;
        getHighSpeedVideoSizes = i;
        util.h.xy.d.b bVar = this.getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = ((i & 101) + (i | 101)) % 128;
        return bVar;
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.d.rc[] m25880() {
        util.h.xy.d.rc[] rcVarArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (rcVarArr == null) {
            int i = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.d.rc[] rcVarArr2 = (util.h.xy.d.rc[]) rcVarArr.clone();
        int i2 = getHighSpeedVideoSizes;
        int i3 = (i2 & 119) + (i2 | 119);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return rcVarArr2;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.d.rc[] m25888() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (i + 63) % 128;
        util.h.xy.d.rc[] rcVarArr = this.getHighSpeedVideoFpsRangesFor;
        if (rcVarArr == null) {
            int i2 = (i ^ 11) + ((i & 11) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.d.rc[] rcVarArr2 = (util.h.xy.d.rc[]) rcVarArr.clone();
        int i3 = getHighSpeedVideoSizes + 25;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return rcVarArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.d.rc[] m25882() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 1) + ((i & 1) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        util.h.xy.d.rc[] rcVarArr = this.getInputFormats;
        if (rcVarArr == null) {
            int i3 = ((i2 | 15) << 1) - (i2 ^ 15);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.d.rc[] rcVarArr2 = (util.h.xy.d.rc[]) rcVarArr.clone();
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = (i4 ^ 87) + ((i4 & 87) << 1);
        getHighSpeedVideoSizes = i5 % 128;
        if (i5 % 2 == 0) {
            return rcVarArr2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public util.h.xy.d.rc[] m25885() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i + 125) % 128;
        getHighSpeedVideoFpsRanges = i2;
        util.h.xy.d.rc[] rcVarArr = this.Camera2StreamConfigurationMap;
        if (rcVarArr == null) {
            getHighSpeedVideoSizes = (i2 + 63) % 128;
            getHighSpeedVideoSizes = ((i2 & 71) + (i2 | 71)) % 128;
            return null;
        }
        int i3 = (i & 41) + (i | 41);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return rcVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25886(util.h.xy.d.b bVar) {
        int i = getHighSpeedVideoSizes + 107;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 != 0) {
            this.getOutputMinFrameDuration = bVar;
            int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getOutputMinFrameDuration = bVar;
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25884(util.h.xy.d.rc[] rcVarArr) {
        int i = getHighSpeedVideoFpsRanges + 29;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.d.rc[]) rcVarArr.clone();
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 95) % 128;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.d.rc[]) rcVarArr.clone();
            throw null;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25887(util.h.xy.d.rc[] rcVarArr) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i ^ 73) + ((i & 73) << 1)) % 128;
        this.getInputFormats = (util.h.xy.d.rc[]) rcVarArr.clone();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 11) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25881(util.h.xy.d.rc[] rcVarArr) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 103) + (i | 103);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            this.Camera2StreamConfigurationMap = (util.h.xy.d.rc[]) rcVarArr.clone();
        } else {
            this.Camera2StreamConfigurationMap = (util.h.xy.d.rc[]) rcVarArr.clone();
            throw new java.lang.ArithmeticException();
        }
    }
}
