package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class o extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    final byte[] getHighSpeedVideoFpsRangesFor;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRanges = new util.h.xy.dh.p(util.h.xy.dh.o.class) { // from class: util.h.xy.dh.o.4
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoSizes = 1;

        @Override // util.h.xy.dh.p
        final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
            util.h.xy.dh.o highResolutionOutputSizeshNQ4ISI = util.h.xy.dh.o.getHighResolutionOutputSizeshNQ4ISI(mzVar.m26337());
            int i = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 89) + (i | 89)) % 128;
            return highResolutionOutputSizeshNQ4ISI;
        }
    };
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 67) % 128;

    static util.h.xy.dh.o getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        util.h.xy.dh.af afVar = new util.h.xy.dh.af(bArr);
        int i = Camera2StreamConfigurationMap + 45;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return afVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 99) + (i | 99)) % 128;
        rjVar.getHighSpeedVideoSizes(z, 12, this.getHighSpeedVideoFpsRangesFor);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 & 15) + (i2 | 15);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 35) + (i | 35)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoFpsRangesFor.length);
        int i2 = Camera2StreamConfigurationMap + 25;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = (Camera2StreamConfigurationMap + 59) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        int i2 = (i & 49) + (i | 49);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 17) << 1) - (i ^ 17);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (miVar instanceof util.h.xy.dh.o) {
            return util.h.xy.fb.a.m26820(this.getHighSpeedVideoFpsRangesFor, ((util.h.xy.dh.o) miVar).getHighSpeedVideoFpsRangesFor);
        }
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 11) + ((i & 11) << 1)) % 128;
        return false;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 5) + ((i & 5) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (i2 % 2 == 0) {
            return util.h.xy.fb.a.m26817(bArr);
        }
        util.h.xy.fb.a.m26817(bArr);
        throw null;
    }

    public java.lang.String toString() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 5) << 1) - (i ^ 5)) % 128;
        java.lang.String mo26276 = mo26276();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 59) % 128;
        return mo26276;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 89) % 128;
        java.lang.String m26860 = util.h.xy.fb.rd.m26860(this.getHighSpeedVideoFpsRangesFor);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 103) << 1) - (i ^ 103);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return m26860;
        }
        throw new java.lang.ArithmeticException();
    }

    o(byte[] bArr, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }

    o(java.lang.String str) {
        this(util.h.xy.fb.rd.m26861(str), false);
    }
}
