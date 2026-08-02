package util.h.xy.ep;

/* loaded from: classes18.dex */
public final class rc {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;

    public final int hashCode() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i & 5) + (i | 5)) % 128;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int m26817 = util.h.xy.fb.a.m26817(this.getHighResolutionOutputSizeshNQ4ISI);
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = ((i3 | 49) << 1) - (i3 ^ 49);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        return (~(i2 & m26817)) & (i2 | m26817);
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (((i | 21) << 1) - (i ^ 21)) % 128;
        Camera2StreamConfigurationMap = i2;
        if (!(obj instanceof util.h.xy.ep.rc)) {
            int i3 = (i2 & 3) + (i2 | 3);
            getHighSpeedVideoFpsRanges = i3 % 128;
            return i3 % 2 != 0;
        }
        util.h.xy.ep.rc rcVar = (util.h.xy.ep.rc) obj;
        if (rcVar.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor) {
            return util.h.xy.fb.a.m26820(this.getHighResolutionOutputSizeshNQ4ISI, rcVar.getHighResolutionOutputSizeshNQ4ISI);
        }
        int i4 = (i2 + 77) % 128;
        getHighSpeedVideoFpsRanges = i4;
        int i5 = ((i4 | 15) << 1) - (i4 ^ 15);
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    public rc(byte[] bArr, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.fb.a.m26821(bArr);
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
