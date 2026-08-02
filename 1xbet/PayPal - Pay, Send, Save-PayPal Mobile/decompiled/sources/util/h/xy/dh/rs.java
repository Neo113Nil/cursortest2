package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rs extends util.h.xy.dh.l {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rk getHighSpeedVideoSizes() {
        util.h.xy.dh.ms msVar = new util.h.xy.dh.ms(getInputFormats());
        int i = getHighSpeedVideoSizes + 31;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return msVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rh getOutputFormats() {
        util.h.xy.dh.rr rrVar = new util.h.xy.dh.rr(getOutputStallDuration());
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i | 97) << 1) - (i ^ 97)) % 128;
        return rrVar;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rd getInputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 109) + (i | 109);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            ((util.h.xy.dh.l) getHighSpeedVideoFpsRangesFor()).getInputSizeshNQ4ISI();
            throw null;
        }
        util.h.xy.dh.rd inputSizeshNQ4ISI = ((util.h.xy.dh.l) getHighSpeedVideoFpsRangesFor()).getInputSizeshNQ4ISI();
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = ((i3 | 59) << 1) - (i3 ^ 59);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            return inputSizeshNQ4ISI;
        }
        throw null;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.ma getHighSpeedVideoFpsRanges() {
        util.h.xy.dh.rq rqVar = new util.h.xy.dh.rq(getOutputMinFrameDuration());
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ 59) + ((i & 59) << 1)) % 128;
        return rqVar;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i ^ 33) + ((i & 33) << 1)) % 128;
        rjVar.getHighSpeedVideoFpsRangesFor(z, 48, this.getHighSpeedVideoFpsRangesFor);
        int i2 = getHighSpeedVideoFpsRanges + 93;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i;
        int i2 = getHighSpeedVideoFpsRanges + 61;
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (z) {
            i = 4;
        } else {
            getHighSpeedVideoFpsRanges = (i3 + 93) % 128;
            i = 3;
        }
        int length = this.getHighSpeedVideoFpsRangesFor.length;
        int i4 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i4 | 51) << 1) - (i4 ^ 51)) % 128;
        int i5 = 0;
        while (i5 < length) {
            int i6 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = (((i6 | 43) << 1) - (i6 ^ 43)) % 128;
            int highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor[i5].mo26279().getHighSpeedVideoFpsRanges(true);
            i = ((i | highSpeedVideoFpsRanges) << 1) - (i ^ highSpeedVideoFpsRanges);
            int i7 = ((i5 | (-89)) << 1) - (i5 ^ (-89));
            i5 = (i7 & 90) + (i7 | 90);
        }
        return i;
    }

    public rs(util.h.xy.dh.d dVar) {
        super(dVar);
    }

    public rs(util.h.xy.dh.c cVar) {
        super(cVar);
    }

    public rs() {
    }
}
