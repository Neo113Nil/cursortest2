package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class h extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    final byte[] getHighSpeedVideoSizes;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRanges = new util.h.xy.dh.p(util.h.xy.dh.h.class) { // from class: util.h.xy.dh.h.2
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoSizes;

        @Override // util.h.xy.dh.p
        final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
            int i = Camera2StreamConfigurationMap;
            int i2 = (i & 33) + (i | 33);
            getHighSpeedVideoSizes = i2 % 128;
            byte[] m26337 = mzVar.m26337();
            if (i2 % 2 == 0) {
                return util.h.xy.dh.h.getHighResolutionOutputSizeshNQ4ISI(m26337);
            }
            util.h.xy.dh.h.getHighResolutionOutputSizeshNQ4ISI(m26337);
            throw new java.lang.ArithmeticException();
        }
    };
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 57) % 128;

    static util.h.xy.dh.h getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        util.h.xy.dh.mx mxVar = new util.h.xy.dh.mx(bArr);
        int i = getHighSpeedVideoFpsRangesFor + 43;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return mxVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 113) + (i | 113)) % 128;
        Camera2StreamConfigurationMap = i2;
        if (miVar instanceof util.h.xy.dh.h) {
            boolean m26820 = util.h.xy.fb.a.m26820(this.getHighSpeedVideoSizes, ((util.h.xy.dh.h) miVar).getHighSpeedVideoSizes);
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 87) + ((i3 & 87) << 1)) % 128;
            return m26820;
        }
        int i4 = ((i2 ^ 35) + ((i2 & 35) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i4;
        Camera2StreamConfigurationMap = (i4 + 119) % 128;
        return false;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 113) % 128;
        int m26817 = util.h.xy.fb.a.m26817(this.getHighSpeedVideoSizes);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        return m26817;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 75) + ((i & 75) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            rjVar.getHighSpeedVideoSizes(z, 4, this.getHighSpeedVideoSizes);
        } else {
            rjVar.getHighSpeedVideoSizes(z, 18, this.getHighSpeedVideoSizes);
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 29) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 37) << 1) - (i ^ 37)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoSizes.length);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 11) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 121) % 128;
        return false;
    }

    public java.lang.String toString() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 79) % 128;
        java.lang.String mo26276 = mo26276();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 9) % 128;
        return mo26276;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 1) << 1) - (i ^ 1)) % 128;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.getHighSpeedVideoSizes);
        int i2 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i2 | 117) << 1) - (i2 ^ 117)) % 128;
        return m26855;
    }

    h(byte[] bArr, boolean z) {
        this.getHighSpeedVideoSizes = bArr;
    }
}
