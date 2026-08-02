package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class rp extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.p(util.h.xy.dh.rp.class) { // from class: util.h.xy.dh.rp.4
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;

        @Override // util.h.xy.dh.p
        final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
            int i = Camera2StreamConfigurationMap;
            int i2 = (i & 29) + (i | 29);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            byte[] m26337 = mzVar.m26337();
            if (i2 % 2 != 0) {
                return util.h.xy.dh.rp.Camera2StreamConfigurationMap(m26337);
            }
            util.h.xy.dh.rp.Camera2StreamConfigurationMap(m26337);
            throw null;
        }
    };
    final byte[] getHighSpeedVideoSizes;

    static {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 29) + (i | 29)) % 128;
    }

    static util.h.xy.dh.rp Camera2StreamConfigurationMap(byte[] bArr) {
        util.h.xy.dh.al alVar = new util.h.xy.dh.al(bArr);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 53) % 128;
        return alVar;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i | 103) << 1) - (i ^ 103)) % 128;
        int m26817 = util.h.xy.fb.a.m26817(this.getHighSpeedVideoSizes);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 ^ 71) + ((i2 & 71) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return m26817;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 17;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!(miVar instanceof util.h.xy.dh.rp)) {
            getHighResolutionOutputSizeshNQ4ISI = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.getHighSpeedVideoSizes, ((util.h.xy.dh.rp) miVar).getHighSpeedVideoSizes);
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 37;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return m26820;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 119;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            rjVar.getHighSpeedVideoSizes(z, 77, this.getHighSpeedVideoSizes);
        } else {
            rjVar.getHighSpeedVideoSizes(z, 26, this.getHighSpeedVideoSizes);
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i2 & 45) + (i2 | 45)) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 63) + ((i & 63) << 1)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoSizes.length);
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 101) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i + 119) % 128;
        return false;
    }

    public java.lang.String toString() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 57) + ((i & 57) << 1)) % 128;
        java.lang.String mo26276 = mo26276();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
        return mo26276;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 21) + ((i & 21) << 1)) % 128;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.getHighSpeedVideoSizes);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 111) % 128;
        return m26855;
    }

    rp(byte[] bArr, boolean z) {
        this.getHighSpeedVideoSizes = bArr;
    }
}
