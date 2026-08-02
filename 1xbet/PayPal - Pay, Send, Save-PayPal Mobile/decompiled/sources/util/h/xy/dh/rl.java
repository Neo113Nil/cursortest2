package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class rl extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    static final util.h.xy.dh.p Camera2StreamConfigurationMap = new util.h.xy.dh.p(util.h.xy.dh.rl.class) { // from class: util.h.xy.dh.rl.5
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoSizes;

        @Override // util.h.xy.dh.p
        final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
            int i = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = ((i ^ 23) + ((i & 23) << 1)) % 128;
            util.h.xy.dh.rl highSpeedVideoSizes = util.h.xy.dh.rl.getHighSpeedVideoSizes(mzVar.m26337());
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = ((i2 & 25) + (i2 | 25)) % 128;
            return highSpeedVideoSizes;
        }
    };
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    final byte[] getHighResolutionOutputSizeshNQ4ISI;

    static {
        int i = getHighSpeedVideoSizes + 3;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static util.h.xy.dh.rl getHighSpeedVideoSizes(byte[] bArr) {
        util.h.xy.dh.ad adVar = new util.h.xy.dh.ad(bArr);
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 111) + ((i & 111) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return adVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 25) % 128;
        int m26817 = util.h.xy.fb.a.m26817(this.getHighResolutionOutputSizeshNQ4ISI);
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return m26817;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 65) << 1) - (i ^ 65);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (!(miVar instanceof util.h.xy.dh.rl)) {
            int i4 = i3 + 87;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.getHighResolutionOutputSizeshNQ4ISI, ((util.h.xy.dh.rl) miVar).getHighResolutionOutputSizeshNQ4ISI);
        int i5 = getHighSpeedVideoFpsRanges;
        int i6 = ((i5 | 29) << 1) - (i5 ^ 29);
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 == 0) {
            return m26820;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (((i | 27) << 1) - (i ^ 27)) % 128;
        rjVar.getHighSpeedVideoSizes(z, 20, this.getHighResolutionOutputSizeshNQ4ISI);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 35) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i & 59) + (i | 59)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighResolutionOutputSizeshNQ4ISI.length);
        int i2 = getHighSpeedVideoSizes;
        int i3 = ((i2 | 115) << 1) - (i2 ^ 115);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 35) % 128;
        return false;
    }

    public java.lang.String toString() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i & 93) + (i | 93)) % 128;
        java.lang.String mo26276 = mo26276();
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i2 ^ 53) + ((i2 & 53) << 1)) % 128;
        return mo26276;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        int i = getHighSpeedVideoFpsRanges + 45;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            util.h.xy.fb.rd.m26855(this.getHighResolutionOutputSizeshNQ4ISI);
            throw null;
        }
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.getHighResolutionOutputSizeshNQ4ISI);
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i2 | 43) << 1) - (i2 ^ 43)) % 128;
        return m26855;
    }

    rl(byte[] bArr, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }
}
