package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class mu extends util.h.xy.dh.mm {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizesFor = 1;

    @Override // util.h.xy.dh.mm
    final util.h.xy.dh.l Camera2StreamConfigurationMap(util.h.xy.dh.mi miVar) {
        util.h.xy.dh.rs rsVar = new util.h.xy.dh.rs(miVar);
        int i = getHighSpeedVideoSizesFor + 117;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return rsVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r1.getHighResolutionOutputSizeshNQ4ISI() != false) goto L10;
     */
    @Override // util.h.xy.dh.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRangesFor.mo26279();
            m26327();
            throw null;
        }
        util.h.xy.dh.mi mo26279 = this.getHighSpeedVideoFpsRangesFor.mo26279();
        boolean m26327 = m26327();
        if (z) {
            int i3 = this.getHighSpeedVideoFpsRanges;
            if (!m26327) {
                getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
            }
            i3 = (i3 ^ 32) | (i3 & 32);
            rjVar.getHighSpeedVideoSizes(i3, this.getHighSpeedVideoSizes);
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            int i5 = (i4 ^ 97) + ((i4 & 97) << 1);
            getHighSpeedVideoSizesFor = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 4;
            }
        }
        if (m26327) {
            getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
            int i7 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
            util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i7 % 128;
            rjVar.getHighResolutionOutputSizeshNQ4ISI.write(128);
            if (i7 % 2 != 0) {
                throw null;
            }
            mo26279.getHighResolutionOutputSizeshNQ4ISI(rjVar, true);
            int i8 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
            util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i8 % 128;
            rjVar.getHighResolutionOutputSizeshNQ4ISI.write(0);
            if (i8 % 2 != 0) {
                throw null;
            }
            int i9 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
            util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i9 % 128;
            rjVar.getHighResolutionOutputSizeshNQ4ISI.write(0);
            if (i9 % 2 != 0) {
                throw null;
            }
        } else {
            mo26279.getHighResolutionOutputSizeshNQ4ISI(rjVar, false);
        }
        int i10 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = ((i10 & 119) + (i10 | 119)) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 53) % 128;
        util.h.xy.dh.mi mo26279 = this.getHighSpeedVideoFpsRangesFor.mo26279();
        boolean m26327 = m26327();
        int highSpeedVideoFpsRanges = mo26279.getHighSpeedVideoFpsRanges(m26327);
        if (m26327) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            int i3 = ((i2 ^ 37) + ((i2 & 37) << 1)) % 128;
            getHighSpeedVideoSizesFor = i3;
            highSpeedVideoFpsRanges += 3;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 13) % 128;
        }
        if (z) {
            getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
            i = util.h.xy.dh.rj.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
            getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 37) % 128;
            i = 0;
        }
        return (highSpeedVideoFpsRanges ^ i) + ((i & highSpeedVideoFpsRanges) << 1);
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        boolean z;
        int i = getHighResolutionOutputSizeshNQ4ISI + 21;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            m26327();
            throw null;
        }
        if (!m26327()) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizesFor = ((i2 & 109) + (i2 | 109)) % 128;
            if (!this.getHighSpeedVideoFpsRangesFor.mo26279().getHighResolutionOutputSizeshNQ4ISI()) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 115) % 128;
                z = false;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 111) % 128;
                return z;
            }
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = ((i3 ^ 25) + ((i3 & 25) << 1)) % 128;
        z = true;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 111) % 128;
        return z;
    }

    mu(int i, int i2, int i3, util.h.xy.dh.c cVar) {
        super(i, i2, i3, cVar);
    }

    public mu(boolean z, int i, util.h.xy.dh.c cVar) {
        super(z, i, cVar);
    }

    public mu(int i, util.h.xy.dh.c cVar) {
        super(true, i, cVar);
    }
}
