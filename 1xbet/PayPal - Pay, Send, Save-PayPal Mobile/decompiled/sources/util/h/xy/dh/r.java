package util.h.xy.dh;

/* loaded from: classes5.dex */
final class r {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    static final util.h.xy.dh.rs getHighSpeedVideoFpsRanges = new util.h.xy.dh.rs();
    static final util.h.xy.dh.ms getHighSpeedVideoSizes = new util.h.xy.dh.ms();

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 87) + (i | 87)) % 128;
    }

    static util.h.xy.dh.rs getHighSpeedVideoSizes(util.h.xy.dh.d dVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 23) + (i | 23);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        int m26288 = dVar.m26288();
        if (i3 == 0 ? m26288 > 0 : m26288 >= 0) {
            util.h.xy.dh.rs rsVar = new util.h.xy.dh.rs(dVar);
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 103;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                return rsVar;
            }
            throw new java.lang.ArithmeticException();
        }
        int i5 = getHighSpeedVideoFpsRangesFor;
        int i6 = ((i5 | 17) << 1) - (i5 ^ 17);
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.rs rsVar2 = getHighSpeedVideoFpsRanges;
        int i7 = ((i5 | 99) << 1) - (i5 ^ 99);
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        if (i7 % 2 != 0) {
            return rsVar2;
        }
        throw null;
    }

    r() {
    }
}
