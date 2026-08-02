package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class e extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    static final util.h.xy.dh.p getHighSpeedVideoSizes = new util.h.xy.dh.p(util.h.xy.dh.e.class) { // from class: util.h.xy.dh.e.2
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoSizes;

        @Override // util.h.xy.dh.p
        final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
            int i = Camera2StreamConfigurationMap;
            int i2 = ((i | 57) << 1) - (i ^ 57);
            getHighSpeedVideoSizes = i2 % 128;
            byte[] m26337 = mzVar.m26337();
            if (i2 % 2 == 0) {
                return util.h.xy.dh.e.getHighResolutionOutputSizeshNQ4ISI(m26337);
            }
            util.h.xy.dh.e.getHighResolutionOutputSizeshNQ4ISI(m26337);
            throw null;
        }
    };
    final byte[] Camera2StreamConfigurationMap;

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 117) + ((i & 117) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static util.h.xy.dh.e getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        util.h.xy.dh.mw mwVar = new util.h.xy.dh.mw(bArr);
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 25) + (i | 25)) % 128;
        return mwVar;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 69) << 1) - (i ^ 69);
        getHighSpeedVideoFpsRanges = i2 % 128;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (i2 % 2 != 0) {
            return util.h.xy.fb.a.m26817(bArr);
        }
        util.h.xy.fb.a.m26817(bArr);
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 25) + (i | 25)) % 128;
        if (!(miVar instanceof util.h.xy.dh.e)) {
            getHighSpeedVideoFpsRanges = ((i & 37) + (i | 37)) % 128;
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.Camera2StreamConfigurationMap, ((util.h.xy.dh.e) miVar).Camera2StreamConfigurationMap);
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return m26820;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 67) % 128;
        rjVar.getHighSpeedVideoSizes(z, 27, this.Camera2StreamConfigurationMap);
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 39) + (i | 39)) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 79) + ((i & 79) << 1)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.Camera2StreamConfigurationMap.length);
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i & 51) + (i | 51)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        int i3 = i2 + 111;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public java.lang.String toString() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i & 73) + (i | 73)) % 128;
        java.lang.String mo26276 = mo26276();
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i2 | 9) << 1) - (i2 ^ 9)) % 128;
        return mo26276;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        int i = getHighSpeedVideoFpsRangesFor + 39;
        getHighSpeedVideoFpsRanges = i % 128;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (i % 2 != 0) {
            return util.h.xy.fb.rd.m26855(bArr);
        }
        util.h.xy.fb.rd.m26855(bArr);
        throw null;
    }

    e(byte[] bArr, boolean z) {
        this.Camera2StreamConfigurationMap = bArr;
    }
}
