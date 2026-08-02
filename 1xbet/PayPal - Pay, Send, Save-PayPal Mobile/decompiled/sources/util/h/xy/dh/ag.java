package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class ag extends util.h.xy.dh.mm {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getInputFormats;

    @Override // util.h.xy.dh.mm, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getInputFormats;
        int i2 = (((i | 47) << 1) - (i ^ 47)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = i2 + 3;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mm, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = (getInputFormats + 99) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        getInputFormats = (i + 35) % 128;
        return this;
    }

    @Override // util.h.xy.dh.mm
    final util.h.xy.dh.l Camera2StreamConfigurationMap(util.h.xy.dh.mi miVar) {
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(miVar);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = ((i ^ 53) + ((i & 53) << 1)) % 128;
        return aaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0.getHighResolutionOutputSizeshNQ4ISI() != false) goto L8;
     */
    @Override // util.h.xy.dh.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
        util.h.xy.dh.mi Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.mo26279().Camera2StreamConfigurationMap();
        boolean m26327 = m26327();
        if (z) {
            int i = this.getHighSpeedVideoFpsRanges;
            if (!m26327) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                getInputFormats = ((i2 & 89) + (i2 | 89)) % 128;
            }
            i = (i ^ 32) | (i & 32);
            int i3 = getInputFormats;
            getHighResolutionOutputSizeshNQ4ISI = ((i3 & 109) + (i3 | 109)) % 128;
            rjVar.getHighSpeedVideoSizes(i, this.getHighSpeedVideoSizes);
        }
        if (m26327) {
            int i4 = getInputFormats;
            getHighResolutionOutputSizeshNQ4ISI = ((i4 ^ 7) + ((i4 & 7) << 1)) % 128;
            rjVar.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(true));
        }
        Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(rjVar.getHighResolutionOutputSizeshNQ4ISI(), m26327);
        int i5 = getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = ((i5 & 17) + (i5 | 17)) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 & 43) + (i2 | 43);
        getInputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            this.getHighSpeedVideoFpsRangesFor.mo26279().Camera2StreamConfigurationMap().getHighSpeedVideoFpsRanges(m26327());
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.mi Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.mo26279().Camera2StreamConfigurationMap();
        boolean m26327 = m26327();
        int highSpeedVideoFpsRanges = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(m26327);
        if (m26327) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            getInputFormats = ((i4 ^ 39) + ((i4 & 39) << 1)) % 128;
            highSpeedVideoFpsRanges = (highSpeedVideoFpsRanges - (~util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges))) - 1;
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 69) % 128;
        }
        if (z) {
            int i5 = getInputFormats;
            getHighResolutionOutputSizeshNQ4ISI = (((i5 | 121) << 1) - (i5 ^ 121)) % 128;
            i = util.h.xy.dh.rj.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
        } else {
            i = 0;
        }
        int i6 = getHighResolutionOutputSizeshNQ4ISI;
        int i7 = (i6 & 115) + (i6 | 115);
        getInputFormats = i7 % 128;
        if (i7 % 2 == 0) {
            return highSpeedVideoFpsRanges + i;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        boolean z;
        int i = getInputFormats + 71;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m26327();
            throw null;
        }
        if (m26327() || this.getHighSpeedVideoFpsRangesFor.mo26279().Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI()) {
            int i2 = getInputFormats + 49;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
            z = false;
        }
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
        return z;
    }

    ag(int i, int i2, int i3, util.h.xy.dh.c cVar) {
        super(i, i2, i3, cVar);
    }

    public ag(boolean z, int i, util.h.xy.dh.c cVar) {
        super(z, i, cVar);
    }
}
