package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class b extends util.h.xy.dh.mm implements util.h.xy.dh.ra {
    private static int getInputFormats = 0;
    private static int getOutputFormats = 1;
    final util.h.xy.dh.mm getHighResolutionOutputSizeshNQ4ISI;

    @Override // util.h.xy.dh.mm, util.h.xy.dh.mi
    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        util.h.xy.dh.ah ahVar = new util.h.xy.dh.ah((util.h.xy.dh.mm) this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor());
        int i = getOutputFormats;
        int i2 = (i ^ 79) + ((i & 79) << 1);
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return ahVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mm, util.h.xy.dh.mi
    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.v vVar = new util.h.xy.dh.v((util.h.xy.dh.mm) this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap());
        int i = getInputFormats;
        getOutputFormats = ((i & 61) + (i | 61)) % 128;
        return vVar;
    }

    @Override // util.h.xy.dh.mm
    final util.h.xy.dh.l Camera2StreamConfigurationMap(util.h.xy.dh.mi miVar) {
        getOutputFormats = (getInputFormats + 17) % 128;
        util.h.xy.dh.l Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(miVar);
        getOutputFormats = (getInputFormats + 17) % 128;
        return Camera2StreamConfigurationMap;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getInputFormats;
        int i2 = ((i | 29) << 1) - (i ^ 29);
        getOutputFormats = i2 % 128;
        int i3 = i2 % 2;
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(rjVar, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getInputFormats + 85;
        getOutputFormats = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        getOutputFormats = (getInputFormats + 59) % 128;
        int highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(z);
        int i = getInputFormats;
        getOutputFormats = (((i | 9) << 1) - (i ^ 9)) % 128;
        return highSpeedVideoFpsRanges;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getOutputFormats;
        int i2 = ((i | 35) << 1) - (i ^ 35);
        getInputFormats = i2 % 128;
        util.h.xy.dh.mm mmVar = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 % 2 == 0) {
            return mmVar.getHighResolutionOutputSizeshNQ4ISI();
        }
        mmVar.getHighResolutionOutputSizeshNQ4ISI();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    b(util.h.xy.dh.mm mmVar) {
        super(r0, r1, mmVar.getHighSpeedVideoSizes, mmVar.getHighSpeedVideoFpsRangesFor);
        int i = mmVar.Camera2StreamConfigurationMap;
        int i2 = mmVar.getHighSpeedVideoFpsRanges;
        int i3 = getOutputFormats;
        getInputFormats = ((i3 ^ 29) + ((i3 & 29) << 1)) % 128;
        if (64 != i2) {
            throw new java.lang.IllegalArgumentException();
        }
        getInputFormats = ((i3 ^ 93) + ((i3 & 93) << 1)) % 128;
        this.getHighResolutionOutputSizeshNQ4ISI = mmVar;
    }
}
