package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class mp extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.p(util.h.xy.dh.mp.class) { // from class: util.h.xy.dh.mp.1
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoSizes;

        @Override // util.h.xy.dh.p
        final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
            int i = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = (((i | 17) << 1) - (i ^ 17)) % 128;
            util.h.xy.dh.mp highSpeedVideoFpsRangesFor = util.h.xy.dh.mp.getHighSpeedVideoFpsRangesFor(mzVar.m26337());
            int i2 = getHighSpeedVideoSizes;
            int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                return highSpeedVideoFpsRangesFor;
            }
            throw new java.lang.ArithmeticException();
        }
    };
    final byte[] getHighSpeedVideoSizes;

    static {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i & 31) + (i | 31)) % 128;
    }

    static util.h.xy.dh.mp getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        util.h.xy.dh.aj ajVar = new util.h.xy.dh.aj(bArr);
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 109) << 1) - (i ^ 109);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return ajVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 49) % 128;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.getHighSpeedVideoSizes);
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i | 33) << 1) - (i ^ 33)) % 128;
        return m26855;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        int i = Camera2StreamConfigurationMap + 95;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            util.h.xy.fb.a.m26817(this.getHighSpeedVideoSizes);
            throw null;
        }
        int m26817 = util.h.xy.fb.a.m26817(this.getHighSpeedVideoSizes);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 81) % 128;
        return m26817;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 105) + ((i & 105) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        if (miVar instanceof util.h.xy.dh.mp) {
            boolean m26820 = util.h.xy.fb.a.m26820(this.getHighSpeedVideoSizes, ((util.h.xy.dh.mp) miVar).getHighSpeedVideoSizes);
            int i3 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i3 & 13) + (i3 | 13)) % 128;
            return m26820;
        }
        getHighSpeedVideoFpsRanges = (i2 + 3) % 128;
        int i4 = i2 + 61;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 43) << 1) - (i ^ 43);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            rjVar.getHighSpeedVideoSizes(z, 15, this.getHighSpeedVideoSizes);
        } else {
            rjVar.getHighSpeedVideoSizes(z, 21, this.getHighSpeedVideoSizes);
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 81) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i | 35) << 1) - (i ^ 35)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoSizes.length);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 71) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 107) + ((i & 107) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 15;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    mp(byte[] bArr, boolean z) {
        this.getHighSpeedVideoSizes = bArr;
    }
}
