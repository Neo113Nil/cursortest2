package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class at extends util.h.xy.dh.mm {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getOutputFormats;

    @Override // util.h.xy.dh.mm, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = (getOutputFormats + 69) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        getOutputFormats = (i + 99) % 128;
        return this;
    }

    @Override // util.h.xy.dh.mm
    final util.h.xy.dh.l Camera2StreamConfigurationMap(util.h.xy.dh.mi miVar) {
        util.h.xy.dh.aq aqVar = new util.h.xy.dh.aq(miVar);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 19) + ((i & 19) << 1);
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return aqVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r1.getHighResolutionOutputSizeshNQ4ISI() != false) goto L17;
     */
    @Override // util.h.xy.dh.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRangesFor.mo26279().getHighSpeedVideoFpsRangesFor();
            m26327();
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.mi highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.mo26279().getHighSpeedVideoFpsRangesFor();
        boolean m26327 = m26327();
        if (z) {
            int i3 = getOutputFormats;
            int i4 = (i3 & 39) + (i3 | 39);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = this.getHighSpeedVideoFpsRanges;
                throw null;
            }
            int i6 = this.getHighSpeedVideoFpsRanges;
            if (!m26327) {
                int i7 = getOutputFormats;
                int i8 = ((i7 | 101) << 1) - (i7 ^ 101);
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                if (i8 % 2 == 0) {
                    highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
                    throw null;
                }
            }
            i6 = (i6 ^ 32) | (i6 & 32);
            int i9 = getHighResolutionOutputSizeshNQ4ISI;
            int i10 = (i9 & 43) + (i9 | 43);
            getOutputFormats = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 / 4;
            }
            rjVar.getHighSpeedVideoSizes(i6, this.getHighSpeedVideoSizes);
            int i12 = getHighResolutionOutputSizeshNQ4ISI;
            getOutputFormats = ((i12 & 3) + (i12 | 3)) % 128;
        }
        if (m26327) {
            int i13 = getHighResolutionOutputSizeshNQ4ISI;
            int i14 = (i13 & 25) + (i13 | 25);
            getOutputFormats = i14 % 128;
            rjVar.getHighSpeedVideoFpsRanges(i14 % 2 != 0 ? highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(false) : highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(true));
        }
        highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(rjVar.getHighSpeedVideoFpsRanges(), m26327);
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 25;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRangesFor.mo26279().getHighSpeedVideoFpsRangesFor().getHighSpeedVideoFpsRanges(m26327());
            throw null;
        }
        util.h.xy.dh.mi highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.mo26279().getHighSpeedVideoFpsRangesFor();
        boolean m26327 = m26327();
        int highSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(m26327);
        if (m26327) {
            int highSpeedVideoFpsRangesFor2 = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges);
            highSpeedVideoFpsRanges = ((highSpeedVideoFpsRanges | highSpeedVideoFpsRangesFor2) << 1) - (highSpeedVideoFpsRanges ^ highSpeedVideoFpsRangesFor2);
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getOutputFormats = ((i3 ^ 33) + ((i3 & 33) << 1)) % 128;
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 33) % 128;
            i = util.h.xy.dh.rj.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
        } else {
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
            i = 0;
        }
        return (highSpeedVideoFpsRanges - (~(-(-i)))) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038 A[RETURN] */
    @Override // util.h.xy.dh.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        boolean z;
        int i;
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
        if (!m26327()) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getOutputFormats = ((i2 & 91) + (i2 | 91)) % 128;
            if (!this.getHighSpeedVideoFpsRangesFor.mo26279().getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI()) {
                z = false;
                i = getHighResolutionOutputSizeshNQ4ISI + 55;
                getOutputFormats = i % 128;
                if (i % 2 != 0) {
                    return z;
                }
                throw null;
            }
        }
        z = true;
        i = getHighResolutionOutputSizeshNQ4ISI + 55;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
        }
    }

    at(int i, int i2, int i3, util.h.xy.dh.c cVar) {
        super(i, i2, i3, cVar);
    }

    public at(boolean z, int i, util.h.xy.dh.c cVar) {
        super(z, i, cVar);
    }

    public at(int i, util.h.xy.dh.c cVar) {
        super(true, i, cVar);
    }
}
