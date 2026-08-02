package util.h.xy.ep;

/* loaded from: classes18.dex */
public final class d {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public final boolean equals(java.lang.Object obj) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i ^ 93) + ((i & 93) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (obj instanceof util.h.xy.ep.d) {
            util.h.xy.ep.d dVar = (util.h.xy.ep.d) obj;
            if (dVar.getHighSpeedVideoSizes == this.getHighSpeedVideoSizes) {
                return util.h.xy.fb.a.m26820(this.getHighResolutionOutputSizeshNQ4ISI, dVar.getHighResolutionOutputSizeshNQ4ISI);
            }
            getHighSpeedVideoFpsRanges = ((i & 13) + (i | 13)) % 128;
            return false;
        }
        int i3 = i2 + 13;
        int i4 = i3 % 128;
        Camera2StreamConfigurationMap = i4;
        boolean z = i3 % 2 != 0;
        getHighSpeedVideoFpsRanges = (i4 + 101) % 128;
        return z;
    }

    public final int hashCode() {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 39) % 128;
        int i = this.getHighSpeedVideoSizes;
        int m26817 = util.h.xy.fb.a.m26817(this.getHighResolutionOutputSizeshNQ4ISI);
        int i2 = Camera2StreamConfigurationMap + 61;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        return (i & (~m26817)) | ((~i) & m26817);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26656() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i ^ 99) + ((i & 99) << 1)) % 128;
        byte[] m26821 = util.h.xy.fb.a.m26821(this.getHighResolutionOutputSizeshNQ4ISI);
        int i2 = getHighSpeedVideoFpsRanges + 25;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return m26821;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m26657() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 5) << 1) - (i ^ 5);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        return i3;
    }

    public d(byte[] bArr, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.fb.a.m26821(bArr);
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    public d(byte[] bArr, int i) {
        this(bArr, i, -1);
    }
}
