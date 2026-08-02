package util.h.xy.ep;

/* loaded from: classes5.dex */
public final class ra implements util.h.xy.ef.mb {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoSizes;
    private util.h.xy.ep.mc getInputFormats;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m26670() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 55) % 128;
        byte[] m26821 = util.h.xy.fb.a.m26821(this.getHighResolutionOutputSizeshNQ4ISI);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        return m26821;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26668() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i & 47) + (i | 47)) % 128;
        byte[] m26821 = util.h.xy.fb.a.m26821(this.getHighSpeedVideoSizes);
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        return m26821;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m26671() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 35) + (i | 35)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = i2 + 21;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.ep.mc m26669() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 93) + (i | 93)) % 128;
        util.h.xy.ep.mc mcVar = this.getInputFormats;
        int i2 = (i & 79) + (i | 79);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return mcVar;
        }
        throw null;
    }

    public ra(util.h.xy.ep.mc mcVar, int i, byte[] bArr, byte[] bArr2) {
        this.getInputFormats = mcVar;
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.fb.a.m26821(bArr);
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = util.h.xy.fb.a.m26821(bArr2);
    }

    public ra(util.h.xy.ep.mc mcVar, int i, byte[] bArr) {
        this(mcVar, i, bArr, null);
    }
}
