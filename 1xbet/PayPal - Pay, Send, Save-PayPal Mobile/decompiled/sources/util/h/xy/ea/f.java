package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class f extends util.h.xy.ea.ri {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // util.h.xy.ea.ri
    public final java.lang.Object clone() {
        util.h.xy.ea.f fVar = new util.h.xy.ea.f(this.getHighResolutionOutputSizeshNQ4ISI);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 25) % 128;
        return fVar;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = (getHighSpeedVideoSizes + 105) % 128;
        getHighSpeedVideoFpsRanges = i;
        if (!(obj instanceof util.h.xy.ea.f)) {
            getHighSpeedVideoSizes = ((i & 15) + (i | 15)) % 128;
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.getHighResolutionOutputSizeshNQ4ISI, ((util.h.xy.ea.f) obj).getHighResolutionOutputSizeshNQ4ISI);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 13) % 128;
        return m26820;
    }

    public final int hashCode() {
        int i = getHighSpeedVideoFpsRanges + 111;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            util.h.xy.fb.a.m26817(this.getHighResolutionOutputSizeshNQ4ISI);
            throw null;
        }
        int m26817 = util.h.xy.fb.a.m26817(this.getHighResolutionOutputSizeshNQ4ISI);
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i2 ^ 71) + ((i2 & 71) << 1)) % 128;
        return m26817;
    }

    public f(byte[] bArr) {
        super(1);
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }
}
