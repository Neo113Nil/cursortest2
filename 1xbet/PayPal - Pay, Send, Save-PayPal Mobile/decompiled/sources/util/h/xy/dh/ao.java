package util.h.xy.dh;

/* loaded from: classes5.dex */
final class ao {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;
    static final util.h.xy.dh.aq getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.aq();
    static final util.h.xy.dh.av getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.av();

    static {
        int i = getHighSpeedVideoFpsRanges + 13;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static util.h.xy.dh.av getHighSpeedVideoSizes(util.h.xy.dh.d dVar) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 5) % 128;
        if (dVar.m26288() > 0) {
            return new util.h.xy.dh.av(dVar);
        }
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (i + 105) % 128;
        util.h.xy.dh.av avVar = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 19) % 128;
        return avVar;
    }

    static util.h.xy.dh.aq getHighSpeedVideoFpsRanges(util.h.xy.dh.d dVar) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i | 83) << 1) - (i ^ 83)) % 128;
        if (dVar.m26288() > 0) {
            util.h.xy.dh.aq aqVar = new util.h.xy.dh.aq(dVar);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 27) % 128;
            return aqVar;
        }
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (((i2 | 69) << 1) - (i2 ^ 69)) % 128;
        getHighSpeedVideoSizes = i3;
        util.h.xy.dh.aq aqVar2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i3 & 41) + (i3 | 41)) % 128;
        return aqVar2;
    }

    ao() {
    }
}
